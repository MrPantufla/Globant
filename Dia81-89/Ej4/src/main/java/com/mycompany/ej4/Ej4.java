package com.mycompany.ej4;
import Objects.Circulo;
import Objects.Rectangulo;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Circulo c = new Circulo();
        Rectangulo r = new Rectangulo();
        
        System.out.println("Ingresar radio del circulo");
        c.setRadio(leer.nextInt());
        System.out.println("Area del circulo: " + c.calcularArea());
        System.out.println("Perimetro del circulo: " + c.calcularPerimetro());
        System.out.println("");
        System.out.println("Ingresar base del rectangulo");
        r.setBase(leer.nextInt());
        System.out.println("Ingresar altura del rectangulo");
        r.setAltura(leer.nextInt());
        System.out.println("Area del rectangulo: " + r.calcularArea());
        System.out.println("Perimetro del rectangulo: " + r.calcularPerimetro());
    }
}
