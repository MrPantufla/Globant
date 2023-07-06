package com.mycompany.cooperativo3;
import Services.AlquilerService;
import Services.PeliculaService;
import Objects.Alquiler;
import Objects.Pelicula;
import java.util.Scanner;
import java.time.LocalDate;

public class Cooperativo3 {
    
        
    public static void main(String[] args) {
        PeliculaService pelicula = new PeliculaService();
        AlquilerService alquiler = new AlquilerService();
        Pelicula p[] = new Pelicula[10];
        Alquiler a[] = new Alquiler[5];
        boolean band=false;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contadorPeliculasAñadidas=0;
        int contadorAlquileresAñadidos=0;
            
        while(band==false){
            System.out.println("Seleccione una opcion:");
            System.out.println("1: Crear pelicula");
            System.out.println("2: Crear alquiler");
            System.out.println("3: Listar todas las peliculas disponibles");
            System.out.println("4: Listar todas las peliculas alquiladas");
            System.out.println("5: Buscar una pelicula por título");
            System.out.println("6: Buscar una película por género");
            System.out.println("7: Buscar un alquiler por fecha");
            System.out.println("8: Calcular el ingreso total del servicio");
            System.out.println("9: Salir");
            
            int opcion = leer.nextInt();
            leer.nextLine();
            
            switch(opcion){
                case 1 -> {
                    p[contadorPeliculasAñadidas] = pelicula.crearPelicula();
                    contadorPeliculasAñadidas++;
                }
                case 2 -> {
                    System.out.println("Ingrese nombre de pelicula a alquilar");
                    String nombrePelicula = leer.nextLine();
                    boolean flag=false;
                     
                    for (int i = 0; i < p.length; i++) {
                        if(p[i]==null){
                            break;
                        }
                        
                        if(nombrePelicula.equals(p[i].getTitulo())){
                            flag=true;
                        }
                    }
                    if(flag){
                        a[contadorAlquileresAñadidos] = alquiler.crearAlquiler(nombrePelicula);
                        contadorAlquileresAñadidos++;
                    }
                    else{
                        System.out.println("La pelicula que intenta alquilar no existe");
                    }
                }   
                case 3 -> {
                    for (int i = 0; i < p.length; i++) {
                        System.out.println(p[i]);
                        if(p[i]==null){
                            break;
                        }
                    }
                }
                case 4 -> {
                    int j=0;
                    while(a[j]!=null){
                        System.out.println(a[j]);
                        j++;
                    }
                }
                case 5 -> {
                    boolean flag=false;
                    System.out.println("Ingresar pelicula a buscar");
                    String titulo = leer.nextLine();
                    for (int i = 0; i < p.length; i++){
                        if(p[i]==null){
                            break;
                        }
                        
                        if(p[i].getTitulo().equals(titulo)){
                            flag=true;
                            break;
                        }
                    }
                    if(flag){
                        System.out.println("La pelicula se encuentra en la lista");
                    }
                    else{
                        System.out.println("La pelicula no se encuentra en la lista");
                    }
                }
                case 6 -> {
                    boolean flag2=false;
                    System.out.println("Ingresar genero a buscar");
                    String genero = leer.nextLine();
                    for (int i = 0; i < p.length; i++){
                        if(p[i]==null){
                            break;
                        }
                        
                        if(p[i].getGenero().equals(genero)){
                            flag2=true;
                            break;
                        }
                    }
                    if(flag2){
                        System.out.println("La pelicula se encuentra en la lista");
                    }
                    else{
                        System.out.println("La pelicula no se encuentra en la lista");
                    }
                }
                case 7 -> {
                    boolean flag3=false;
                    System.out.println("Ingresar fecha a buscar con formato YYYY-MM-DD");
                    String ingresarFecha=leer.nextLine();
                    LocalDate nuevaFecha = LocalDate.parse(ingresarFecha);
                    
                    int comparacion;
                    for (int i = 0; i < p.length; i++){
                        if(a[i]==null){
                            break;
                        }
                        
                        comparacion=(nuevaFecha.compareTo(a[i].getFechaInicio()));
                        
                        if(comparacion==0){
                            flag3=true;
                            break;
                        }
                    }
                    if(flag3){
                        System.out.println("La pelicula se encuentra en la lista");
                    }
                    else{
                        System.out.println("La pelicula no se encuentra en la lista");
                    }
                }
                case 8 -> {
                    int sumaTotal=0;
                    
                    for (int i = 0; i < a.length; i++) {
                        if(a[i]==null){
                            break;
                        }
                        
                        sumaTotal+=a[i].getPrecio();
                    }
                    
                    System.out.println("El ingreso total del servicio es: " + sumaTotal);
                }
                case 9 -> band=true;
            }
        }
    }
}