import java.util.Scanner;

public class Extra_23 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int tamanio=10, cantPalabras=5;
        String matriz[][]=new String[tamanio][tamanio];
        String palabras[]=new String[cantPalabras];
        int filasRandom[]=new int[cantPalabras];
        int columnasRandom[]=new int[cantPalabras];
        boolean band;

        System.out.println("Ingresar palabras");
        for (int i = 0; i < palabras.length; i++) {
            palabras[i]=leer.nextLine();
            if((palabras[i].length()>5) || (palabras[i].length()<3)){
                System.out.println("Plabra no válida, ingresar otra vez");
                i--;
            }
        }

        for (int i = 0; i < filasRandom.length; i++) {
            filasRandom[i]=(int)((Math.random()*10)-1);
            columnasRandom[i]=(int)((Math.random()*10)-1);
            band=false;

            for (int j = 0; j < filasRandom.length; j++) {
                if(filasRandom[i]==filasRandom[j] && i!=j && i!=0){
                    band=true;
                }
            }

            for (int j = 0; j < columnasRandom.length; j++) {
                if(columnasRandom[i]+(palabras[i].length())>9){
                    band=true;
                }
            }

            if(band==true){
                i--;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < palabras[i].length(); j++) {
                matriz[filasRandom[i]][columnasRandom[i]+j]=palabras[i].substring(j, j+1);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
                
            }
            System.out.println("");
        }

        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if(matriz[i][j]==null){
                    int numero=(int)(Math.random()*10);
                    matriz[i][j]=numero + "";
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
