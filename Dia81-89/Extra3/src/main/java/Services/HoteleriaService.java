package Services;
import Objects.CuatroEstrellas;
import Objects.CincoEstrellas;
import Objects.Camping;
import Objects.Residencia;
import java.util.Scanner;

public class HoteleriaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    CuatroEstrellas cu = new CuatroEstrellas();
    CincoEstrellas ci = new CincoEstrellas();
    Camping c = new Camping();
    Residencia r = new Residencia();
    
    public CuatroEstrellas crearCuatroEstrellas(String nombre, String direccion, String gerente, int habitaciones, int camas, int pisos, char gimnasio, String nombreRestaurante, int capacidadRestaurante){
        cu.setNombre(nombre);
        cu.setDireccion(direccion);
        cu.setGerente(gerente);
        cu.setCantHabitaciones(habitaciones);
        cu.setNumCamas(camas);
        cu.setCantPisos(pisos);
        cu.setTipoGimnasio(gimnasio);
        cu.setNombreRestaurante(nombreRestaurante);
        cu.setCapacidadRestaurante(capacidadRestaurante);
        
        int auxRestaurante;
        if(cu.getCapacidadRestaurante()<30){
            auxRestaurante=10;
        }
        else if(cu.getCapacidadRestaurante()>30 && cu.getCapacidadRestaurante()<50){
            auxRestaurante=30;
        }
        else{
            auxRestaurante=50;
        }
        
        int auxGimnasio;
        if(cu.getTipoGimnasio()=='a'){
            auxGimnasio=50;
        }
        else{
            auxGimnasio=30;
        }
            
        int precioHabitacion=50+cu.getCantHabitaciones()+auxRestaurante+auxGimnasio;
        
        cu.setPrecioHabitacion(precioHabitacion);
        
        return new CuatroEstrellas(cu.getCantHabitaciones(), cu.getNumCamas(), cu.getCantPisos(), cu.getTipoGimnasio(), cu.getNombreRestaurante(), cu.getCapacidadRestaurante(), cu.getPrecioHabitacion(), cu.getNombre(), cu.getDireccion(), cu.getGerente());
    }
    
    public CincoEstrellas crearCincoEstrellas(String nombre, String direccion, String gerente, int habitaciones, int camas, int pisos, char gimnasio, String nombreRestaurante, int capacidadRestaurante, int salonesConferencia, int suites, int limosinas){
        ci.setNombre(nombre);
        ci.setDireccion(direccion);
        ci.setGerente(gerente);
        ci.setCantHabitaciones(habitaciones);
        ci.setNumCamas(camas);
        ci.setCantPisos(pisos);
        ci.setTipoGimnasio(gimnasio);
        ci.setNombreRestaurante(nombreRestaurante);
        ci.setCapacidadRestaurante(capacidadRestaurante);
        ci.setCantSalonesConferencia(salonesConferencia);
        ci.setCantSuites(suites);
        ci.setCantLimosinas(limosinas);
        
        int auxRestaurante;
        if(ci.getCapacidadRestaurante()<30){
            auxRestaurante=10;
        }
        else if(ci.getCapacidadRestaurante()>30 && ci.getCapacidadRestaurante()<50){
            auxRestaurante=30;
        }
        else{
            auxRestaurante=50;
        }
        
        int auxGimnasio;
        if(ci.getTipoGimnasio()=='a'){
            auxGimnasio=50;
        }
        else{
            auxGimnasio=30;
        }
        
        int precioHabitacion=50+ci.getCantHabitaciones()+auxRestaurante+auxGimnasio+(ci.getCantLimosinas()*15);
        ci.setPrecioHabitacion(precioHabitacion);
        
        return new CincoEstrellas(ci.getCantSalonesConferencia(), ci.getCantSuites(), ci.getCantLimosinas(), ci.getCantHabitaciones(), ci.getNumCamas(), ci.getCantPisos(), ci.getTipoGimnasio(), ci.getNombreRestaurante(), ci.getCapacidadRestaurante(), ci.getPrecioHabitacion(), ci.getNombre(), ci.getDireccion(), ci.getGerente());
    }
    
    public Camping crearCamping(String nombre, String direccion, String gerente, boolean privado, int metrosCuadrados, int carpas, int baños, boolean restaurante){
        c.setNombre(nombre);
        c.setDireccion(direccion);
        c.setGerente(gerente);
        c.setPrivado(privado);
        c.setMetrosCuadrados(metrosCuadrados);
        c.setCantCarpas(carpas);
        c.setCantBaños(baños);
        c.setRestaurante(restaurante);
        
        return new Camping(c.getCantCarpas(), c.getCantBaños(), c.isRestaurante(), c.isPrivado(), c.getMetrosCuadrados(), c.getNombre(), c.getDireccion(), c.getGerente());
    }
    
    public Residencia crearResidencia(String nombre, String direccion, String gerente, boolean privado, int metrosCuadrados, int habitaciones, boolean descuentos, boolean deportivo){
        r.setNombre(nombre);
        r.setDireccion(direccion);
        r.setGerente(gerente);
        r.setPrivado(privado);
        r.setMetrosCuadrados(metrosCuadrados);
        r.setCantHabitaciones(habitaciones);
        r.setDescuentosGremios(descuentos);
        r.setCampoDeportivo(deportivo);
        
        return new Residencia(r.getCantHabitaciones(), r.isDescuentosGremios(), r.isCampoDeportivo(), r.isPrivado(), r.getMetrosCuadrados(), r.getNombre(), r.getDireccion(), r.getGerente());
    }
    
}
