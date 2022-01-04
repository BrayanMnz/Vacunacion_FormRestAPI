package ProyectoVacunacion.ClienteREST.Services;

import ProyectoVacunacion.ClienteREST.Models.*;
import io.javalin.Javalin;
import static io.javalin.apibuilder.ApiBuilder.*;
import ProyectoVacunacion.ClienteREST.Models.*;
import ProyectoVacunacion.ClienteREST.util.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import javax.mail.*;
import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class MailService {

    public static void sendMail(Persona auxPersona) {
        String mailText = "Hola "+auxPersona.getNombreCompleto_persona().toUpperCase() +" para llenar la encuesta correspondiente a tu estado de salud luego de recibir tu vacuna accede al siguiente enlace: \n https://app.brayanmnz.live/Survey/"+auxPersona.getId_persona();
        
        String nombre = auxPersona.getNombreCompleto_persona();

        // Recipient's email ID needs to be mentioned.

        String to = String.format("%s", auxPersona.getContacto_persona().getEmail_contacto());

        // Sender's email ID needs to be mentioned
        String from = "vacunacionproyecto@gmail.com";

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("vacunacionproyecto@gmail.com", "proyecto123456");

            }

        });

        // Used to debug SMTP issues
        session.setDebug(true);

        try {
            // Create a default MimeMessage object.q
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("Encuesta en linea, seguimiento del Proceso de Vacunacion.");

            // Now set the actual message

            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(mailText);
            // message.setText(mailText);

            //MimeBodyPart attachmentPart = new MimeBodyPart();
            // attachmentPart.attachFile(new
            // File("/home/brayanmnz/Proyecto_Vacunacion/app/src/main/codigos/Quote.png"));
            // attachmentPart.attachFile(new File("src/main/codigos/Quote" + auxPersona.getId_persona() + ".png"));

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            //multipart.addBodyPart(attachmentPart);

            message.setContent(multipart);

            System.out.println("sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException ex) {
            ex.printStackTrace();
            System.out.println("\n \n Error enviando correo: "+ex.getMessage());
            // Encolar email para envíar
        }
        // ====================================================================
    }

}
