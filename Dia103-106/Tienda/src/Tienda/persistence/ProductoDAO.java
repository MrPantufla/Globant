package Tienda.persistence;
import Tienda.objects.Producto;
import java.util.ArrayList;

public class ProductoDAO extends DAO{
    
    public ArrayList devolverTodosLosProductos() throws Exception{
        try{
            ArrayList <Producto> productos = new ArrayList();
            
            String sql = "SELECT * FROM producto";
            
            consultarBase(sql);
            
            Producto producto = null;
            
            while(resultado.next()){
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
            
        } catch (Exception e){
            desconectarBase();
            throw e;
        }    
    }
    
    public ArrayList devolverEnviandoConsulta(String sql) throws Exception{
        try{
            ArrayList <Producto> productos = new ArrayList();
            
            consultarBase(sql);
            
            Producto producto = null;
            
            while(resultado.next()){
                producto = new Producto();
                if(sql.contains("codigo")){
                    producto.setCodigo(resultado.getInt("codigo"));
                }
                if(sql.contains("nombre")){
                    producto.setNombre(resultado.getString("nombre"));
                }
                if(sql.contains("precio")){
                    producto.setPrecio(resultado.getDouble("precio"));
                }
                if(sql.contains("codigo_fabricante")){
                    producto.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                }
                productos.add(producto);
            }
            desconectarBase();
            return productos;
            
        } catch (Exception e){
            desconectarBase();
            throw e;
        }    
    }
    
    public void insertarElemento(String sql) throws Exception{
        insertarModificarEliminar(sql);
    }
}
