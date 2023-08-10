package Services;
import Objects.Juego;
import Objects.Jugador;
import Objects.Revolver;
import java.util.ArrayList;
import Services.JugadorService;

public class JuegoService {
    Juego j = new Juego();
    JugadorService s = new JugadorService();
    
    public void llenarJuego(ArrayList<Jugador>jugadores, Revolver r){
        j.setJugadores(jugadores);
        j.setRevolver(r);
    }
    
    public boolean ronda(ArrayList<Jugador>jugadores, RevolverService r){
        for (Jugador i : jugadores) {
            if(s.disparo(r)){
                System.out.println("El jugador " + i.getNombre() + " ha perdido");
                return true;
            }
            else{
                System.out.println("El jugador " + i.getNombre() + " no fue mojado");
                r.siguienteChorro();
                return false;
            }
        }
        return false;
    }
}
