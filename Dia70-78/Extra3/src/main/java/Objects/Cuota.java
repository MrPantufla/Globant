package Objects;
import java.time.LocalDate;

public class Cuota {
    private int numero;
    private int monto;
    private boolean pagada;
    private LocalDate vencimiento;
    private String metodoPago;

    public Cuota() {
    }

    public Cuota(int numero, int monto, boolean pagada, LocalDate vencimiento, String metodoPago) {
        this.numero = numero;
        this.monto = monto;
        this.pagada = pagada;
        this.vencimiento = vencimiento;
        this.metodoPago = metodoPago;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    
}
