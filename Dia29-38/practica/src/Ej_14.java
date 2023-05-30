import java.util.Scanner;

public class Ej_14 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar una cantidad de euros");
        int cant=leer.nextInt();
        leer.nextLine();
        System.out.println("Ingresar libra, yen o dolar");
        String opcion=leer.nextLine();

        convertir(cant, opcion);
    }

    public static void convertir(int cantidad, String cadena){
        switch(cadena){
            case "libra":
                System.out.println(cantidad + " euros es igual a "+ cantidad*0.86 + " libras");
                break;
            case "yen":
                System.out.println(cantidad + " euros es igual a "+ cantidad*129.852 + " yenes");
                break;
            case "dolar":
                System.out.println(cantidad + " euros es igual a "+ cantidad*1.28 + " dolares");
                break;
        }
    }
}

