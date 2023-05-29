import java.util.Scanner;

public class Ej_6 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        int numero=leer.nextInt();

        if(numero%2==0){
            System.out.println("Es par");
        }
        else{
            System.out.println("Es impar");
        }
    }
}