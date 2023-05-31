import java.util.Scanner;

public class Extra_18 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar cant");
        int cant=leer.nextInt(), sum=0;
        int arr[]=new int[cant];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=leer.nextInt();
            sum+=arr[i];
        }

        System.out.println("Suma: " + sum);
    }
}
