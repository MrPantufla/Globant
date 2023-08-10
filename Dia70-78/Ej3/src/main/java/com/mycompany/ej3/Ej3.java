package com.mycompany.ej3;
import Services.CartaService;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        CartaService c = new CartaService();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        c.llenarBaraja();
       
        boolean band=false;
        while(band==false){
            System.out.println("Ingrese la opción que desea");
            System.out.println("1: Barajar");
            System.out.println("2: Mostrar la siguiente carta");
            System.out.println("3: Mostrar la cantidad de cartas que quedan en la baraja");
            System.out.println("4: Pedir una cantidad de cartas");
            System.out.println("5: Mostrar la cantidad de cartas descartadas");
            System.out.println("6: Mostrar todas las cartas que quedan en la baraja");
            System.out.println("7: Salir");
            int opcion=leer.nextInt();
           
            switch(opcion){
               case 1-> c.barajar();
               case 2-> c.siguienteCarta();
               case 3-> c.cartasDisponibles();
               case 4-> c.darCartas();
               case 5-> c.cartasMonton();
               case 6-> c.mostrarBaraja();
               case 7-> band=true;
            }
        }   
    }
}
