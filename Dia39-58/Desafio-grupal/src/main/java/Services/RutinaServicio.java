package Services;

import Objects.Rutina;
import java.util.Scanner;
import java.util.UUID;

public class RutinaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Rutina r = new Rutina();
    
    public static String generarID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
    
    public Rutina crearRutina(){   
        System.out.println("Ingresar nombre");
        r.setNombre(leer.nextLine());
        System.out.println("Ingresar duracion en minutos");
        r.setDuracion(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingresar nivel de dificultad");
        r.setNivelDificultad(leer.nextLine());
        System.out.println("Ingresar descripcion");
        r.setDescripcion(leer.nextLine());
        r.setId((int) (Math.random()*10));
        
        return r;
    }
    
    public Rutina actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion){
        if(r.getId()==id){
            r.setNombre(nombre);
            r.setDuracion(duracion);
            r.setNivelDificultad(nivelDificultad);
            r.setDescripcion(descripcion);
        }
        
        return r;
    }
    
    public String obtenerRutina(){
        return r.toString();
    }
    
    public int retornarId(){
        return r.getId();
    }
}
