import java.util.Scanner;

public class Extra_11 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        int numero=leer.nextInt(), i=0;

        while(numero>0){
            numero=numero/10;
            i++;
        }
        System.out.println("Tiene " + i + " cifras");
    }
}
