package Tienda.persistence;
import Tienda.objects.Fabricante;
import java.util.ArrayList;

public final class FabricanteDAO extends DAO{
    
    public Fabricante buscarFabricante(String n) throws Exception{
        try{
            String sql = "SELECT * FROM fabricante WHERE nombre = '" + n + "'";
            
            consultarBase(sql);
            
            Fabricante fabricante = null;
            
            while(resultado.next()){
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt("codigo"));
                fabricante.setNombre(resultado.getString("nombre"));
            }
            desconectarBase();
            return fabricante;
            
        } catch(Exception e){
            desconectarBase();
            throw e;
        }
    }
    
    public ArrayList devolverTodosLosFabricantes() throws Exception{
        try{
            ArrayList <Fabricante> fabricantes = new ArrayList();
            
            String sql = "SELECT * FROM fabricante";
            
            consultarBase(sql);
            
            Fabricante fabricante = null;
            
            while(resultado.next()){
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));  
                fabricantes.add(fabricante);
            }
            desconectarBase();
            return fabricantes;
            
        } catch (Exception e){
            desconectarBase();
            throw e;
        }    
    }
    
    public void agregarFabricante(String sql) throws Exception{
        try{
            insertarModificarEliminar(sql);
        } catch(Exception e){
            throw e;
        }
    }
}
