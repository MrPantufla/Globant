package Objects;
import java.time.LocalDate;

public class Alquiler {
    private String peliculaAlquilada;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private long precio;

    public Alquiler() {
    }

    public Alquiler(String peliculaAlquilada, LocalDate fechaInicio, LocalDate fechaFin, long precio) {
        this.peliculaAlquilada = peliculaAlquilada;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

    public String getPeliculaAlquilada() {
        return peliculaAlquilada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPeliculaAlquilada(String peliculaAlquilada) {
        this.peliculaAlquilada = peliculaAlquilada;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "peliculaAlquilada=" + peliculaAlquilada + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", precio=" + precio + '}';
    }
    
    
}
