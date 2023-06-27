package Services;
import Objects.Meses;
import java.util.Random;
import java.util.Scanner;

public class MesesService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Meses m = new Meses();
    
    public void cargarMesesDelAnio(){
        String meses[]= new String[12];
        
        meses[0]="enero";
        meses[1]="febrero";
        meses[2]="marzo";
        meses[3]="abril";
        meses[4]="mayo";
        meses[5]="junio";
        meses[6]="julio";
        meses[7]="agosto";
        meses[8]="septiembre";
        meses[9]="octubre";
        meses[10]="noviembre";
        meses[11]="diciembre";
        
        m.setMesesDelAnio(meses);
    }
    
    
    public void adivinarMes(){
        Random random = new Random();
        int numeroAleatorio = random.nextInt(12);
        
        String[] arregloMeses = m.getMesesDelAnio();
        int indiceMes = numeroAleatorio;
        String mesEspecifico = arregloMeses[indiceMes];
        
        String adivinar;
        System.out.println("Ingresar un mes para comenzar a adivinar");
        do{
            adivinar=leer.nextLine();
            if(!(adivinar.equals(mesEspecifico))){
                System.out.println("Incorrecto, ingresar otra vez");
            }
            else{
                System.out.println("Correcto!");
            }
        }while(!(adivinar.equals(mesEspecifico)));
    }
}
