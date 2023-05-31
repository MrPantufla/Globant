import java.util.Scanner;

public class Extra_13 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        int cant=leer.nextInt();

        for(int i=1; i<=cant; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
