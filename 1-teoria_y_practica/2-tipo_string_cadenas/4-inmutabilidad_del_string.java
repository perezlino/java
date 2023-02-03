/*  ======================================================
    ============== INMUTABILIDAD DEL STRING ==============
    ======================================================

     ___________________________________________________________________________________________________
    |                                                                                                   |            
    |   Cualquier cambio o cualquier método que modifica el String, lo que hace es retornar una nueva   |
    |   instancia, pero la original se mantiene intacta, no varía. El resultado se tiene que guardar    |
    |   en otra variable.                                                                               |        
    |___________________________________________________________________________________________________|
*/

    public class EjemploStringInmutable {
        public static void main(String[] args) {

            String curso = "Programación Java";
            String profesor = "Alfonso Pérez";

            // Ejemplo 1
            System.out.println("------ Ejemplo 1 ------");
            String resultado = curso.concat(profesor);
            System.out.println("curso = " + curso);
            System.out.println("resultado = " + resultado);
            System.out.println(curso == resultado);

            // Ejemplo 2
            System.out.println("------ Ejemplo 2 ------");
            String resultado2 = curso.transform(c -> {
                return c + " con " + profesor;
            });
            
            System.out.println("curso = " + curso);
            System.out.println("resultado2 = " + resultado2);

            // Ejemplo 3
            System.out.println("------ Ejemplo 3 ------");           
            String resultado3 = resultado.replace("a", "A");
            System.out.println("resultado = " + resultado);
            System.out.println("resultado3 = " + resultado3);
        }
    }
/* Esto es lo que nos devuelve:

------ Ejemplo 1 ------
curso = Programación Java
resultado = Programación JavaAlfonso Pérez
false
------ Ejemplo 2 ------
curso = Programación Java
resultado2 = Programación Java con Alfonso Pérez
------ Ejemplo 3 ------
resultado = Programación JavaAlfonso Pérez
resultado3 = ProgrAmAción JAvAAlfonso Pérez

*/