package com.mycompany.ej1;
import Objects.Perro;
import Objects.Persona;

public class Ej1 {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Perro", "Caniche", 25, "Chico");
        Perro perro2 = new Perro("Perroxd", "asd", 3, "Grande");
        Persona persona1 = new Persona("Juan", "Pizzio", 24, 56489752, perro1);
        Persona persona2 = new Persona("xd", "dx", 69, 12345678, perro2);
        
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        
    }
}
