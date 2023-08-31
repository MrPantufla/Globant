package Services;
import java.util.Collections;

import Objects.Carta;
import java.util.ArrayList;
import java.util.Scanner;

public class CartaService {
    ArrayList <Carta> baraja = new ArrayList();
    ArrayList <Carta> descartadas = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void llenarBaraja(){
        for (int i = 1; i < 13; i++) {
            for(int j=0; j<4; j++){
                if(i!=8 && i!=9){
                    Carta c = new Carta();
                    c.setNumero(i);
                    switch(j){
                        case 0 -> c.setPalo("Copas");
                        case 1 -> c.setPalo("Bastos");
                        case 2 -> c.setPalo("Oros");
                        case 3 -> c.setPalo("Espadas");          
                    }
                    baraja.add(c);
                }
            } 
        }
    }
    
    public void barajar(){
        Collections.shuffle(baraja);
    }
    
    public void siguienteCarta(){
        if(!baraja.isEmpty()){
            System.out.println("La siguiente carta en la baraja es el " + baraja.get(0).getNumero() + " de " + baraja.get(0).getPalo());
        }
        else{
            System.out.println("La baraja se ha quedado vacía");
        }
    }
    
    public void cartasDisponibles(){
        System.out.println("El numero de cartas disponibles es: " + baraja.size());
    }
    
    public void darCartas(){
        System.out.println("Ingrese la cantidad que quiere obtener");
        int cant=leer.nextInt();
        if(baraja.size()>= cant){
            for (int i = 0; i < cant; i++) {
                System.out.println(baraja.get(0).getNumero() + " de " + baraja.get(0).getPalo());
                descartadas.add(baraja.get(0));
                baraja.remove(0);
            }
        }
        else{
            System.out.println("Quedan menos de " + cant + " carta/s en la baraja");
        }
    }
    
    public void cartasMonton(){
        for(Carta i : descartadas){
            System.out.println(i.getNumero() + " de " + i.getPalo());
        }
    }
    
    public void mostrarBaraja(){
         for(Carta i : baraja){
            System.out.println(i.getNumero() + " de " + i.getPalo());
        }
    }
}
