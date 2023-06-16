package Objects;

public class Pentagono {
    private double lado;

    public Pentagono(double lado) {
        this.lado = lado;
    }
    
    public double calcularPerimetro(){
        return this.lado*5;
    }
    
    public double calcularArea(){
        return (this.lado*this.lado*5)/(4*Math.tan(Math.PI/5));
    }
}
