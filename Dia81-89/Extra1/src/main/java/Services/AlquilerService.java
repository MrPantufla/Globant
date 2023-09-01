package Services;
import Objects.Alquiler;
import Objects.Barco;
import Objects.Velero;
import Objects.Motor;
import Objects.Yate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AlquilerService {
    Alquiler a = new Alquiler();
    Barco b = new Barco();
    Velero v = new Velero();
    Motor m = new Motor();
    Yate y = new Yate();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public double alquilarBarco(){
        alquilerBase();
        
        System.out.println("Que tipo de barco va a alquilar?");
        System.out.println("1- Velero");
        System.out.println("2- A motor");
        System.out.println("3- Yate");
        int opcion = leer.nextInt();
        leer.nextLine();
        
        switch(opcion){
            case 1 -> {
                a.setBarco(alquilarVelero());
                double precioBase = ChronoUnit.DAYS.between(a.getFechaAlquiler(), a.getFechaDevolucion())*(a.getBarco().getTamanio()*10);
                return precioBase+v.getMastiles();
            }
            case 2 -> {
                a.setBarco(alquilarMotor());
                double precioBase = ChronoUnit.DAYS.between(a.getFechaAlquiler(), a.getFechaDevolucion())*(a.getBarco().getTamanio()*10);
                return precioBase+m.getPotencia();
            }
            case 3 -> {
                a.setBarco(alquilarYate());
                double precioBase = ChronoUnit.DAYS.between(a.getFechaAlquiler(), a.getFechaDevolucion())*(a.getBarco().getTamanio()*10);
                return precioBase+y.getPotencia()+y.getCamarotes();
            }
        }
        
        return 0;
    }
    
    public void alquilerBase(){
        System.out.println("Ingresar nombre del cliente");
        a.setNombreCliente(leer.nextLine());
        System.out.println("Ingresar documento del cliente");
        a.setDocumento(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingresar fecha de alquiler en formato yyyy-mm-dd");
        String fecha = leer.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        a.setFechaAlquiler(LocalDate.parse(fecha, formatter));
        System.out.println("Ingresar fecha de finalizacion de alquiler en formato yyyy-mm-dd");
        fecha=leer.nextLine();
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        a.setFechaDevolucion(LocalDate.parse(fecha, formatter));
        System.out.println("Ingresar posicion de estacionamiento");
        a.setPosicion(leer.nextInt());
        leer.nextLine();
    }
    
    public void alquilarDefault(){
        System.out.println("Ingeresar numero de matricula");
        b.setMatricula(leer.nextInt());
        System.out.println("Ingesar tamaño en metros");
        b.setTamanio(leer.nextInt());
        System.out.println("Ingresar año de fabricacion");
        b.setAnio(leer.nextInt());
        leer.nextLine();
    }
    
    public Velero alquilarVelero(){
        
        alquilarDefault();
        
        v.setMatricula(b.getMatricula());
        v.setTamanio(b.getTamanio());
        v.setAnio(b.getAnio());
        System.out.println("Ingresar numero de mastiles");
        v.setMastiles(leer.nextInt());
        leer.nextLine();
        
        return v;
    }
    
    public Motor alquilarMotor(){
        
        alquilarDefault();
        
        m.setMatricula(b.getMatricula());
        m.setTamanio(b.getTamanio());
        m.setAnio(b.getAnio());
        System.out.println("Ingresar potencia en CV");
        m.setPotencia(leer.nextInt());
        leer.nextLine();
        
        return m;
    }
    
    public Yate alquilarYate(){
        
        alquilarDefault();
        
        y.setMatricula(b.getMatricula());
        y.setTamanio(b.getTamanio());
        y.setAnio(b.getAnio());
        System.out.println("Ingresar potencia en CV");
        y.setPotencia(leer.nextInt());
        System.out.println("Ingresar numero de camarotes");
        y.setCamarotes(leer.nextInt());
        leer.nextLine();
        
        return y;
    }
}
