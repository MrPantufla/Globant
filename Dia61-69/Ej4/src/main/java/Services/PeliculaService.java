package Services;
import Objects.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PeliculaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList <Pelicula> peliculas = new ArrayList();
    
    public void cargarPeliculas(){
        boolean band=true;
        
        while(band==true){
            Pelicula p = new Pelicula();
            System.out.println("Ingresar título");
            p.setTitulo(leer.nextLine());
            System.out.println("Ingresar director");
            p.setDirector(leer.nextLine());
            System.out.println("Ingresar duracion en horas");
            p.setDuracion(leer.nextInt());
            leer.nextLine();
            peliculas.add(p);
            
            System.out.println("Desea agregar otra pelicula? Y o N");
            String opcion=leer.nextLine();
            opcion=opcion.toLowerCase();
            if(opcion.equals("n")){
                band=false;
            }
        }
    }
    
    public void mostrarPeliculas(){
        System.out.println("TODAS LAS PELICULAS LISTADAs:");
        for(Pelicula i : peliculas){
            System.out.println(i.toString());
        }
    }
    
    public void mostrarPeliculasLargas(){
        System.out.println("TODAS LAS PELICULAS CON DURACION MAYOR A 1 HORA:");
        for(Pelicula i : peliculas){
            if(i.getDuracion()>60){
                System.out.println(i.toString());
            }
        }
    }
    
    public void mayorAMenor(){
        System.out.println("PELICULAS ORDENADAS DE MAYOR A MENOR DURACION");
        Collections.sort(peliculas, new Comparator<Pelicula>(){
            @Override
            public int compare(Pelicula p1, Pelicula p2){
                return Integer.valueOf(p1.getDuracion()).compareTo((p2.getDuracion()));
            }
        });
        for(Pelicula i : peliculas){
            System.out.println(i.toString());
        }
    }
    
    public void menorAMayor(){
        System.out.println("PELICULAS ORDENADAS DE MENOR A MAYOR DURACION");
        Collections.sort(peliculas, new Comparator<Pelicula>(){
            @Override
            public int compare(Pelicula p1, Pelicula p2){
                return Integer.valueOf(p2.getDuracion()).compareTo(p1.getDuracion());
            }
        });
        for(Pelicula i : peliculas){
            System.out.println(i.toString());
        }
    }
    
    public void ordenadasPorTitulo(){
        System.out.println("TITULOS ORDENADOS POR ORDEN ALFABETICO");
        Collections.sort(peliculas, new Comparator<Pelicula>(){
            @Override
            public int compare(Pelicula p1, Pelicula p2){
                return new String(p1.getTitulo()).compareTo(new String(p2.getTitulo()));
            }
        });
        for(Pelicula i : peliculas){
            System.out.println(i.toString());
        }
    }
    
    public void ordenadasPorDirector(){
        System.out.println("DIRECTORES ORDENADOS POR ORDEN ALFABETICO");
        Collections.sort(peliculas, new Comparator<Pelicula>(){
            @Override
            public int compare(Pelicula p1, Pelicula p2){
                return new String(p1.getDirector()).compareTo(new String(p2.getDirector()));
            }
        });
        for(Pelicula i : peliculas){
            System.out.println(i.toString());
        }
    }
}
