package Services;
import java.util.Scanner;
import Objects.Raices;
      
public class RaicesService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Raices r = new Raices();
    
    public Raices crearOperacion(){
        System.out.println("Ingrese A");
        r.setA(leer.nextInt());
        System.out.println("Ingrese B");
        r.setB(leer.nextInt());
        System.out.println("Ingrese C");
        r.setC(leer.nextInt());
        
        return r;
    }
    
    public double getDiscriminante(){
        return (Math.pow(r.getB(),2)-(4*r.getA()*r.getC()));
    }
    
    public boolean tieneRaices(){
        return getDiscriminante()>0;
    }
    
    public boolean tieneRaiz(){
        return getDiscriminante()==0;
    }
    
    public void obtenerRaices(){
        if(tieneRaices()){
            System.out.println("Raiz 1: " + ((r.getB()*(-1))+Math.sqrt(getDiscriminante()/(2*r.getA()))));
            System.out.println("Raiz 2: " + ((r.getB()*(-1))-Math.sqrt(getDiscriminante()/(2*r.getA()))));
        }
        else{
            System.out.println("No tiene 2 raices");
        }
    } 
    
    public void obtenerRaiz(){
        System.out.println("La unica solucion posible es: " + ((r.getB()*(-1))+Math.sqrt(getDiscriminante()/(2*r.getA()))));
    }
    
    public void calcular(){
        if(tieneRaices()){
            System.out.println("Hay dos soluciones posibles y estas son " + ((r.getB()*(-1))+Math.sqrt(getDiscriminante()/(2*r.getA()))) + " y " + ((r.getB()*(-1))-Math.sqrt(getDiscriminante()/(2*r.getA())))); 
        }
        else{
            System.out.println("Hay una sola solución y esta es " + ((r.getB()*(-1))-Math.sqrt(getDiscriminante()/(2*r.getA()))));
        }
    }
}
