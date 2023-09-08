package Objects;

public class Residencia extends ExtraHotelero{
    private int cantHabitaciones;
    private boolean descuentosGremios;
    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean descuentosGremios, boolean campoDeportivo, boolean privado, int metrosCuadrados, String nombre, String direccion, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentosGremios = descuentosGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentosGremios() {
        return descuentosGremios;
    }

    public void setDescuentosGremios(boolean descuentosGremios) {
        this.descuentosGremios = descuentosGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
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
