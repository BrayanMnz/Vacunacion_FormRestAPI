package ProyectoVacunacion.ClienteREST.Models;

import javax.persistence.*;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import java.io.Serializable;
import java.util.*;

@Entity
public class CentroVacunacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Se genera el ID automatico
    private int id_CentroVacunacion;

    @Column
    private String nombre_Centro;

    @Column
    private String descripcion_Centro;

    @Column
    private int dosis_Disponibles = 0;


    @Column
    private Date ultimaCita = null;

 
    @OneToOne
    @JoinColumn(name = "Ubicacion")
    private Ubicacion ubicacion_Centro;


    @OneToMany
    @LazyCollection(LazyCollectionOption.FALSE)
    private  List<Persona> personasCentro;

    @OneToMany()
    private  List<CitaVacunacion> citasCentro;

    @OneToMany()
    @LazyCollection(LazyCollectionOption.FALSE)
    private  List<EstacionVitales> EstacionesCentro;

  


    public CentroVacunacion() {
    }

    public CentroVacunacion(int id_CentroVacunacion, String nombre_Centro, String descripcion_Centro, Ubicacion ubicacion_Centro) {
        this.id_CentroVacunacion = id_CentroVacunacion;
        this.nombre_Centro = nombre_Centro;
        this.descripcion_Centro = descripcion_Centro;
        this.ubicacion_Centro = ubicacion_Centro;
        this.ultimaCita = null;
        
    }

    public CentroVacunacion(String nombre_Centro, String descripcion_Centro, int dosis_Disponibles, Ubicacion ubicacion_Centro) {
        
        this.nombre_Centro = nombre_Centro;
        this.descripcion_Centro = descripcion_Centro;
        this.dosis_Disponibles = dosis_Disponibles;
        this.ubicacion_Centro = ubicacion_Centro;
    }

    public CentroVacunacion(String nombre_Centro, String descripcion_Centro,  Ubicacion ubicacion_Centro) {
        
        this.nombre_Centro = nombre_Centro;
        this.descripcion_Centro = descripcion_Centro;
        this.ubicacion_Centro = ubicacion_Centro;
    }


    public int getId_CentroVacunacion() {
        return this.id_CentroVacunacion;
    }

    public void setId_CentroVacunacion(int id_CentroVacunacion) {
        this.id_CentroVacunacion = id_CentroVacunacion;
    }

    public String getNombre_Centro() {
        return this.nombre_Centro;
    }

    public void setNombre_Centro(String nombre_Centro) {
        this.nombre_Centro = nombre_Centro;
    }

    public String getDescripcion_Centro() {
        return this.descripcion_Centro;
    }

    public void setDescripcion_Centro(String descripcion_Centro) {
        this.descripcion_Centro = descripcion_Centro;
    }

    public int getDosis_Disponibles() {
        return this.dosis_Disponibles;
    }

    public void setDosis_Disponibles(int dosis_Disponibles) {
        this.dosis_Disponibles = dosis_Disponibles;
    }

    public Ubicacion getUbicacion_Centro() {
        return this.ubicacion_Centro;
    }

    public void setUbicacion_Centro(Ubicacion ubicacion_Centro) {
        this.ubicacion_Centro = ubicacion_Centro;
    }


    public List<Persona> getPersonasCentro() {
        return personasCentro;
    }

    public void setPersonasCentro(List<Persona> personasCentro) {
        this.personasCentro = personasCentro;
    }

    public void addPersonas(Persona personasCentro) {
            getPersonasCentro().add(personasCentro);
    }

    public void addCitas(CitaVacunacion citasCentro) {
        getCitasCentro().add(citasCentro);
    }

    public Date getUltimaCita() {
        return this.ultimaCita;
    }

    public void setUltimaCita(Date ultimaCita) {
        this.ultimaCita = ultimaCita;
    }

    public List<CitaVacunacion> getCitasCentro() {
        return this.citasCentro;
    }

    public void setCitasCentro(List<CitaVacunacion> citasCentro) {
        this.citasCentro = citasCentro;
    }


    public List<EstacionVitales> getEstacionesCentro() {
        return this.EstacionesCentro;
    }

    public void setEstacionesCentro(List<EstacionVitales> EstacionesCentro) {
        this.EstacionesCentro = EstacionesCentro;
    }

    

    }
