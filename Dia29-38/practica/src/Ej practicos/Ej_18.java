import java.util.Random;
import java.util.Scanner;

public class Ej_18 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int matriz[][]=new int[3][3];
        
        for (int i=0; i<3; i++) {
            for(int j=0; j<3; j++){
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Traspuesta");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i]+ " ");
            }
            System.out.println("");
        }
        
    }
}