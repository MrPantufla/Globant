package com.mycompany.extra1;
import Objects.Cancion;

public class Extra1 {
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion("xd", "autorinventado123");
        
        System.out.println("Primera cancion vacia: " + cancion1.getTitulo() + ", " + cancion1.getAutor());
        System.out.println("Segunda cancion: " + cancion2.getTitulo() + ", " + cancion2.getAutor());
    }
}
