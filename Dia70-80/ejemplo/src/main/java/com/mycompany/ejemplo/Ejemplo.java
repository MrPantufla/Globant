package com.mycompany.ejemplo;
import Obejcts.Persona;

public class Ejemplo {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        
        persona1.setNombre("Juan");
        persona1.setEdad(24);
        
        System.out.println(persona1.getEdad()); 
    }
}
