package Objects;

public class Rectangulo {
    private double lado;
    private double altura;

    public Rectangulo(double lado, double altura) {
        this.lado = lado;
        this.altura= altura;
    }    
    
    public double calcularArea(){
        return this.lado*this.altura;
    }
    
    public double calcularPerimetro(){
        return (this.lado*2)+(this.altura*2);
    }
}
