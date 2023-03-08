package directorio;

public class PersonaPrueba {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Alfonso",6000.00,true);
        Persona persona2 = new Persona("Tomas",4000.00,false);

        imprimir(persona1);
        imprimir(persona2);
    }
    
    // En este caso, dado que estamos dentro del metodo 'main' y es un metodo estatico, si
    // queremos llamar a otro metodo dentro de este metodo 'main', entonces, ese otro 
    // metodo tiene que ser 'estatico'.

    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
}
/* 
persona = Persona [nombre: Alfonso, sueldo: 6000.0, eliminado: true] 
persona = Persona [nombre: Tomas, sueldo: 4000.0, eliminado: false]
*/     

/* --------------------------------------------------------------------------------------------------------

Un detalle es que no podemos utilizar la palabra reservada 'this' dentro de un "Metodo estatico". Así 
que por ejemplo, si en este caso queremos utilizar 'this':

                        package directorio;

                        public class PersonaPrueba {

                            public static void main(String[] args) {
                                
                                Persona persona1 = new Persona("Alfonso",6000.00,true);
                                Persona persona2 = new Persona("Tomas",4000.00,false);

                                this.imprimir(persona1); <===============
                                this.imprimir(persona2); <===============
                            }


podemos observar que nos manda un error indicando que en la variable 'this' no puede ser referenciada 
dentro de un "Contexto estatico" y esto se debe a lo mismo que hemos platicado, el "Contexto estatico" 
hemos dicho que no puede acceder al "Contexto dinamico", debido a que el "Contexto estatico" se 
relaciona con las Clases y todavía no hemos creado Objetos. Así que el "Contexto estatico" no puede 
acceder al "Contexto dinamico" y el "Contexto dinamico" tiene que ver con los Objetos y por lo tanto el 
operador 'this tiene que ver con el "Contexto dinamico", es decir, cuando ya creamos Objetos. Por lo tanto, 
el "Contexto dinamico" sí puede acceder al "Contexto estatico", pero el "Contexto estatico" no puede 
acceder al "Contexto dinamico". Por ello es que dentro de un método que tenga la palabra 'static' no 
podemos utilizar el operador 'this', ya que, el "Contexto estatico" no puede acceder al "Contexto dinamico". 
Pero si estamos en un método que no tenga la palabra 'static', entonces, sí podemos acceder a metodos
estaticos. Vamos a ver cómo es esto:

*/
public class PersonaPrueba {

    private int contador; // <============== Creamos un atributo

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Alfonso",6000.00,true);
        Persona persona2 = new Persona("Tomas",4000.00,false);

        imprimir(persona1);
        imprimir(persona2);

        // Estos atributos no pueden ser referenciados desde un Metodo Estatico

        // this.contador = 10;
        // contador = 10;
    }
    
    // En este caso, dado que estamos dentro del metodo 'main' y es un metodo estatico, si
    // queremos llamar a otro metodo dentro de este metodo 'main', entonces, ese otro 
    // metodo tiene que ser 'estatico'.

    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }

    // Pero si podemos referenciar ese atributo desde un "Metodo no estatico"

    /* Por otro lado, podemos llamar a un metodo estatico, desde el metodo getContador, dado que
       corresponde al "Contexto dinamico", debido a que no tiene la palabra reservada 'static',
       por lo tanto, es un "Metodo dinamico" o asociado con nuestros Objetos. Y este contexto,
       SI puede acceder a los metodos o atributos estaticos de nuestra Clase. Por lo tanto, 
       podemos acceder al metodo 'imprimir'. */

    public int getContador(){
        imprimir(new Persona("Carlos",3500.00,true));
        return this.contador;
    }
}
