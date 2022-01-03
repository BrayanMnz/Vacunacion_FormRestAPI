package ProyectoVacunacion.ClienteREST.Services;

import ProyectoVacunacion.ClienteREST.Models.CentroVacunacion;
import ProyectoVacunacion.ClienteREST.Models.Persona;
import ProyectoVacunacion.ClienteREST.Models.Ubicacion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.swing.plaf.synth.SynthSpinnerUI;

import java.util.ArrayList;
import java.util.*;


/**
 *
 * Created by vacax on 03/06/16.
 */
public class CentroVacunacionServices extends GestionDb<CentroVacunacion> {

    private static CentroVacunacionServices instancia;
    private static double minima=0;
    private static ArrayList<Double> distancia = new ArrayList<>();

    private CentroVacunacionServices() {
        super(CentroVacunacion.class);
    }

    public static CentroVacunacionServices getInstancia(){
        if(instancia==null){
            instancia = new CentroVacunacionServices();
        }
        return instancia;
    }

    /**
     *
     * @param nombre
     * @return
     */
    public List<CentroVacunacion> findAllByNombre(String nombre){
        EntityManager em = getEntityManager();
        Query query = em.createQuery("select e from CentroVacunacion e where e.nombre_Centro like :nombre");
        query.setParameter("nombre", nombre+"%");
        List<CentroVacunacion> lista = query.getResultList();
        return lista;
    }

    public List<CentroVacunacion> consultaNativa(){
        EntityManager em = getEntityManager();
        Query query = em.createNativeQuery("select * from CentroVacunacion ", CentroVacunacion.class);
        //query.setParameter("nombre", apellido+"%");
        List<CentroVacunacion> lista = query.getResultList();
        return lista;
    }

    public void setDosisCentro(CentroVacunacion centro, Integer cantVacunas){
        
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("UPDATE CentroVacunacion SET dosis_Disponibles = :auxDosis WHERE id_CentroVacunacion = :idCentro");
        query.setParameter("auxDosis", cantVacunas);
        query.setParameter("idCentro", centro.getId_CentroVacunacion());
        int rowsUpdated = query.executeUpdate();
        em.getTransaction().commit();
        em.close();
    }

    public Integer getDosisCentro(CentroVacunacion centro){
        
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Object cantidad = em.createQuery(" SELECT c.dosis_Disponibles FROM CentroVacunacion c where  c.id_CentroVacunacion = :idCentro")
        .setParameter("idCentro", centro.getId_CentroVacunacion())
        .getSingleResult();
        em.getTransaction().commit();
        em.close();

        return (int) cantidad;
    }


    public CentroVacunacion findCentrosbyUbicacion(Persona auxPersona){
        CentroVacunacion proe = null;
        EntityManager em = getEntityManager();
        // Query query = em.createQuery("select e from CentroVacunacion e where e.nombre_Centro like :nombre");
        String latitud = auxPersona.getUbicacion_persona().getLatitud();
        String longitud = auxPersona.getUbicacion_persona().getLongitud();
        // Object prueba = em.createQuery("SELECT u.municipio from Ubicacion u WHERE u.id_ubicacion = :custName")
        // .setParameter("custName", auxPersona.getUbicacion_persona().getId_ubicacion())
        // // .setParameter(1, 1)
        // .getSingleResult();
        // query.setParameter("nombre", nombre+"%");
        // List<CentroVacunacion> lista = query.getResultList();
        
        // List<CentroVacunacion> x = em.createQuery("SELECT c FROM CentroVacunacion c INNER JOIN Ubicacion u on u.id_ubicacion = c.ubicacion_Centro AND u.municipio LIKE ?1")
        //     .setParameter(1, prueba)
        //     .getResultList();
      
        List<CentroVacunacion> x = em.createQuery("SELECT c FROM CentroVacunacion c INNER JOIN Ubicacion u on u.id_ubicacion = c.ubicacion_Centro")
        .getResultList();

        // if(x.size() == 1 ){
        //     return x.get(0);
        // }
        // else {q

            System.out.println(x);
            for (CentroVacunacion auxCentro : x) {

                
                String lat = auxCentro.getUbicacion_Centro().getLatitud();
                String longi = auxCentro.getUbicacion_Centro().getLongitud();


               distancia.add(distance(Double.parseDouble(latitud), Double.parseDouble(longitud),Double.parseDouble(lat), Double.parseDouble(longi)));
	       System.out.println(distancia.size());                   

            }
            minima = Collections.min(distancia);  
            System.out.println(minima);
	    distancia.clear();
            
            for (CentroVacunacion auxCentro : x) {

                
                String lat = auxCentro.getUbicacion_Centro().getLatitud();
                String longi = auxCentro.getUbicacion_Centro().getLongitud();

                Double distancia_ = (distance(Double.parseDouble(latitud), Double.parseDouble(longitud),Double.parseDouble(lat), Double.parseDouble(longi)));
               System.out.println(distancia_ +" ==== "+minima);
               if( distancia_ == minima ){
                   proe = auxCentro;
               }else {

               }

            }

        //}

        return proe;

    }


    private static double distance(double lat1, double lon1, double lat2, double lon2) {
		if ((lat1 == lat2) && (lon1 == lon2)) {
			return 0;
		}
		else {
			double theta = lon1 - lon2;
			double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
			dist = Math.acos(dist);
			dist = Math.toDegrees(dist);
			dist = dist * 60 * 1.1515;
			return (dist);
		}
	}


}
