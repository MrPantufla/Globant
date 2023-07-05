package Services;
import Objects.Alquiler;
import java.time.LocalDate;
import java.util.Scanner;

public class AlquilerService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Alquiler crearAlquiler(){
        Alquiler a = new Alquiler();
        System.out.println("Ingresar pelicula a alquilar");
        a.setPeliculaAlquilada(leer.nextLine());
        System.out.println("Ingresar fecha de inicio con el formato YYYY-MM-DD");
        String ingresarFecha=leer.nextLine();
        LocalDate nuevaFecha = LocalDate.parse(ingresarFecha);
        a.setFechaInicio(nuevaFecha);
        System.out.println("Ingresar fecha de fin con el formato YYYY-MM-DD");
        ingresarFecha=leer.nextLine();
        nuevaFecha = LocalDate.parse(ingresarFecha);
        a.setFechaFin(nuevaFecha);
        System.out.println("Ingresar precio");
        a.setPrecio(leer.nextInt());
        leer.nextLine();
        
        return a;
    }
    
    
}
