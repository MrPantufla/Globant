package Services;

import Objects.DiscountCalculator;

public class DiscountCalculatorService {
    DiscountCalculator d = new DiscountCalculator();
    
    public void crearOferta(double precio, int descuento){
        d.setPrecio(precio);
        d.setDescuento(descuento);
    }
    
    public double realizarDescuento(){
        return d.getPrecio()-(d.getDescuento()*d.getPrecio()/100);
    }
}
