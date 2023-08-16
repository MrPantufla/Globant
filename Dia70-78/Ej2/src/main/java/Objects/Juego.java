package Objects;
import java.util.ArrayList;

public class Juego {
    private ArrayList jugadores;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
    
    public void llenarJuego(ArrayList<Jugador>jugadores, Revolver r){
        setJugadores(jugadores);
        setRevolver(r);
    }
    
    public int ronda(){
        ArrayList<Jugador>players = getJugadores();
        
        for(Jugador j : players){
            if(j.disparo(revolver)){
                System.out.println(j.getNombre() + " ha perdido");
                return 0;
            }
            else{
                System.out.println(j.getNombre() + " se salva");
            }
        }
        
        return 0;
    }
}
