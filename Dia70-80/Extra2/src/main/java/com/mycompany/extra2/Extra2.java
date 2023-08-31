package com.mycompany.extra2;
import Services.CineService;
import Services.EspectadorService;
import java.util.Scanner;
import Objects.Espectador;
import java.util.ArrayList;
import java.util.Random;
import Services.PeliculaService;

public class Extra2 {
    public static void main(String[] args) {
        CineService c = new CineService();
        EspectadorService e = new EspectadorService();
        PeliculaService p = new PeliculaService();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        c.inicializarSala();
        System.out.println("Ingrese la cantidad de espectadores a crear");
        int cant = leer.nextInt();
        leer.nextLine();
        e.crearEspectadores(cant);
        ArrayList <Espectador> espectadores = new ArrayList();
        espectadores = e.devolverEspectadores();
        p.cargarPelicula();
        
        for(Espectador i : espectadores){
            boolean band=false;
            
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 6; k++) {
                    if((c.devolverSala()[j][k].charAt(2))==(' ')){
                        band=true;
                        break;
                    }
                }
                if(band==true){break;}
            }
            if(band){
                if((i.getEdad()>=p.devolverPelicula().getEdadMinima())&&(i.getDinero()>=c.devolverCine().getPrecio())){
                    Random random = new Random();
                    boolean band2=false;
                    while(band2==false){
                        int aleatorioI = random.nextInt(8);
                        int aleatorioJ = random.nextInt(6);
                        if((c.devolverSala()[aleatorioI][aleatorioJ]).charAt(2)!=('X')){
                          (c.devolverSala()[aleatorioI][aleatorioJ]) = (c.devolverSala()[aleatorioI][aleatorioJ]).substring(0, (c.devolverSala()[aleatorioI][aleatorioJ]).length() - 1) + "X";
                          band2=true;
                        }
                    }
                }
                else{
                    System.out.println(i.getNombre() + " no puede entrar porque no cuenta con la edad o el dinero suficiente");
                }
            }
            else{
                System.out.println("No quedan asientos disponibles");
                break;
            }
        }
        
        c.mostrarSala();
    }
}
