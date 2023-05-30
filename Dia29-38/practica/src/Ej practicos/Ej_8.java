import java.util.Scanner;

public class Ej_8 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        String frase=leer.nextLine();
        if(frase.length()==8){
            System.out.println("Correcto");
        }
        else{
            System.out.println("Incorrecto");
        }
    }
}