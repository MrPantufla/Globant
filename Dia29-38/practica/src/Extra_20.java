import java.util.Scanner;

public class Extra_20 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        int arr[]=new int[10];
        
        rellenar(arr);
        imprimir(arr);
    }

    public static void rellenar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=(int)(Math.random()*10);
        }
    }

    public static void imprimir(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
