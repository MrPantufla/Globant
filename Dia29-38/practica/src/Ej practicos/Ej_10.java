import java.util.Scanner;

public class Ej_10 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        int limite, numero, count;
        count=0;
        System.out.println("Ingresar el limite");
        limite=leer.nextInt();

        while(count<limite){
            numero=leer.nextInt();
            count+=numero;
            System.out.println("Suma hasta ahora: "+ count);
        }
    }
}