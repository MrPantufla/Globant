package com.mycompany.ej5;
import Objects.Cuenta;

public class Ej5 {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        
        cuenta1.crearCuenta();
        cuenta1.ingresar(20);
        cuenta1.retirar(2);
        cuenta1.extraccionRapida(1);
        cuenta1.consultarSaldo();
        cuenta1.consultarDatos();
    }
}
