package Services;
import Objects.Curso;
import java.util.Scanner;

public class CursoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String alumnos[] = new String[5];
    Curso c = new Curso();
    
    public void cargarAlumnos(){
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresar nombre del alumno" + (i+1));
            alumnos[i]=leer.nextLine();
        }
        c.setAlumnos(alumnos);
    }
    
    public Curso crearCurso(){
        System.out.println("Ingresar nombre del curso");
        c.setNombre(leer.nextLine());
        System.out.println("Ingresar horas por día");
        c.setHorasPorDia(leer.nextInt());
        System.out.println("Ingresar dias por semana");
        c.setDiasPorSemana(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingresar turno");
        c.setTurno(leer.nextLine());
        System.out.println("Ingresar precio por hora");
        c.setPrecioPorHora(leer.nextInt());
        leer.nextLine();
        return c;
    }
    
    public int calcularGananciaSemanal(){
        return 5*c.getDiasPorSemana()*c.getHorasPorDia()*c.getPrecioPorHora();
    }
}
