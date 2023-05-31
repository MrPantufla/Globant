import java.util.Scanner;

public class Extra_10 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar 2 num");
        int num1=(int)(Math.random()*10), num2=(int)(Math.random()*10), resultado;
        System.out.println("Los numeros son "+ num1 + " y " + num2);

        
        do{
            resultado=leer.nextInt();
            if(resultado==(num1*num2)){
                System.out.println("Correcto");
            }
            else{
                System.out.println("Incorrecto, ingresar de nuevo");
            }
        }while(resultado!=(num1*num2));
    }
}
