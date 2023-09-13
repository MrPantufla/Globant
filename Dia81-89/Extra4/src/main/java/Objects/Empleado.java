package Objects;

import java.time.LocalDate;

public class Empleado extends Persona{
    private LocalDate incorporacion;
    private int despacho;

    public Empleado() {
    }

    public Empleado(LocalDate incorporacion, int despacho, String nombre, String apellido, int id, String estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.incorporacion = incorporacion;
        this.despacho = despacho;
    }

    public LocalDate getIncorporacion() {
        return incorporacion;
    }

    public void setIncorporacion(LocalDate incorporacion) {
        this.incorporacion = incorporacion;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
}
