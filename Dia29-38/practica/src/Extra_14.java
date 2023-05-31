import java.util.Scanner;

public class Extra_14 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar cant de familias");
        int familias=leer.nextInt(), hijos, edad, acumulador, auxj;

        for (int i = 1; i <= familias; i++) {
            System.out.println("FAMILIA " + i + ": ¿Cuantos hijos tiene?");
            acumulador=0;
            auxj=0;
            hijos=leer.nextInt();
            for(int j=1; j<=hijos; j++){
                System.out.println("Ingresar la edad del hijo " + j + "/" + hijos);
                edad=leer.nextInt();
                acumulador+=edad;
                auxj=j;
            }
            System.out.println("El promedio de edad de la familia " + i + " es: " + acumulador/auxj);
        }
    }
}
