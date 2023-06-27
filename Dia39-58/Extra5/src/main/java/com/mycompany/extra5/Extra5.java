package com.mycompany.extra5;
import Services.MesesService;

public class Extra5 {

    public static void main(String[] args) {
        MesesService m = new MesesService();
        
        m.cargarMesesDelAnio();
        m.adivinarMes();
    }
}
