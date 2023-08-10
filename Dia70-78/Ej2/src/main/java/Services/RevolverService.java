package Services;
import Objects.Revolver;
import java.util.Random;

public class RevolverService {
    Revolver r = new Revolver();
    Random random = new Random();
    Random random2 = new Random();
    
    public void llenarRevolver(){
        int aleatorio = random.nextInt(6 - 1 + 1) + 1;
        r.setpActual(aleatorio);
        System.out.println("Aleatorio 1 " + aleatorio);
        int aleatorio2 = random2.nextInt(6 - 1 + 1) + 1;
        r.setpAgua(aleatorio2);
        System.out.println("Aleatorio 2 " + aleatorio2);
    }
    
    public boolean mojar(){
        return r.getpActual()==r.getpAgua();
    }
    
    public void siguienteChorro(){
        if(r.getpActual()==6){
            r.setpActual(1);
        }
        else{
            r.setpActual(r.getpActual()+1);
        }
    }
    
    @Override
    public String toString(){
        return r.toString();
    }
}
