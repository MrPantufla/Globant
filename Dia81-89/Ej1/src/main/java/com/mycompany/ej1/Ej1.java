package com.mycompany.ej1;
import Objects.Caballo;
import Objects.Gato;
import Objects.Perro;

public class Ej1 {
    public static void main(String[] args) {
        Perro p = new Perro("Stich", "Croquetas", 15, "Doberman");
        Gato g = new Gato("Pelusa", "Galletas", 6, "Siames");
        Caballo c = new Caballo("Juan", "Pasto", 25, "Fino");
        
        p.alimentarse();
        g.alimentarse();
        c.alimentarse();
    }
}