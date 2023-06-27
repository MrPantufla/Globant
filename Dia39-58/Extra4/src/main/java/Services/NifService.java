package Services;
import Objects.Nif;
import java.util.Scanner;

public class NifService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Nif n = new Nif();
     
    public Nif crearNif(){
        System.out.println("Ingrese el DNI");
        n.setDni(leer.nextInt());
        int numeroLetraDeNif=(Math.round(n.getDni()%23));
        String letraDeNif="x";
        switch(numeroLetraDeNif){
            case 0 -> letraDeNif="T";
            case 1 -> letraDeNif="R";
            case 2 -> letraDeNif="W";
            case 3 -> letraDeNif="A";
            case 4 -> letraDeNif="G";
            case 5 -> letraDeNif="M";
            case 6 -> letraDeNif="Y";
            case 7 -> letraDeNif="F";
            case 8 -> letraDeNif="P";
            case 9 -> letraDeNif="D";
            case 10 -> letraDeNif="X";
            case 11 -> letraDeNif="B";
            case 12 -> letraDeNif="N";
            case 13 -> letraDeNif="J";
            case 14 -> letraDeNif="Z";
            case 15 -> letraDeNif="S";
            case 16 -> letraDeNif="Q";
            case 17 -> letraDeNif="V";
            case 18 -> letraDeNif="H";
            case 19 -> letraDeNif="L";
            case 20 -> letraDeNif="C";
            case 21 -> letraDeNif="K";
            case 22 -> letraDeNif="E";
        }
        n.setNif(letraDeNif);
        
        return n;
    }
    
    public void mostrar(){
        System.out.println(n.getDni() + "-" + n.getLetra());
    }
}
