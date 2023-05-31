import java.util.Scanner;

public class Extra_7 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.println("Definir cant de numeros");
        int n=leer.nextInt();


        conWhile(n);
        conDoWhile(n);
    }

    public static void conWhile(int n){
        System.out.println("Con while:");
        Scanner leer = new Scanner(System.in);

        int numero, min, max, count=1, almacenador=0, i=1;
        numero=leer.nextInt();
        min=numero;
        max=numero;
        almacenador+=numero;

       while(i<n){
            numero=leer.nextInt();

            i++;

            if(numero<min){
                min=numero;
            }

            if(numero>max){
                max=numero;
            }

            count++;
            almacenador+=numero;
        }

        System.out.println("El mayor es: "+ max + " y el menor es: " + min);
        System.out.println("El promedio de los numeros ingresados es: "+ almacenador/count);
    
    }

    public static void conDoWhile(int n){
        System.out.println("Con do while:");
        Scanner leer = new Scanner(System.in);

        int numero, min, max, count=1, almacenador=0, i=1;
        numero=leer.nextInt();
        min=numero;
        max=numero;
        almacenador+=numero;

        do{
            numero=leer.nextInt();
            i++;

            if(numero<min){
                min=numero;
            }

            if(numero>max){
                max=numero;
            }

            count++;
            almacenador+=numero;

        }while(i<n);

        System.out.println("El mayor es: "+ max + " y el menor es: " + min);
        System.out.println("El promedio de los numeros ingresados es: "+ almacenador/count);
    }
}


