package com.mycompany.ej13;
import Services.CursoService;

public class Ej13 {
    public static void main(String[] args) {
        CursoService curso = new CursoService();
        
        curso.crearCurso();
        curso.cargarAlumnos();
        System.out.println("La ganancia semanal es: " + curso.calcularGananciaSemanal());
    }
}
