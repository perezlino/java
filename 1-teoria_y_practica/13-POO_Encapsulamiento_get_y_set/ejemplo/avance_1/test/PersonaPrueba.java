package ejemplo.test;

// La Clase 'Persona' se encuentra en otro paquete, por tanto, debemos importarla
import ejemplo.dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Alfonso", 5000.00, false);

        // No podemos acceder a los atributos de la Clase 'Persona' dado que se encuentran
        // como 'privados'. Por tanto, para acceder a ellos debemos utilizar los metodos que
        // creamos, 'get' y 'set'.
         persona1.setNombre("Tomas");
         System.out.println("'persona1' nombre con cambio: " + persona1.getNombre());
         System.out.println("'persona1' sueldo: " + persona1.getSueldo());
         System.out.println("'persona1' eliminado: " + persona1.isEliminado());
    }  
}
/* 
'persona1' nombre con cambio: Tomas
'persona1' sueldo: 5000.0  
'persona1' eliminado: false 
*/