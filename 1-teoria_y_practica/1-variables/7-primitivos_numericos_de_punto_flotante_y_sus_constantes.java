/*  =======================================================
    PRIMITIVOS NUMERICOS DE PUNTO FLOTANTE Y SUS CONSTANTES
    =======================================================

    Si se fijan acá no marca error, siendo que ni siquiera le pusimos la letra "d", porque podemos 
    colocar la de "d" minúscula o mayúscula tal como pusimos en el float la letra "f" para indicar 
    de que la literal es un flotante. Pero acá no es necesario, ya que cuando se indica el punto 
    automáticamente la literal toma el tipo o el valor como un 'double'. Entonces por defecto es 
    'double'.

    Es mejor omitir la letra "d".


    double
    ======
*/
    public class PrimitivosFloat {
        public static void main(String[] args) {

            // Recordar que el rango de un float es desde -1.4E-45 a 3.4028235E38
            double realDouble = 3.4028235E39;
            System.out.println("realDouble = " + realDouble);
            System.out.println("double corresponde en byte a = " + Double.BYTES);
            System.out.println("double corresponde en bites a = " + Double.SIZE);
            System.out.println("máximo valor para double = " + Double.MAX_VALUE);
            System.out.println("mínimo valor para double = " + Double.MIN_VALUE);
        }
    }
/* Esto nos devuelve:

realDouble = 3.4028235E39
double corresponde en byte a = 8
double corresponde en bites a = 64
máximo valor para double = 1.7976931348623157E308
mínimo valor para double = 4.9E-324


                                ====================================

    Cambiando de tema, también lo quería revisar en esta clase, que creo que bien importante es sobre los 
    valores por defecto de los primitivos. En este caso del float y del double, y en general, en cualquier 
    tipo numérico, ya sea enteros, byte, short, int y long. Siempre por defecto es cero. En el tipo flotante 
    es 0.0, en ambos, en el float y en el double. 

    El float de la imagen no tiene valor, pero al querer devolver su valor se genera un error. Entonces, me 
    van a preguntar, ¿cómo y dónde se encuentra este valor por defecto? Si está dando error, se aplica 
    solamente a atributos o variables de la clase, independiente si es estática, es decir, propia de la 
    clase (concepto que vamos a ver después). Por ahora no nos preocupemos por eso. Entonces, cuando se 
    declara una variable de la clase y no se asigna valor, por defecto, queda en 0. Pero esto no se aplica a 
    la variable del método, variable local, por ejemplo, del método main.

    Ejemplo erróneo:
*/
    public class PrimitivosFloat {
        public static void main(String[] args) {

            double realDouble = 3.4028235E39;
            System.out.println("realDouble = " + realDouble);
            System.out.println("double corresponde en byte a = " + Double.BYTES);
            System.out.println("double corresponde en bites a = " + Double.SIZE);
            System.out.println("máximo valor para double = " + Double.MAX_VALUE);
            System.out.println("mínimo valor para double = " + Double.MIN_VALUE);

            float numberFloat;
            System.out.println("numberFloat = " + numberFloat); // Se genera un error al llamar a 'numberFloat'
        }
    }
/*

    Acá no se aplica. Cuando es local, el método se tiene que inicializar siempre, siempre con igual, por 
    ejemplo 0.0, que sería el valor por defecto, pero en el caso del float con f.
 */
    public class PrimitivosFloat {
        public static void main(String[] args) {

            double realDouble = 3.4028235E39;
            System.out.println("realDouble = " + realDouble);
            System.out.println("double corresponde en byte a = " + Double.BYTES);
            System.out.println("double corresponde en bites a = " + Double.SIZE);
            System.out.println("máximo valor para double = " + Double.MAX_VALUE);
            System.out.println("mínimo valor para double = " + Double.MIN_VALUE);

            float numberFloat = 0.0f;
            System.out.println("numberFloat = " + numberFloat);
        }
    }
/*
    Aunque me estoy adelantando demasiado, pero solamente para que visualicen, solamente lo voy a declarar, 
    pero obviamente no como local, no como atributo local, sino como atributo de la clase. 

    Esto sería un atributo variable de la clase que hace referencia a la instancia, (un tema que vamos a ver 
    después) pero está fuera del contexto o del alcance de un método estático. 

    Entonces, para qué se puede utilizar un atributo o variables de la clase dentro de un método estático? 
    Este atributo tiene que ser también estático. Estás dentro del mismo contexto. Entonces para este caso 
    lo voy a dejar en “static”, solamente para que lo podamos visualizar, ver este valor por defecto.
*/
    public class PrimitivosFloat {

        float numberFloat; // <-------------------
        public static void main(String[] args) {

            double realDouble = 3.4028235E39;
            System.out.println("realDouble = " + realDouble);
            System.out.println("double corresponde en byte a = " + Double.BYTES);
            System.out.println("double corresponde en bites a = " + Double.SIZE);
            System.out.println("máximo valor para double = " + Double.MAX_VALUE);
            System.out.println("mínimo valor para double = " + Double.MIN_VALUE);

            //float numberFloat = 0.0f;
            System.out.println("numberFloat = " + numberFloat); // Se genera un error al llamar a 'numberFloat'
        }
    }
/*

    Utilizando static, vemos que se puede utilizar la variable dentro del método main, que antes nos 
    arrojaba un error:
*/
    public class PrimitivosFloat {

        static float numberFloat; // <-------------------
        public static void main(String[] args) {

            double realDouble = 3.4028235E39;
            System.out.println("realDouble = " + realDouble);
            System.out.println("double corresponde en byte a = " + Double.BYTES);
            System.out.println("double corresponde en bites a = " + Double.SIZE);
            System.out.println("máximo valor para double = " + Double.MAX_VALUE);
            System.out.println("mínimo valor para double = " + Double.MIN_VALUE);

            //float numberFloat = 0.0f;
            System.out.println("numberFloat = " + numberFloat);
        }
    }
/* Esto nos devuelve:

realDouble = 3.4028235E39
double corresponde en byte a = 8
double corresponde en bites a = 64
máximo valor para double = 1.7976931348623157E308
mínimo valor para double = 4.9E-324
numberFloat = 0.0


    Ahora si cambiamos su valor y ejecutamos:
*/
    public class PrimitivosFloat {

        static float numberFloat = 45.45f; // <-------------------
        public static void main(String[] args) {

            double realDouble = 3.4028235E39;
            System.out.println("realDouble = " + realDouble);
            System.out.println("double corresponde en byte a = " + Double.BYTES);
            System.out.println("double corresponde en bites a = " + Double.SIZE);
            System.out.println("máximo valor para double = " + Double.MAX_VALUE);
            System.out.println("mínimo valor para double = " + Double.MIN_VALUE);

            //float numberFloat = 0.0f;
            System.out.println("numberFloat = " + numberFloat);
        }
    }
/* Esto nos devuelve:

realDouble = 3.4028235E39
double corresponde en byte a = 8
double corresponde en bites a = 64
máximo valor para double = 1.7976931348623157E308
mínimo valor para double = 4.9E-324
numberFloat = 45.45

 */