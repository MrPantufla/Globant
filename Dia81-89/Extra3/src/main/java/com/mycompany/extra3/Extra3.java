package com.mycompany.extra3;
import Objects.Alojamiento;
import Services.HoteleriaService;
import Objects.CuatroEstrellas;
import Objects.CincoEstrellas;
import java.util.ArrayList;
import java.util.Arrays;
import Objects.Camping;
import Objects.Residencia;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Extra3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        HoteleriaService h = new HoteleriaService();
        ArrayList<Alojamiento> alojamientos = new ArrayList();
        
        alojamientos.add(h.crearCuatroEstrellas("cuatroEstrellas1", "direccion1", "gerente1", 20, 4, 2, 'a', "restaurante1", 30));
        alojamientos.add(h.crearCuatroEstrellas("cuatroEstrellas2", "direccion2", "gerente2", 25,3, 3, 'b', "restaurante2", 40));
        alojamientos.add(h.crearCincoEstrellas("cincoEstrellas1", "direccion3", "gerente3", 50,4, 5, 'a', "restaurante3", 50, 2, 1, 10));
        alojamientos.add(h.crearCincoEstrellas("cincoEstrellas2", "direccion4", "gerente4", 55,3, 4, 'a', "restaurante4", 40, 3, 3, 15));
        alojamientos.add(h.crearCamping("camping1", "direccion5", "gerente5", true, 800, 40, 2, true));
        alojamientos.add(h.crearCamping("camping2", "direccion6", "gerente6", false, 2000, 60, 4, false));
        alojamientos.add(h.crearResidencia("residencia1", "direccion7", "gerente7", true, 200, 4, true, true));
        alojamientos.add(h.crearResidencia("residencia2", "direccion8", "gerente8", false, 300, 5, false, false));
        
        boolean band = false;
        
        while(band==false){
            System.out.println("Ingrese la opcion correspondiente");
            System.out.println("1- Consultar todos los alojamientos");
            System.out.println("2- Consultar todos los hoteles del más caro al más barato");
            System.out.println("3- Consultar todos los campings con restaurante");
            System.out.println("4- Consiltar todas las residencias con decuento");
            System.out.println("5- Salir");
            int opcion = leer.nextInt();
            
            switch(opcion){
                case 1->{
                    for(Alojamiento a : alojamientos){
                        System.out.println(a.getNombre());
                    }
                }
                case 2->{
                    ArrayList <Alojamiento> hoteles = new ArrayList();
                    
                    for(Alojamiento a : alojamientos){
                        if((a instanceof CuatroEstrellas)||(a instanceof CincoEstrellas)){
                            hoteles.add(a);
                        }
                    }
                    
                    Collections.sort(hoteles, new Comparator<Alojamiento>() {
                        @Override
                        public int compare(Alojamiento a1, Alojamiento a2) {
                            return Double.compare(((CuatroEstrellas)a1).getPrecioHabitacion(), ((CuatroEstrellas)a2).getPrecioHabitacion());
                        }
                    });

                    for (Alojamiento g : hoteles) {
                        System.out.println(g.getNombre() + " - " + ((CuatroEstrellas) g).getPrecioHabitacion());
                    }
                }
                case 3->{
                    for(Alojamiento a : alojamientos){
                        if(a instanceof Camping){
                            if(((Camping)a).isRestaurante()){
                                System.out.println(a.getNombre()); 
                            }
                        }
                    }
                }
                case 4->{
                    for(Alojamiento a : alojamientos){
                        if(a instanceof Residencia){
                            if(((Residencia)a).isDescuentosGremios()){
                                System.out.println(a.getNombre()); 
                            }
                        }
                    }
                }
                case 5->{
                    band=true;
                }
            }
        }
    }
}
