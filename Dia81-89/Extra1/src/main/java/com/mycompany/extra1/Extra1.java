package com.mycompany.extra1;
import Services.AlquilerService;

public class Extra1 {
    public static void main(String[] args) {
        AlquilerService a = new AlquilerService();
        
        System.out.println("El precio total es: " + a.alquilarBarco());
    }
}
