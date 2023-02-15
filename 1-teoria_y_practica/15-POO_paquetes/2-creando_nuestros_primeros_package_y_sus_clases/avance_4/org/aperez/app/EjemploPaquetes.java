package org.aperez.app;

import org.aperez.app.hogar.*;

public class EjemploPaquetes {
    
    public static void main(String[] args) {
        
        Persona p = new Persona();
        p.nombre = "Alfonso";
        System.out.println(p.nombre);

        Gato g = new Gato();

        // No hay ningún import de perro porque están en el mismo contexto de package (org.aperez.app). 
        // Solamente es necesario importar cuando están en distintos paquetes.
        Perro perro = new Perro();
    }
}
// Alfonso