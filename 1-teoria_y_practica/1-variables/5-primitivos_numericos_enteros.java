/*  ======================================================
    ============ PRIMITIVOS NUMERICOS ENTEROS ============
    ======================================================

    Ya se ha hablado sobre los primitivos y no son objetos, tampoco instancias. Es un tipo de dato que 
    representa un valor. Recuerden que en Java hay dos tipos o dos categorías de tipo dato: los 
    primitivos son solamente valor y los de referencia, que son los objetos y los objetos son una 
    instancia de una clase.


    byte
    ====
*/
    public class PrimitivosEnteros {
        public static void main(String[] args) {

            // Recordar que el rango de un byte es desde -128 a 127
            byte numeroByte = 127;
            System.out.println("numeroByte = " + numeroByte);
            System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
            System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
            System.out.println("valor máximo de un byte: " + Byte.MAX_VALUE);
            System.out.println("valor mínimo de un byte: " + Byte.MIN_VALUE);

        }
    }
/* Esto nos devuelve:

numeroByte = 127
tipo byte corresponde en byte a 1
tipo byte corresponde en bites a 8
valor máximo de un byte: 127
valor mínimo de un byte: -128



    short
    =====
*/

    public class PrimitivosEnteros {
        public static void main(String[] args) {

            // Recordar que el rango de un short es desde -32768 a 32767
            short numeroShort = 32767;
            System.out.println("numeroShort = " + numeroShort);
            System.out.println("tipo short corresponde en byte a " + Short.BYTES);
            System.out.println("tipo short corresponde en bites a " + Short.SIZE);
            System.out.println("valor máximo de un short: " + Short.MAX_VALUE);
            System.out.println("valor mínimo de un short: " + Short.MIN_VALUE);

        }
    }
/* Esto nos devuelve:

numeroShort = 32767
tipo short corresponde en byte a 2
tipo short corresponde en bites a 16
valor máximo de un short: 32767
valor mínimo de un short: -32768



    int
    ===
*/

public class PrimitivosEnteros {
    public static void main(String[] args) {

        // Recordar que el rango de un int es desde -2147483648 a 2147483647
        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("valor máximo de un int: " + Integer.MAX_VALUE); 
        System.out.println("valor mínimo de un int: " + Integer.MIN_VALUE);

    }
}
/* Esto nos devuelve:

numeroInt = 2147483647
tipo int corresponde en byte a 4
tipo int corresponde en bites a 32
valor máximo de un int: 2147483647
valor mínimo de un int: -2147483648




    long
    ====

    Tenemos que indicar con una letra “L” al final del número, que este no es un entero sino un tipo 
    de dato long. Lo que hacemos es convertir la literal (que por defecto es entero), la convertimos 
    a un tipo long.
*/

public class PrimitivosEnteros {
    public static void main(String[] args) {

        // Recordar que el rango de un long es desde -9223372036854775808 a 9223372036854775807
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("valor mínimo de un long: " + Long.MIN_VALUE);

    }
}
/* Esto nos devuelve:

numeroLong = 9223372036854775807
tipo long corresponde en byte a 8
tipo long corresponde en bites a 64
valor máximo de un long: 9223372036854775807
valor mínimo de un long: -9223372036854775808



    var
    ===

    Siempre var, cuando se defina un valor en la literal que sea numérica, va a ser un entero por defecto, 
    exceptuando que el número pase el límite permitido de este. En ese caso, debemos indicar con la 
    letra “L” al final del número para que tome el valor del tipo long.
*/

public class PrimitivosEnteros {
    public static void main(String[] args) {

        var numeroVar = 2147483648L; 
        System.out.println("numeroVar = " + numeroVar);

    }
}
/* Esto nos devuelve:

numeroVar = 2147483648

*/