/*  ======================================================
    ========= CREANDO NUESTRA PRIMERA APLICACION =========
    ======================================================

    Vamos a crear este 'método principal' o 'main' que hace que una clase de JAVA sea una aplicación. Es decir, 
    que cuando se ejecute, de forma automática la máquina virtual de JAVA invoque este método main o 
    principal y se ejecuten todas las tareas, todos los procesos, los objetos, instancias, nuestra aplicación 
    que tengamos dentro de este método. Es el pustra, el arranque o puerta de entrada de nuestra aplicación.
    
    Para el 'Hola Mundo' y para cualquier cosa que hagamos en Java como aplicación de escritorio o como 
    aplicación de consola, necesitamos implementar el main (main o método principal).

    Primero tiene que ser un método “public” o público y además estático (“static”). Bueno, son palabras clave 
    de Java, al igual que “class” son reservadas del lenguaje. Bueno, 'public' es un modificador de acceso que 
    indica que este método o esta clase se puede llamar (ejecutar) desde cualquier parte de la aplicación.
  */
    package directorio.subdirectorio;
    
    public class Clase {
        public static void main(String[] args) {} /* ----> Luego, las llaves del método. Las llaves en Java limitan */
    }                                             /*       el contexto o el alcance. En este caso del método, y el 
                                                           caso de la clase es el cuerpo de clase, es el contexto o
                                                           el alcance de una clase.                                 


    public static void 
    -------------------
    Significa el tipo de retorno. Este método no retorna nada, es vacío. Es un método que no devuelve ningún valor. 
    Solamente ejecuta un proceso, alguna tarea.

    public static void main( )
    -------------------------- 
    Este método recibe argumentos o parámetros del tipo arreglo de string o cadena. */

    package directorio.subdirectorio;

    public class Clase {
        public static void main(String[] args) {
            System.out.println("Hola Mundo desde Java"); /* ----> Y recuerden, el out es una instancia de PrintStream */
        }                                                /*       que es para imprimir en la consola. */ */
    }                

/*  Entonces tenemos entrada y salida de nuestro programa o aplicación. La entrada siempre son los parámetros 
    (argumentos). Pueden ser desde el método main como argumentos, estos argumentos podemos pasarlos mediante 
    terminal o la consola o alguna configuración en el arranque.

    También hay otra forma de pasar parámetros que después vamos a ver, parámetros del usuario o entrada. Y 
    tenemos la salida “Imprimir en la pantalla”. En este caso la pantalla sería el terminal o la consola y eso
    sería todo.

/*                                      =============================

    Es requisito que el método main sea público, estático y void. Tiene que tener esa estructura. Hay dos atajos 
    para crear esta estructura:

        1.	Escribiendo 'main' y luego dando click a la opción que nos entrega el editor.
        2.	La otra forma es escribir 'psvm'.