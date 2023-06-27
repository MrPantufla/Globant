package Objects;

public class Ahorcado {
    private String[] palabra;
    private int letrasEncontradas;
    private int jugadasMaximas;
    private int jugadasRealizadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int letrasEncontradas, int jugadasMaximas, int jugadasRealizadas) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
        this.jugadasRealizadas=jugadasRealizadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public int getJugadasRealizadas() {
        return jugadasRealizadas;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public void setJugadasRealizadas(int jugadasRealizadas) {
        this.jugadasRealizadas = jugadasRealizadas;
    }
}
