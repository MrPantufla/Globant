import java.util.Scanner;

public class Extra_8 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        int num=2, pares=0, impares=0;

        while(num%5!=0){
            num=leer.nextInt();
            if(num%2==0){
                pares++;
            }
            else{
                impares++;
            }
        }

        System.out.println("Numeros pares: "+ pares + " y numeros impares: " + impares);
    }
}
