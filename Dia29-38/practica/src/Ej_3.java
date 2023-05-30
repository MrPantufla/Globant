import java.util.Scanner;

public class Ej_3 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        String frase = leer.nextLine();

        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
}
