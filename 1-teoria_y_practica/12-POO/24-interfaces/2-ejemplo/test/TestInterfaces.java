package test;

// Al poner .* también importa tanto a los tipos Interface, como a los tipos Clase, es la misma sintaxis
import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {

    // IAccesoDatos datos = new IAccesoDatos()  <----- No podemos instanciar Objetos de una Interface

    /*  Entonces, ¿Cómo podemos empezar a trabajar con los métodos definidos en la Interface? Para ello 
        tenemos que tomar una implementación y por ello fue que realizamos 2 implementaciones para que 
        quede claro cómo podemos reutilizar código cuando estamos trabajando con Interfaces. Es como si 
        tuviéramos una Clase padre y 2 Clases hijas, sin embargo, recordemos que cuando trabajamos con 
        Clases, lo que abstraemos son características en común y en este caso lo que estamos abstrayendo 
        es comportamiento en común, más bien funcionalidad y no características. Por ello en este caso, 
        no es conveniente utilizar una Clase abstracta, de hecho no tendría mucho sentido, ya que, no 
        tenemos características en común, sino, tenemos comportamiento en común y cuando tenemos 
        comportamiento en común lo mejor es utilizar una Interface. Así que, esto podríamos decir que la 
        Interface IAccesoDatos es como si fuera una Clase padre, pero realmente es un tipo Interface, donde 
        abstraemos el comportamiento y posteriormente tenemos Clases que implementan ese comportamiento. 
        Así que para ello, es que ya no vamos a utilizar el tipo Interface para crear Objetos, ya que, no 
        se puede, sino que, vamos a crear Objetos de las Clases que implementan el comportamiento de las 
        Interfaces. Así que vamos a crear un Objeto de la implementación de MySql (ImplementacionMySql).    */

        IAccesoDatos datos = new ImplementacionMySql();

    /*  Posteriormente con la variable de datos vamos a aplicar 'polimorfismo', ya que, recordemos que el 
        'polimorfismo', por ejemplo, en este caso si mandamos a llamar el método 'listar', si damos CTRL + clic 
        sobre este método, nos lleva a la Interface, pero este método no tiene ninguna implementación, así 
        que realmente en tiempo de ejecución no es que se vaya a ejecutar este método. Así que recordemos cuál 
        es el método que se va a ejecutar sí tenemos métodos en común entre la Clase que implementa la Interface 
        y nuestro tipo Interface, entonces, el método que se va a ejecutar es el del Objeto al cual está 
        apuntando esta Interface (ImplementacionMySql), ya que tienen los métodos en común. Ell método de 'listar' 
        en la Clase y el método 'listar' en la Interface. Así que, el que toma prioridad es el método de nuestra 
        Clase, la Clase que implementa la Interface, es decir la Clase ImplementacionMySql.   */        

        //datos.listar(); // Listar desde Mysql

        //imprimir(datos); // Listar desde Mysql
        
        datos = new ImplementacionOracle();

        //datos.listar(); // Listar desde Oracle
        imprimir(datos);  // Listar desde Oracle
    }
    
    // Tambien podemos crear un método llamado 'imprimir' 'public' y 'static', debido a que estamos dentro del 
    // método 'main', entonces este método también va a ser 'estático'.
    
    // Este método, es un método genérico que recibe un tipo Interface y ese tipo de Interface puede apuntar a 
    // referencias, tanto de ImplementacionMySql, como ImplementacionOracle.

    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}