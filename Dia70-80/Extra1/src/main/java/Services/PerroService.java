package Services;
import Objects.Perro;
import java.util.ArrayList;

public class PerroService {
    ArrayList<Perro>perros = new ArrayList();
    
    public void crearPerro(String nombre, String raza, int edad, String tamanio){
        Perro p = new Perro();
        p.setNombre(nombre);
        p.setRaza(raza);
        p.setEdad(edad);
        p.setTamanio(tamanio);
        p.setAdoptado(false);
        perros.add(p);
    }
    
    public ArrayList devolverPerros(){
        return perros;
    }
}
