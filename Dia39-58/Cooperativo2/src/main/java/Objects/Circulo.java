package Objects;

public class Circulo {
    private double radio;
    
    public Circulo(double radio){
        this.radio=radio;
    }
    
    public double calcularArea(){
        return (Math.PI*(Math.pow(this.radio,2)));
    }
    
    public double calcularPerimetro(){
        return 2*Math.PI*this.radio;
    }
}
