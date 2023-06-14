package Objects;

public class Rectangulo {
    private int base;
    private int altura;
    
    public Rectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
    }
    
    public void setBase(int base){
        this.base=base;
    }
    
    public void setAltura(int altura){
        this.altura=altura;
    }
    
    public int getBase(){
        return this.base;
    }
    
    public int getAltura(){
        return this.altura;
    }
    
    public int superficie(){
        return this.base*this.altura;
    }
    
    public int perimetro(){
        return (this.base+this.altura)*2;
    }
    
    public void dibujar(){
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                if(i==0 || j==0 || i==(this.altura-1) || j==(this.base-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
