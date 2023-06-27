package Services;
import Objects.Movil;
import java.util.Scanner;

public class MovilService {
    Movil m = new Movil();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Movil cargarCelular(){
        System.out.println("Ingresar marca");
        m.setMarca(leer.nextLine());
        System.out.println("Ingresar precio");
        m.setPrecio(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingresar modelo");
        m.setModelo(leer.nextLine());
        System.out.println("Ingresar memoria RAM");
        m.setMemoriaRam(leer.nextInt());
        System.out.println("Ingresar almacenamiento");
        m.setAlmacenamiento(leer.nextInt());
        
        return m;
    }
    
    public void ingresarCodigo(){
        int codigo[]=new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingresar caracter del codigo nro" + (i+1));
            codigo[i]=leer.nextInt();
        }
        
        m.setCodigo(codigo);
    }
    
    /*Metodo de control*/
    public void retornarTodo(){
        System.out.println("Marca: " + m.getMarca());
        System.out.println("Precio: " + m.getPrecio());
        System.out.println("Modelo: " + m.getModelo());
        System.out.println("RAM: " + m.getMemoriaRam());
        System.out.println("Almacenamiento: " + m.getAlmacenamiento());
        System.out.println (m.getCodigo());
    }
}
