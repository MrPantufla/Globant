import java.util.Scanner;

public class Extra_22 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingesar NxM");
        int n=leer.nextInt(), m=leer.nextInt(), sum=0;
        int matriz[][]=new int[n][m];

        for (int i = 0; i < matriz.length; i++) {
            for(int j=0; j< matriz.length; j++){
                matriz[i][j]=(int)(Math.random()*10);
                sum+=matriz[i][j];
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for(int j=0; j< matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("La suma es: " + sum);
    }
}
