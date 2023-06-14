package com.mycompany.ej7;
import Objects.Persona;

public class Ej7 {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        
        System.out.println("Ingresar datos de persona 1");
        persona1.crearPersona();
        System.out.println("Ingresar datos de persona 2");
        persona2.crearPersona();
        System.out.println("Ingresar datos de persona 3");
        persona3.crearPersona();
        System.out.println("Ingresar datos de persona 4");
        persona4.crearPersona();
        
        float imcs[] = new float [4];
        boolean mayores[] = new boolean[4];
        
        imcs[0] = persona1.calcularIMC();
        imcs[1] = persona2.calcularIMC();
        imcs[2] = persona3.calcularIMC();
        imcs[3] = persona4.calcularIMC();
        
        mayores[0]=persona1.esMayorDeEdad();
        mayores[1]=persona2.esMayorDeEdad();
        mayores[2]=persona3.esMayorDeEdad();
        mayores[3]=persona4.esMayorDeEdad();
        
        int cantMayores=0;
        int imcBajo=0;
        int imcMedio=0;
        int imcAlto=0;
        
        for (int i = 0; i < mayores.length; i++) {
            if(mayores[i]==true){
                cantMayores++;
            }
            
            if(imcs[i]==(-1)){
                imcBajo++;
            }
            else if(imcs[i]==0){
                imcMedio++;
            }
            else{
                imcAlto++;
            }
        }
        
        System.out.println("El porcentaje de mayores de edad es: " + (cantMayores*100/mayores.length));
        System.out.println("El porcentaje de personas con peso bajo es: " + (imcBajo*100/imcs.length));
        System.out.println("El porcentaje de personas con peso medio es: " + (imcMedio*100/imcs.length));
        System.out.println("El porcentaje de personas con peso alto es: " + (imcAlto*100/imcs.length));
    }
}
