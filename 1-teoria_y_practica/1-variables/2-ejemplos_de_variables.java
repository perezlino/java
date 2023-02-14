/*  ======================================================
    ================ EJEMPLOS DE VARIABLES ===============
    ======================================================

    Me podrían decir que acá estamos asignando un valor de forma directa en 'saludar', por lo tanto no 
    podría ser un objeto, porque un objeto es una instancia de una clase con el "operador new". Hay 
    excepciones en Java, hay clases como "String" y también la clase "Integer" (la clase, no el primitivo). 
    En la clase se pueden asignar valores tal cual, así como un cadena con doble comilla. En el caso de 
    un "Integer", un número, por ejemplo, 10 y JAVA por detrás de escena se encarga de crear esta instancia.
    Por debajo no se ve, pero sí por debajo se crea una instancia, una referencia de este objeto.   */

    package directorio.subdirectorio;

    public class Clase {
        public static void main(String[] args) {
            
            String saludar = "Hola Mundo desde Java";

            /* Se tiene un atajo utilizando 'sout' para obtener System.out.println(): */
            System.out.println(saludar);

            /* Y como sabemos que saludar es un objeto podemos utilizar métodos: */
            System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

            /* Con int, numero es un valor no tiene atributos ni métodos. */
            int numero = 11;
            System.out.println("numero = " + numero);

            /* Modificamos el valor de la variable 'numero'. */
            numero = 7;
            System.out.println("numero = " + numero);

            /* También puede declarar una variable sin asignar el valor y asignar el valor más adelante: */
            int miNumero;
            miNumero = 25;
            System.out.println("miNumero = " + miNumero);

            /* Tenga en cuenta que si asigna un nuevo valor a una variable existente, sobrescribirá el valor 
            anterior: */
            int miEdad = 36;
            miEdad = 46;
            System.out.println("miEdad = " + miEdad);

            /* También puede asignar el mismo valor a varias variables en una línea: */
            int x, y, z;
            x = y = z = 50;
            System.out.println("suma de variables" + x + y + z);            

            /* También existe var que es un tipo de variable dinámica. Identifica el tipo de dato de manera 
               automática: */
            var number = 10;
            System.out.println("(number + number) = " + (number+number));

            /* Yo puedo acá definir esta variable que exista en nuestro contexto, en nuestra aplicación y 
                después le asignó valor. Después le doy alguna instancia, algún objeto. */
            String nombre;
            nombre = "Alfonso";

            /* Ahora podemos hablar un poco de cómo actúan las variables declaradas en contextos superior e 
               inferior. Como pueden ver ahora utilizamos la variable primitiva "int" numero dentro de un
               condicional 'if', donde le indicamos que si la variable 'numero' es igual a 10, la variable referencial 
               "nombre" tome un nuevo valor, que vendría a ser Juan. En este caso, la variable referencial "nombre" 
               se encuentra en el contexto superior y la utilizamos en un contexto inferior, pero no puede ser 
               al revés. Es de la forma Padre-Hijo. */
            if(numero == 10){
                nombre = "Juan";
                System.out.println("nombre = " + nombre);
            }

            /* Si no desea que otros (o usted mismo) sobrescriban los valores existentes, use la palabra clave "final" 
               (esto declarará la variable como "final" o "constante", lo que significa inmutable y de solo lectura): */
               final int myNum = 15;
               myNum = 20;  // generará un error: no se puede asignar un valor a una variable final
        }

}
/* Esto nos devuelve:

Hola Mundo desde Java
saludar.toUpperCase() = HOLA MUNDO DESDE JAVA
numero = 11
miNumero = 25
miEdad = 46
(number + number) = 20
nombre = Juan

 */