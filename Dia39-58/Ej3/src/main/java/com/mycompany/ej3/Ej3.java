package com.mycompany.ej3;
import Objects.Operacion;
public class Ej3 {

    public static void main(String[] args) {
        Operacion operacion1 = new Operacion(9,3);
        
        System.out.println("Suma: " + operacion1.sumar());
        System.out.println("Resta: " + operacion1.restar());
        System.out.println("Multiplicacion: " + operacion1.multiplicar());
        System.out.println("Division: " + operacion1.dividir());
    }
}
