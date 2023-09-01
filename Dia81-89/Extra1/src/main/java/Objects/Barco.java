package Objects;

import java.time.LocalDate;

public class Barco {
    protected int matricula;
    protected int tamanio;
    protected int anio;

    public Barco() {
    }

    public Barco(int matricula, int tamanio, int anio) {
        this.matricula = matricula;
        this.tamanio = tamanio;
        this.anio = anio;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
}
