import java.util.Scanner;

public class Ej_12 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        int count=0;
        String cadena;
        
        do{
            cadena=leer.nextLine();
            if(((cadena.substring(0, 1)).equals("X"))&&(cadena.length()==5)&&((cadena.substring(4, 5)).equals("O"))){
                count++;
            }
        }
        

        System.out.println("El numero de cadenas correctas es: "+ count);
    }
}