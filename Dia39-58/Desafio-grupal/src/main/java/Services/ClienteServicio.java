package Services;
import java.util.Scanner;
import Objects.Cliente;
import java.util.UUID;

public class ClienteServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cliente c = new Cliente();
    
    public static String generarID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
    
    public Cliente registrarCliente(){   
        System.out.println("Ingresar nombre");
        c.setNombre(leer.nextLine());
        System.out.println("Ingresar edad");
        c.setEdad(leer.nextInt());
        System.out.println("Ingresar altura en cm");
        c.setAltura(leer.nextInt());
        System.out.println("Ingresar peso en gr");
        c.setPeso(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingresar objetivo");
        c.setObjetivo(leer.nextLine());
        c.setId((int) (Math.random()*10));
        
        return c;
    }
    
    public Cliente actualizarCliente(int id, String nombre, int edad, int altura, int peso, String objetivo){
        if(c.getId()==id){
            c.setNombre(nombre);
            c.setEdad(edad);
            c.setAltura(altura);
            c.setPeso(peso);
            c.setObjetivo(objetivo);
        }
        
        return c;
    }
    
    public String obtenerClientes(){
        return c.toString();
    }
    
    public int retornarId(){
        return c.getId();
    }
}
