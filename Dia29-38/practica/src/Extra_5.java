import java.util.Scanner;

public class Extra_5 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar valor y tipo");
        double valor=leer.nextInt();
        char tipo = leer.next().charAt(0);
        tipo=Character.toLowerCase(tipo);
        double valorTotal;

        switch(tipo){
            case 'a':
            System.out.println(valorTotal=valor*0.50);
                break;
            case 'b':
            System.out.println(valorTotal=valor*0.65);
                break;
            case 'c':
                System.out.println(valor);
                break;
            default:
                System.out.println("Clase no válida");
        }
    }
}
