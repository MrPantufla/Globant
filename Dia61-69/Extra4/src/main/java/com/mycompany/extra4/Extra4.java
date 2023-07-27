package com.mycompany.extra4;
import Services.CiudadService;

public class Extra4 {

    public static void main(String[] args) {
        CiudadService c = new CiudadService();
        
        c.añadirDiez();
        c.mostrarDatos();
        c.buscarPorCodigo();
        c.agregarCiudad();
        c.mostrarDatos();
        c.eliminarCiudades();
        c.mostrarDatos();
    }
}
