import java.util.Scanner;

public class Ej_9 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        String frase=leer.nextLine();

        if((frase.substring(0, 1)).equals("A")){
            System.out.println("Correcto");
        }
        else{
            System.out.println("Incorrecto");
        }
    }
}