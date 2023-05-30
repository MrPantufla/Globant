import java.util.Scanner;

public class Ej_17 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar cant de numeros");
        int n= leer.nextInt();
        int numero, count;
        int arr[]=new int [5];

        for(int i=0; i<n; i++){
            System.out.println("Ingresar un numero");
            numero=leer.nextInt();
            count=0;
            while(numero>0){
                count++;
                numero=numero/10;
            }
            switch(count){
                case 1:
                    arr[0]++;
                    break;
                case 2:
                    arr[1]++;
                    break;
                case 3:
                    arr[2]++;
                    break;
                case 4:
                    arr[3]++;
                    break;
                case 5:
                    arr[4]++;
                    break;
                default:
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Numeros de "+ (i+1) + " cifra/s: " + arr[i]);
        }
    }
}