package Services;
import Objects.Electrodomestico;
import java.util.Scanner;

public class ElectrodomesticoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Electrodomestico e = new Electrodomestico();
    
    public void comprobarConsumo(Electrodomestico e, char letra){
        if((int)letra>(int)'f'){
            e.setConsumo('f');
        }
    }
    
    public void comprobarColor(Electrodomestico e, String color){
        color = color.toLowerCase();
        
        if(!color.equals("negro") && !color.equals("rojo") && !color.equals("azul") && !color.equals("gris")){
            e.setColor("blanco");
        }
    }
    
    public Electrodomestico crearElectrodomestico(){
        
        e.setPrecio(1000);
        System.out.println("Ingresar color");
        e.setColor(leer.nextLine());
        System.out.println("Ingresar letra de consumo");
        String aux = leer.nextLine();
        e.setConsumo(aux.charAt(0));
        System.out.println("Ingresar peso");
        e.setPeso(leer.nextInt());
        leer.nextLine();
        
        comprobarConsumo(e, e.getConsumo());
        comprobarColor(e, e.getColor());
        return new Electrodomestico(e.getPrecio(), e.getColor(), e.getConsumo(), e.getPeso());
    }
    
    public int precioFinal(){
        switch(e.getConsumo()){
            case 'a'-> e.setPrecio(e.getPrecio()+1000);
            case 'b'-> e.setPrecio(e.getPrecio()+800);
            case 'c'-> e.setPrecio(e.getPrecio()+600);
            case 'd'-> e.setPrecio(e.getPrecio()+500);
            case 'e'-> e.setPrecio(e.getPrecio()+300);
            case 'f'-> e.setPrecio(e.getPrecio()+100);
        }
        
        if(e.getPeso()>1 && e.getPeso()<=19){
            e.setPrecio(e.getPrecio()+100);
        }
        else if(e.getPeso()>19 && e.getPeso()<=49){
            e.setPrecio(e.getPrecio()+500);
        }
        else if(e.getPeso()>49 && e.getPeso()<=79){
            e.setPrecio(e.getPrecio()+800);
        }
        else{
            e.setPrecio(e.getPrecio()+1000);
        }
        
        return e.getPrecio();
    }
}
