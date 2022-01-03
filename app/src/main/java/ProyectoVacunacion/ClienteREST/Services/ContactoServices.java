package ProyectoVacunacion.ClienteREST.Services;

import ProyectoVacunacion.ClienteREST.Models.Contacto;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


/**
 *
 * Created by vacax on 03/06/16.
 */
public class ContactoServices extends GestionDb<Contacto> {

    private static ContactoServices instancia;

    private ContactoServices() {
        super(Contacto.class);
    }

    public static ContactoServices getInstancia(){
        if(instancia==null){
            instancia = new ContactoServices();
        }
        return instancia;
    }

    /**
     *
     * @param nombre
     * @return
     */
    public List<Contacto> findAllByLaboratorio(String laboratorio){
        EntityManager em = getEntityManager();
        Query query = em.createQuery("select v from Vacuna v where v.laboratorio like :laboratorio");
        query.setParameter("laboratorio", laboratorio+"%");
        List<Contacto> lista = query.getResultList();
        return lista;
    }

    public List<Contacto> consultaNativa(){
        EntityManager em = getEntityManager();
        Query query = em.createNativeQuery("select * from Vacuna ", Contacto.class);
        //query.setParameter("nombre", apellido+"%");
        List<Contacto> lista = query.getResultList();
        return lista;
    }


}
