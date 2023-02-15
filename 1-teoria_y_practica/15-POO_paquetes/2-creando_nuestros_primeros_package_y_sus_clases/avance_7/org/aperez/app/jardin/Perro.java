package org.aperez.app.jardin;

import org.aperez.app.hogar.Persona;

public class Perro {
    
    String nombre;
    String raza;

/*  Pero el perro va a tener otro método que es para que interactúe y juegue con el dueño. Por lo 
    tanto va a haber una relación de dependencia. Es decir, el perro en este método, va a recibir 
    una instancia de Persona para que la persona le lance la pelota y el perro como reacción, vaya 
    a ir a buscar la pelota. Pero ojo, no puede ser 'public'. La idea es que el perro solamente 
    juegue en su contexto en el jardín y no dentro de la casa. Entonces no puede ser 'public', tiene 
    que ser 'default'.
*/
    String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}