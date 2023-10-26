package Services;
import Entidades.Editorial;
import java.util.Scanner;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EditorialService {
    EntityManager em = Persistence.createEntityManagerFactory("Ej1PU").createEntityManager();
    
    public void crearEditorial(String nombre){
        Editorial e = new Editorial();
        e.setId(UUID.randomUUID().toString());
        e.setNombre(nombre);
        e.setAlta(false);
        
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
    }
    
    public void removerEditorial(String id){
        Editorial e = em.find(Editorial.class, id);
        em.getTransaction().begin();
        em.remove(e);
        em.getTransaction().commit();
    }
    
    public void modificarEditorial(String id, String nombre){
        Editorial e = em.find(Editorial.class, id);
        e.setNombre(nombre);
        em.getTransaction().begin();
        em.merge(e);
        em.getTransaction().commit();
    }
    
    public Editorial consultarEditorialPorId(Editorial id){
        Editorial e = em.find(Editorial.class, id);
        
        return e;
    }
    
    public Editorial consultarEditorialPorNombre(String name){
        return (Editorial)em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre").setParameter("nombre", name).getSingleResult();
    }
}
