package ProyectoVacunacion.ClienteREST.Services;

import ProyectoVacunacion.ClienteREST.Models.Ubicacion;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


/**
 *
 * Created by vacax on 03/06/16.
 */
public class UbicacionServices extends GestionDb<Ubicacion> {

    private static UbicacionServices instancia;

    private UbicacionServices() {
        super(Ubicacion.class);
    }

    public static UbicacionServices getInstancia(){
        if(instancia==null){
            instancia = new UbicacionServices();
        }
        return instancia;
    }

    /**
     *
     * @param nombre
     * @return
     */
    public List<Ubicacion> findAllByLaboratorio(String laboratorio){
        EntityManager em = getEntityManager();
        Query query = em.createQuery("select v from Vacuna v where v.laboratorio like :laboratorio");
        query.setParameter("laboratorio", laboratorio+"%");
        List<Ubicacion> lista = query.getResultList();
        return lista;
    }

    public List<Ubicacion> consultaNativa(){
        EntityManager em = getEntityManager();
        Query query = em.createNativeQuery("select * from Vacuna ", Ubicacion.class);
        //query.setParameter("nombre", apellido+"%");
        List<Ubicacion> lista = query.getResultList();
        return lista;
    }


}
