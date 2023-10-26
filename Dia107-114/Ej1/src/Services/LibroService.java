package Services;
import Entidades.Libro;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import Entidades.Autor;
import Entidades.Editorial;
import java.util.UUID;

public class LibroService {
    EntityManager em = Persistence.createEntityManagerFactory("Ej1PU").createEntityManager();
    
    public void crearLibro(String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Autor autor, Editorial editorial){
        Libro l = new Libro();
        l.setIsbn(UUID.randomUUID().toString());
        l.setTitulo(titulo);
        l.setAnio(anio);
        l.setEjemplares(ejemplares);
        l.setEjemplaresPrestados(ejemplaresPrestados);
        l.setEjemplaresRestantes(ejemplaresRestantes);
        l.setAutor(autor);
        l.setEditorial(editorial);
        
        em.getTransaction().begin();
        em.persist(l);
        em.getTransaction().commit();
    }
    
    public void eliminarLibro(String isbn){
        Libro l = em.find(Libro.class, isbn);
        
        em.getTransaction().begin();
        em.remove(l);
        em.getTransaction().commit();
    }
    
    public void modificarLibro(String isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Autor autor, Editorial editorial){
        Libro l = em.find(Libro.class, isbn);

        l.setTitulo(titulo);
        l.setAnio(anio);
        l.setEjemplares(ejemplares);
        l.setEjemplaresPrestados(ejemplaresPrestados);
        l.setEjemplaresRestantes(ejemplaresRestantes);
        l.setAutor(autor);
        l.setEditorial(editorial);
        
        em.getTransaction().begin();
        em.merge(l);
        em.getTransaction().commit();
    }
    
    public Libro consultarLibroPorIsbn(String isbn){
        Libro l = em.find(Libro.class, isbn);
        
        return l;
    }

    public Libro consultarLibroPorTitulo(String title){
        return (Libro)em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo").setParameter("titulo", title).getSingleResult();
    }
    
    public Libro consultarLibroPorAutor(String name){
        return (Libro)em.createQuery("SELECT l from Libro l WHERE l.autor.nombre LIKE :nombre").setParameter("nombre", name).getSingleResult();
    }
    
    public Libro consultarLibroPorEditorial(String name){
        return (Libro)em.createQuery("SELECT l from Libro l WHERE l.editorial.nombre LIKE :nombre").setParameter("nombre", name).getSingleResult();
    }
}
