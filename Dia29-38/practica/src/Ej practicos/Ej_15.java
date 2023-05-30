import java.util.Scanner;

public class Ej_15 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        int vector[]=new int[100];

        for (int i = 0; i < 100; i++) {
            vector[i]=i+1;
        }

        for (int i = 99; i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }
}