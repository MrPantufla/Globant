package Objects;

public class Circunferencia {
   private double radio;
   
   public Circunferencia(double radio){
       this.radio=radio;
   }
   
   public void setRadio(double radio){
       this.radio=radio;
   }
   
   public double getRadio(){
       return this.radio;
   }
   
   public void crearCircunferencia(double radio){
       this.radio=radio;
   }
   
   public double area(){
       return this.radio*this.radio*Math.PI;
   }
   
   public double perimetro(){
       return 2*Math.PI*this.radio;
   }
}
