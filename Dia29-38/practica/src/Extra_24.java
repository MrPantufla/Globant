import java.util.Scanner;

public class Extra_24 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar n");
        int n=leer.nextInt();
        int vector[]=new int[n];
        vector[0]=1;
        vector[1]=1;

        for (int i = 2; i < n; i++) {
            vector[i]=vector[i-1]+vector[i-2];
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}
