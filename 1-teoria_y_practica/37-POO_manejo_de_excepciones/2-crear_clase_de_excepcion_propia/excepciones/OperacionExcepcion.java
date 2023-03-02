package excepciones;

/*  Para que el compilador de Java tome nuestra Clase como una Clase de Excepcion, entonces tiene
    que extender de alguna de als Clases de Excepcion definidas en el API de Java. Por ejemplo,
    puede ser 'Exception' o 'RuntimeException'. Ya hemos comentado, que si heredamos de 'Exception'
    el compilador nos obligara a procesar la Excepcion, ya que, se conocen del tipo 'CheckedException'.
    Y si heredamos de la Clase 'RuntimeException' entonces el compilador no nos va a obligar esta Excepcion.

    Posteriormente, lo que normalmente se hace cuando heredamos de la Clase Exception, es que mandamos 
    un mensaje, pero este mensaje lo debemos de propagar hacia la Clase padre, hacia la Clase de Exception, 
    por lo tanto, vamos a agregar un constructor: OperacionExcepcion y este constructor lo que va a recibir 
    es un String, dónde vamos a indicar cuál es el mensaje de la excepción. Y para poder inicializar 
    correctamente la Clase de Excepción, entonces, propagamos este mensaje hacia la Clase padre, por lo tanto, 
    utilizamos super y pasamos el mensaje. Con eso es suficiente para que definamos nuestra propia Clase de 
    Excepción. Podemos observar que es muy sencillo simplemente hacemos extends, recibimos un mensaje y lo 
    propagamos hacia la Clase padre y aunque es poco código tenemos que hacerlo de esta manera para que podamos 
    trabajar con nuestros propios tipos de excepción.       */

public class OperacionExcepcion extends Exception{

    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}