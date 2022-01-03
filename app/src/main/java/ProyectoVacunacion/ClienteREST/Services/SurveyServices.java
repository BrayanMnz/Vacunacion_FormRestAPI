package ProyectoVacunacion.ClienteREST.Services;

import ProyectoVacunacion.ClienteREST.Models.Survey;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


/**
 *
 * Created by vacax on 03/06/16.
 */
public class SurveyServices extends GestionDb<Survey> {

    private static SurveyServices instancia;

    private SurveyServices() {
        super(Survey.class);
    }

    public static SurveyServices getInstancia(){
        if(instancia==null){
            instancia = new SurveyServices();
        }
        return instancia;
    }

    /**
     *
     * @param nombre
     * @return
     */
    public List<Survey> findbyId(int idSurvey){
        EntityManager em = getEntityManager();
        Query query = em.createQuery("select e from Survey e where e.id_Survey = :id_Survey");
        query.setParameter("id_Survey", idSurvey);
        List<Survey> lista = query.getResultList();
        return lista;
    }

    public List<Survey> consultaNativa(){
        EntityManager em = getEntityManager();
        Query query = em.createNativeQuery("select * from Persona ", Survey.class);
        //query.setParameter("nombre", apellido+"%");
        List<Survey> lista = query.getResultList();
        return lista;
    }


}
