package com.mycompany.ej3;

import Services.AlumnoService;

public class Ej3 {
    public static void main(String[] args) {
        AlumnoService a = new AlumnoService();
        
        a.crearAlumnos();
        a.notaFinal();
    }
}
