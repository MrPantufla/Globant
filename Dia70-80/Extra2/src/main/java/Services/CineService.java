package Services;
import Objects.Cine;
import java.util.Scanner;

public class CineService {
    Cine c = new Cine();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void inicializarSala(){
        String [][] matriz = new String [8][6];
        for (int i = 7; i >= 0; i--){
            for (int j = 0; j < 6; j++) {
                matriz[i][j]=((String.valueOf(7-i+1)).concat(String.valueOf((char)('A'+j)))).concat(" ");
            }
        }
        c.setSala(matriz);
        System.out.println("Ingresar el valor de la funcion");
        c.setPrecio(leer.nextInt());
    }
    
    public void mostrarSala(){
        String [][] matrizAux = c.getSala();
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrizAux[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public String[][] devolverSala(){
        return c.getSala();
    }
    
    public Cine devolverCine(){
        return c;
    }
}
