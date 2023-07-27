package Services;
import Objects.Producto;
import java.util.HashMap;
import java.util.Scanner;

public class ProductoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    HashMap<Integer, Producto> productos = new HashMap();
    
    public void menu(){
        boolean band=false;
        int i=0;
        while(band==false){
            System.out.println("1- Agregar un producto");
            System.out.println("2- Eliminar un producto");
            System.out.println("3- Modificar el precio de un producto");
            System.out.println("4- Listar productos");
            System.out.println("5- Salir");
            
            int opcion=leer.nextInt();
            leer.nextLine();
            
            switch(opcion){
                case 1:
                    agregarProducto(i);
                    i++;
                    break;
                case 2:
                    eliminarProducto();
                    break;
                case 3:
                    cambiarPrecio();
                    break;
                case 4:
                    listarProductos();
                    break;
                case 5:
                    band=true;
            }
        }
    }
    
    private void agregarProducto(int iterador){
        Producto p = new Producto();
        System.out.println("Ingresar el nombre del producto");
        p.setNombre(leer.nextLine());
        System.out.println("Ingresar precio");
        String precio=leer.nextLine();
        p.setPrecio(Double.parseDouble(precio));
        productos.put(iterador, p);
        System.out.println("Producto añadido con exito, lista de productos:");
        listarProductos();
    }
    
    private void eliminarProducto(){
        System.out.println("Ingrese la key de producto a eliminar");
        int key=leer.nextInt();
        leer.nextLine();
        if(productos.containsKey(key)){
            productos.remove(key);
            System.out.println("Producto " + key + " eliminado con exito, lista de productos:");
            listarProductos();
        }
        else{
            System.out.println("El producto " + key + " no existe");
        }
    }
    
    private void cambiarPrecio(){
        System.out.println("Ingrese la key del producto a modificar");
        int key=leer.nextInt();
        leer.nextLine();
        if(productos.containsKey(key)){
            System.out.println("Ingrese el nuevo precio");
            productos.get(key).setPrecio(leer.nextDouble());
            leer.nextLine();
            System.out.println("Precio modificado, lista de productos:");
            listarProductos();
        }
        else{
            System.out.println("El producto " + key + " no existe");
        }
    }
    
    private void listarProductos(){
        System.out.println("");
        for(HashMap.Entry<Integer, Producto> i : productos.entrySet()){ 
            System.out.println(i.toString());  
        }
        System.out.println("");
    }
}
