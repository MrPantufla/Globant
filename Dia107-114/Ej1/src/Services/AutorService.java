package Services;
import Entidades.Autor;
import java.util.Scanner;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class AutorService {
    EntityManager em = Persistence.createEntityManagerFactory("Ej1PU").createEntityManager();
    
    public void crearAutor(String nombre){
        Autor a = new Autor();
        a.setId(UUID.randomUUID().toString());
        a.setNombre(nombre);
        a.setAlta(false);
        
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
    }
    
    public void removerAutor(String id){
        Autor a = em.find(Autor.class, id);
        em.getTransaction().begin();
        em.remove(a);
        em.getTransaction().commit();
    }
    
    public void modificarAutor(String id, String nombre){
        Autor a = em.find(Autor.class, id);
        a.setNombre(nombre);
        em.getTransaction().begin();
        em.merge(a);
        em.getTransaction().commit();
    }
    
    public Autor consultarAutorPorId(String id){
        Autor a = em.find(Autor.class, id);
        
        return a;
    }
    
    public Autor consultarAutorPorNombre(String name){
        return (Autor)em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre").setParameter("nombre", name).getSingleResult();
    }
}
