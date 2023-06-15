package Objects;

public class Matematica {
    
    private double num1;
    private double num2;
    
    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Matematica() {
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
    
    public double devolverMayor(){
        return Math.max(this.num1, this.num2);
    }
    
    public double calcularPotencia(){
        return (Math.pow(Math.round(Math.max(this.num1, this.num2)),Math.round(Math.min(num1, num2))));
    }
    
    public double calcularRaiz(){
        return Math.sqrt(Math.abs(Math.min(num1, num2)));
    }
}
