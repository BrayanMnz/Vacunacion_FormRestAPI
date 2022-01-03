package ProyectoVacunacion.ClienteREST.Models;

import javax.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
public class CitaVacunacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Se genera el ID automatico
    private int id_CitaVacunacion;

    @Column
    private Date fecha_Cita;

    @OneToOne
    @JoinColumn(name = "Persona")
    private Persona persona_CitaVacunacion;

    @OneToOne
    @JoinColumn(name = "CentroVacunacion")
    private CentroVacunacion centro_CitaVacunacion;



    public CitaVacunacion() {
    }


    public CitaVacunacion(int id_CitaVacunacion, Date fecha_Cita, Persona persona_CitaVacunacion, CentroVacunacion centro_CitaVacunacion) {
        this.id_CitaVacunacion = id_CitaVacunacion;
        this.fecha_Cita = fecha_Cita;
        this.persona_CitaVacunacion = persona_CitaVacunacion;
        this.centro_CitaVacunacion = centro_CitaVacunacion;
    }

    public CitaVacunacion(Date fecha_Cita, Persona persona_CitaVacunacion, CentroVacunacion centro_CitaVacunacion) {
     //   this.id_CitaVacunacion = id_CitaVacunacion;
        this.fecha_Cita = fecha_Cita;
        this.persona_CitaVacunacion = persona_CitaVacunacion;
        this.centro_CitaVacunacion = centro_CitaVacunacion;
    }

    public CitaVacunacion(Date fecha_Cita) {
        //   this.id_CitaVacunacion = id_CitaVacunacion;
           this.fecha_Cita = fecha_Cita;
       }



    public int getId_CitaVacunacion() {
        return this.id_CitaVacunacion;
    }

    public void setId_CitaVacunacion(int id_CitaVacunacion) {
        this.id_CitaVacunacion = id_CitaVacunacion;
    }

    public Date getFecha_Cita() {
        return this.fecha_Cita;
    }

    public void setFecha_Cita(Date fecha_Cita) {
        this.fecha_Cita = fecha_Cita;
    }

    public Persona getPersona_CitaVacunacion() {
        return this.persona_CitaVacunacion;
    }

    public void setPersona_CitaVacunacion(Persona persona_CitaVacunacion) {
        this.persona_CitaVacunacion = persona_CitaVacunacion;
    }

    public CentroVacunacion getCentro_CitaVacunacion() {
        return this.centro_CitaVacunacion;
    }

    public void setCentro_CitaVacunacion(CentroVacunacion centro_CitaVacunacion) {
        this.centro_CitaVacunacion = centro_CitaVacunacion;
    }


    }
