package Tienda;
import Tienda.services.FabricanteService;
import Tienda.services.ProductoService;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        FabricanteService f = new FabricanteService();
        ProductoService p = new ProductoService();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        try{
            boolean band=true;
            
            while(band==true){
                System.out.println("Ingrese la opcion deseada:");
                System.out.println("1- Mostrar todos los productos");
                System.out.println("2- Mostrar todos los productos con sus precios");
                System.out.println("3- Mostrar todos los productos con valor entre 120 y 202");
                System.out.println("4- Mostrar todos los portátiles");
                System.out.println("5- Mostrar el producto más barato");
                System.out.println("6- Agregar un producto");
                System.out.println("7- Agregar un fabricante");
                System.out.println("8- Editar un producto");
                System.out.println("9- Salir");
                
                int opcion = leer.nextInt();
                leer.nextLine();
                
                switch (opcion){
                    case 1-> p.imprimirNombreProductos();
                    case 2-> p.imprimirNombreYPrecioProductos();
                    case 3-> p.imprimirProductosEntre120y202();
                    case 4-> p.imprimirPortatiles();
                    case 5-> p.imprimirProductoMasBarato();
                    case 6-> p.agregarProducto();
                    case 7-> f.agregarFabricante();
                    case 8-> p.editarProducto();
                    case 9-> band=false;
                }
                System.out.println("---Presione ENTER para continuar---");
                leer.nextLine();
            }
        } catch (Exception e){
            throw e;
        }
    }
}
