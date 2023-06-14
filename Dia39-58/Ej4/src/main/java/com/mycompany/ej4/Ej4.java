package com.mycompany.ej4;
import Objects.Rectangulo;
public class Ej4 {

    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo(5,8);
        
        System.out.println("Superficie: " + rec1.superficie());
        System.out.println("Perimetro: " + rec1.perimetro());
        System.out.println("");
        rec1.dibujar();
    }
}
