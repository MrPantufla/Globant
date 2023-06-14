package Objects;

public class Operacion {
    private int numero1;
    private int numero2;
    
    public Operacion(int numero1, int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }
    
    public Operacion(){}
    
    public void setNumero1(int numero1){
        this.numero1=numero1;
    }
    
    public void setNumero2(int numero2){
        this.numero2=numero2;
    }
    
    public int getNumero1(){
        return this.numero1;
    }
    
    public int getNumero2(){
        return this.numero2;
    }
    
    public void crearOperacion(int numero1, int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }
    
    public int sumar(){
        return this.numero1+this.numero2;
    }
    
    public int restar(){
        return this.numero1-this.numero2;
    }
    
    public int multiplicar(){
        if(this.numero1!=0 && this.numero2!=0){
            return this.numero1*this.numero2;
        }
        else{
            System.out.println("Uno de los numeros es 0");
            return 0;
        }
    }
    
    public int dividir(){
        if(this.numero1!=0 && this.numero2!=0){
            return this.numero1/this.numero2;
        }
        else{
            System.out.println("Uno de los numeros es 0");
            return 0;
        }
    }
}
