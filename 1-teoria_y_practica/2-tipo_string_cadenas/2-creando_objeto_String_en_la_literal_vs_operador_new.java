/*  ======================================================
     CREANDO OBJETO STRING EN LA LITERAL V/S OPERADOR NEW 
    ======================================================

*/
    public class EjemploString {
        public static void main(String[] args) {

            // Ejemplo 1
            String curso = "Programación Java";
            String curso2 = new String("Programación Java");
            
            boolean esIgual = curso == curso2;
            System.out.println("curso == curso2 = " + esIgual);
            
            esIgual = curso.equals(curso2);
            System.out.println("curso.equals(curso2) = " + esIgual);

            // Caso especial
            String curso3 = "Programación Java";
            esIgual = curso == curso3;
            System.out.println("curso == curso3 = " + esIgual);

            // Ejemplo 2 - JAVA es CaseSensitive
            String curso4 = "auto";
            String curso5 = "Auto";

            boolean igualdad = curso4 == curso5;
            System.out.println("curso4 == curso5 = " + igualdad);

            igualdad = curso4.equals(curso5);
            System.out.println("curso4.equals(curso5) = " + igualdad);

        }
    }
/* Esto nos devuelve:

curso == curso2 = false
curso.equals(curso2) = true
curso == curso3 = true
curso4 == curso5 = false
curso4.equals(curso5) = false

     ______________________________________________________________________________________________________
    |                                                                                                      |                     
    |   Porque siendo que curso y curso5 son objetos distintos me regresa 'true' al utilizar '=='' ?       | 
    |                                                                                                      | 
    |   Lo que hace JAVA es NO crear un nuevo objeto, esto con el fin de optimizar. Entonces, en vez de    | 
    |   crear una nueva instancia de curso5 (un nuevo objeto), lo que hace es asignar la referencia del    | 
    |   curso que ya existe (curso). Entonces, curso5 es igual a curso y no a una nueva instancia de un    | 
    |   String. Y esto lo hace solamente para optimizar, para no tener que estar creando tantos objetos    | 
    |   en memoria en nuestra aplicación de forma automática. Detecta que existe una instancia con ese     | 
    |   mismo texto en nuestro sistema y le asigna esa referencia. Por lo tanto, son iguales. Es el mismo  | 
    |   objeto, pero en distintas variables, que se guardan en distintas variables, en curso y en curso5.  | 
    |______________________________________________________________________________________________________|    
    
*/