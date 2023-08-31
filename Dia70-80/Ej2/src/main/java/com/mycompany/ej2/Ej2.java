package com.mycompany.ej2;
import Objects.Jugador;
import java.util.ArrayList;
import Objects.Juego;
import Objects.Revolver;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Jugador>jugadores = new ArrayList();
        Revolver r = new Revolver();
        Juego j = new Juego();
        
        System.out.println("Ingresar cantidad de jugadores");
        int cant = leer.nextInt();
        
        for (int i = 0; i < cant; i++) {
            Jugador jugador = new Jugador(i,"Jugador"+i,false);
            jugadores.add(jugador);
        }
        
        r.llenarRevolver();
        j.llenarJuego(jugadores,r);
        j.ronda();
    }
}
