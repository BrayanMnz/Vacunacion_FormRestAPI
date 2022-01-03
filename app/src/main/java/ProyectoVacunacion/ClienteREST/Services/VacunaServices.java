package ProyectoVacunacion.ClienteREST.Services;

import ProyectoVacunacion.ClienteREST.Models.Vacuna;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


/**
 *
 * Created by vacax on 03/06/16.
 */
public class VacunaServices extends GestionDb<Vacuna> {

    private static VacunaServices instancia;

    private VacunaServices() {
        super(Vacuna.class);
    }

    public static VacunaServices getInstancia(){
        if(instancia==null){
            instancia = new VacunaServices();
        }
        return instancia;
    }

    /**
     *
     * @param nombre
     * @return
     */
    public List<Vacuna> findAllByLaboratorio(String laboratorio){
        EntityManager em = getEntityManager();
        Query query = em.createQuery("select v from Vacuna v where v.laboratorio like :laboratorio");
        query.setParameter("laboratorio", laboratorio+"%");
        List<Vacuna> lista = query.getResultList();
        return lista;
    }


    public Vacuna findByCentro(int idCentro){
        EntityManager em = getEntityManager();
        Query query = em.createQuery("select v from Vacuna v INNER JOIN CentroVacunacion c ON c.id_CentroVacunacion = v.centro_Vacunacion and c.id_CentroVacunacion = :id", Vacuna.class);
        query.setParameter("id", idCentro);
        Vacuna lista = (Vacuna) query.getSingleResult();
        return lista;
    }

    public List<Vacuna> consultaNativa(){
        EntityManager em = getEntityManager();
        Query query = em.createNativeQuery("select * from Vacuna ", Vacuna.class);
        //query.setParameter("nombre", apellido+"%");
        List<Vacuna> lista = query.getResultList();
        return lista;
    }


}
