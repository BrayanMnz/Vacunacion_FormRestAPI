package ProyectoVacunacion.ClienteREST.Services;

import ProyectoVacunacion.ClienteREST.Models.SignosVitales;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


/**
 *
 * Created by vacax on 03/06/16.
 */
public class SignosServices extends GestionDb<SignosVitales> {

    private static SignosServices instancia;

    private SignosServices() {
        super(SignosVitales.class);
    }

    public static SignosServices getInstancia(){
        if(instancia==null){
            instancia = new SignosServices();
        }
        return instancia;
    }

    /**
     *
     * @param nombre
     * @return
     */
    // public SignosVitales findByPersona(int idPersona){
    //     EntityManager em = getEntityManager();
    //     Query query = em.createNativeQuery("select * from signosvitales s where s.fk_persona = :idPersona;",SignosVitales.class);
    //     query.setParameter("idPersona", idPersona);
        
    //     return query.getSingleResult();
    // }

    public List<SignosVitales> consultaNativa(){
        EntityManager em = getEntityManager();
        Query query = em.createNativeQuery("select * from Persona ", SignosVitales.class);
        //query.setParameter("nombre", apellido+"%");
        List<SignosVitales> lista = query.getResultList();
        return lista;
    }


}
