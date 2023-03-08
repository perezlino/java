package org.aperez.app;

import org.aperez.app.hogar.*;

public class EjemploPaquetes {
    
    public static void main(String[] args) {
        
        Persona p = new Persona();
        p.nombre = "Alfonso"; // No podemos utilizar el atributo 'nombre', ya que no es 'public'
        System.out.println(p.nombre);
        p.apellido = "Perez";
        System.out.println(p.apellido);

        Gato g = new Gato(); // No podemos acceder a la clase 'Gato', ya no es 'public'.

        Perro perro = new Perro();
    }
}
// Alfonso