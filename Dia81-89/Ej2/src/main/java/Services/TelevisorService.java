package Services;
import Objects.Electrodomestico;
import Objects.Televisor;
import java.util.Scanner;

public class TelevisorService extends ElectrodomesticoService{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Televisor t = new Televisor();
    Electrodomestico e = new Electrodomestico();
    
    public Televisor crearTelevisor(){
        System.out.println("CREAR TELEVISOR");
        e =super.crearElectrodomestico();
        t.setPrecio(super.precioFinal());
        t.setColor(e.getColor());
        t.setConsumo(e.getConsumo());
        System.out.println("Ingresar resolucion en pulgadas");
        t.setResolucion(leer.nextInt());
        leer.nextLine();
        System.out.println("Tiene sintonizador? Y o N");
        String aux = leer.nextLine();
        if(aux.equals("y") || aux.equals("Y")){
            t.setSintonizador(true);
        }
        else{
            t.setSintonizador(false);
        }
        System.out.println("");
        
        return new Televisor(t.getPrecio(), t.getColor(), t.getConsumo(), t.getResolucion(), t.getPeso(), t.isSintonizador());
    }
    
    public int precioFinal(){
        if(t.getResolucion()>40){
            double aux = t.getPrecio()*1.3;
            t.setPrecio((int)aux);
        }
        
        if(t.isSintonizador()){
            t.setPrecio(e.getPrecio()+500);
        }
        
        return t.getPrecio();
    }
    
    public void mostrarTelevisor(){
        System.out.println("Precio: " + t.getPrecio());
        System.out.println("Color: " + t.getColor());
        System.out.println("Consumo: " + t.getConsumo());
        System.out.println("Resolucion: " + t.getResolucion());
        System.out.println("Sintonizador: " + t.isSintonizador());
    }
}
