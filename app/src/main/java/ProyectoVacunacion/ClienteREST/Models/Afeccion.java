package ProyectoVacunacion.ClienteREST.Models;

import javax.persistence.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.*;

@Entity
public class Afeccion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Se genera el ID automatico
    private int id_afeccion;

    @Column
    private String titulo_afeccion;

    @Column 
    private String descripcion_afeccion; 

    @Column
    private int prioridad_afeccion; 


    public Afeccion() {
    }

    public Afeccion(int id_afeccion, String titulo_afeccion, String descripcion_afeccion, int prioridad_afeccion) {
        this.id_afeccion = id_afeccion;
        this.titulo_afeccion = titulo_afeccion;
        this.descripcion_afeccion = descripcion_afeccion;
        this.prioridad_afeccion = prioridad_afeccion;
    }

    public Afeccion( String titulo_afeccion, String descripcion_afeccion, int prioridad_afeccion) {
        this.titulo_afeccion = titulo_afeccion;
        this.descripcion_afeccion = descripcion_afeccion;
        this.prioridad_afeccion = prioridad_afeccion;
    }



    public int getId_afeccion() {
        return this.id_afeccion;
    }

    public void setId_afeccion(int id_afeccion) {
        this.id_afeccion = id_afeccion;
    }

    public String getTitulo_afeccion() {
        return this.titulo_afeccion;
    }

    public void setTitulo_afeccion(String titulo_afeccion) {
        this.titulo_afeccion = titulo_afeccion;
    }

    public String getDescripcion_afeccion() {
        return this.descripcion_afeccion;
    }

    public void setDescripcion_afeccion(String descripcion_afeccion) {
        this.descripcion_afeccion = descripcion_afeccion;
    }

    public int getPrioridad_afeccion() {
        return this.prioridad_afeccion;
    }

    public void setPrioridad_afeccion(int prioridad_afeccion) {
        this.prioridad_afeccion = prioridad_afeccion;
    }


    }
