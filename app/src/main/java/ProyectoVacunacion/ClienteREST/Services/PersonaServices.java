package ProyectoVacunacion.ClienteREST.Services;

import ProyectoVacunacion.ClienteREST.Models.Persona;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import ProyectoVacunacion.ClienteREST.Models.*;


/**
 *
 * Created by vacax on 03/06/16.
 */
public class PersonaServices extends GestionDb<Persona> {

    private static PersonaServices instancia;

    private PersonaServices() {
        super(Persona.class);
    }

    public static PersonaServices getInstancia(){
        if(instancia==null){
            instancia = new PersonaServices();
        }
        return instancia;
    }

    /**
     *
     * @param nombre
     * @return
     */
    public List<Persona> findAllByNombre(String nombre){
        EntityManager em = getEntityManager();
        Query query = em.createQuery("select e from Persona e where e.nombre like :nombre");
        query.setParameter("nombre", nombre+"%");
        List<Persona> lista = query.getResultList();
        return lista;
    }

    public List<Persona> consultaNativa(){
        EntityManager em = getEntityManager();
        Query query = em.createNativeQuery("select * from Persona ", Persona.class);
        //query.setParameter("nombre", apellido+"%");
        List<Persona> lista = query.getResultList();
        return lista;
    }

    public SignosVitales findVitalesbyPersona(Persona auxPersona){
        EntityManager em = getEntityManager();
        Query query = em.createNativeQuery("SELECT SV.* FROM SignosVitales SV join Persona P on P.id_persona = SV.fk_persona AND P.id_persona = :id order by SV.fechahora  desc limit 1; ", SignosVitales.class);
        query.setParameter("id", auxPersona.getId_persona());
        try {
        	Object aux = query.getSingleResult();
            return (SignosVitales) aux;
        } catch (Exception e) {
            System.out.println("ERROR-->"+e);
            //TODO: handle exception
        }

        return null;
    }


    // public Persona findPersonabyEstacion(Persona auxPersona){
    //     EntityManager em = getEntityManager();
    //     Query query = em.createNativeQuery("SELECT SV.* FROM SignosVitales SV join Persona P on P.id_persona = SV.fk_persona AND P.id_persona = :id", Persona.class);
    //     query.setParameter("id", auxPersona.getId_persona());
    //     try {
    //     	Object aux = query.getSingleResult();
    //         return (SignosVitales) aux;
    //     } catch (Exception e) {
    //         System.out.println("ERROR-->"+e);
    //         //TODO: handle exception
    //     }

    //     return null;
    // }

    public List<Persona> PersonasForSurvey(boolean iscard){
        EntityManager em = getEntityManager();
        Query query = null;     
        if(iscard){
             query = em.createNativeQuery("select P.* from PERSONA P where P.primeradosis = TRUE and encuestado = FALSE and ivr = TRUE ", Persona.class); 
        }
        if(!iscard){
             query = em.createNativeQuery("select P.* from PERSONA P where P.primeradosis = TRUE and encuestado = FALSE and ivr = FALSE ", Persona.class);
        }
        //query.setParameter("nombre", apellido+"%");
        List<Persona> lista = query.getResultList();
        return lista;
    }

}
