package com.mycompany.ej5;
import Services.PaisService;
public class Ej5 {
    public static void main(String[] args) {
        PaisService p = new PaisService();
        
        p.agregarPaises();
        p.eliminarPais();
    }
}
