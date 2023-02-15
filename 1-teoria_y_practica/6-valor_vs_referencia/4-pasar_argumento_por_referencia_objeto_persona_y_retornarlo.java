/*  ============================================================================
    ==== PASAR ARGUMENTO POR REFERENCIA OBJETO PERSONA Y RETORNARLO (RETURN) ===
    ============================================================================

    FORMA 1
    =======
*/
class Persona {

    // Atributo de la clase
    private String nombre;

    // Metodo de la clase
    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    // Metodo de la clase
    public String leerNombre(){
        return this.nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.modificarNombre("Alfonso");

        System.out.println("iniciamos el método main");

        System.out.println("persona1.nombre = " + persona1.leerNombre());
        System.out.println("Antes de llamar al método test");
        System.out.println("================================");
/* 
        iniciamos el método main
        persona1.nombre = Alfonso
        Antes de llamar al método test
        ================================ 

        - Llamamos al metodo 'test' y como argumento le entregamos un 'objeto' de la Clase 'persona1'
        - En este caso le entregamos el Objeto que acabamos de crear, 'persona1'.
        - Dado que el metodo 'main' es 'estatico' solo puede llamar a otros metodos que sean 'estaticos'.
*/
        test(persona1);
        System.out.println("Después de llamar al método test");
        System.out.println("================================");
/* 
        Iniciamos el método test
        Finaliza el método test
        Después de llamar al método test
        ================================ 
*/

        System.out.println("persona1.nombre = " + persona1.leerNombre());
        System.out.println("Finaliza el método main con los datos de la persona1 modificados!");
    }
/* 
        persona1.nombre = Pepe
        Finaliza el método main con los datos de la persona1 modificados! 

        -----------------------------------------------------------------------------------------
     ____________________________________________________________________________________________________________
    |                                                                                                            |                       
    |    NOTAR NO UTILIZAMOS 'void', en su defecto, usamos la clase 'Persona'. De esta manera podemos retornar   |
    |    un valor, utilizando 'return'. Obtenemos el mismo resultado que en el punto 3.-                                                                         |   
    |____________________________________________________________________________________________________________|
*/              
    public static Persona test(Persona persona){
        System.out.println("Iniciamos el método test");
        persona.modificarNombre("Pepe");
        return persona;
    }
}

/*

    FORMA 2
    =======
*/
class Persona {

    // Atributo de la clase
    private String nombre;

    // Metodo de la clase
    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    // Metodo de la clase
    public String leerNombre(){
        return this.nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.modificarNombre("Alfonso");

        System.out.println("iniciamos el método main");

        System.out.println("persona1.nombre = " + persona1.leerNombre());
        System.out.println("Antes de llamar al método test");
        System.out.println("================================");
/* 
        iniciamos el método main
        persona1.nombre = Alfonso
        Antes de llamar al método test
        ================================ 

        - Llamamos al metodo 'test' y como argumento le entregamos un 'objeto' de la Clase 'persona1'
        - En este caso le entregamos el Objeto que acabamos de crear, 'persona1'.
        - Dado que el metodo 'main' es 'estatico' solo puede llamar a otros metodos que sean 'estaticos'.
*/      
        //------------------------------------------------------------------------------------------------------
        //MODIFICAMOS
        persona1 = test(persona1); // <=================================== Igualamos 'persona1' al valor
        System.out.println("Después de llamar al método test"); //         retornado por el metodo test(persona1).        
        System.out.println("================================"); //         Esto lo podemos hacer dado que este
/*                                                              //         metodo nos "retorna" un valor.
        Iniciamos el método test
        Finaliza el método test
        Después de llamar al método test
        ================================ 
        //------------------------------------------------------------------------------------------------------
*/

        System.out.println("persona1.nombre = " + persona1.leerNombre());
        System.out.println("Finaliza el método main con los datos de la persona1 modificados!");
    }
/* 
        persona1.nombre = Pepe
        Finaliza el método main con los datos de la persona1 modificados! 

        -----------------------------------------------------------------------------------------
     ____________________________________________________________________________________________________________
    |                                                                                                            |                       
    |    NOTAR NO UTILIZAMOS 'void', en su defecto, usamos la clase 'Persona'. De esta manera podemos retornar   |
    |    un valor, utilizando 'return'. Obtenemos el mismo resultado que en el punto 3.-                                                                         |   
    |____________________________________________________________________________________________________________|
*/              
    public static Persona test(Persona persona){
        System.out.println("Iniciamos el método test");
        persona.modificarNombre("Pepe");
        return persona;
    }
}
/*

    FORMA 3
    =======
*/
class Persona {

    // Atributo de la clase
    private String nombre;

    // Metodo de la clase
    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    // Metodo de la clase
    public String leerNombre(){
        return this.nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.modificarNombre("Alfonso");

        System.out.println("iniciamos el método main");

        System.out.println("persona1.nombre = " + persona1.leerNombre());
        System.out.println("Antes de llamar al método test");
        System.out.println("================================");
    /* 
        iniciamos el método main
        persona1.nombre = Alfonso
        Antes de llamar al método test
        ================================ 

        - Llamamos al metodo 'test' y como argumento le entregamos un 'objeto' de la Clase 'persona1'
        - En este caso le entregamos el Objeto que acabamos de crear, 'persona1'.
        - Dado que el metodo 'main' es 'estatico' solo puede llamar a otros metodos que sean 'estaticos'.
    */
        persona1 = test(persona1);
        System.out.println("Después de llamar al método test");
        System.out.println("================================");
    /* 
        Iniciamos el método test
        Finaliza el método test
        Después de llamar al método test
        ================================ 
    */

        System.out.println("persona1.nombre = " + persona1.leerNombre());
        System.out.println("Finaliza el método main con los datos de la persona1 modificados!");
    }
    /* 
        persona1.nombre = Pepe
        Finaliza el método main con los datos de la persona1 modificados! 

        -----------------------------------------------------------------------------------------
    ____________________________________________________________________________________________________________
    |                                                                                                            |                       
    |    NOTAR NO UTILIZAMOS 'void', en su defecto, usamos la clase 'Persona'. De esta manera podemos retornar   |
    |    un valor, utilizando 'return'. Obtenemos el mismo resultado que en el punto 3.-                                                                         |   
    |____________________________________________________________________________________________________________|
    */              
    public static Persona test(Persona persona){
        System.out.println("Iniciamos el método test");
        persona.nombre = "Pepe";
        return persona;
    }
}
