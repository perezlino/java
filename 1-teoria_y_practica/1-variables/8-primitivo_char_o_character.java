/*  =======================================================
    ============= PRIMITIVOS CHAR O CHARACTER =============
    =======================================================

    El tipo char o carácter solamente es un solo carácter.


    char
    ====
*/
    public class PrimitivoCharacter {
        public static void main(String[] args) {

            char caracter = 'A';
            System.out.println("caracter = " + caracter);

        }
    }
/* Esto nos devuelve:

caracter = A


    Otro ejemplo:
*/
    public class PrimitivoCharacter {
        public static void main(String[] args) {

            char caracter = '6';
            System.out.println("caracter = " + caracter);

        }
    }
/* Esto nos devuelve:

caracter = 6


    Si pusiéramos el valor ‘10’ nos devuelve un error, dado que CHAR solo acepta un solo carácter:
*/
    public class PrimitivoCharacter {
        public static void main(String[] args) {

            char caracter = '10'; // Esta linea nos devueve un error
            System.out.println("caracter = " + caracter);

        }
    }
/*

    Para indicar un tipo de carácter UNICODE, podemos utilizar el “Mapa de caracteres” de Windows:
*/
    public class PrimitivoCharacter {
        public static void main(String[] args) {

            char caracter = '\u0040';
            System.out.println("caracter = " + caracter);

        }
    }
/* Esto nos devuelve:

caracter = @


    También podemos utilizar el número entero del HTML code (“decimal” le dicen en el curso), y
    podemos comprobar que carácter y decimal son iguales:
*/
    public class PrimitivoCharacter {
        public static void main(String[] args) {

            char caracter = '\u0040';
            char decimal = 64;
            System.out.println("caracter = " + caracter);
            System.out.println("decimal = " + decimal);
            System.out.println("decimal = caracter: " + (decimal == caracter));

        }
    }
/* Esto nos devuelve:

caracter = @
decimal = @
decimal = caracter: true


    También podemos copiar el símbolo y utilizarlo directamente en el valor de la variable:
*/
    public class PrimitivoCharacter {
        public static void main(String[] args) {

            char caracter = '\u0040';
            char decimal = 64;
            char simbolo = '@';
            System.out.println("caracter = " + caracter);
            System.out.println("decimal = " + decimal);
            System.out.println("decimal = caracter: " + (decimal == caracter));
            System.out.println("simbolo = " + simbolo);

        }
    }
/* Esto nos devuelve:

caracter = @
decimal = @
decimal = caracter: true
simbolo = @


    Si utilizamos un var, de forma automática el motor de JAVA detecta que la literal corresponde a un 
    char y a un char UNICODE, en este caso el arroba, y lo asigna a esta variable var con el tipo char.
*/
public class PrimitivoCharacter {
    public static void main(String[] args) {

        char caracter = '\u0040';
        char decimal = 64;
        char simbolo = '@';
        var character = '\u0040';
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));
        System.out.println("simbolo = " + simbolo);
        System.out.println("character = " + character);

        System.out.println("char corresponde en byte:" + System.lineSeparator() + Character.BYTES);
        System.out.println("Char corresponde en bites = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);

    }
}
/* Esto nos devuelve:

caracter = @
decimal = @
decimal = caracter: true
simbolo = @
character = @
char corresponde en byte:
2
Char corresponde en bites = 16
Character.MIN_VALUE =
Character.MAX_VALUE = ?

*/