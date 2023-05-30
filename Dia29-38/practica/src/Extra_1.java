import java.util.Scanner;

public class Extra_1{
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        int min;
        float horas, dias;
        System.out.println("Ingresar minutos");
        min=leer.nextInt();
        horas=min/60;
        dias=horas/24;
        System.out.println(horas +" horas");
        System.out.println(dias + " dias");
    }
}
