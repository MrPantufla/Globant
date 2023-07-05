package com.mycompany.cooperativo3;
import Services.AlquilerService;
import Services.PeliculaService;
import Objects.Alquiler;
import Objects.Pelicula;
import java.util.Scanner;
import java.util.Date;
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
            
            int opcion = leer.nextInt();
            leer.nextLine();
            
            switch(opcion){
                case 1:
                    p[contadorPeliculasAñadidas] = pelicula.crearPelicula();
                    contadorPeliculasAñadidas++;
                    break;
                case 2:
                    a[contadorAlquileresAñadidos] = alquiler.crearAlquiler();
                    contadorAlquileresAñadidos++;
                    break;
                case 3:
                    for (int i = 0; i < 10; i++) {
                        System.out.println(p[i]);
                        if(p[i]==null){
                            break;
                        }
                    }
                    break;
                case 4:
                    int j=0;
                    while(a[j]!=null){
                        System.out.println(a[j]);
                        j++;
                    }
                    break;
                case 5:
                    boolean flag=false;
                    System.out.println("Ingresar pelicula a buscar");
                    String titulo = leer.nextLine();
                    for (int i = 0; i < 10; i++){
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
                    break;
                case 6:
                    boolean flag2=false;
                    System.out.println("Ingresar genero a buscar");
                    String genero = leer.nextLine();
                    for (int i = 0; i < 10; i++){
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
                    break;
                case 7:
                    boolean flag3=false;
                    System.out.println("Ingresar fecha a buscar con formato YYYY-MM-DD");
                    String ingresarFecha=leer.nextLine();
                    LocalDate nuevaFecha = LocalDate.parse(ingresarFecha);
                    System.out.println("NUEVA FECHA" + nuevaFecha);
                    System.out.println("FECHA" + a[0].getFechaInicio());
                    int comparacion;
                    for (int i = 0; i < 10; i++){
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
                    break;
            }
        }
    }
}