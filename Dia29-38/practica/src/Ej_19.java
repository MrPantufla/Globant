import java.util.Scanner;

public class Ej_19 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        int matriz[][]=new int[3][3];
        boolean band=true;

        System.out.println("Ingresar la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=leer.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j]!=((matriz[j][i])*(-1))){
                    band=false;
                }
            }
        }

        if(band==true){
            System.out.println("La matriz es antisimetrica");
        }
        else{
            System.out.println("La matriz no es antisimetrica");
        }

    }
}