package com.mycompany.ej12;
import Objects.Persona;
import java.text.ParseException;

public class Ej12 {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        
        try {
            persona1.crearPersona();
        } catch (ParseException e) {
            System.out.println("Error al analizar la fecha de nacimiento.");
        }
        
        System.out.println("Edad de la persona 1: " + persona1.calcularEdad());
        System.out.println("Que persona1 es menor que la edad ingresada es: " + persona1.menorQue(20));
        persona1.mostrarPersona();
    }
}
