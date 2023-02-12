package org.aperez.app.jardin;

import org.aperez.app.hogar.*;

public class EjemploPaquetes {
    
    public static void main(String[] args) {
        
        Persona p = new Persona();
        p.setNombre("Alfonso"); 
        System.out.println(p.getNombre());
        p.setApellido("Perez");
        System.out.println(p.getApellido());

        Gato g = new Gato();

        Perro perro = new Perro();
        perro.nombre = "Vito";
        perro.raza = "Labrador";

        String jugando = perro.jugar(p);
        System.out.println("Jugando = " + jugando);
    }
}
// Alfonso
// Perez
// Jugando = Lanza la pelota al perro!