package ProyectoVacunacion.ClienteREST.Models;

import javax.persistence.*;

import java.util.*;

@Entity
public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Se genera el ID automatico
    private int id_Usuario;

    @Column
    public String username;
    @Column
    public String passwd_usuario;
    @Column
    public String nombre_usuario;
    @Column
    public String rol_usuario; 

    @OneToOne
    @JoinColumn(name = "Estacion")
    private EstacionVitales EstacionVitales;

  
    public Usuario() {
    }





    public Usuario(String username, String passwd_usuario, String nombre_usuario, String rol_usuario, EstacionVitales EstacionVitales) {
        this.username = username;
        this.passwd_usuario = passwd_usuario;
        this.nombre_usuario = nombre_usuario;
        this.rol_usuario = rol_usuario;
        this.EstacionVitales = EstacionVitales;
    }



    public Usuario(String username, String passwd_usuario, String nombre_usuario, String rol_usuario) {
        this.username = username;
        this.passwd_usuario = passwd_usuario;
        this.nombre_usuario = nombre_usuario;
        this.rol_usuario = rol_usuario;
    }

    public Usuario(String username, String nombre_usuario, String rol_usuario) {
        this.username = username;
        
        this.nombre_usuario = nombre_usuario;
        this.rol_usuario = rol_usuario;
    }



    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd_usuario() {
        return this.passwd_usuario;
    }

    public void setPasswd_usuario(String passwd_usuario) {
        this.passwd_usuario = passwd_usuario;
    }

    public String getNombre_usuario() {
        return this.nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getRol_usuario() {
        return this.rol_usuario;
    }

    public void setRol_usuario(String rol_usuario) {
        this.rol_usuario = rol_usuario;
    }

    

    /**
     * @return int return the id_Usuario
     */
    public int getId_Usuario() {
        return id_Usuario;
    }

    /**
     * @param id_Usuario the id_Usuario to set
     */
    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public EstacionVitales getEstacionVitales() {
        return this.EstacionVitales;
    }

    public void setEstacionVitales(EstacionVitales EstacionVitales) {
        this.EstacionVitales = EstacionVitales;
    }


}