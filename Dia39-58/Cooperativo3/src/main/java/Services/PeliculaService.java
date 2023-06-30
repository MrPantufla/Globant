package Services;
import Objects.Pelicula;
import java.util.Scanner;

public class PeliculaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Pelicula crearPelicula(){
        Pelicula p = new Pelicula();
        System.out.println("Ingresar título de la película");
        p.setTitulo(leer.nextLine());
        System.out.println("Ingresar genero");
        p.setGenero(leer.nextLine());
        System.out.println("Ingresar año");
        p.setAnio(leer.nextInt());
        System.out.println("Ingresar duracion en minutos");
        p.setDuracion(leer.nextInt());
        leer.nextLine();
        return p;
    }
    
    
}
