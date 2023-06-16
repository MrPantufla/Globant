package Objects;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String tipo;

    public Vehiculo(String marca, String modelo, int anio, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int moverse(int segundos){
        return switch (this.tipo) {
            case "automovil" -> 3*segundos;
            case "motocicleta" -> 2*segundos;
            case "bicicleta" -> segundos;
            default -> 0;
        };
    }
    
    public int frenar(){
        return switch (this.tipo) {
            case "automovil" -> 2;
            case "motocicleta" -> 2;
            case "bicicleta" -> 0;
            default -> 0;
        };
    }
}
