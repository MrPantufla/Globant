package com.mycompany.ej8;
import Objects.Cadena;
public class Ej8 {

    public static void main(String[] args) {
        Cadena cadena1 = new Cadena("holaxddaa");
 
        System.out.println("La cantidad de vocales es: " + cadena1.mostrarVocales());
        cadena1.invertirFrase();
        System.out.println("Se repite el caracter " + cadena1.vecesRepetido("a") + " veces");
        cadena1.comprarLongitud("xd");
        cadena1.unirFrases("asd");
        cadena1.reemplazar("$");
        System.out.println("Que la cadena tiene el caracter es " + cadena1.contiene("x"));
        
    }
}
