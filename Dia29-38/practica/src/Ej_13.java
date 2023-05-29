import java.util.Scanner;

public class Ej_13 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar tamaño de la matriz");
        int numero=leer.nextInt();
        String matriz[][]=new String[numero][numero];

        for (int i = 0; i<numero; i++) {
            for(int j=0; j<numero; j++){
                if((i==0)||(j==0)||(i==numero-1)||(j==numero-1)){
                    matriz[i][j]="*";
                }
                else{
                    matriz[i][j]=" ";
                }
            }
        }

        for (int i=0; i<numero; i++) {
            for (int j=0; j<numero; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();   
        }
    }
}