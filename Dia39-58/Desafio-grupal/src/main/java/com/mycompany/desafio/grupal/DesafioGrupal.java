package com.mycompany.desafio.grupal;

import java.util.ArrayList;
import Services.ClienteServicio;
import Services.RutinaServicio;
import java.util.Scanner;

public class DesafioGrupal {
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {  
        ArrayList<ClienteServicio> clientes = new ArrayList<>();
        ArrayList<RutinaServicio> rutinas = new ArrayList<>();
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Cliente " + i);
            clientes.add(new ClienteServicio());
            clientes.get(i).registrarCliente();
        }
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Rutina " + i);
            rutinas.add(new RutinaServicio());
            rutinas.get(i).crearRutina();
        }
        
        System.out.println("MOSTRAR CLIENTES");
        imprimirClientes(clientes);
        
        System.out.println("MOSTRAR RUTINAS");
        imprimirRutinas(rutinas);
        
        System.out.println("MODIFICAR CLIENTE");
        modificarCliente(clientes);
        
        System.out.println("ELIMINAR CLIENTE");
        eliminarCliente(clientes);
        
        System.out.println("MOSTRAR CLIENTES NUEVAMENTE");
        imprimirClientes(clientes);
        
        System.out.println("MODIFICAR RUTINA");
        modificarRutina(rutinas);
        
        System.out.println("ELIMINAR RUTINA");
        eliminarRutina(rutinas);
        
        System.out.println("MOSTRAR RUTINAS NUEVAMENTE");
        imprimirRutinas(rutinas);
    }
    public static void imprimirClientes(ArrayList<ClienteServicio> clientes){
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).obtenerClientes()); 
        }
    }
    
    public static void imprimirRutinas(ArrayList<RutinaServicio> rutinas){
        for (int i = 0; i < rutinas.size(); i++) {
            System.out.println(rutinas.get(i).obtenerRutina());
        }
    }
    
    public static void eliminarCliente(ArrayList<ClienteServicio> clientes){
        System.out.println("Ingresar id del cliente a eliminar");
        int id=leer.nextInt();
        leer.nextLine();
        for (int i = 0; i < clientes.size(); i++) {
            if(id==clientes.get(i).retornarId()){
                clientes.remove(i);
                System.out.println("SE REMOVIO EL CLIENTE NUMERO " + i);
            }
        }
    }
    
    public static void eliminarRutina(ArrayList<RutinaServicio> rutinas){
        System.out.println("Ingresar id de rutina a eliminar");
        int id=leer.nextInt();
        leer.nextLine();
        for (int i = 0; i < rutinas.size(); i++) {
            if(id==rutinas.get(i).retornarId()){
                rutinas.remove(i);
                System.out.println("SE REMOVIO LA RUTINA NUMERO " + i);
            }
        }
    }
    
    public static void modificarCliente(ArrayList<ClienteServicio> clientes){
        System.out.println("Ingrese el id del cliente a modificar");
        int id = leer.nextInt();
        leer.nextLine();
        for (int i = 0; i < clientes.size(); i++) {
            if(id==clientes.get(i).retornarId()){
                System.out.println("Nombre");
                String nombre=leer.nextLine();
                System.out.println("Edad");
                int edad=leer.nextInt();
                System.out.println("Altura");
                int altura=leer.nextInt();
                System.out.println("Peso");
                int peso=leer.nextInt();
                leer.nextLine();
                System.out.println("Objetivo");
                String objetivo=leer.nextLine();
                clientes.get(i).actualizarCliente(clientes.get(i).retornarId(), nombre, edad, altura, peso, objetivo);
            }
        }
    }
    
    public static void modificarRutina(ArrayList<RutinaServicio> rutinas){
        System.out.println("Ingresar el ID de la rutina a modificar");
        id = leer.nextInt();
        leer.nextLine();
        for (int i = 0; i < rutinas.size(); i++) {
            if(id==rutinas.get(i).retornarId()){
                System.out.println("Nombre");
                String nombre=leer.nextLine();
                System.out.println("Duracion");
                int duracion=leer.nextInt();
                leer.nextLine();
                System.out.println("Dificultad");
                String dificultad=leer.nextLine();
                System.out.println("Descripcion");
                String descripcion=leer.nextLine();
                rutinas.get(i).actualizarRutina(rutinas.get(i).retornarId(), nombre, duracion, dificultad, descripcion);
            }
        }
    }
}
