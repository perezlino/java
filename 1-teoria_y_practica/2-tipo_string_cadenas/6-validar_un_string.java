/*  ======================================================
    ================== VALIDAR UN STRING =================
    ======================================================

    ______________________________________________________________________________________________
   |                                                                                              |         
   | Entonces con esto ya sabemos que el "método concat" solamente lo utilizamos cuando el objeto |
   | String que vamos a concatenar, tiene una instancia, no es nulo.                              |  
   |______________________________________________________________________________________________|

     ______________________________________________
    |                                              | 
    |    StringUtils.isBlank()                     | 
    |    ---------------------                     |     
    |                                              |         
    |    StringUtils.isBlank(null)      = true     | 
    |    StringUtils.isBlank("")        = true     | 
    |    StringUtils.isBlank(" ")       = true     | 
    |    StringUtils.isBlank("bob")     = false    | 
    |    StringUtils.isBlank("  bob  ") = false    | 
    |                                              |      
    |    StringUtils.isEmpty()                     |             
    |    ---------------------                     | 
    |                                              |     
    |    StringUtils.isEmpty(null)      = true     | 
    |    StringUtils.isEmpty("")        = true     | 
    |    StringUtils.isEmpty(" ")       = false    | 
    |    StringUtils.isEmpty("bob")     = false    | 
    |    StringUtils.isEmpty("  bob  ") = false    |
    |______________________________________________|

    
    AVANCE 1
    ========
*/
    public class EjemploStringValidar {
        public static void main(String[] args) {
            
            System.out.println("------ Ejemplo 1 ------");
            String curso = null;
            boolean esNulo = curso == null;
            System.out.println("esNulo = " + esNulo);
            
            System.out.println("------ Ejemplo 2 ------");
            if(esNulo == false) {
                System.out.println(curso.toUpperCase());
            }
    
          //System.out.println("Bienvenido al curso ".concat(curso)); // Devuelve error porque curso = null
            System.out.println("Bienvenido al curso " + curso);
        }
    }
    
/* Esto es lo que nos devuelve:

------ Ejemplo 1 ------
esNulo = true
------ Ejemplo 2 ------
Bienvenido al curso null


    AVANCE 2
    ========
*/
    public class EjemploStringValidar {
        public static void main(String[] args) {
            
            System.out.println("------ Ejemplo 1 ------");
            String curso = null;
            boolean esNulo = curso == null;
            System.out.println("esNulo = " + esNulo);
            
            System.out.println("------ Ejemplo 2 ------");
            if(esNulo == false) {
                System.out.println(curso.toUpperCase());
            }

        //System.out.println("Bienvenido al curso ".concat(curso)); // Devuelve error porque curso = null
            System.out.println("Bienvenido al curso " + curso);

            System.out.println("------ Ejemplo 3 ------");
            if(esNulo) {
                curso = "Programación Java";
            }

            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso " + curso);
        }
    }
/* Esto es lo que nos devuelve:

------ Ejemplo 1 ------
esNulo = true
------ Ejemplo 2 ------
Bienvenido al curso null
------ Ejemplo 3 ------
PROGRAMACIÓN JAVA
Bienvenido al curso Programación Java


    AVANCE 3
    ========
*/
    public class EjemploStringValidar {
        public static void main(String[] args) {
            
            System.out.println("------ Ejemplo 1 ------");
            String curso = null;
            boolean esNulo = curso == null;
            System.out.println("esNulo = " + esNulo);
            
            System.out.println("------ Ejemplo 2 ------");
            if(esNulo == false) {
                System.out.println(curso.toUpperCase());
            }

          //System.out.println("Bienvenido al curso ".concat(curso)); // Devuelve error porque curso = null
            System.out.println("Bienvenido al curso " + curso);

            System.out.println("------ Ejemplo 3 ------");
            if(esNulo) {
                curso = "Programación Java";
            }

            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso " + curso);

            System.out.println("------ Ejemplo 4 ------");
          //boolean esVacio = curso.isEmpty(); ----> Es lo mismo
            boolean esVacio = curso.length() == 0;

          //if(!esVacio) ---> es lo mismo 
            if(esVacio == false) { // IF siempre se activa cuando su parametro es TRUE
                System.out.println(curso.toUpperCase());
                System.out.println("Bienvenido al curso ".concat(curso));
            }
        }
    }
