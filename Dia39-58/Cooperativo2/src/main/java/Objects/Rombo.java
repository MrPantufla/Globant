package Objects;

public class Rombo {
    private double diagonal1;
    private double diagonal2;
    private double lado;

    public Rombo(double diagonal1, double diagonal2) {
        this.diagonal1=diagonal1;
        this.diagonal2=diagonal2;
        this.lado=Math.sqrt((this.diagonal1 * this.diagonal1 + this.diagonal2 * this.diagonal2) / 4);
    }
    
    public double calcularPerimetro(){
        return this.lado*4;
    }
    
    public double calcularArea(){
        return (this.diagonal1*this.diagonal2)/2;
    }
}
