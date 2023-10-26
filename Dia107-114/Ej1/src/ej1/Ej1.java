package ej1;
import Services.AutorService;
import Services.EditorialService;
import Services.LibroService;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

public class Ej1 {
    public static void main(String[] args) {
        AutorService a = new AutorService();
        LibroService l = new LibroService();
        EditorialService e = new EditorialService();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        boolean band = true;
        
        while(band){
            System.out.println("1- Crear un nuevo libro");
            System.out.println("2- Crear un nuevo autor");
            System.out.println("3- Crear una nueva editorial");
            System.out.println("4- Editar valores de un libro");
            System.out.println("5- Editar valores de un autor");
            System.out.println("6- Editar valores de una editorial");
            System.out.println("7- Eliminar un libro");
            System.out.println("8- Eliminar un autor");
            System.out.println("9- Eliminar una editorial");
            System.out.println("10- Consultar libro por isbn");
            System.out.println("11- Consultar libro por título");
            System.out.println("12- Consultar libro por autor");
            System.out.println("13- Consultar libro por editorial");
            System.out.println("14- Salir");
            
            int opcion=leer.nextInt();
            leer.nextLine();
            
            switch(opcion){
                case 1->{
                    System.out.println("Ingresar nombre");
                    String nombre = leer.nextLine();
                    System.out.println("Intgresar año");
                    int anio = leer.nextInt();
                    System.out.println("Ingresar cant de ejemplares");
                    int ejemplares = leer.nextInt();
                    System.out.println("Ingresar cant de ejemplares prestados");
                    int ejemplaresPrestados = leer.nextInt();
                    System.out.println("Ingresar cant de ejemplares restantes");
                    int ejemplaresRestantes = leer.nextInt();
                    leer.nextLine();
                    System.out.println("Ingresar nombre de su autor");
                    String nombreAutor = leer.nextLine();
                    System.out.println("Ingresar nombre de su editorial");
                    String nombreEditorial = leer.nextLine();
                    l.crearLibro(nombre, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, a.consultarAutorPorNombre(nombreAutor), e.consultarEditorialPorNombre(nombreEditorial));
                }
                case 2->{
                    System.out.println("Ingresar nombre");
                    String nombre = leer.nextLine();
                    a.crearAutor(nombre);
                }
                case 3->{
                    System.out.println("Ingresar nombre");
                    String nombre = leer.nextLine();
                    e.crearEditorial(nombre);
                }
                case 4->{
                    System.out.println("Ingresar isbn del libro a editar");
                    String isbn = leer.nextLine();
                    System.out.println("Ingresar nombre");
                    String nombre = leer.nextLine();
                    System.out.println("Intgresar año");
                    int anio = leer.nextInt();
                    System.out.println("Ingresar cant de ejemplares");
                    int ejemplares = leer.nextInt();
                    System.out.println("Ingresar cant de ejemplares prestados");
                    int ejemplaresPrestados = leer.nextInt();
                    System.out.println("Ingresar cant de ejemplares restantes");
                    int ejemplaresRestantes = leer.nextInt();
                    leer.nextLine();
                    System.out.println("Ingresar nombre de su autor");
                    String nombreAutor = leer.nextLine();
                    System.out.println("Ingresar nombre de su editorial");
                    String nombreEditorial = leer.nextLine();
                    l.modificarLibro(isbn, nombre, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, a.consultarAutorPorNombre(nombreAutor), e.consultarEditorialPorNombre(nombreEditorial));
                }
                case 5->{
                    System.out.println("Ingresar id del autor a editar");
                    String id = leer.nextLine();
                    System.out.println("Ingresar nombre");
                    String nombre = leer.nextLine();
                    a.modificarAutor(id, nombre);
                }
                case 6->{
                    System.out.println("Ingresar id de la editorial a editar");
                    String id = leer.nextLine();
                    System.out.println("Ingresar nombre");
                    String nombre = leer.nextLine();
                    e.modificarEditorial(id, nombre);
                }
                case 7->{
                    System.out.println("Ingresar isbn del libro a eliminar");
                    String isbn = leer.nextLine();
                    l.eliminarLibro(isbn);
                }
                case 8->{
                    System.out.println("Ingresar id del autor a eliminar");
                    String id = leer.nextLine();
                    a.removerAutor(id);
                }
                case 9->{
                    System.out.println("Ingresar id de la editorial a eliminar");
                    String id = leer.nextLine();
                    e.removerEditorial(id);
                }
                case 10->{
                    System.out.println("Ingresar isbn del libro a consultar");
                    String isbn = leer.nextLine();
                    System.out.println(l.consultarLibroPorIsbn(isbn).toString());
                }
                case 11->{
                    System.out.println("Ingresar titulo del libro a consultar");
                    String titulo = leer.nextLine();
                    System.out.println(l.consultarLibroPorTitulo(titulo).toString());
                }
                case 12->{
                    System.out.println("Ingresar nombre del autor del libro a consultar");
                    String nombre = leer.nextLine();
                    System.out.println(l.consultarLibroPorAutor(nombre).toString());
                }
                case 13->{
                    System.out.println("Ingresar nombre de la editorial del libro a consultar");
                    String nombre = leer.nextLine();
                    System.out.println(l.consultarLibroPorEditorial(nombre).toString());
                }
                case 14->{
                    band=false;
                }
            }
        }
    }
    
}
