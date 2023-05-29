import java.util.Scanner;

public class Ej_11 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, opcion;
        System.out.println("Ingresar dos numeros");
        num1=leer.nextInt();
        num2=leer.nextInt();
        boolean band=true;

        do{
            System.out.print("\033[H\033[2J");
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion=leer.nextInt();

            switch(opcion){
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.println("La suma es: "+ (num1+num2));
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    System.out.println("La resta es: "+ (num1-num2));
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");
                    System.out.println("El producto es: "+ (num1*num2));
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 4:
                    System.out.print("\033[H\033[2J");
                    System.out.println("La division es: "+ (num1/num2));
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 5:
                    System.out.print("\033[H\033[2J");
                    System.out.println("Saliendo...");
                    new java.util.Scanner(System.in).nextLine();
                    band=false;
                    break;
            }
        }while(band==true);
    }
}