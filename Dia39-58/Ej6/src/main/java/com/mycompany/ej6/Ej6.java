package com.mycompany.ej6;
import Objects.Cafetera;

public class Ej6 {

    public static void main(String[] args) {
        Cafetera cafetera1 = new Cafetera(20, 0);
        
        cafetera1.llenarCafetera();
        cafetera1.servirTaza(6);
        System.out.println("La cantidad actual es: " + cafetera1.getCantidadActual());
        cafetera1.vaciarCafetera();
        System.out.println("La cantidad actual es: " + cafetera1.getCantidadActual());
        cafetera1.agregarCafe(15);
        System.out.println("La cantidad actual es: " + cafetera1.getCantidadActual());
    }
}
