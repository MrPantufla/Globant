package Objects;

public class TemperatureConverter {
    private double grados;
    private String unidad;

    public TemperatureConverter() {
    }

    public TemperatureConverter(double grados, String unidad) {
        this.grados = grados;
        this.unidad = unidad;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    
}
