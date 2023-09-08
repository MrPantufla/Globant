package Objects;

public class Camping extends ExtraHotelero{
    private int cantCarpas;
    private int cantBaños;
    private boolean restaurante;

    public Camping() {
    }

    public Camping(int cantCarpas, int cantBaños, boolean restaurante, boolean privado, int metrosCuadrados, String nombre, String direccion, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, gerente);
        this.cantCarpas = cantCarpas;
        this.cantBaños = cantBaños;
        this.restaurante = restaurante;
    }

    public int getCantCarpas() {
        return cantCarpas;
    }

    public void setCantCarpas(int cantCarpas) {
        this.cantCarpas = cantCarpas;
    }

    public int getCantBaños() {
        return cantBaños;
    }

    public void setCantBaños(int cantBaños) {
        this.cantBaños = cantBaños;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    
}
