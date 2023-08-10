package com.mycompany.ej2;
import Objects.Jugador;
import Services.JuegoService;
import Services.RevolverService;
import Services.JugadorService;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Jugador> lista = new ArrayList();
        JuegoService j = new JuegoService();
        RevolverService r = new RevolverService();
        JugadorService jugador = new JugadorService();
        
        System.out.println("Ingresar cantidad de jugadores");
        int cantidad=leer.nextInt();
        for (int i = 0; i < cantidad; i++) {
            lista.add(jugador.crearJugador(i));
        }
        
        boolean band=false;
        while(band==false){
            band=j.ronda(lista, r);
        }
    }
}
