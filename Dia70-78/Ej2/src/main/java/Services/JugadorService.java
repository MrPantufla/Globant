package Services;
import Objects.Jugador;

public class JugadorService {
    Jugador j = new Jugador();
    
    public Jugador crearJugador(int i){
        String nombre="Jugador"+i;
        Jugador player = new Jugador(i,nombre,false);
        
        return player;
    }
    
    public boolean disparo(RevolverService r){
        if(r.mojar()){
            j.setMojado(true);
            r.siguienteChorro();
            return true;
        }
        r.siguienteChorro();
        return false;
    }
    
}
