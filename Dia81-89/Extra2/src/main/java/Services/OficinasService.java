package Services;
import Objects.Oficinas;
import java.util.Scanner;
import Objects.Edificio;

public class OficinasService extends EdificioService{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Oficinas o = new Oficinas();
    
    public Oficinas crearOficinas(){
        System.out.println("Ingresar ancho del edificio");
        o.setAncho(leer.nextInt());
        System.out.println("Ingresar largo del edificio");
        o.setLargo(leer.nextInt());
        System.out.println("Ingresar alto del edificio");
        o.setAlto(leer.nextInt());
        System.out.println("Ingresar cantidad de oficinas");
        o.setCantOficinas(leer.nextInt());
        System.out.println("Ingresar cantidad de personas por oficina");
        o.setCantPersonas(leer.nextInt());
        System.out.println("Ingresar cantidad de pisos");
        o.setPisos(leer.nextInt());
        
        return new Oficinas(o.getAncho(), o.getLargo(), o.getAlto(), o.getCantOficinas(), o.getCantPersonas(), o.getPisos());
    }

    @Override
    public int calcularSuperficie(Edificio o) {
        return o.getAncho()*o.getLargo();
    }

    @Override
    public int calcularVolumen(Edificio o) {
        return o.getAncho()*o.getLargo();
    }
    
    public void cantPersonas(Oficinas o){
        System.out.println("En un piso entran " + o.getCantOficinas()*o.getCantPersonas() + " personas");
        System.out.println("En total entran " + o.getCantOficinas()*o.getCantPersonas()*o.getPisos() + " personas en el edificio");
    }
    
}
