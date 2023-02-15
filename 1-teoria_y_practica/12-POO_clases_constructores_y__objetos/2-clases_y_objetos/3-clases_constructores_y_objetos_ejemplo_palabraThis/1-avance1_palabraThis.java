package directorio;

public class palabraThis {

    public static void main(String[] args) {

        // Dado que se creo en la clase 'Persona' un constructor con argumentos, de manera
        // obligatoria, debemos inicializar el objeto con argumentos
        Persona persona = new Persona("Alfonso","Perez");
        System.out.println("persona.nombre = " + persona.nombre);
        System.out.println("persona.apellido = " + persona.apellido);
    }
/* 
        persona.nombre = Alfonso
        persona.apellido = Perez
*/    
}

/*  En JAVA en un archivo solo podemos tener una sola Clase que es del tipo 'public'. A todas las
    demas clases ya no se les va a agregar el modificador de acceso 'public', ya que, solo se van
    a poder utilizar solo dentro de la clase 'public' o dentro del paquete al cual pertenecen. A
    estas clases se les conoce como Clases 'Default'. Entonces, solamente se podrá acceder a este 
    tipo de clase dentro de aquellas clases que esten dentro del mismo package, pero no fuera. */

class Persona {

    String nombre;
    String apellido;
}

    // Creamos un constructor con argumentos para la Clase 'Persona'
    // Vemos que tampoco le agregamos el modificador 'public'.
    // Este constructor lo podemos usar solamente en clases que esten definidas dentro del mismo 
    // paquete en el cual fue creado y no fuera de este.
    Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
