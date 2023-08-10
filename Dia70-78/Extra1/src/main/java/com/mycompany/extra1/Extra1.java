package com.mycompany.extra1;
import Services.PerroService;
import Services.PersonaService;

public class Extra1 {
    public static void main(String[] args) {
        PerroService p = new PerroService();
        PersonaService persona = new PersonaService();
        
        p.crearPerro("Perro", "Caniche", 25, "Chico");
        p.crearPerro("Perroxd", "asd", 3, "Grande");
        p.crearPerro("Dogo", "raza", 54, "Mediano");
        persona.crearPersona("Juan", "Pizzio", 24, 56489752);
        persona.crearPersona("xd", "dx", 69, 12345678);
        persona.crearPersona("persona3", "apellido", 87, 945618);
        persona.adoptarPerro(p.devolverPerros());
        persona.mostrarDatos();
    }
}
