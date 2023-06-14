package Objects;
import java.util.Scanner;

public class Cuenta {
    private int numeroCuenta;
    private int dni;
    private int saldo;
    Scanner leer = new Scanner(System.in);
    
    public Cuenta(int numeroCuenta, int dni, int saldo){
        this.numeroCuenta=numeroCuenta;
        this.dni=dni;
        this.saldo=saldo;
    }
    
    public Cuenta(){};
    
    public void setNumeroCuenta(int numeroCuenta){
        this.numeroCuenta=numeroCuenta;
    }
    
    public void setDni(int dni){
        this.dni=dni;
    }
    
    public void setSaldo(int saldo){
        this.saldo=saldo;
    }
    
    public int getNumeroCuenta(){
        return this.numeroCuenta;
    }
    
    public int getDni(){
        return this.dni;
    } 
    
    public int getSaldo(){
        return this.saldo;
    }
    
    public void crearCuenta(){
        System.out.println("Ingresar numero de cuenta");
        this.numeroCuenta=leer.nextInt();
        System.out.println("Ingresar dni");
        this.dni=leer.nextInt();
        this.saldo=0;
    }
    
    public void ingresar(int saldo){
        this.saldo+=saldo;
    }
    
    public void retirar(int saldo){
        this.saldo-=saldo;
        
        if(this.saldo<0){
            this.saldo=0;
        }
    }
    
    public void extraccionRapida(int saldo){
        if(saldo<=(this.saldo*0.2)){
            this.saldo-=saldo;
        }
        else{
            System.out.println("Cantidad ingresada mayor al 20%");
        }
    }
    
    public void consultarSaldo(){
        System.out.println("Saldo: " + getSaldo());
    }
    
    public void consultarDatos(){
        System.out.println("Numero de cuenta: " + getNumeroCuenta() + ", Dni: " + getDni() + ", Saldo: " + getSaldo());
    }
}
