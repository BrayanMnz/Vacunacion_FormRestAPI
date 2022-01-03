package ProyectoVacunacion.ClienteREST.Models;

import javax.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
public class Formulario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Se genera el ID automatico
    private int id_Formulario;

    @Column
    private String descripcion_Formulario;

    @OneToOne
    @JoinColumn(name = "fk_personaFormulario")
    private Persona persona_Formulario;

    public Formulario() {
    }

    public Formulario(int id_Formulario, String descripcion_Formulario, Persona persona_Formulario) {
        this.id_Formulario = id_Formulario;
        this.descripcion_Formulario = descripcion_Formulario;
        this.persona_Formulario = persona_Formulario;
    }

    public Formulario( String descripcion_Formulario, Persona persona_Formulario) {
        this.descripcion_Formulario = descripcion_Formulario;
        this.persona_Formulario = persona_Formulario;
    }


    public int getId_Formulario() {
        return this.id_Formulario;
    }

    public void setId_Formulario(int id_Formulario) {
        this.id_Formulario = id_Formulario;
    }

    public String getDescripcion_Formulario() {
        return this.descripcion_Formulario;
    }

    public void setDescripcion_Formulario(String descripcion_Formulario) {
        this.descripcion_Formulario = descripcion_Formulario;
    }

    public Persona getPersona_Formulario() {
        return this.persona_Formulario;
    }

    public void setPersona_Formulario(Persona persona_Formulario) {
        this.persona_Formulario = persona_Formulario;
    }


    }
