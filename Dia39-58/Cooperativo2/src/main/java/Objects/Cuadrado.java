package Objects;

public class Cuadrado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    public double calcularArea(){
        return this.lado*this.lado;
    }
    
    public double calcularPerimetro(){
        return this.lado*4;
    }
}
