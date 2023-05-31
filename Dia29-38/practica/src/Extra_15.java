import java.util.Scanner;

public class Extra_15 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");

        int a=leer.nextInt(), b=leer.nextInt();

        System.out.println("Elija que hacer: 1-sumar, 2-restar, 3-multiplicar, 4-dividir");
        int opcion=leer.nextInt();

        switch(opcion){
            case 1:
            System.out.println(sumar(a,b));
                break;
            case 2:
            System.out.println(restar(a,b));
                break;
            case 3:
            System.out.println(multiplicar(a,b));
                break;
            case 4:
            System.out.println(dividir(a,b));
                break;
            default:
                System.out.println("Opcion incorrecta"); 
        }
    }

    public static int sumar(int num1, int num2){
        return num1+num2;
    }

    public static int restar(int num1, int num2){
        return num1-num2;
    }

    public static int multiplicar(int num1, int num2){
        return num1*num2;
    }

    public static int dividir(int num1, int num2){
        return num1/num2;
    }
}
