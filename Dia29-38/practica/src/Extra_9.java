import java.util.Scanner;

public class Extra_9 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        int numero, divisor, i=0;
        numero=leer.nextInt();
        divisor=leer.nextInt();

        while(numero>divisor){
            i++;
            System.out.println(numero + "-" + divisor + "=" + (numero-divisor) + "   " + i + " resta/s realizada/s");
            numero-=divisor;
        }

        System.out.println("Dado que " + numero + " es menor que " + divisor + ", entonces: el residuo es " + numero + " y el cociente es " + i);
    }
}
