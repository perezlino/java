/*  ======================================================
    ======= PRIMITIVOS NUMERICOS DE PUNTO FLOTANTE =======
    ======================================================


    float
    =====
*/
    public class PrimitivosFloat {
        public static void main(String[] args) {

            // Recordar que el rango de un float es desde -1.4E-45 a 3.4028235E38
            float realFloat = 1;
            System.out.println("realFloat = " + realFloat);
            System.out.println("float corresponde en byte a = " + Float.BYTES);
            System.out.println("float corresponde en bites a = " + Float.SIZE);
            System.out.println("máximo valor para float = " + Float.MAX_VALUE);
            System.out.println("mínimo valor para float = " + Float.MIN_VALUE);

        }
    }
/* Esto nos devuelve:

realFloat = 1.0
float corresponde en byte a = 4
float corresponde en bites a = 32
máximo valor para float = 3.4028235E38
mínimo valor para float = 1.4E-45


    Pero qué pasa si quiero colocar la coma o el punto en caso de forma explícita 1.0? Se fijan marca 
    un error porque al colocar un punto, es decir, un decimal y algo, cero o lo que sea, cambia el tipo 
    de la literal, ya no es entero, sino pasa a ser por defecto del tipo double. Y double no se puede 
    convertir de forma directa con float. 
*/
    public class PrimitivosFloat {
        public static void main(String[] args) {

            float realFloat = 1.0; // Erróneo
            System.out.println("realFloat = " + realFloat);
            System.out.println("float corresponde en byte a = " + Float.BYTES);
            System.out.println("float corresponde en bites a = " + Float.SIZE);
            System.out.println("máximo valor para float = " + Float.MAX_VALUE);
            System.out.println("mínimo valor para float = " + Float.MIN_VALUE);

        }
    }
/* 
    Entonces, para indicar que la literal no es un double sino un float, utilizamos la letra “F”:
*/
    public class PrimitivosFloat {
        public static void main(String[] args) {

            float realFloat = 1.0F; 
            System.out.println("realFloat = " + realFloat);
            System.out.println("float corresponde en byte a = " + Float.BYTES);
            System.out.println("float corresponde en bites a = " + Float.SIZE);
            System.out.println("máximo valor para float = " + Float.MAX_VALUE);
            System.out.println("mínimo valor para float = " + Float.MIN_VALUE);

        }
    }
/* Esto nos devuelve:

realFloat = 1.0
float corresponde en byte a = 4
float corresponde en bites a = 32
máximo valor para float = 3.4028235E38
mínimo valor para float = 1.4E-45


    También podemos trabajar con exponenciales:
*/
    public class PrimitivosFloat {
        public static void main(String[] args) {

            float realFloat = 2.12E3F; 
            float realFloat2 = 2120F; 
            float realFloat3 = 2.12E-3F; 
            System.out.println("realFloat = " + realFloat);
            System.out.println("realFloat2 = " + realFloat2);
            System.out.println("realFloat3 = " + realFloat3);
            System.out.println("float corresponde en byte a = " + Float.BYTES);
            System.out.println("float corresponde en bites a = " + Float.SIZE);
            System.out.println("máximo valor para float = " + Float.MAX_VALUE);
            System.out.println("mínimo valor para float = " + Float.MIN_VALUE);

        }
    }
/* Esto nos devuelve:

realFloat = 2120.0
realFloat2 = 2120.0
realFloat3 = 0.00212
float corresponde en byte a = 4
float corresponde en bites a = 32
máximo valor para float = 3.4028235E38
mínimo valor para float = 1.4E-45

*/