package Objects;
import java.time.LocalDate;

public class Poliza {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int numeroPoliza;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int cantCuotas;
    private String formaPago;
    private int monto;
    private boolean granizo;
    private int montoGranizo;
    private String tipoCovertura;

    public Poliza() {
    }

    public Poliza(Cliente cliente, Vehiculo vehiculo, int numeroPoliza, LocalDate fechaInicio, LocalDate fechaFin, int cantCuotas, String formaPago, int monto, boolean granizo, int montoGranizo, String tipoCovertura) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantCuotas = cantCuotas;
        this.formaPago = formaPago;
        this.monto = monto;
        this.granizo = granizo;
        this.montoGranizo = montoGranizo;
        this.tipoCovertura = tipoCovertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public int getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(int montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public String getTipoCovertura() {
        return tipoCovertura;
    }

    public void setTipoCovertura(String tipoCovertura) {
        this.tipoCovertura = tipoCovertura;
    }
    
    
}
