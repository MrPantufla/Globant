package Tienda.services;
import Tienda.objects.Producto;
import Tienda.persistence.ProductoDAO;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ProductoDAO producto = new ProductoDAO();
    Producto p = new Producto();
    
    public void imprimirNombreProductos() throws Exception{
        try{
            ArrayList <Producto> productos = new ArrayList();
            productos=producto.devolverEnviandoConsulta("SELECT nombre FROM producto");
            
            for(Producto p : productos){
                System.out.println(p.getNombre());
            }
        } catch (Exception e){
            throw e;
        }
    }
    
    public void imprimirNombreYPrecioProductos() throws Exception{
        try{
            ArrayList <Producto> productos = new ArrayList();
            productos=producto.devolverEnviandoConsulta("SELECT nombre, precio FROM producto");
        
            for(Producto p : productos){
                System.out.println("NOMBRE: " + p.getNombre() + " PRECIO: " + p.getPrecio());
            }
        } catch (Exception e){
            throw e;
        }
    }
    
    public void imprimirProductosEntre120y202() throws Exception{
        ArrayList <Producto> productos = new ArrayList();
        productos=producto.devolverEnviandoConsulta("SELECT nombre, precio FROM producto WHERE precio>=120 AND precio<=202");
        try{
            for(Producto p : productos){
                System.out.println("NOMBRE: " + p.getNombre() + " PRECIO: " + p.getPrecio());
            }
        } catch(Exception e){
            throw e;
        } 
    }
    
    public void imprimirPortatiles() throws Exception{
        ArrayList <Producto> productos = new ArrayList();
        productos=producto.devolverEnviandoConsulta("SELECT nombre FROM producto WHERE nombre LIKE 'Portátil%'");
        try{
            for(Producto p : productos){
                if(p.getNombre().contains("Portátil")){
                    System.out.println(p.getNombre());
                }
            }
        } catch (Exception e){
            throw e;
        }
    }
    
    public void imprimirProductoMasBarato() throws Exception{
        ArrayList <Producto> productos = new ArrayList();
        productos=producto.devolverEnviandoConsulta("SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1");
        try{
            for(Producto p : productos){
                System.out.println("NOMBRE: " + p.getNombre() + " PRECIO: " + p.getPrecio());
            }
        } catch(Exception e){
            throw e;
        } 
    }
    
    public void agregarProducto() throws Exception{
        try{
            System.out.println("Ingresar nombre del producto");
            String nombre=leer.nextLine();
            System.out.println("Ingresar precio");
            double precio = leer.nextDouble();
            leer.nextLine();
            System.out.println("Ingresar codigo de fabricante");
            int codigoFabricante=leer.nextInt();
            leer.nextLine();
            
            ArrayList <Producto> productos = new ArrayList();
            productos=producto.devolverTodosLosProductos();
            
            int codigoProducto = productos.size()+1;
            
            String sql = "INSERT INTO producto VALUES (" + codigoProducto + ",'" + nombre + "'," + precio + "," + codigoFabricante + ");";
            producto.insertarElemento(sql);
        } catch (Exception e){
            throw e;
        }
    }
    
    public void editarProducto() throws Exception{
        try{
            System.out.println("Indicar codigo del producto a editar");
            int codigo=leer.nextInt();
            leer.nextLine();
            System.out.println("Ingresar nuevo nombre");
            String nombre = leer.nextLine();
            System.out.println("Ingresar nuevo precio");
            int precio = leer.nextInt();
            System.out.println("Ingresar nuevo codigo de fabricante");
            int codigoFabricante = leer.nextInt();
            leer.nextLine();
            
            String sql = "UPDATE producto SET nombre = '" + nombre + "', precio = " + precio + ", codigo_fabricante = " + codigoFabricante + " WHERE codigo = " + codigo + ";";
            producto.insertarElemento(sql);
        } catch (Exception e){
            throw e;
        }
    }
}
