package ProyectoVacunacion.ClienteREST.Models;

import javax.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
public class EstacionVitales implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Se genera el ID automatico
    private int id_EstacionVitales;


    @Column
    private String descripcionEstacion;

    @Column
    private Date lastSeen;

    @OneToOne
    @JoinColumn(name = "Ubicacion")
    private Ubicacion ubicacion_Centro;

    @OneToOne
    @JoinColumn(name = "Centro")
    private CentroVacunacion centroVacunacion;

   @Column 
   private Boolean hasPerson; 

   @OneToOne
   @JoinColumn(name="Persona")
   private Persona personaEstacion;


   


    public EstacionVitales() {
    }




    public EstacionVitales(String descripcionEstacion, Date lastSeen, Ubicacion ubicacion_Centro, CentroVacunacion centroVacunacion, Persona personaEstacion) {
        this.descripcionEstacion = descripcionEstacion;
        this.lastSeen = lastSeen;
        this.ubicacion_Centro = ubicacion_Centro;
        this.centroVacunacion = centroVacunacion;
        this.hasPerson = false;
        this.personaEstacion = personaEstacion;
    }

    public EstacionVitales(String descripcionEstacion,CentroVacunacion centroVacunacion) {
        this.descripcionEstacion = descripcionEstacion;
        this.centroVacunacion = centroVacunacion;
        this.hasPerson = false;
        
    }

    public EstacionVitales(String descripcionEstacion, Date lastSeen, Ubicacion ubicacion_Centro, CentroVacunacion centroVacunacion) {
       // this.id_EstacionVitales = id_EstacionVitales;
        this.descripcionEstacion = descripcionEstacion;
        this.lastSeen = lastSeen;
        this.ubicacion_Centro = ubicacion_Centro;
        this.centroVacunacion = centroVacunacion;
        this.hasPerson = false;
    }



    public EstacionVitales(String descripcionEstacion, Date lastSeen, Ubicacion ubicacion_Centro) {
        
        this.descripcionEstacion = descripcionEstacion;
        this.lastSeen = lastSeen;
        this.ubicacion_Centro = ubicacion_Centro;
        this.hasPerson = false;
    }


    public EstacionVitales(int id_EstacionVitales, Date lastSeen, Ubicacion ubicacion_Centro) {
        this.id_EstacionVitales = id_EstacionVitales;
        this.lastSeen = lastSeen;
        this.ubicacion_Centro = ubicacion_Centro;
        this.hasPerson = false;
    }

    public EstacionVitales( Date lastSeen) {
        this.lastSeen = lastSeen;  
    }




    public int getId_EstacionVitales() {
        return this.id_EstacionVitales;
    }

    public void setId_EstacionVitales(int id_EstacionVitales) {
        this.id_EstacionVitales = id_EstacionVitales;
    }

    public Date getLastSeen() {
        return this.lastSeen;
    }

    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    public Ubicacion getUbicacion_Centro() {
        return this.ubicacion_Centro;
    }

    public void setUbicacion_Centro(Ubicacion ubicacion_Centro) {
        this.ubicacion_Centro = ubicacion_Centro;
    }


    public String getDescripcionEstacion() {
        return this.descripcionEstacion;
    }

    public void setDescripcionEstacion(String descripcionEstacion) {
        this.descripcionEstacion = descripcionEstacion;
    }

    public CentroVacunacion getCentroVacunacion() {
        return this.centroVacunacion;
    }

    public void setCentroVacunacion(CentroVacunacion centroVacunacion) {
        this.centroVacunacion = centroVacunacion;
    }


    public Boolean isHasPerson() {
        return this.hasPerson;
    }

    public Boolean getHasPerson() {
        return this.hasPerson;
    }

    public void setHasPerson(Boolean hasPerson) {
        this.hasPerson = hasPerson;
    }

    public Persona getPersonaEstacion() {
        return this.personaEstacion;
    }

    public void setPersonaEstacion(Persona personaEstacion) {
        this.personaEstacion = personaEstacion;
    }


    
}
