package Objects;

public class Triangulo {
    private double base;
    private double lado1;
    private double lado2;
    private double semiperimetro;
    private double area;
    
    public Triangulo(double base, double lado1, double lado2){
        this.base=base;
        this.lado1=lado1;
        this.lado2=lado2;
        this.semiperimetro=(this.base+this.lado1+this.lado2)/2;
        this.area=(Math.sqrt(this.semiperimetro*(this.semiperimetro-this.base)*(this.semiperimetro-this.lado1)*(this.semiperimetro-this.lado2)));
    }
    
    public double calcularArea(){
        return this.area;
    }
    
    public double calcularPerimetro(){
        return this.base+this.lado1+this.lado2;
    }
}
