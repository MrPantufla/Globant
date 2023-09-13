package Services;
import Objects.Estudiante;
import Objects.Persona;
import Objects.Profesor;
import Objects.Empleado;
import Objects.PersonalDeServicio;
import java.time.LocalDate;
import java.util.Scanner;

public class FacultadService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Estudiante e = new Estudiante();
    Profesor p = new Profesor();
    PersonalDeServicio pe = new PersonalDeServicio();
    
    public Estudiante crearEstudiante(){
        System.out.println("Ingresar nombre");
        e.setNombre(leer.nextLine());
        System.out.println("Ingresar apellido");
        e.setApellido(leer.nextLine());
        System.out.println("Ingresar id");
        e.setId(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingresar estado civil");
        e.setEstadoCivil(leer.nextLine());
        System.out.println("Ingresar curso");
        e.setCurso(leer.nextInt());
        leer.nextLine();
        
        return e;
    }
    
    public Profesor crearProfesor(){
        System.out.println("Ingresar nombre");
        p.setNombre(leer.nextLine());
        System.out.println("Ingresar apellido");
        p.setApellido(leer.nextLine());
        System.out.println("Ingresar id");
        p.setId(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingresar estado civil");
        p.setEstadoCivil(leer.nextLine());
        System.out.println("Ingresar fecha de incorporacion (yyyy-mm-dd)");
        String fecha = leer.nextLine();
        p.setIncorporacion(LocalDate.parse(fecha));
        System.out.println("Ingresar despacho al que pertenece");
        p.setDespacho(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingresar departamento al que pertenece");
        p.setDepartamento(leer.nextLine());
        
        return p;
    }
    
    public PersonalDeServicio crearPersonalDeServicio(){
        System.out.println("Ingresar nombre");
        pe.setNombre(leer.nextLine());
        System.out.println("Ingresar apellido");
        pe.setApellido(leer.nextLine());
        System.out.println("Ingresar id");
        pe.setId(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingresar estado civil");
        pe.setEstadoCivil(leer.nextLine());
        System.out.println("Ingresar fecha de incorporacion (yyyy-mm-dd)");
        String fecha = leer.nextLine();
        pe.setIncorporacion(LocalDate.parse(fecha));
        System.out.println("Ingresar despacho al que pertenece");
        pe.setDespacho(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingresar seccion a la que pertenece");
        pe.setSeccion(leer.nextLine());
        
        return pe;
    }
    
    public void cambiarEstadoCivil(Persona persona){
        System.out.println("Ingrese el nuevo estado civil");
        persona.setEstadoCivil(leer.nextLine());
    }
    
    public void reasignarDespacho(Empleado e){
        System.out.println("Ingresar el numero del nuevo despacho");
        e.setDespacho(leer.nextInt());
        leer.nextLine();
    }
    
    public void matricularAlumno(){
        System.out.println("Ingresar numero de nuevo curso");
        e.setCurso(leer.nextInt());
        leer.nextLine();
    }
    
    public void cambioDepartamento(){
        System.out.println("Ingresar el nuevo departamento");
        p.setDepartamento(leer.nextLine());
    }
    
    public void trasladoSeccion(){
        System.out.println("Ingresar nombre de nueva seccion");
        pe.setSeccion(leer.nextLine());
    }
    
    public void mostrarInfo(){
        System.out.println("ESTUDIANTE");
        System.out.println("Nombre: " + e.getNombre() + ", apellido: " + e.getApellido() + ", id: " + e.getId() + ", estado civil: " + e.getEstadoCivil() + ", curso: " + e.getCurso());
        System.out.println("");
        System.out.println("PROFESOR");
        System.out.println("Nombre: " + p.getNombre() + ", apellido: " + p.getApellido() + ", id: " + p.getId() + ", estado civil: " + p.getEstadoCivil() + ", fecha de incorporacion: " + p.getIncorporacion() + ", despacho: " + p.getDespacho() + ", departamento: " + p.getDepartamento());
        System.out.println("");
        System.out.println("PERSONAL DE SERVICIO");
        System.out.println("Nombre: " + pe.getNombre() + ", apellido: " + pe.getApellido() + ", id: " + pe.getId() + ", estado civil: " + pe.getEstadoCivil() + ", fecha de incorporacion: " + pe.getIncorporacion() + ", despacho: " + pe.getDespacho() + ", seccion: " + pe.getSeccion());
    }
    
    public void menu(){
        System.out.println("CREAR ESTUDIANTE:");
        crearEstudiante();
        System.out.println("CREAR PROFESOR:");
        crearProfesor();
        System.out.println("CREAR PERSONAL DE SERVICIO:");
        crearPersonalDeServicio();
        
        boolean band=false;
        
        while(!band){
            System.out.println("Seleccionar una opcion");
            System.out.println("1- Cambio del estado civil de una persona");
            System.out.println("2- Reasignación de despacho a un empleado");
            System.out.println("3- Matriculación de un estudiante en un nuevo curso");
            System.out.println("4- Cambio de departamento de un profesor");
            System.out.println("5- Traslado de sección de un empleado del personal de servicio");
            System.out.println("6- Mostrar toda la informacion de las instancias");
            System.out.println("7- Salir");
            int opcion = leer.nextInt();
            leer.nextLine();
        
            switch(opcion){
                case 1->{
                    System.out.println("Ingrese: 1-Estudiante 2-Profesor 3-PersonalDeServicio");
                    int num=leer.nextInt();
                    leer.nextLine();
                
                    if(num==1){
                        cambiarEstadoCivil(e);
                    }
                    else if(num==2){
                        cambiarEstadoCivil(p);
                    }
                    else{
                        cambiarEstadoCivil(pe);
                    }
                }
                case 2->{
                    System.out.println("Ingrese: 1-Profesor 2-PersonalDeServicio");
                    int num=leer.nextInt();
                    if(num==1){
                        reasignarDespacho(p);
                    }
                    else{
                        reasignarDespacho(pe);
                    }
                }
                case 3->matricularAlumno();
                case 4->cambioDepartamento();
                case 5->trasladoSeccion();
                case 6-> mostrarInfo();
                case 7-> band=true;
            }
        }
    }
}
