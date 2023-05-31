import java.util.Scanner;

public class Extra_17 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        float numero;
        numero=leer.nextFloat();

        if(esPrimo(numero)){
            System.out.println("Es primo");
        }
        else{
            System.out.println("No es primo");
        }

    }

    public static boolean esPrimo(float num){
        num=num/2;
        boolean band=true;

        for (int i = 1; i < num; i++) {
            if(num%i==0){
                band=false;
            }
        }

        return band;
    }
}
