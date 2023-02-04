/*  ======================================================
    ============ CONVERSIONES ENTRE PRIMITIVOS ===========
    ======================================================

     ___________________________________________________________________________________________________________
    |                                                                                                           |
    |   La conversión de tipos es cuando se asigna un valor de un tipo de datos primitivo a otro tipo.          |
    |                                                                                                           |
    |   En Java, hay dos tipos de casting:                                                                      |        
    |                                                                                                           |    
    |   - Widening Casting (automáticamente): conversión de un tipo más pequeño a un tamaño mayor               |
    |     -----------------------------------                                                                   |        
    |                                                                                                           |
    |       byte -> short -> char -> int -> long -> float -> double                                             |
    |                                                                                                           |
    |                                                                                                           |
    |   - Narrowing Casting (manualmente): conversión de un tipo más grande a un tipo de tamaño más pequeño     |
    |     -------------------------------                                                                       |
    |                                                                                                           |    
    |       double -> float -> long -> int -> char -> short -> byte                                             |    
    |___________________________________________________________________________________________________________|
    

    Ejemplos Widening Casting
    -------------------------
    Se realiza automáticamente cuando se pasa un tipo de tamaño más pequeño a un Tipo de tamaño más grande:
*/
    public class Main {
        public static void main(String[] args) {

        int myInt = 9;
        double myDouble = myInt; // Casting automático: int a double
    
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
        }
    }
/*
    Ejemplos Narrowing Casting
    --------------------------
*/
    public class Main {
        public static void main(String[] args) {

        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Casting manual: double a int
    
        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
        }
    }
/*

    EJEMPLO
    =======
*/
    public class ConversionDeTipos {
        public static void main(String[] args) {

            int i = 10000;

            // Castear (forzar la conversión)
            /* Un int tiene mayor capacidad que un short, por tanto, devuelve error por "posible" 
            perdida de informacion */
            short s = i; // Devuelve un error
            short s = (short) i; // De esta manera forzamos el cambio de tipo
            System.out.println("s = " + s);
            System.out.println("el valor maximo de un short es = " + Short.MAX_VALUE); 
                                                // short acepta numeros entre -32768 a 32767
                                                // i = 10000, deberia aceptarlo. Pero como se comento
                                                // por "posible" perdida de informacion, devuelve error.


            long l = i; // Un int tiene menor capacidad que un long, por tanto, no habria problemas de
                        // perdida de informacion
            System.out.println("l = " + l);


            char b = (char) i;
            System.out.println("b = " + b);


            float f = (float) i;
            System.out.println("f = " + f);
        }
    }        
/* Esto nos devuelve el terminal:

s = 10000
el valor maximo de un short es = 32767
l = 10000
b = ?
f = 10000.0

*/