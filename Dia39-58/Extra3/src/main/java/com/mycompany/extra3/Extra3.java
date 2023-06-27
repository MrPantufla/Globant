package com.mycompany.extra3;
import Services.RaicesService;

public class Extra3 {

    public static void main(String[] args) {
        RaicesService r = new RaicesService();
        
        r.crearOperacion();
        System.out.println("Discriminante: " + r.getDiscriminante());
        System.out.println("Tiene 2 raices: " + r.tieneRaices());
        System.out.println("Tiene una sola raiz: " + r.tieneRaiz());
        r.obtenerRaices();
        r.obtenerRaiz();
        r.calcular();
    }
}
