package ProyectoVacunacion.ClienteREST.Services;

import ProyectoVacunacion.ClienteREST.Models.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

public class UsuarioServices extends GestionDb<Usuario>  {
    private static UsuarioServices instance;

    public UsuarioServices() {
        super(Usuario.class);
    }

    public static UsuarioServices getInstance() {
        if(instance==null){
            instance = new UsuarioServices();
        }
        return instance;
    }
    public Usuario getUsuario(String username){

        // System.out.println(username);

        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Usuario aux = (Usuario)em.createQuery(" SELECT u FROM Usuario u  where  u.username = :auxusrname")
        .setParameter("auxusrname", username)
        .getSingleResult();
        em.getTransaction().commit();
        em.close();

        return aux;
    }
    public boolean verify_user(String username, String password){

        Usuario aux = getUsuario(username);

        try {
            
            if (aux.getUsername().equalsIgnoreCase(username) && aux.getPasswd_usuario().equals(password)){
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }

    public void editUser(Usuario auxUsuario) {
        

            int user = getUsuario(auxUsuario.getUsername()).getId_Usuario();

            // EntityManager em = getEntityManager();
            // em.getTransaction().begin();
            // Object user = em.createQuery(" SELECT u.id_Usuario FROM Usuario u  where  u.username = :auxusrname")
            // .setParameter("auxusrname", auxUsuario.getUsername())
            // .getSingleResult();
            // em.getTransaction().commit();
            // em.close();
            
            EntityManager em1 = getEntityManager();
            em1.getTransaction().begin();
            Query updateuser = em1.createQuery("UPDATE Usuario u SET u.username = :nmusuario, u.nombre_usuario = :nombreuser, u.rol_usuario = :roluser WHERE u.id_Usuario = :idusr")
            .setParameter("nmusuario", auxUsuario.getUsername().toString())
            .setParameter("nombreuser", auxUsuario.getNombre_usuario().toString())
            .setParameter("roluser", auxUsuario.getRol_usuario().toString())
            .setParameter("idusr", (Integer) user);
            int rowsUpdated = updateuser.executeUpdate();
            em1.getTransaction().commit();
            em1.close();
        
    }
    
}
