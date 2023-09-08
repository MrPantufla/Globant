package Objects;

public class Alojamiento {
    protected String nombre;
    protected String direccion;
    protected String gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.gerente = gerente;
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
