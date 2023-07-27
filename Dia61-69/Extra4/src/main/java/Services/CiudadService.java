package Services;

import java.util.HashMap;
import java.util.Scanner;

public class CiudadService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap <Integer, String> ciudades = new HashMap();
    
    public void añadirDiez(){
        ciudades.put(1,"ciudad1");
        ciudades.put(2,"ciudad2");
        ciudades.put(3,"ciudad3");
        ciudades.put(4,"ciudad4");
        ciudades.put(5,"ciudad5");
        ciudades.put(6,"ciudad6");
        ciudades.put(7,"ciudad7");
        ciudades.put(8,"ciudad8");
        ciudades.put(9,"ciudad9");
        ciudades.put(10,"ciudad10");
    }
    
    public void mostrarDatos(){
        System.out.println("");
        for(HashMap.Entry<Integer, String> i : ciudades.entrySet()){ 
            System.out.println(i.toString());  
        }
        System.out.println("");
    }
    
    public void buscarPorCodigo(){
        System.out.println("Ingresar codigo a buscar");
        int codigo=leer.nextInt();
        leer.nextLine();
        
        if(ciudades.containsKey(codigo)){
            System.out.println("La ciudad con el código postal " + codigo + " es: " + ciudades.get(codigo));
        }
        else{
            System.out.println("Ninguna ciudad listada tiene ese código asociado");
        }
    }
    
    public void agregarCiudad(){
        System.out.println("Ingresar nombre de la ciudad a añadir");
        String nombre = leer.nextLine();
        System.out.println("Ingresar CP");
        int cp = leer.nextInt();
        leer.nextLine();
        ciudades.put(cp, nombre);
    }
    
    public void eliminarCiudades(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresar ciudad a eliminar");
            String ciudad = leer.nextLine();
            if(ciudades.containsValue(ciudad)){
                for(HashMap.Entry<Integer, String> j : ciudades.entrySet()){ 
                    if(j.getValue().equals(ciudad)){
                        System.out.println(j.getValue() + " eliminada");
                        ciudades.remove(j.getKey());
                        break;
                    }
                }
            }
            else{
                i--;
                System.out.println("La ciudad indicada no se encuentra en la lista");
            }
        }
    }
}
