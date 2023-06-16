package Objects;

public class Hexagono {
    private double lado;
    private double perimetro;

    public Hexagono(double lado) {
        this.lado = lado;
        this.perimetro=this.lado*6;
    }
    
    public double calcularPerimetro(){
        return this.perimetro;
    }
    
    public double calcularArea(){
        return ((3*Math.sqrt(3)*(Math.pow(this.lado,2)))/2);
    }
}
