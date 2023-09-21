package Objects;

public class Dispositivo {
    protected boolean dañado;
    protected double consumo;

    public Dispositivo() {
    }

    public Dispositivo(boolean dañado, double consumo) {
        this.dañado = dañado;
        this.consumo = consumo;
    }

    public boolean isDañado() {
        return dañado;
    }

    public void setDañado(boolean dañado) {
        this.dañado = dañado;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    
    public double usar(int intensidad, int tiempo){
        return this.consumo*intensidad*tiempo;
    }
}
