package Objects;
import java.util.Scanner;

public class Persona {
    Scanner leer = new Scanner(System.in);
    private String nombre;
    private int edad;
    private String sexo;
    private int peso;
    private float altura;
    
    public Persona(){}
    
    public Persona(String nombre, int edad, String sexo, int peso, float altura){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
    
    public void setPeso(int peso){
        this.peso=peso;
    }
    
    public void setAltura(float altura){
        this.altura=altura;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public int getPeso(){
        return this.peso;
    }
    
    public float getAltura(){
        return this.altura;
    }
    
    public void crearPersona(){
        System.out.println("Ingresar nombre");
        this.nombre=leer.nextLine();
        System.out.println("Ingresar edad");
        this.edad=leer.nextInt();
        leer.nextLine();
        System.out.println("Ingresar sexo");
        do{
            this.sexo=leer.nextLine();
            if(!(this.sexo.equals("H") || this.sexo.equals("M") || this.sexo.equals("O"))){
                System.out.println("Dato mal ingresado, volver a ingresar sexo");
            }
        }while(!(this.sexo.equals("H") || this.sexo.equals("M") || this.sexo.equals("O")));
        System.out.println("Ingresar peso");
        this.peso=leer.nextInt();
        leer.nextLine();
        System.out.println("Ingresar altura");
        this.altura=leer.nextFloat();
        leer.nextLine();
    }   
    
    public float calcularIMC(){
        float imc=(this.peso/(this.altura*this.altura));
        if(imc<20){
            return -1;
        }
        else if(imc>=20 && imc <=25){
            return 0;
        }
        else{
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(){
        return (this.edad>=18);
    }
}
