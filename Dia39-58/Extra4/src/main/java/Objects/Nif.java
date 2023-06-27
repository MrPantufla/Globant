package Objects;

public class Nif {
    private int dni;
    private String letra;

    public Nif() {
    }

    public Nif(int dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public int getDni() {
        return dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNif(String letra) {
        this.letra = letra;
    }
}
