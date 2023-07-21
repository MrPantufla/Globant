package com.mycompany.ej2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej2 {

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
        
        System.out.println("LA LISTA ES:");
        for(String i : razas){
            System.out.println(i);
        }
        System.out.println("");
        
        System.out.println("Ingresar una raza a eliminar");
        entrada=leer.nextLine();
        if(razas.contains(entrada)){
            razas.remove(entrada);
            System.out.println("NUEVA LISTA:");
            for(String i : razas){
            System.out.println(i);
        }
        System.out.println("");
        }
        else{
            System.out.println("No existe esa raza en la lista");
        }
    }
}
