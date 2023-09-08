package com.mycompany.ej2;
import Objects.Electrodomestico;
import Services.TelevisorService;
import Services.LavadoraService;
import java.util.ArrayList;
import Objects.Lavadora;
import Objects.Televisor;

public class Ej2y3 {
    public static void main(String[] args) {
        LavadoraService l = new LavadoraService();
        TelevisorService t = new TelevisorService();
        int sum = 0;
        
        ArrayList <Electrodomestico> electrodomesticos = new ArrayList();
        
        electrodomesticos.add(l.crearLavadora());
        electrodomesticos.add(t.crearTelevisor());
        electrodomesticos.add(l.crearLavadora());
        electrodomesticos.add(t.crearTelevisor());
        
        for(Electrodomestico i : electrodomesticos){
            
            if (i instanceof Lavadora) {
                l.mostrarLavadora((Lavadora) i);
                System.out.println("PRECIO: " + l.precioFinal((Lavadora)i));
                sum+=l.precioFinal();
            }
            else if(i instanceof Televisor){
                t.mostrarTelevisor((Televisor) i);
                System.out.println("PRECIO: " + t.precioFinal((Televisor)i));
                sum+=t.precioFinal();
            }
        }
        
        System.out.println("VALOR TOTAL: " + sum);    
    }
}
