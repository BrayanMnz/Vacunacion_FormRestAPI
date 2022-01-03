package ProyectoVacunacion.ClienteREST.Services;

import ProyectoVacunacion.ClienteREST.Models.Formulario;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


/**
 *
 * Created by vacax on 03/06/16.
 */
public class FormularioServices extends GestionDb<Formulario> {

    private static FormularioServices instancia;

    private FormularioServices() {
        super(Formulario.class);
    }

    public static FormularioServices getInstancia(){
        if(instancia==null){
            instancia = new FormularioServices();
        }
        return instancia;
    }

    /**
     *
     * @param nombre
     * @return
     */
    public List<Formulario> findAllByLaboratorio(String laboratorio){
        EntityManager em = getEntityManager();
        Query query = em.createQuery("select v from Vacuna v where v.laboratorio like :laboratorio");
        query.setParameter("laboratorio", laboratorio+"%");
        List<Formulario> lista = query.getResultList();
        return lista;
    }

    public List<Formulario> consultaNativa(){
        EntityManager em = getEntityManager();
        Query query = em.createNativeQuery("select * from Vacuna ", Formulario.class);
        //query.setParameter("nombre", apellido+"%");
        List<Formulario> lista = query.getResultList();
        return lista;
    }


}
