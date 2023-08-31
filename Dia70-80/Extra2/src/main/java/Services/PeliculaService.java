package Services;
import Objects.Pelicula;
import java.util.Scanner;

public class PeliculaService {
    Pelicula p = new Pelicula();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void cargarPelicula(){
        System.out.println("Ingresar título");
        p.setTitulo(leer.nextLine());
        System.out.println("Ingresar duracion en minutos");
        p.setDuracion(leer.nextInt());
        System.out.println("Ingresar edad minima");
        p.setEdadMinima(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingresar director");
        p.setDirector(leer.nextLine());
    }
    
    public Pelicula devolverPelicula(){
        return p;
    }
}
