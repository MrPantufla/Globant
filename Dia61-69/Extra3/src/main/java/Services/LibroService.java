package Services;
import Objects.Libro;
import java.util.HashSet;
import java.util.Scanner;

public class LibroService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet <Libro> libros = new HashSet();
    
    public boolean prestamo(){
        System.out.println("Ingresar el nombre del libro a pedir prestado");
        String nombre = leer.nextLine();
        for(Libro i : libros){
            if(i.getNombre().equals(nombre)){
                if(i.getPrestados()<i.getEjemplares()){
                    System.out.println(i.getNombre() + " prestado");
                    i.setPrestados(i.getPrestados()+1);
                    return true;
                }
                else{
                    System.out.println("No quedan ejemplares para prestar");
                    return false;
                }
            }
        }
        return false;
    }
    
    public boolean devolucion(){
        System.out.println("Ingresar el nombre del libro a devolver");
        String nombre = leer.nextLine();
        for(Libro i : libros){
            if(i.getNombre().equals(nombre)){
                if(i.getPrestados()>0){
                    System.out.println(i.getNombre() + " devuelto");
                    i.setPrestados(i.getPrestados()-1);
                    return true;
                }
                else{
                    System.out.println("Ningun ejemplar fue prestado anteriormente");
                    return false;
                }
            }
        }
        return false;
    }
    
    public void añadirLibro(){
        Libro l = new Libro();
        System.out.println("Ingrese el nombre del libro a añadir");
        l.setNombre(leer.nextLine());
        System.out.println("Ingrese el nombre del autor");
        l.setAutor(leer.nextLine());
        System.out.println("Ingrese el numero de copias");
        l.setEjemplares(leer.nextInt());
        leer.nextLine();
        l.setPrestados(0);
        libros.add(l);
    }
    
    public void listarLibros(){
        System.out.println("LIBROS LISTADOS:");
        for(Libro i : libros){
            System.out.println(i.toString());
        }
        System.out.println("");
    }
}
