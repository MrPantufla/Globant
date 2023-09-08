package com.mycompany.extra2;
import Objects.Edificio;
import Services.OficinasService;
import Services.PolideportivoService;
import Objects.Oficinas;
import Objects.Polideportivo;
import java.util.ArrayList;

public class Extra2 {
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList();
        int countTechados=0;
        PolideportivoService p = new PolideportivoService();
        OficinasService o = new OficinasService();
        
        for (int i = 0; i < 4; i++) {
            if(i%2==0){
                System.out.println("INGRESAR DATOS POLIDEPORTIVO");
                edificios.add(p.crearPolideportivo());
            }
            else{
                System.out.println("INGRESAR DATOS EDIFICIO DE OFICINAS");
                edificios.add(o.crearOficinas());
            }  
        }
        
        /*for (int i = 0; i < edificios.size(); i++) {
            System.out.println("");
            System.out.println(edificios.get(i).getClass().getSimpleName());
            System.out.println("La superficie es: " + p.calcularSuperficie(edificios.get(i)));
            System.out.println("El volumen es: " + p.calcularVolumen(edificios.get(i)));
            if(edificios.get(i) instanceof Polideportivo){
                if(((Polideportivo) edificios.get(i)).getTipo().equals("techado")){
                    countTechados++;
                }
            }
        }*/
        
        for(Edificio e : edificios){
            System.out.println("");
            System.out.println(e.getClass().getSimpleName());
            System.out.println("La superficie es: " + p.calcularSuperficie(e));
            System.out.println("El volumen es: " + p.calcularVolumen(e));
            if(e instanceof Polideportivo){
                if(((Polideportivo) e).getTipo().equals("techado")){
                    countTechados++;
                }
            }
            else{
                o.cantPersonas((Oficinas)e);
            }
        }
        System.out.println("");
        System.out.println("La cantidad de polideportivos techados es " + countTechados + " y la cantidad de abiertos es " + (2-countTechados));
    }
}
