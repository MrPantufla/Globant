import java.util.Scanner;

public class Extra_19 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar tamaño");
        int n=leer.nextInt();
        int arreglo1[]=new int [n];
        int arreglo2[]=new int [n];

        System.out.println("Ingesar array 1");
        for (int index = 0; index < n; index++) {
            arreglo1[index]=leer.nextInt();
        }
        
        System.out.println("Ingresar array 2");
        for (int index = 0; index < n; index++) {
            arreglo2[index]=leer.nextInt();
        }

        System.out.println("Que los arrays son iguales es: " + sonIguales(arreglo1, arreglo2, n));

    }

    public static boolean sonIguales(int[] arr1, int[] arr2, int tam){
        boolean band=true;
        
        for (int i = 0; i < tam; i++) {
            if(arr1[i]!=arr2[i]){
                band=false;
            }
        }

        return band;
    }
}
