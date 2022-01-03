package ProyectoVacunacion.ClienteREST.Services;

import ProyectoVacunacion.ClienteREST.Models.EstacionVitales;
import ProyectoVacunacion.ClienteREST.Models.EstacionVitales;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class EstacionServices extends GestionDb<EstacionVitales> {

    private static EstacionServices instancia;

    private EstacionServices() {
        super(EstacionVitales.class);
    }

    public static EstacionServices getInstancia() {
        if (instancia == null) {
            instancia = new EstacionServices();
        }
        return instancia;
    }

    /**
     *
     * @param nombre
     * @return
     */
    // public List<EstacionVitales> findAllByCode(Integer nombre){
    // EntityManager em = getEntityManager();
    // Query query = em.createQuery("select e from EstacionVitales e where
    // e.centroVacunacion = :nombre");
    // query.setParameter("nombre", nombre);
    // List<EstacionVitales> lista = query.getResultList();
    // return lista;
    // }

    public List<EstacionVitales> consultaNativa() {
        EntityManager em = getEntityManager();
        Query query = em.createNativeQuery("select * from Persona ", EstacionVitales.class);
        // query.setParameter("nombre", apellido+"%");
        List<EstacionVitales> lista = query.getResultList();
        return lista;
    }

}
