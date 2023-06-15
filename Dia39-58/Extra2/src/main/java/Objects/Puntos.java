package Objects;

public class Puntos {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Puntos() {
    }
    
    public void crearPuntos(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public void calcularDistancia(){
        double distancia=Math.sqrt((Math.pow(this.x2-this.x1,2))+((Math.pow(this.y2-this.y1,2))));
        System.out.println("La distancia que se encuentra entre los dos puntos es: " + distancia);
    }
}
