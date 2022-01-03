package ProyectoVacunacion.ClienteREST.Models;

import javax.persistence.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.*;

@Entity
public class Ubicacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Se genera el ID automatico
    private int id_ubicacion;

    @Column
    private String provincia;

    @Column
    private String municipio;

    @Column
    private String sector;

    @Column
    private String latitud;

    @Column
    private String longitud;



    public Ubicacion() {
    }


    public Ubicacion(int id_ubicacion, String provincia, String municipio, String sector, String latitud, String longitud) {
        this.id_ubicacion = id_ubicacion;
        this.provincia = provincia;
        this.municipio = municipio;
        this.sector = sector;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Ubicacion(String provincia, String municipio, String sector, String latitud, String longitud) {
        // this.id_ubicacion = id_ubicacion;
        this.provincia = provincia;
        this.municipio = municipio;
        this.sector = sector;
        this.latitud = latitud;
        this.longitud = longitud;
    }


    public int getId_ubicacion() {
        return this.id_ubicacion;
    }

    public void setId_ubicacion(int id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }

    public String getProvincia() {
        return this.provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getMunicipio() {
        return this.municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getSector() {
        return this.sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getLatitud() {
        return this.latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return this.longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
    

    }
