package Services;
import Objects.Alquiler;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AlquilerService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Alquiler crearAlquiler(String nombre){
        Alquiler a = new Alquiler();
        a.setPeliculaAlquilada(nombre);
        System.out.println("Ingresar fecha de inicio con el formato YYYY-MM-DD");
        String ingresarFecha=leer.nextLine();
        LocalDate nuevaFecha = LocalDate.parse(ingresarFecha);
        a.setFechaInicio(nuevaFecha);
        System.out.println("Ingresar fecha de fin con el formato YYYY-MM-DD");
        ingresarFecha=leer.nextLine();
        nuevaFecha = LocalDate.parse(ingresarFecha);
        a.setFechaFin(nuevaFecha);
        long diferenciaDias = ChronoUnit.DAYS.between(a.getFechaInicio(), a.getFechaFin());
        int precio=0;
        
            if(diferenciaDias<=3){
                precio+=(diferenciaDias*10);
                a.setPrecio(precio);
            }
            else{
                precio+=(diferenciaDias*10+(diferenciaDias*10)*((diferenciaDias-3)*0.1));
                a.setPrecio(precio);
            }
        return a;
    }
    
    
}
