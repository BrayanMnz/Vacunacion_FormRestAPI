package ProyectoVacunacion.ClienteREST.Models;

import javax.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
public class Vacuna implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Se genera el ID automatico
    private int id_Vacuna;

    @Column
    private String laboratorio;

    @Column
    private String lote;

    @Column
    private String tipo_Vacuna;

    @OneToOne
    @JoinColumn(name = "CentroVacunacion")
    private CentroVacunacion centro_Vacunacion;

    @Column
    private int cantVacunas;

    


    public Vacuna() {
    }

    public Vacuna(int id_Vacuna, String laboratorio, String lote, String tipo_Vacuna, CentroVacunacion centro_Vacunacion) {
        this.id_Vacuna = id_Vacuna;
        this.laboratorio = laboratorio;
        this.lote = lote;
        this.tipo_Vacuna = tipo_Vacuna;
        this.centro_Vacunacion = centro_Vacunacion;
    }

    public Vacuna(int id_Vacuna, String laboratorio, String lote, String tipo_Vacuna, int cantVacuna) {
        this.id_Vacuna = id_Vacuna;
        this.laboratorio = laboratorio;
        this.lote = lote;
        this.tipo_Vacuna = tipo_Vacuna;
        this.cantVacunas = cantVacuna;
     }


    public Vacuna(String laboratorio, String lote, String tipo_Vacuna, int cantVacuna) {
        // this.id_Vacuna = id_Vacuna;
        this.laboratorio = laboratorio;
        this.lote = lote;
        this.tipo_Vacuna = tipo_Vacuna;
        // this.centro_Vacunacion = centro_Vacunacion;
        this.cantVacunas = cantVacuna;
    }


    public int getId_Vacuna() {
        return this.id_Vacuna;
    }

    public void setId_Vacuna(int id_Vacuna) {
        this.id_Vacuna = id_Vacuna;
    }

    public String getLaboratorio() {
        return this.laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getLote() {
        return this.lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getTipo_Vacuna() {
        return this.tipo_Vacuna;
    }

    public void setTipo_Vacuna(String tipo_Vacuna) {
        this.tipo_Vacuna = tipo_Vacuna;
    }

    public CentroVacunacion getCentro_Vacunacion() {
        return this.centro_Vacunacion;
    }

    public void setCentro_Vacunacion(CentroVacunacion centro_Vacunacion) {
        this.centro_Vacunacion = centro_Vacunacion;
    }

    public int getCantVacunas() {
        return this.cantVacunas;
    }

    public void setCantVacunas(int cantVacunas) {
        this.cantVacunas = cantVacunas;
    }

    }
