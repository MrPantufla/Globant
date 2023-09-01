package Objects;

import Interfaces.calculosFormas;

public class Circulo implements calculosFormas{

    private int radio;

    public Circulo() {
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    public Circulo(int radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return this.radio*this.radio*Math.PI;
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI*this.radio*2;
    }
}
