package com.mycompany.cooperativo1;
import Objects.Vehiculo;
public class Cooperativo1 {

    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Honda", "Civic", 2007, "automovil");
        Vehiculo vehiculo2 = new Vehiculo("Ricardo", "Cordoba", 1980, "bicicleta");
        Vehiculo vehiculo3 = new Vehiculo("Suzuki", "Cb150", 2000, "motocicleta");
        
        System.out.println("Vehiculo1:");
        System.out.println("Durante 5 segundos se mueve: " + (vehiculo1.moverse(5)));
        System.out.println("Durante 10 segundos se mueve: " + (vehiculo1.moverse(10)));
        System.out.println("Durante 60 segundos se mueve: " + (vehiculo1.moverse(60)));
        System.out.println("");
        System.out.println("Vehiculo 2");
        System.out.println("Durante 5 segundos se mueve: " + (vehiculo2.moverse(5)));
        System.out.println("Durante 10 segundos se mueve: " + (vehiculo2.moverse(10)));
        System.out.println("Durante 60 segundos se mueve: " + (vehiculo2.moverse(60)));
        System.out.println("");
        System.out.println("Vehiculo 3");
        System.out.println("Durante 5 segundos se mueve: " + (vehiculo3.moverse(5)));
        System.out.println("Durante 10 segundos se mueve: " + (vehiculo3.moverse(10)));
        System.out.println("Durante 60 segundos se mueve: " + (vehiculo3.moverse(60)));
        
        int bicicleta=vehiculo2.moverse(300)+vehiculo2.frenar();
        int auto=vehiculo1.moverse(300)+vehiculo1.frenar(); 
        int moto=vehiculo3.moverse(300)+vehiculo3.frenar();
        
        if(bicicleta>auto && bicicleta>moto){
            System.out.println("El vehiculo que más avanzó fue la bicicleta recorriendo " + bicicleta + " metros");
        }
        else if(auto>bicicleta && auto>moto){
            System.out.println("El vehiculo que más avanzó fue el auto recorriendo " + auto + " metros");
        }
        else if(moto>bicicleta && moto>auto){
            System.out.println("El vehiculo que más avanzó fue la moto recorriendo " + moto + " metros");
        }
        else{
            System.out.println("Hubo 2 vehiculos que recorrieron la misma distancia ");
        }
    }
}
