package Objects;

public class Alumno {
    private String nombre;
    private int dni;
    private int cantVotos;

    public Alumno() {
    }

    public Alumno(String nombre, int dni, int cantVotos) {
        this.nombre = nombre;
        this.dni = dni;
        this.cantVotos = cantVotos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(int cantVotos) {
        this.cantVotos = cantVotos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", dni=" + dni + ", cantVotos=" + cantVotos + '}';
    }
    
}
