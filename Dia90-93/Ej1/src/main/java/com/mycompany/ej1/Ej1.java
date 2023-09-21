package com.mycompany.ej1;
import Objects.Persona;
import java.util.Scanner;
import podio.Je;
import java.util.Random;

public class Ej1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona p;
        
        try{
            System.out.println(p.esMayorDeEdad());
        }catch(RuntimeException a){
            System.out.println("xddd" + a.getMessage());
        }
    }
}