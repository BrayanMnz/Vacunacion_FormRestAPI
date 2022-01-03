package ProyectoVacunacion.ClienteREST.Models;

import javax.persistence.*;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import java.io.Serializable;
// import java.sql.String;
import java.util.*;

@Entity
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Se genera el ID automatico
    private int id_persona;

    @Column
    private String dni_persona;

    @Column
    private String nombreCompleto_persona;

    @Column
    private String fechaNacimiento_persona;

    @Column
    private String sexo_persona;

    @Column
    private int edad;

    @Column
    private Double prioridad;


    @Column
    private Boolean primeraDosis;
    
    @Column
    private Boolean segundaDosis;

    @Column
    private Boolean cita;     

    @Column
    private Boolean IVR;
    
    @Column
    private Boolean encuestado;

    @Column Boolean mailSent;

   
 

    @OneToOne
    @JoinColumn(name = "Ubicacion")
    private Ubicacion ubicacion_persona;

    @OneToOne
    @JoinColumn(name = "Contacto")
    private Contacto contacto_persona;

    @OneToOne(mappedBy = "persona_Formulario")
    private Formulario formulario_Persona;

    @OneToOne
    @JoinColumn(name = "Afeccion")
    private Afeccion Afeccion_persona;

    @OneToMany()
    private  List<CitaVacunacion> citasPersona;

    @OneToMany
    @LazyCollection(LazyCollectionOption.FALSE)
    private  List<Survey> surveysPersona;

    @OneToOne
    @JoinColumn(name = "Centro")
    private CentroVacunacion centro_persona;

    
    

    


    public Persona() {
    }


    public Persona(int id_persona, String dni_persona, String nombreCompleto_persona, String fechaNacimiento_persona, String sexo_persona, int edad, Ubicacion ubicacion_persona, Contacto contacto_persona,
     Formulario formulario_Persona, Afeccion Afeccion_persona, Double prioridad, Boolean cita) {
        this.id_persona = id_persona;
        this.dni_persona = dni_persona;
        this.nombreCompleto_persona = nombreCompleto_persona;
        this.fechaNacimiento_persona = fechaNacimiento_persona;
        this.sexo_persona = sexo_persona;
        this.edad = edad;
        this.ubicacion_persona = ubicacion_persona;
        this.contacto_persona = contacto_persona;
        this.formulario_Persona = formulario_Persona;
        this.Afeccion_persona = Afeccion_persona;
        this.prioridad = prioridad;
        this.cita = cita;
        this.encuestado = false;
    }
    


    public Persona(String dni_persona, String nombreCompleto_persona, String fechaNacimiento_persona, String sexo_persona, Ubicacion ubicacion_persona, 
    Contacto contacto_persona, int edad, Double prioridad, Boolean cita) {
        // this.id_persona = id_persona;
        this.dni_persona = dni_persona;
        this.nombreCompleto_persona = nombreCompleto_persona;
        this.fechaNacimiento_persona = fechaNacimiento_persona;
        this.sexo_persona = sexo_persona;
        this.ubicacion_persona = ubicacion_persona;
        this.contacto_persona = contacto_persona;
        this.edad = edad;
        this.prioridad = prioridad;
        this.encuestado = false;
    }

    public Persona(String dni_persona, String nombreCompleto_persona, String fechaNacimiento_persona,
     String sexo_persona, int edad, Double prioridad, Boolean cita) {
        // this.id_persona = id_persona;
        this.dni_persona = dni_persona;
        this.nombreCompleto_persona = nombreCompleto_persona;
        this.fechaNacimiento_persona = fechaNacimiento_persona;
        this.sexo_persona = sexo_persona;
        this.edad = edad;
        this.prioridad = prioridad;
        this.cita = cita;
        this.encuestado = false;
        
    }


    public Persona(String dni_persona, String nombreCompleto_persona, String fechaNacimiento_persona,
     String sexo_persona, Ubicacion ubicacion_persona, Contacto contacto_persona,
      Afeccion Afeccion_persona, int edad, Double prioridad, Boolean cita) {
        this.dni_persona = dni_persona;
        this.nombreCompleto_persona = nombreCompleto_persona;
        this.fechaNacimiento_persona = fechaNacimiento_persona;
        this.sexo_persona = sexo_persona;
        this.ubicacion_persona = ubicacion_persona;
        this.contacto_persona = contacto_persona;
        this.formulario_Persona = formulario_Persona;
        this.Afeccion_persona = Afeccion_persona;
        this.edad = edad;
        this.prioridad = prioridad;
        this.cita = cita;

        this.encuestado = false;
    }

    public Persona(String dni_persona, String nombreCompleto_persona, String fechaNacimiento_persona,
     String sexo_persona, Ubicacion ubicacion_persona, Contacto contacto_persona,
      Afeccion Afeccion_persona, int edad, Double prioridad, Boolean cita, Boolean IVR) {
        this.dni_persona = dni_persona;
        this.nombreCompleto_persona = nombreCompleto_persona;
        this.fechaNacimiento_persona = fechaNacimiento_persona;
        this.sexo_persona = sexo_persona;
        this.ubicacion_persona = ubicacion_persona;
        this.contacto_persona = contacto_persona;
        this.formulario_Persona = formulario_Persona;
        this.Afeccion_persona = Afeccion_persona;
        this.edad = edad;
        this.prioridad = prioridad;
        this.cita = cita;
        this.IVR = IVR;
        this.encuestado = false;
    }

    public int getId_persona() {
        return this.id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getDni_persona() {
        return this.dni_persona;
    }

    public void setDni_persona(String dni_persona) {
        this.dni_persona = dni_persona;
    }

    public String getNombreCompleto_persona() {
        return this.nombreCompleto_persona;
    }

    public void setNombreCompleto_persona(String nombreCompleto_persona) {
        this.nombreCompleto_persona = nombreCompleto_persona;
    }

    public String getFechaNacimiento_persona() {
        return this.fechaNacimiento_persona;
    }

    public void setFechaNacimiento_persona(String fechaNacimiento_persona) {
        this.fechaNacimiento_persona = fechaNacimiento_persona;
    }

    public String getSexo_persona() {
        return this.sexo_persona;
    }

    public void setSexo_persona(String sexo_persona) {
        this.sexo_persona = sexo_persona;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Ubicacion getUbicacion_persona() {
        return this.ubicacion_persona;
    }

    public void setUbicacion_persona(Ubicacion ubicacion_persona) {
        this.ubicacion_persona = ubicacion_persona;
    }

    public Contacto getContacto_persona() {
        return this.contacto_persona;
    }

    public void setContacto_persona(Contacto contacto_persona) {
        this.contacto_persona = contacto_persona;
    }

    public Formulario getFormulario_Persona() {
        return this.formulario_Persona;
    }

    public void setFormulario_Persona(Formulario formulario_Persona) {
        this.formulario_Persona = formulario_Persona;
    }

    public Afeccion getAfeccion_persona() {
        return this.Afeccion_persona;
    }

    public void setAfeccion_persona(Afeccion Afeccion_persona) {
        this.Afeccion_persona = Afeccion_persona;
    }

    public Double getPrioridad() {
        return this.prioridad;
    }

    public void setPrioridad(Double prioridad) {
        this.prioridad = prioridad;
    }


    public Boolean isPrimeraDosis() {
        return this.primeraDosis;
    }

    public Boolean getPrimeraDosis() {
        return this.primeraDosis;
    }

    public void setPrimeraDosis(Boolean primeraDosis) {
        this.primeraDosis = primeraDosis;
    }

    public Boolean isSegundaDosis() {
        return this.segundaDosis;
    }

    public Boolean getSegundaDosis() {
        return this.segundaDosis;
    }

    public void setSegundaDosis(Boolean segundaDosis) {
        this.segundaDosis = segundaDosis;
    }

    public List<CitaVacunacion> getCitasPersona() {
        return citasPersona;
    }

    public void setCitasPersona(List<CitaVacunacion> citasPersona) {
        this.citasPersona = citasPersona;
    }
  
    public void addCitas(CitaVacunacion citasPersona) {
        getCitasPersona().add(citasPersona);
    }


    public Boolean isCita() {
        return this.cita;
    }

    public Boolean getCita() {
        return this.cita;
    }

    public void setCita(Boolean cita) {
        this.cita = cita;
    }

    public List<Survey> getSurveysPersona() {
        return this.surveysPersona;
    }

    public void setSurveysPersona(List<Survey> surveysPersona) {
        this.surveysPersona = surveysPersona;
    }
    
    public void addSurvey(Survey surveyPersona) {
        getSurveysPersona().add(surveyPersona);
    }

    public Boolean isIVR() {
        return this.IVR;
    }

    public Boolean getIVR() {
        return this.IVR;
    }

    public void setIVR(Boolean IVR) {
        this.IVR = IVR;
    }

    public CentroVacunacion getCentro_persona() {
        return this.centro_persona;
    }

    public void setCentro_persona(CentroVacunacion centro_persona) {
        this.centro_persona = centro_persona;
    }

    public Boolean isEncuestado() {
        return this.encuestado;
    }

    public Boolean getEncuestado() {
        return this.encuestado;
    }

    public void setEncuestado(Boolean encuestado) {
        this.encuestado = encuestado;
    }

    public Boolean isMailSent() {
        return this.mailSent;
    }

    public Boolean getMailSent() {
        return this.mailSent;
    }

    public void setMailSent(Boolean mailSent) {
        this.mailSent = mailSent;
    }
}