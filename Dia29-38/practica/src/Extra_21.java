import java.util.Scanner;

public class Extra_21 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        int alumnos[][]=new int[10][4];
        int aprobados=0, desaprobados=0, alumno;

        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno " + i);
            for (int j = 0; j < 4; j++) {
                alumnos[i][j]=leer.nextInt();
                switch(i){
                    case 0:
                        alumnos[i][j]*=0.1;
                        break;
                    case 1:
                        alumnos[i][j]*=0.15;
                        break;
                    case 2:
                        alumnos[i][j]*=0.25;
                        break;
                    case 3:
                        alumnos[i][j]*=0.5;
                        break;
                    default:
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            alumno=0;
            for (int j = 0; j < 4; j++) {
                alumno+=alumnos[i][j];
            }
            if(alumno>=7){
                aprobados++;
            }
            else{
                desaprobados++;
            }
        }

        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnnos desaprobados: " + desaprobados);
    }
}
