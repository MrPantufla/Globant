package Services;
import Objects.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList <Integer> notas = new ArrayList();
    private ArrayList <Alumno> alumnos = new ArrayList();
    
    public void crearAlumnos(){
        String opcion;
        boolean band=false;
        Alumno a = new Alumno();
        
        while(band==false){
            
            System.out.println("Ingresar nombre");
            a.setNombre(leer.nextLine());
            System.out.println("Ingresar las tres notas");
            notas.add(leer.nextInt());
            notas.add(leer.nextInt());
            notas.add(leer.nextInt());
            leer.nextLine();
            a.setNotas(notas);
            alumnos.add(a);
        
            System.out.println("Desea agregar otro alumno? S o N");
            opcion=leer.nextLine();
            opcion=opcion.toLowerCase();
            if(opcion.equals("n")){
                band=true;
            }
        }
    }
    
    public void notaFinal(){
        String nombre;
        System.out.println("Ingrese el nombre del alumno");
        nombre=leer.nextLine();
        boolean encontrado=false;
        
        for(Alumno i : alumnos){
            if(i.getNombre().equals(nombre)){
                int nota=((i.getNotas().get(0)+i.getNotas().get(1)+i.getNotas().get(2))/3);
                System.out.println("La nota final es: " + nota);
                encontrado=true;
                break;    
            }
        }
        
        if(!encontrado){
            System.out.println("El alumno ingresado no existe");
        } 
    }
    
    public void mostrar(){
        for(Alumno i : alumnos){
            System.out.println(i.getNombre());
        }
    }
}
