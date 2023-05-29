import java.util.Scanner;

public class Ej_4 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        float celcius=leer.nextFloat();
       
        System.out.println("EL equivalente en farenheit es: "+ (32+(9*celcius/5)));
    }
}