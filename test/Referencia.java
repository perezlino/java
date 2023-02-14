package test;

public class Referencia {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Alfonso");

        System.out.println("iniciamos el método main");

        System.out.println("persona.nombre = " + persona.leerNombre());
        System.out.println("Antes de llamar al método test");
        System.out.println("================================");
/* 
        iniciamos el método main
        persona.nombre = Alfonso
        Antes de llamar al método test
        ================================ 
*/

        test(persona);
        System.out.println("Después de llamar al método test");
        System.out.println("================================");


        
        System.out.println("persona.nombre = " + persona.leerNombre());
        System.out.println("Finaliza el método main con los datos de la persona modificados!");
    }

    public static void test(Persona ingresarpersona){
        System.out.println("Iniciamos el método test");
        ingresarpersona.modificarNombre("Pepe");
        System.out.println("Finaliza el método test");
    }
}
/* 


Iniciamos el método test
Finaliza el método test
Después de llamar al método test
================================
persona.nombre = Pepe
Finaliza el método main con los datos de la persona modificados! 

*/
