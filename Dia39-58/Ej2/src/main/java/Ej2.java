import Objects.Circunferencia;

public class Ej2 {
    public static void main(String[] args) {
        Circunferencia circulo1 = new Circunferencia(5.04);
        
        System.out.println("Area: " + circulo1.area());
        System.out.println("Perimetro: " + circulo1.perimetro());
    }
}
