package com.mycompany.ej14;
import Services.MovilService;

public class Ej14 {

    public static void main(String[] args) {
        MovilService movil1 = new MovilService();
        
        movil1.cargarCelular();
        movil1.ingresarCodigo();
        movil1.retornarTodo();
    }
}
