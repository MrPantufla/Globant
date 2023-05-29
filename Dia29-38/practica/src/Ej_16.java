import java.util.Random;
import java.util.Scanner;

public class Ej_16 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        boolean band=false, band2=false;
        int n, buscar;
        System.out.println("Ingresar un tamaño");
        n=leer.nextInt();
        int arreglo[]=new int[n];
        System.out.println("Ingresar un valor a buscar");
        buscar=leer.nextInt();

        for (int i = 0; i < n; i++) {
            arreglo[i]=(int)Math.random()*10;

            if(arreglo[i]==buscar){
                band=true;
                continue;
            }

            if(band=true){
                if(arreglo[i]==buscar){
                    band2=true;
                }
            }
        }

        if(band2==true){
            System.out.println("El numero se encuentra más de una vez");
        }
        else{
            if(band==true){
                System.out.println("El numero se encuentra solo una vez");
            }
            else{
                System.out.println("El numero no se encuentra en el arreglo");
            }
        }
    }
}