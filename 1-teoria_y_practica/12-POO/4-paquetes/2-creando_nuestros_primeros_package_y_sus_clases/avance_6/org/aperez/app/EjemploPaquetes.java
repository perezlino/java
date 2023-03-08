package org.aperez.app;

import org.aperez.app.hogar.*;

public class EjemploPaquetes {
    
    public static void main(String[] args) {
        
        Persona p = new Persona();
        p.nombre = "Alfonso"; 
        System.out.println(p.nombre);
        p.apellido = "Perez";
        System.out.println(p.apellido);

        Gato g = new Gato();

        Perro perro = new Perro();
        perro.nombre = "Vito";
        perro.raza = "Labrador";
    }
}
// Alfonso
// Perez