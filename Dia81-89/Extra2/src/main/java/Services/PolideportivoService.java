package Services;
import Objects.Polideportivo;
import java.util.Scanner;
import Objects.Edificio;

public class PolideportivoService extends EdificioService{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Polideportivo p = new Polideportivo();
    
    public Polideportivo crearPolideportivo(){
        System.out.println("Ingresar ancho del edificio");
        p.setAncho(leer.nextInt());
        System.out.println("Ingresar largo del edificio");
        p.setLargo(leer.nextInt());
        System.out.println("Ingresar alto del edificio");
        p.setAlto(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingresar nombre del edificio");
        p.setNombre(leer.nextLine());
        System.out.println("Ingresar si es 'abierto' o 'techado'");
        p.setTipo(leer.nextLine());
        
        return new Polideportivo(p.getAncho(), p.getLargo(), p.getAlto(), p.getNombre(), p.getTipo());
    }
    
    @Override
    public int calcularSuperficie(Edificio p) {
        return p.getAncho()*p.getLargo();
    }

    @Override
    public int calcularVolumen(Edificio p) {
        return p.getAncho()*p.getLargo();
    }
    
}
