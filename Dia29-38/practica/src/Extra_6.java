import java.util.Scanner;

public class Extra_6 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingesar cant de personas");
        int n=leer.nextInt(), countMenor=0, count=0;
        float estatura, estaturasMenores=0, estaturas=0;

        for (int i = 0; i < n; i++) {
            System.out.println("Ingresar una estatura");
            estatura=leer.nextFloat();
            if(estatura<1.6){
                countMenor++;
                estaturasMenores+=estatura;
            }
            count++;
            estaturas+=estatura;
        }

        System.out.println("El promedio de estaturas menores a 1.6mts es: "+ estaturasMenores/countMenor);
        System.out.println("El promedio total de las estaturas es: "+ estaturas/count);
    }
}
