package Services;
import Objects.Persona;
import java.util.ArrayList;
import java.util.Scanner;
import Objects.Perro;

public class PersonaService {
    ArrayList<Persona>personas = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearPersona(String nombre, String apellido, int edad, int documento){
        Persona p = new Persona();
        p.setNombre(nombre);
        p.setApellido(apellido);
        p.setEdad(edad);
        p.setDocumento(documento);
        personas.add(p);
    }
    
    public void adoptarPerro(ArrayList<Perro>perros){
        for(Persona i : personas){ 
            boolean band=false;
            while(band==false){
                System.out.println(i.getNombre() + ", ingresa el nombre del perro a adoptar de la siguiente lista:");
            
                for(Perro perro : perros){
                    System.out.println(perro.getNombre());
                }
                
                String nombre = leer.nextLine();
                int count=0;
                
                for(Perro perro : perros){
                    count++;
                    if(perro.getNombre().equals(nombre)){
                        if(perro.isAdoptado()==true){
                            System.out.println("El perro ya está adoptado, elija otro");
                            break;
                        }
                        else{
                            System.out.println(perro.getNombre() + " adoptado correctamente");
                            i.setPerro(perro);
                            perro.setAdoptado(true);
                            band=true;
                            break;
                        }
                    }
                    else{
                        if(count==perros.size()){
                            System.out.println("Ningun perro tiene ese nombre, ingrese otro");
                        }
                    }
                }
            }
        }
    }
    
    public void mostrarDatos(){
        System.out.println("DUEÑOS Y PERROS:");
        for(Persona p : personas){
            System.out.println(p.toString());
        }
    }
}
