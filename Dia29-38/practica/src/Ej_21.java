import java.util.Scanner;

public class Ej_21 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        int matrizGrande[][]=new int [10][10];
        int matriz[][]=new int [3][3];
        boolean band=false;
        int indicei=0, indicej=0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizGrande[i][j]=(int)(Math.random()*10);
                System.out.print(matrizGrande[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Ingresar matriz 3x3");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]=leer.nextInt();
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(matrizGrande[i][j]==matriz[0][0]){
                    int count=0;
                    indicei=i;
                    indicej=j;
                    for (int i2 = 0; i2 < matriz.length; i2++) {
                        for (int j2 = 0; j2 < matriz.length; j2++) {
                            if(matriz[i2][j2]==(matrizGrande[i+i2][j+j2])){
                                count++;
                            }
                        }
                    }
                    if(count==9){
                        band=true;
                        break;
                    }
                }
                if(band==true){
                    break;
                }
            }
            if(band==true){
                break;
            }
        }

        if(band==true){
            System.out.println("Encontrada en el indice " + indicei + ", " + indicej);
        }
        else{
            System.out.println("No encontrada");
        }
    }
}