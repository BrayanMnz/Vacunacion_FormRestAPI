package ProyectoVacunacion.ClienteREST.Models;

import javax.persistence.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.*;

@Entity
public class Survey implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Se genera el ID automatico
    private int id_Survey;

    @Column
    private String tos;

    @Column
    private String diarrea;
    
    @Column
    private String nausea;
    
    @Column
    private String garganta;

    @Column
    private String secrecionNasal;

    @Column
    private String respirar;

    @Column
    private String Fiebre;

    @Column
    private String hospitalizado;

    @Column
    private String hospitalNombre;

    @Column
    private String Uci;

    @Column
    private String otraEnfermedad;

    @Column
    private String nombreEnfermedad;

    @Column
    private String ventilador;

    @Column
    private String oxigenoEmo;

    @Column
    private String ayudanteNombre;

    @Column
    private String relacion;

    @Column
    private String ayudanteEmail;

    @Column
    private String ayudanteTelefono;



    @OneToOne
    @JoinColumn(name = "Persona")
    private Persona persona_Survey;



    public Survey() {
    }


    public Survey(int id_Survey, String tos, String diarrea, String nausea, String garganta, String secrecionNasal, String respirar, String Fiebre, String hospitalizado, String hospitalNombre, String Uci, String otraEnfermedad, String nombreEnfermedad, String ventilador, String oxigenoEmo, String ayudanteNombre, String relacion, String ayudanteEmail, String ayudanteTelefono, Persona persona_Survey) {
        this.id_Survey = id_Survey;
        this.tos = tos;
        this.diarrea = diarrea;
        this.nausea = nausea;
        this.garganta = garganta;
        this.secrecionNasal = secrecionNasal;
        this.respirar = respirar;
        this.Fiebre = Fiebre;
        this.hospitalizado = hospitalizado;
        this.hospitalNombre = hospitalNombre;
        this.Uci = Uci;
        this.otraEnfermedad = otraEnfermedad;
        this.nombreEnfermedad = nombreEnfermedad;
        this.ventilador = ventilador;
        this.oxigenoEmo = oxigenoEmo;
        this.ayudanteNombre = ayudanteNombre;
        this.relacion = relacion;
        this.ayudanteEmail = ayudanteEmail;
        this.ayudanteTelefono = ayudanteTelefono;
        this.persona_Survey = persona_Survey;
    }

    public Survey(String tos, String diarrea, String nausea, String garganta, String secrecionNasal, String respirar, String Fiebre, String hospitalizado, String hospitalNombre, String Uci, String otraEnfermedad, String nombreEnfermedad, String ventilador, String oxigenoEmo, String ayudanteNombre, String relacion, String ayudanteEmail, String ayudanteTelefono, Persona persona_Survey) {
        this.tos = tos;
        this.diarrea = diarrea;
        this.nausea = nausea;
        this.garganta = garganta;
        this.secrecionNasal = secrecionNasal;
        this.respirar = respirar;
        this.Fiebre = Fiebre;
        this.hospitalizado = hospitalizado;
        this.hospitalNombre = hospitalNombre;
        this.Uci = Uci;
        this.otraEnfermedad = otraEnfermedad;
        this.nombreEnfermedad = nombreEnfermedad;
        this.ventilador = ventilador;
        this.oxigenoEmo = oxigenoEmo;
        this.ayudanteNombre = ayudanteNombre;
        this.relacion = relacion;
        this.ayudanteEmail = ayudanteEmail;
        this.ayudanteTelefono = ayudanteTelefono;
        this.persona_Survey = persona_Survey;
    }


    public Survey(String tos, String diarrea, String nausea, String garganta, String secrecionNasal, String respirar, String Fiebre, String hospitalizado, String hospitalNombre, String Uci, String otraEnfermedad, String nombreEnfermedad, String ventilador, String oxigenoEmo,  Persona persona_Survey) {
        this.tos = tos;
        this.diarrea = diarrea;
        this.nausea = nausea;
        this.garganta = garganta;
        this.secrecionNasal = secrecionNasal;
        this.respirar = respirar;
        this.Fiebre = Fiebre;
        this.hospitalizado = hospitalizado;
        this.hospitalNombre = hospitalNombre;
        this.Uci = Uci;
        this.otraEnfermedad = otraEnfermedad;
        this.nombreEnfermedad = nombreEnfermedad;
        this.ventilador = ventilador;
        this.oxigenoEmo = oxigenoEmo;
        this.persona_Survey = persona_Survey;
    }




    public int getId_Survey() {
        return this.id_Survey;
    }

    public void setId_Survey(int id_Survey) {
        this.id_Survey = id_Survey;
    }

    public String getTos() {
        return this.tos;
    }

    public void setTos(String tos) {
        this.tos = tos;
    }

    public String getDiarrea() {
        return this.diarrea;
    }

    public void setDiarrea(String diarrea) {
        this.diarrea = diarrea;
    }

    public String getNausea() {
        return this.nausea;
    }

    public void setNausea(String nausea) {
        this.nausea = nausea;
    }

    public String getGarganta() {
        return this.garganta;
    }

    public void setGarganta(String garganta) {
        this.garganta = garganta;
    }

    public String getSecrecionNasal() {
        return this.secrecionNasal;
    }

    public void setSecrecionNasal(String secrecionNasal) {
        this.secrecionNasal = secrecionNasal;
    }

    public String getRespirar() {
        return this.respirar;
    }

    public void setRespirar(String respirar) {
        this.respirar = respirar;
    }

    public String getFiebre() {
        return this.Fiebre;
    }

    public void setFiebre(String Fiebre) {
        this.Fiebre = Fiebre;
    }

    public String getHospitalizado() {
        return this.hospitalizado;
    }

    public void setHospitalizado(String hospitalizado) {
        this.hospitalizado = hospitalizado;
    }

    public String getHospitalNombre() {
        return this.hospitalNombre;
    }

    public void setHospitalNombre(String hospitalNombre) {
        this.hospitalNombre = hospitalNombre;
    }

    public String getUci() {
        return this.Uci;
    }

    public void setUci(String Uci) {
        this.Uci = Uci;
    }

    public String getOtraEnfermedad() {
        return this.otraEnfermedad;
    }

    public void setOtraEnfermedad(String otraEnfermedad) {
        this.otraEnfermedad = otraEnfermedad;
    }

    public String getNombreEnfermedad() {
        return this.nombreEnfermedad;
    }

    public void setNombreEnfermedad(String nombreEnfermedad) {
        this.nombreEnfermedad = nombreEnfermedad;
    }

    public String getVentilador() {
        return this.ventilador;
    }

    public void setVentilador(String ventilador) {
        this.ventilador = ventilador;
    }

    public String getOxigenoEmo() {
        return this.oxigenoEmo;
    }

    public void setOxigenoEmo(String oxigenoEmo) {
        this.oxigenoEmo = oxigenoEmo;
    }

    public String getAyudanteNombre() {
        return this.ayudanteNombre;
    }

    public void setAyudanteNombre(String ayudanteNombre) {
        this.ayudanteNombre = ayudanteNombre;
    }

    public String getRelacion() {
        return this.relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public String getAyudanteEmail() {
        return this.ayudanteEmail;
    }

    public void setAyudanteEmail(String ayudanteEmail) {
        this.ayudanteEmail = ayudanteEmail;
    }

    public String getAyudanteTelefono() {
        return this.ayudanteTelefono;
    }

    public void setAyudanteTelefono(String ayudanteTelefono) {
        this.ayudanteTelefono = ayudanteTelefono;
    }

    public Persona getPersona_Survey() {
        return this.persona_Survey;
    }

    public void setPersona_Survey(Persona persona_Survey) {
        this.persona_Survey = persona_Survey;
    }


    }
