package Tienda.services;
import Tienda.persistence.FabricanteDAO;
import Tienda.objects.Fabricante;
import java.util.ArrayList;
import java.util.Scanner;

public class FabricanteService {
    FabricanteDAO fabricante = new FabricanteDAO();
    Fabricante f = new Fabricante();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void agregarFabricante() throws Exception{
        try{
            System.out.println("Ingresar nombre del fabricante");
            String nombre=leer.nextLine();
            
            ArrayList <Fabricante> fabricantes = new ArrayList();
            fabricantes=fabricante.devolverTodosLosFabricantes();
            
            int codigoFabricante = fabricantes.size()+1;
            
            String sql = "INSERT INTO fabricante VALUES (" + codigoFabricante + ",'" + nombre + "');";
            fabricante.agregarFabricante(sql);
        } catch (Exception e){
            throw e;
        }
    }
    
    public void imprimirFabricantes() throws Exception{
        try{
            ArrayList <Fabricante> fabricantes = new ArrayList();
            fabricantes=fabricante.devolverTodosLosFabricantes();
            
            for(Fabricante f : fabricantes){
                System.out.println(f.getNombre());
            }
        } catch (Exception e){
            throw e;
        }
    }
}
