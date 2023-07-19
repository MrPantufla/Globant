package Objects;

public class DiscountCalculator {
    private double precio;
    private int descuento;

    public DiscountCalculator() {
    }

    public DiscountCalculator(int precio, int descuento) {
        this.precio = precio;
        this.descuento = descuento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    
    
}