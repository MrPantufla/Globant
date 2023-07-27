package Objects;

public class CantanteFamoso {
    private String nombre;
    private String disco;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombre, String disco) {
        this.nombre = nombre;
        this.disco = disco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    @Override
    public String toString() {
        return "CantanteFamoso{" + "nombre=" + nombre + ", disco=" + disco + '}';
    }
}
