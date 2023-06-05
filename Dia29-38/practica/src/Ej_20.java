import java.util.Scanner;

public class Ej_20 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        int cuadrado[][]=new int[3][3];
        boolean band=true;
        int arr[]=new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=0;
        }

        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado.length; j++) {
                cuadrado[i][j]=leer.nextInt();
            }
        }

        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado.length; j++) {
                arr[i]+=cuadrado[i][j];
                arr[j+3]+=cuadrado[j][i];

                if(i==j){
                    arr[6]+=cuadrado[i][j];
                }

                if(i+j==2){
                    arr[7]+=cuadrado[i][j];
                }
            }
        }

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1]){
                band=false;
            }
        }

        if(band){
            System.out.println("Es un cuadrado magico");
        }
        else{
            System.out.println("No es un cuadrado magico");
        }
    }
}