/*  ====================================================================
    ==== RETORNAR NULL CUANDO UNA VARIABLE NO APUNTA A NINGUN OBJETO ===
    ====================================================================
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
public class PasarPorReferencia {
    public static void main(String[] args) {

        Persona persona1 = null;

        persona1 = test(persona1); // Al ejecutarse el metodo, este retorna el valor 'null' y se lo
                                   // asigna a 'persona1', persona1 = null.

        // Es cuando se ejecuta esta linea se genera un error, pues 'persona1' no apunta a ningun objeto
        // por tanto, no puede llamar a ningun metodo de la Clase 'Persona'.
        System.out.println("persona1.nombre = " + persona1.leerNombre());

    }
       
    public static Persona test(Persona persona){
        if(persona == null){
            System.out.println("persona1 no apunta a ningun objeto !!!");
            return null;
        }
        persona.modificarNombre("Pepe");
        return persona;
    }
}
/* 
persona1 no apunta a ningun objeto !!!
Exception in thread "main" java.lang.NullPointerException
        at test.Referencia.main(Referencia.java:10) 
*/