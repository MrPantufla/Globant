package Services;
import Objects.Alquiler;
import java.util.Date;
import java.util.Scanner;

public class AlquilerService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Alquiler crearAlquiler(){
        Alquiler a = new Alquiler();
        System.out.println("Ingresar pelicula a alquilar");
        a.setPeliculaAlquilada(leer.nextLine());
        int dia;
        int mes;
        int anio;
        System.out.println("Ingresar fecha de inicio");
        dia=leer.nextInt();
        mes=leer.nextInt();
        anio=leer.nextInt();
        Date fecha=new Date(dia, mes, anio);
        a.setFechaInicio(fecha);
        System.out.println("Ingresar fecha de fin");
        dia=leer.nextInt();
        mes=leer.nextInt();
        anio=leer.nextInt();
        fecha=new Date(dia, mes, anio);
        a.setFechaFin(fecha);
        System.out.println("Ingresar precio");
        a.setPrecio(leer.nextInt());
        leer.nextLine();
        
        return a;
    }
    
    
}
