package ejemplo.test;

// La Clase 'Persona' se encuentra en otro paquete, por tanto, debemos importarla
import ejemplo.dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Alfonso", 5000.00, false);

        System.out.println("'persona1': " + persona1.toString());

        // Ahora que creamos el metodo 'toString' no es necesario llamarlo, el compilador
        // lo hace de manera automatica
        System.out.println("'persona1': " + persona1);

        persona1.setNombre("Tomas");

        System.out.println("'persona1': " + persona1);

    }  
}
/* 
'persona1': Persona [nombre: Alfonso, sueldo: 5000.0, eliminado: false]
'persona1': Persona [nombre: Alfonso, sueldo: 5000.0, eliminado: false]
'persona1': Persona [nombre: Tomas, sueldo: 5000.0, eliminado: false]  
*/