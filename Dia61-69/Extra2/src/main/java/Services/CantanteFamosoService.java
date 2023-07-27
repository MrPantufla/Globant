package Services;
import Objects.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

public class CantanteFamosoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList <CantanteFamoso> cantantes = new ArrayList();
    
    public void menu(){
        
        boolean band=false;
        
        while(band==false){
            System.out.println("Seleccione una opcion");
            System.out.println("1- Añadir un cantante");
            System.out.println("2- Eliminar a un cantante");
            System.out.println("3- Listar cantantes");
            System.out.println("4- Salir");
            
            int opcion=leer.nextInt();
            leer.nextLine();
            
            switch(opcion){
                case 1 -> añadirCantante();
                case 2 -> eliminarCantante();
                case 3 -> listarCantantes();
                case 4 -> band=true;
            }
        }
    }
    
    private void añadirCantante(){
        CantanteFamoso c = new CantanteFamoso();
        System.out.println("Ingresar nombre");
        c.setNombre(leer.nextLine());
        System.out.println("Ingresar disco");
        c.setDisco(leer.nextLine());
        cantantes.add(c);
    }
    
    private int eliminarCantante(){
        System.out.println("Ingresar el cantante a eliminar");
        String cant = leer.nextLine();
        
        for(CantanteFamoso i : cantantes){
            if(i.getNombre().equals(cant)){
               cantantes.remove(i);
               System.out.println(cant + " eliminado con exito");
               return 0;
            }
        }
        
        System.out.println(cant + " no se encuentra en la lista");
        return 1;
    }
    
    private void listarCantantes(){
        System.out.println("");
        for(CantanteFamoso i : cantantes){
            System.out.println(i.toString());
        }
        System.out.println("");
    }
    
    public void añadirLista(ArrayList<CantanteFamoso> lista){
        cantantes.addAll(lista);
    } 
}
