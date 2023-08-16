package com.mycompany.extra4;
import Objects.Simulador;

public class Extra4 {

    public static void main(String[] args) {
        Simulador s = new Simulador();
        
        s.llenarListas();
        s.generarDni();
        s.generarAlumnos();
        s.imprimirAlumnos();
        System.out.println("");
        System.out.println("");
        s.votacion();
        s.imprimirAlumnos();
        System.out.println("");
        System.out.println("");
        s.facilitadores();
    }
}
