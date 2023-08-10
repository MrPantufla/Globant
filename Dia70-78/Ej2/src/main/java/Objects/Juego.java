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
    
}
