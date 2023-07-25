package Services;
import Objects.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class PaisService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private HashSet <Pais> paises = new HashSet();
    
    public void agregarPaises(){
        boolean band=true;
        
        while(band==true){
            Pais p = new Pais();
            System.out.println("Ingresar pais a agregar");
            p.setNombre(leer.nextLine());
            paises.add(p);
            System.out.println("Desea añadir otro? Y o N");
            String opcion=leer.nextLine();
            opcion=opcion.toLowerCase();
            if(opcion.equals("n")){
                band=false;
            }
        }
        
        System.out.println("TODOS LOS PAISES AÑADIDOS:");
        ordenarYMostrar(paises);
    }
    
    public void eliminarPais(){
        boolean band=false;
        System.out.println("Ingresar pais a buscar");
        String busqueda=leer.nextLine();
        for(Pais i : paises){
            if(busqueda.equals(i.getNombre())){
                band=true;
                paises.remove(i);
                break;
            }
        }
        
        if(band){
            System.out.println("El pais fue eliminado correctamente, nuevo conjunto:");
            ordenarYMostrar(paises);
        }
        else{
            System.out.println("El país ingresado no se encuentra en la lista");
        }
    }
    
    private void ordenarYMostrar(HashSet<Pais> paises){
        ArrayList<Pais> paisesArrayList = new ArrayList <>(paises);
        Collections.sort(paisesArrayList, new Comparator<Pais>() {
            @Override
            public int compare(Pais pais1, Pais pais2) {
                return pais1.getNombre().compareTo(pais2.getNombre());
            }
        });
        
        for(Pais i : paisesArrayList){
            System.out.println(i.getNombre());
        }
    }
}