/* Esto es lo que nos devuelve:

------ Ejemplo 1 ------
esNulo = true
------ Ejemplo 2 ------
Bienvenido al curso null
------ Ejemplo 3 ------
PROGRAMACIÓN JAVA
Bienvenido al curso Programación Java
------ Ejemplo 4 ------
PROGRAMACIÓN JAVA
Bienvenido al curso Programación Java


    AVANCE 4
    ========
*/
    public class EjemploStringValidar {
        public static void main(String[] args) {
            
            System.out.println("------ Ejemplo 1 ------");
            String curso = null;
            boolean esNulo = curso == null;
            System.out.println("esNulo = " + esNulo);
            
            System.out.println("------ Ejemplo 2 ------");
            if(esNulo == false) {
                System.out.println(curso.toUpperCase());
            }

          //System.out.println("Bienvenido al curso ".concat(curso)); // Devuelve error porque curso = null
            System.out.println("Bienvenido al curso " + curso);

            System.out.println("------ Ejemplo 3 ------");
            if(esNulo) {
                curso = "Programación Java";
            }

            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso " + curso);

            System.out.println("------ Ejemplo 4 ------");
          //boolean esVacio = curso.isEmpty(); ----> Es lo mismo
            boolean esVacio = curso.length() == 0;

          //if(!esVacio) ---> es lo mismo 
            if(esVacio == false) { // IF siempre se activa cuando su parametro es TRUE
                System.out.println(curso.toUpperCase());
                System.out.println("Bienvenido al curso ".concat(curso));
            }
        
            System.out.println("------ Ejemplo 5 ------");
          //boolean esVacio = curso.length() == 0; ----> Es lo mismo
            boolean esVacio2 = curso.isEmpty(); 
            
          //if(esVacio2 == false) ---> es lo mismo 
            if(!esVacio2) { // IF siempre se activa cuando su parametro es TRUE
                System.out.println(curso.toUpperCase());
                System.out.println("Bienvenido al curso ".concat(curso));
            }
        }
    }
/* Esto es lo que nos devuelve:

------ Ejemplo 1 ------
esNulo = true
------ Ejemplo 2 ------
Bienvenido al curso null
------ Ejemplo 3 ------
PROGRAMACIÓN JAVA
Bienvenido al curso Programación Java
------ Ejemplo 4 ------
PROGRAMACIÓN JAVA
Bienvenido al curso Programación Java
------ Ejemplo 5 ------
PROGRAMACIÓN JAVA
Bienvenido al curso Programación Java


    AVANCE 5
    ========
*/
    public class EjemploStringValidar {
        public static void main(String[] args) {
            
            System.out.println("------ Ejemplo 1 ------");
            String curso = null;
            boolean esNulo = curso == null;
            System.out.println("esNulo = " + esNulo);
            
            System.out.println("------ Ejemplo 2 ------");
            if(esNulo == false) {
                System.out.println(curso.toUpperCase());
            }

          //System.out.println("Bienvenido al curso ".concat(curso)); // Devuelve error porque curso = null
            System.out.println("Bienvenido al curso " + curso);

            System.out.println("------ Ejemplo 3 ------");
            if(esNulo) {
                curso = "Programación Java";
            }

            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso " + curso);

            System.out.println("------ Ejemplo 4 ------");
          //boolean esVacio = curso.isEmpty(); ----> Es lo mismo
            boolean esVacio = curso.length() == 0;

          //if(!esVacio) ---> es lo mismo 
            if(esVacio == false) { // IF siempre se activa cuando su parametro es TRUE
                System.out.println(curso.toUpperCase());
                System.out.println("Bienvenido al curso ".concat(curso));
            }
        
            System.out.println("------ Ejemplo 5 ------");
          //boolean esVacio = curso.length() == 0; ----> Es lo mismo
            boolean esVacio2 = curso.isEmpty(); 
            
          //if(esVacio2 == false) ---> es lo mismo 
            if(!esVacio2) { // IF siempre se activa cuando su parametro es TRUE
                System.out.println(curso.toUpperCase());
                System.out.println("Bienvenido al curso ".concat(curso));
            }

            System.out.println("------ Ejemplo 6 ------");
            curso = " ";
            boolean esBlanco = curso.isBlank();
            if(esBlanco){ // IF siempre se activa cuando su parametro es TRUE
                System.out.println("Bienvenido al curso");
            }
        }
    }
/* Esto es lo que nos devuelve:

------ Ejemplo 1 ------
esNulo = true
------ Ejemplo 2 ------
Bienvenido al curso null
------ Ejemplo 3 ------
PROGRAMACIÓN JAVA
Bienvenido al curso Programación Java
------ Ejemplo 4 ------
PROGRAMACIÓN JAVA
Bienvenido al curso Programación Java
------ Ejemplo 5 ------
PROGRAMACIÓN JAVA
Bienvenido al curso Programación Java
------ Ejemplo 6 ------
Bienvenido al curso

*/