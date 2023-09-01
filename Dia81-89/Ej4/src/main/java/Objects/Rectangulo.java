package Objects;

import Interfaces.calculosFormas;

public class Rectangulo implements calculosFormas{

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return this.base*this.altura;
    }

    @Override
    public double calcularPerimetro() {
        return (this.base+this.altura)*2;
    }
    
}
