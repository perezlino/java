package test;

import dominio.Persona3;

public class TestFinal {

    public static void main(String[] args) {
        
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);

        // Vamos a intentar modificar el valor de la variable 'miVariable'
        miVariable = 5; // <=================== Se genera un ERROR

        //============================================================================

        // Llamamos para imprimir la variable constante que se encuentra
        // en la Clase  'Persona3'
        System.out.println("Constante = " + Persona3.MI_CONSTANTE);

        // Esta variable constante no podemos modificarla, dado que, fue
        // creada como 'final'
        Persona.MI_CONSTANTE = 40; // <===== Se genera un ERROR

        //============================================================================

        // Ahora si creamos un nuevo Objeto 'final' de la Clase 'Persona3'
        final Persona3 persona = new Persona3();
        persona = new Persona3(); // Nos devuelve un Error. Lo que sucede es que nosotros creamos 
                                  // una variable llamada 'persona' del tipo 'Persona3' y que es 'final'.
                                  // Y esta variable esta apuntando a un Objeto que se creo en la direccion
                                  // de memoria 'new Persona3()' y debido a que es 'final' ya no podemos
                                  // cambiar esta referencia. Asi que si queremos asignarle una nueva referencia
                                  // de otro Objeto, esto ya no va a ser posible.   

        // Lo que si podemos modificar es el contenido del Objeto al cual apunta la variable 'persona'.
        persona.setNombre("Alfonso");
        System.out.println("'persona' nombre" + persona.getNombre());
    }
    
}
