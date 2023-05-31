import java.util.Scanner;

public class Extra_16{
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese cant");
        int cant=leer.nextInt(), j=0;
        leer.nextLine();
        String matriz[][]=new String[cant][2];
        String opcion="x";

        for (int i = 0; i < cant; i++){
            System.out.println("Ingrese nombre");
            matriz[i][0]=leer.nextLine();
            System.out.println("Ingrese edad");
            matriz[i][1]=leer.nextLine();
        }

        do{
            System.out.println("");
            System.out.println("Nombre: " + matriz[j][0]);
            System.out.println("Edad: " + matriz[j][1]);

            if(Integer.parseInt(matriz[j][1])>=18){
                System.out.println("Mayor de edad");
            }
            else{
                System.out.println("Menor de edad");
            }
            j++;
            System.out.println("");
            System.out.println("Desea ver más?");
            opcion=leer.nextLine();
        }while(!opcion.equals("no") && j<cant);
    }
}
