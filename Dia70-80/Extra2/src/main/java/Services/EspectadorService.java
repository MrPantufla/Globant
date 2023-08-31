package Services;
import Objects.Espectador;
import java.util.ArrayList;
import java.util.Random;

public class EspectadorService {
    ArrayList<Espectador>espectadores = new ArrayList();
    
    public void crearEspectadores(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Espectador e = new Espectador();
            e.setNombre("Espectador"+i);
            Random random = new Random();
            int aleatorio = random.nextInt(21)+10;
            e.setEdad(aleatorio);
            aleatorio= random.nextInt(90)+10;
            e.setDinero(aleatorio);
            espectadores.add(e);
        }
    }
    
    public ArrayList devolverEspectadores(){
        return espectadores;
    }
}
