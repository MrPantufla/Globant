package com.mycompany.extra3;
import Services.LibroService;
import java.util.Scanner;

public class Extra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        LibroService l = new LibroService();
        
        boolean band=false;
        
        while(band==false){
            System.out.println("Seleccionar opcion");
            System.out.println("1- Añadir un libro");
            System.out.println("2- Pedir prestado un libro");
            System.out.println("3- Devolver un libro");
            System.out.println("4- Listar libros");
            System.out.println("5- Salir");
            
            String opcion = leer.nextLine();
            
            switch(Integer.parseInt(opcion)){
                case 1 -> l.añadirLibro();
                case 2 -> l.prestamo();
                case 3 -> l.devolucion();
                case 4 -> l.listarLibros();
                case 5 -> band=true;
            }
        }
    }
}
