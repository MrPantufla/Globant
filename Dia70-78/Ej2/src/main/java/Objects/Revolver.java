package Objects;

import java.util.Random;

public class Revolver {
    private int pActual;
    private int pAgua;

    public Revolver() {
    }

    public Revolver(int pActual, int pAgua) {
        this.pActual = pActual;
        this.pAgua = pAgua;
    }

    public int getpActual() {
        return pActual;
    }

    public void setpActual(int pActual) {
        this.pActual = pActual;
    }

    public int getpAgua() {
        return pAgua;
    }

    public void setpAgua(int pAgua) {
        this.pAgua = pAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "pActual=" + pActual + ", pAgua=" + pAgua + '}';
    }
    
    public void llenarRevolver(){
        Random random = new Random();
        int min = 0;
        int max = 5;
        
        int numeroRandom = random.nextInt(max - min + 1) + min;
        int numeroRandom2 = random.nextInt(max - min + 1) + min;
        
        setpAgua(numeroRandom);
        setpActual(numeroRandom2);
    }
    
    public boolean mojar(){
        return getpAgua()==getpActual();
    }
    
    public void siguienteChorro(){
        if(getpActual()!=5){
            setpActual(getpActual()+1);
        }
        else{
            setpActual(0);
        }
    }
}
