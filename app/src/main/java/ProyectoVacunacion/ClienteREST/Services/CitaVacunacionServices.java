package ProyectoVacunacion.ClienteREST.Services;

import ProyectoVacunacion.ClienteREST.Models.CitaVacunacion;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


/**
 *
 * Created by vacax on 03/06/16.
 */
public class CitaVacunacionServices extends GestionDb<CitaVacunacion> {

    private static CitaVacunacionServices instancia;

    private CitaVacunacionServices() {
        super(CitaVacunacion.class);
    }

    public static CitaVacunacionServices getInstancia(){
        if(instancia==null){
            instancia = new CitaVacunacionServices();
        }
        return instancia;
    }

    /**
     *
     * @param nombre
     * @return
     */
    public List<CitaVacunacion> findAllByLaboratorio(String laboratorio){
        EntityManager em = getEntityManager();
        Query query = em.createQuery("select v from Vacuna v where v.laboratorio like :laboratorio");
        query.setParameter("laboratorio", laboratorio+"%");
        List<CitaVacunacion> lista = query.getResultList();
        return lista;
    }

    public List<CitaVacunacion> consultaNativa(){
        EntityManager em = getEntityManager();
        Query query = em.createNativeQuery("select * from Vacuna ", CitaVacunacion.class);
        //query.setParameter("nombre", apellido+"%");
        List<CitaVacunacion> lista = query.getResultList();
        return lista;
    }


}
