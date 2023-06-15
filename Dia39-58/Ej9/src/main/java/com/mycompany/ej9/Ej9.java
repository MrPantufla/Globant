package com.mycompany.ej9;
import Objects.Matematica;

public class Ej9 {
    public static void main(String[] args) {
        double min=(-20), max=20;
        
        Matematica cuenta1 = new Matematica((Math.random() * (max - min) + min),(Math.random() * (max - min) + min));
        
        System.out.println("El mayor es: " + cuenta1.devolverMayor());
        System.out.println("La potencia es: " + cuenta1.calcularPotencia());
        System.out.println("La raiz del menor es: " + cuenta1.calcularRaiz());
    }
}
