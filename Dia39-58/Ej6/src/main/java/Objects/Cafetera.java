package Objects;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;
    
    public Cafetera(){}
    
    public Cafetera(int capacidadMaxima, int cantidadActual){
        this.capacidadMaxima=capacidadMaxima;
        this.cantidadActual=cantidadActual;
    }
    
    public void setCapacidadMaxima(int capacidadMaxima){
        this.capacidadMaxima=capacidadMaxima;
    }
    
    public void setCantidadActual(int cantidadActual){
        this.cantidadActual=cantidadActual;
    }
    
    public int getCapacidadMaxima(){
        return this.capacidadMaxima;
    }
    
    public int getCantidadActual(){
        return this.cantidadActual;
    }
    
    public void llenarCafetera(){
        this.cantidadActual=this.capacidadMaxima;
    }
    
    public void servirTaza(int capacidadTaza){
        this.cantidadActual-=capacidadTaza;
        
        if(this.cantidadActual<0){
            System.out.println("La taza no fue llenada por completo");
            this.cantidadActual=0;
        }
        else{
            System.out.println("La taza fue llenada por completo");
        }
    }
    
    public void vaciarCafetera(){
        this.cantidadActual=0;
    }
    
    public void agregarCafe(int cantidad){
        this.cantidadActual+=cantidad;
        
        if(this.cantidadActual>this.capacidadMaxima){
            this.cantidadActual=this.capacidadMaxima;
        }
    }
}
