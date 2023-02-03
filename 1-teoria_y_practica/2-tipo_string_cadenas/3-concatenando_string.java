/*  ======================================================
    ================= CONCATENANDO STRING ================
    ======================================================

*/
    public class EjemploStringConcatenacion {
        public static void main(String[] args) {

            String curso = "Programación Java";
            String profesor = "Alfonso Pérez";

            // Ejemplo 1
            String detalle = curso + " con el instructor " + profesor;
            System.out.println(detalle);

            // Ejemplo 2
            String detalle2 = curso.concat(" con ").concat(profesor);
            System.out.println("detalle2 = " + detalle2);

            // Ejemplo 3
            int numeroA = 10;
            int numeroB = 5;

            System.out.println(detalle + numeroA + numeroB);
/*          
             _________________________________________________________________________________________________________
            |                                                                                                         |  
            |   Por qué concatena también los números y no los suma?                                                  |  
            |   ----------------------------------------------------                                                  |  
            |   Bueno, eso se debe a la precedencia de los operadores. Como encuentra primero una cadena,             |  
            |   un string en la izquierda, entonces va asumir que todo se trata de una cadena y va a concatenar.      |  
            |   Importante tener en cuenta que las expresiones se van evaluando de izquierda a derecha.               |      
            |                                                                                                         |          
            |   Entonces, primero un string, luego números y luego concatena, a menos que utilicemos, por ejemplo,    |  
            |   los paréntesis. Entonces, con los paréntesis cambiamos la precedencia, es decir, el orden en que      |  
            |   se ejecutan, el orden en que se evalúan estas operaciones.                                            |  
            |                                                                                                         |  
            |   Entonces, en este caso, primero va a sumar, una vez que suma va a concatenar. Siempre los paréntesis  |  
            |   tienen preferencia en la precedencia, siempre una mayor prioridad.                                    |  
            |_________________________________________________________________________________________________________| 
*/                                                                           ^ 
            System.out.println(detalle + (numeroA + numeroB));               | 
            System.out.println(numeroA + numeroB + detalle);                 | 
        }                                                                    | 
    }                                                                        |
/* Esto nos devuelve:                                                        | 
                                                                             |
Programación Java con el instructor Alfonso Pérez                            |
detalle2 = Programación Java con Alfonso Pérez                               |
Programación Java con el instructor Alfonso Pérez105  ------------------------
Programación Java con el instructor Alfonso Pérez15
15Programación Java con el instructor Alfonso Pérez

*/