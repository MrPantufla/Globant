import java.util.Scanner;

public class Ej_5 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        int numero=leer.nextInt();

        System.out.println("El doble es: "+ numero*2);
        System.out.println("El triple es: "+ numero*3);
        System.out.println("La raiz cuadrada es: "+ Math.sqrt(numero));
    }
}