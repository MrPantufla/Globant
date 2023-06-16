package com.mycompany.cooperativo2;
import Objects.Circulo;
import Objects.Cuadrado;
import Objects.Hexagono;
import Objects.Pentagono;
import Objects.Rectangulo;
import Objects.Rombo;
import Objects.Triangulo;


public class Cooperativo2 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3.98);
        Cuadrado cuadrado = new Cuadrado(4);
        Hexagono hexagono = new Hexagono(7);
        Pentagono pentagono = new Pentagono(11);
        Rectangulo rectangulo = new Rectangulo(2,7);
        Rombo rombo = new Rombo(5.6, 6.3);
        Triangulo triangulo = new Triangulo(3,4,3);
        
        System.out.println("El perimetro del circulo es: " + String.format("%.2f",circulo.calcularPerimetro()) + " y el area es: " + String.format("%.2f",circulo.calcularArea()));
        System.out.println("El perimetro del cuadrado es: " + String.format("%.2f",cuadrado.calcularPerimetro()) + " y el area es: " + String.format("%.2f",cuadrado.calcularArea()));
        System.out.println("El perimetro del hexagono es: " + String.format("%.2f",hexagono.calcularPerimetro()) + " y el area es: " + String.format("%.2f",hexagono.calcularArea()));
        System.out.println("El perimetro del pentagono es: " + String.format("%.2f",pentagono.calcularPerimetro()) + " y el area es: " + String.format("%.2f",pentagono.calcularArea()));
        System.out.println("El perimetro del rectangulo es: " + String.format("%.2f",rectangulo.calcularPerimetro()) + " y el area es: " + String.format("%.2f",rectangulo.calcularArea()));
        System.out.println("El perimetro del rombo es: " + String.format("%.2f",rombo.calcularPerimetro()) + " y el area es: " + String.format("%.2f",rombo.calcularArea()));
        System.out.println("El perimetro del triangulo es: " + String.format("%.2f",triangulo.calcularPerimetro()) + " y el area es: " + String.format("%.2f",triangulo.calcularArea()));  
    }
}
