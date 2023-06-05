import java.util.Scanner;

public class Extra_24 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar n");
        int n=leer.nextInt();
        int vector[]=new int[n];
        vector[0]=1;
        vector[1]=1;

        System.out.print(vector[0] + " ");
        System.out.print(vector[1] + " ");
        for (int i = 2; i < n; i++) {
            vector[i]=vector[i-1]+vector[i-2];
            System.out.print(vector[i] + " ");
        }
    }
}
