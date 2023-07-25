package com.mycompany.ej4;
import Services.PeliculaService;

public class Ej4 {

    public static void main(String[] args) {
        PeliculaService p = new PeliculaService();
        
        p.cargarPeliculas();
        System.out.println("");
        
        p.mostrarPeliculas();
        System.out.println("");
        
        p.mostrarPeliculasLargas();
        System.out.println("");
        
        p.mayorAMenor();
        System.out.println("");
        
        p.menorAMayor();
        System.out.println("");
        
        p.ordenadasPorTitulo();
        System.out.println("");
        
        p.ordenadasPorDirector();
    }
}
