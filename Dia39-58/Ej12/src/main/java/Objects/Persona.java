package Objects;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Persona {
    private String nombre;
    private Date nacimiento;
    Scanner leer = new Scanner(System.in);

    public Persona(String nombre, Date nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    public void crearPersona() throws ParseException{
        System.out.println("Ingresar nombre");
        this.nombre=leer.nextLine();
        System.out.println("Ingresar fecha de nacimiento");
        String fecha=leer.nextLine();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        this.nacimiento = formatoFecha.parse(fecha);
    }
    
    public int calcularEdad(){
        Date fechaActual = new Date();
        return (fechaActual.getYear())-this.nacimiento.getYear();
    }
    
    public boolean menorQue(int edad){
        return calcularEdad()<edad;
    }
    
    public void mostrarPersona(){
        System.out.println("Nombre: " + this.nombre + ", Fecha de nacimiento: " + this.nacimiento);
    }
}
