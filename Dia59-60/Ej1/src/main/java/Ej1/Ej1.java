package Ej1;

import Services.DiscountCalculatorService;

public class Ej1 {
    public static void main(String[] args) {
        DiscountCalculatorService d = new DiscountCalculatorService();
        d.crearOferta(200,10);
        
        System.out.println(d.realizarDescuento());
    } 
}
