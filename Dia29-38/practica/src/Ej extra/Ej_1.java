import java.util.Scanner;

public class Ej_1{
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        int min;
        System.out.println("Ingresar minutos");
        min=leer.nextInt();

        System.out.println(min/60 +" horas");
        System.out.println(min/60/24 + " dias");
    }
}
