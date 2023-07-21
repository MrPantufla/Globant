package com.mycompany.ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        ArrayList <String> razas = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        boolean band=false;
        String entrada, opcion;
        
        while(band==false){
            System.out.println("Ingresar raza");
            entrada=leer.nextLine();
            razas.add(entrada);
            System.out.println("Desea ingresar otra raza? Ingresa S o N");
            opcion=leer.nextLine();
            opcion=opcion.toLowerCase();
            
            if(opcion.equals("n")){
                band=true;
            }
        }
        
        for(String i : razas){
            System.out.println(i);
        }
    }
}
