package ProyectoVacunacion.ClienteREST.Models;

import javax.persistence.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.*;

@Entity
public class Contacto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Se genera el ID automatico
    private int id_contacto;

    @Column
    private String email_contacto;

    @Column
    private String telefono_contacto;

    @Column
    private String movil_contacto;

    @Column
    private String nombreContactoEmergencia;

    @Column
    private String telefonoContactoEmergencia;


    public Contacto() {
    }


    public Contacto(int id_contacto, String email_contacto, String telefono_contacto, String movil_contacto, String nombreContactoEmergencia, String telefonoContactoEmergencia) {
        this.id_contacto = id_contacto;
        this.email_contacto = email_contacto;
        this.telefono_contacto = telefono_contacto;
        this.movil_contacto = movil_contacto;
        this.nombreContactoEmergencia = nombreContactoEmergencia;
        this.telefonoContactoEmergencia = telefonoContactoEmergencia;
    }

    public Contacto(String email_contacto, String telefono_contacto, String movil_contacto, String nombreContactoEmergencia, String telefonoContactoEmergencia) {
        
        this.email_contacto = email_contacto;
        this.telefono_contacto = telefono_contacto;
        this.movil_contacto = movil_contacto;
        this.nombreContactoEmergencia = nombreContactoEmergencia;
        this.telefonoContactoEmergencia = telefonoContactoEmergencia;
    }


    public int getId_contacto() {
        return this.id_contacto;
    }

    public void setId_contacto(int id_contacto) {
        this.id_contacto = id_contacto;
    }

    public String getEmail_contacto() {
        return this.email_contacto;
    }

    public void setEmail_contacto(String email_contacto) {
        this.email_contacto = email_contacto;
    }

    public String getTelefono_contacto() {
        return this.telefono_contacto;
    }

    public void setTelefono_contacto(String telefono_contacto) {
        this.telefono_contacto = telefono_contacto;
    }

    public String getMovil_contacto() {
        return this.movil_contacto;
    }

    public void setMovil_contacto(String movil_contacto) {
        this.movil_contacto = movil_contacto;
    }

    public String getNombreContactoEmergencia() {
        return this.nombreContactoEmergencia;
    }

    public void setNombreContactoEmergencia(String nombreContactoEmergencia) {
        this.nombreContactoEmergencia = nombreContactoEmergencia;
    }

    public String getTelefonoContactoEmergencia() {
        return this.telefonoContactoEmergencia;
    }

    public void setTelefonoContactoEmergencia(String telefonoContactoEmergencia) {
        this.telefonoContactoEmergencia = telefonoContactoEmergencia;
    }


    }
