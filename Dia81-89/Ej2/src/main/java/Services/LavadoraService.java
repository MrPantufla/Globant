package Services;
import Objects.Electrodomestico;
import Objects.Lavadora;
import java.util.Scanner;

public class LavadoraService extends ElectrodomesticoService{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Lavadora l = new Lavadora();
    Electrodomestico e = new Electrodomestico();
    
    public Lavadora crearLavadora(){
        System.out.println("CREAR LAVADORA");
        e =super.crearElectrodomestico();
        l.setPrecio(super.precioFinal());
        l.setColor(e.getColor());
        l.setConsumo(e.getConsumo());
        System.out.println("Ingresar la carga");
        l.setCarga(leer.nextInt());
        leer.nextLine();
        System.out.println("");
        return new Lavadora(l.getPrecio(), l.getColor(), l.getConsumo(), l.getPeso(), l.getCarga());
    }
    
    public int precioFinal(Lavadora l){ 
        if(l.getCarga()>30){
            l.setPrecio(l.getPrecio()+500);
        }
        
        return l.getPrecio();
    }
    
    public void mostrarLavadora(Lavadora l){
        System.out.println("LAVADORA");
        System.out.println("Precio: " + l.getPrecio());
        System.out.println("Color: " + l.getColor());
        System.out.println("Consumo: " + l.getConsumo());
        System.out.println("Carga: " + l.getCarga());
        System.out.println("");
    }
}
