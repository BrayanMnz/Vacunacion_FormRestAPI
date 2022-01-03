package ProyectoVacunacion.ClienteREST.Models;

import javax.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
public class SignosVitales implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Se genera el ID automatico
    private int id_signos;

    @Column
    private Double temperatura;

    @Column 
    private Double spo2; 

    @Column
    private Double heartrate; 

    @Column
    private Double systolic;

    @Column
    private Double diastolic;

 
    @Column 
    private Date FechaHora;

    @OneToOne
    @JoinColumn(name = "fk_persona")
    private Persona persona_Vitales;

    public SignosVitales() {
    }


    public SignosVitales( Double temperatura, Double spo2, Double heartrate, Double systolic, Double diastolic, Date FechaHora, Persona persona_Vitales) {
        
        this.temperatura = temperatura;
        this.spo2 = spo2;
        this.heartrate = heartrate;
        this.systolic = systolic;
        this.FechaHora = FechaHora;
        this.persona_Vitales = persona_Vitales;
        this.diastolic = diastolic;
    }

    public SignosVitales( Double temperatura, Double spo2, Double heartrate, Double systolic, Double diastolic) {

        this.temperatura = temperatura;
        this.spo2 = spo2;
        this.heartrate = heartrate;
        this.systolic = systolic;
        
        this.diastolic = diastolic;
    }
    
    

    public int getId_signos() {
        return this.id_signos;
    }

    public void setId_signos(int id_signos) {
        this.id_signos = id_signos;
    }

    public Double getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public Double getSpo2() {
        return this.spo2;
    }

    public void setSpo2(Double spo2) {
        this.spo2 = spo2;
    }

    public Double getHeartrate() {
        return this.heartrate;
    }

    public void setHeartrate(Double heartrate) {
        this.heartrate = heartrate;
    }


    public Double getSystolic() {
        return this.systolic;
    }

    public void setSystolic(Double systolic) {
        this.systolic = systolic;
    }

    public Double getDiastolic() {
        return this.diastolic;
    }

    public void setDiastolic(Double diastolic) {
        this.diastolic = diastolic;
    }
    


    public Date getFechaHora() {
        return this.FechaHora;
    }

    public void setFechaHora(Date FechaHora) {
        this.FechaHora = FechaHora;
    }

    public Persona getPersona_Vitales() {
        return this.persona_Vitales;
    }

    public void setPersona_Vitales(Persona persona_Vitales) {
        this.persona_Vitales = persona_Vitales;
    }

    }
