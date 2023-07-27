package Services;

import java.util.ArrayList;
import java.util.Scanner;

public class NumerosService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList <Integer> numeros = new ArrayList();
   
    public void añadirNumeros(){
        int num, i=0, count=0;
        do{
            System.out.println("Ingresar numero");
            num=leer.nextInt();
            i++;
            count+=num;
            numeros.add(num);
        }while(num!=(-99));
        
        i--;
        numeros.remove(i);
        count+=99;
        
        System.out.println("LISTA DE TODOS LOS NUMEROS:");
        for(Integer j : numeros){
            System.out.println(j);
        }
        
        double countDouble = count;
        double iDouble = i;
        
        System.out.println("");
        System.out.println("La suma total es:" + count);
        System.out.println("El promedio de todos los numeros es: " + countDouble/iDouble);
    }
}
