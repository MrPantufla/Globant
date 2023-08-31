package Objects;

public class Televisor extends Electrodomestico{
    private int resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int precio, String color, char consumo, int resolucion, int peso, boolean sintonizador) {
        super(precio, color, consumo, peso);
        this.resolucion=resolucion;
        this.sintonizador=sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }
    
}
