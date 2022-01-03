package ProyectoVacunacion.ClienteREST.Services;

import ProyectoVacunacion.ClienteREST.Models.Afeccion;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


/**
 *
 * Created by vacax on 03/06/16.
 */
public class AfeccionServices extends GestionDb<Afeccion> {

    private static AfeccionServices instancia;

    private AfeccionServices() {
        super(Afeccion.class);
    }

    public static AfeccionServices getInstancia(){
        if(instancia==null){
            instancia = new AfeccionServices();
        }
        return instancia;
    }

    /**
     *
     * @param nombre
     * @return
     */
    public List<Afeccion> findbyId(int idAfeccion){
        EntityManager em = getEntityManager();
        Query query = em.createQuery("select e from Afeccion e where e.id_afeccion = :id_Afeccion");
        query.setParameter("id_Afeccion", idAfeccion);
        List<Afeccion> lista = query.getResultList();
        return lista;
    }

    public List<Afeccion> consultaNativa(){
        EntityManager em = getEntityManager();
        Query query = em.createNativeQuery("select * from Persona ", Afeccion.class);
        //query.setParameter("nombre", apellido+"%");
        List<Afeccion> lista = query.getResultList();
        return lista;
    }


}
