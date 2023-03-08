/*  ======================================================
    ==== INTRODUCCION A LOS BLOQUES DE INICIALIZACION ====
    ======================================================

    Existen 2 tipos de bloques de inicialización: 'Bloques de código de inicialización estáticos' y 
    'Bloques de inicialización no estáticos'. Ambos bloques se van a ejecutar antes del constructor, 
    así que es importante que sepamos que existen ese tipo de bloques y que se mandan a llamar antes 
    del constructor de nuestra clase.

*/
package dominio;

public class Persona{

    private final int idPersona;
    private static int contadorPersonas;

/*  En primer lugar vamos a definir un bloque de inicialización estático. Utilizamos la palabra 
    reservada static y no tenemos que definir nada más, simplemente agregar el cuerpo de este bloque 
    de código. Así que a esto se le conoce como un bloque de código de inicialización, pero estático, 
    así que este bloque de código estático se va a ejecutar antes del constructor y también antes de 
    cualquier bloque de inicialización no estático. Por lo tanto, este bloque se ejecuta cuando se carga 
    esta clase en memoria.      */

    static {
        System.out.println("Ejecucion Bloque estatico");

/*      Dentro de este bloque de inicialización podemos aprovechar para inicializar nuestras variables, 
        pero solamente las variables 'estáticas'. Recordemos que dentro de un bloque estático y de igual 
        manera dentro de los métodos estáticos, no podemos utilizar por ejemplo el operador 'this', así que 
        en este caso no tenemos acceso a este operador, ya que estamos en el contexto estático. Así que 
        solamente podemos acceder a nuestra variable 'contadorPersonas' utilizando el nombre de nuestra clase 
        y posteriormente accediendo a la variable 'contadorPersonas', ya que, esta variable es estática.        */
        
        ++Persona.contadorPersonas;
    }

/*  Como siguiente paso vamos a agregar un bloque de inicialización no estático. Para ello, simplemente 
    abrimos y cerramos llaves y esto es un bloque de inicialización no estático y lo importante es que este 
    bloque de inicialización se ejecuta antes del constructor de nuestra clase. Así que si ven un bloque de 
    inicialización de este tipo, entonces deben de saber qué se ejecuta antes del constructor de nuestra clase.
    Vamos a mandar un mensaje a consola para saber en qué momento exactamente se ejecuta este bloque ejecución.     */

    {
        System.out.println("Ejecucion Bloque no estatico");

/*      Y aqui ya podemos inicializar los atributos de nuestra clase que no sean estaticos. Y aqui ya tenemos
        acceso al operador 'this'. Asi que ya tenemos acceso al atributo no estatico 'idPersona' y debido que
        la variable 'contadorPersonas' ya se incrementó, simplemente podemos asignarle el valor 'contadorPersonas'.     */

        //this.idPersona = Persona.contadorPersonas;
    

/*  El Bloque de codigo NO estatico se va a ejecutar cada vez que creemos un Objeto de nuestra Clase, a diferencia 
    del Bloque de codigo estatico que solamente se va a ejecutar la primera vez que se carga en memoria la Clase 
    'Persona', es decir, se va a ejecutar solamente una vez.

    Por lo tanto, si queremos que al atributo 'idPersona' se le asigne un valor unico, entonces tenemos que volver
    a incrementar la variable 'contadorPersonas'. La primera vez que utilizamos esta variable, ya estaba incrementada,
    debido a la linea de codigo que colocamos en el Bloque estatico, por tanto, 'idPersona' comenzara en 1. Y al
    utilizar un 'postIncremento', la proxima vez que se inicialice la variable 'idPersona' tomará el valor de 2. Y asi
    sucesivamente.      */

        this.idPersona = Persona.contadorPersonas++;
    }


    public Persona() {
        System.out.println("Ejecucion del constructor");
    }


    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString(){
        return "Persona{" + "idPersona: " + idPersona + "}";
    }

}