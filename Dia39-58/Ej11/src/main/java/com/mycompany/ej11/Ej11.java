package com.mycompany.ej11;
import java.util.Scanner;
import java.util.Date;

public class Ej11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int dia, mes, anio;
        
        dia=leer.nextInt();
        mes=leer.nextInt();
        anio=leer.nextInt();
        
        Date fecha = new Date(anio, mes, dia);
        
        Date fechaActual = new Date();
        
        System.out.println("Entre la fecha ingresada y la actual hay " + (fechaActual.getYear()+1900-fecha.getYear()) + " años");      
    }
}
