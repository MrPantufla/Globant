package Objects;

public class Oficinas extends Edificio{
    private int cantOficinas;
    private int cantPersonas;
    private int pisos;

    public Oficinas() {
    }

    public Oficinas(int cantOficinas, int cantPersonas, int pisos, int ancho, int largo, int alto) {
        super(ancho, largo, alto);
        this.cantOficinas = cantOficinas;
        this.cantPersonas = cantPersonas;
        this.pisos = pisos;
    }

    public int getCantOficinas() {
        return cantOficinas;
    }

    public void setCantOficinas(int cantOficinas) {
        this.cantOficinas = cantOficinas;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
}
