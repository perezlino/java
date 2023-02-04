/*  ======================================================
     METODOS UTILES PARA CONVERTIR UN STRING EN UN ARRAY 
    ======================================================


    AVANCE 1
    ========
     ________________________________________________________________________
    |                                                                        |
    |   "length" en un String es un 'método' y en un array es un 'atributo'. |
    |________________________________________________________________________|


    AVANCE 1
    ========
*/
    public class EjemploStringMetodosArreglo {
        public static void main(String[] args) {
            
            String trabalenguas = "trabalenguas";

            System.out.println("------ Ejemplo 1 ------");
            // arreglo = {'t','r','a','b','a','l','e','n','g','u','a','s'}
            char[] arreglo = trabalenguas.toCharArray();
            int largo = arreglo.length;
            System.out.println("largo = " + largo);
            
            for(int i = 0; i < largo; i++){
                System.out.print("\narray = " + arreglo[i]);
            }
        }
    }
/* Retorna lo siguiente:

------ Ejemplo 1 ------
largo = 12
array = t 
array = r 
array = a 
array = b 
array = a 
array = l 
array = e
array = n
array = g
array = u
array = a
array = s


    AVANCE 2
    ========
*/
    public class EjemploStringMetodosArreglo {
        public static void main(String[] args) {
            
            String trabalenguas = "trabalenguas";

            System.out.println("------ Ejemplo 1 ------");

            // arreglo = {'t','r','a','b','a','l','e','n','g','u','a','s'}
            char[] arreglo = trabalenguas.toCharArray();
            int largo = arreglo.length;
            System.out.println("largo = " + largo);
            
            for(int i = 0; i < largo; i++){
                System.out.print("\narray = " + arreglo[i]);
            }

            System.out.println("\n------ Ejemplo 2 ------");

            // arreglo2 = {"tr","b","lengu","s"}
            String[] arreglo2 = trabalenguas.split("a");
            int longitud = arreglo2.length;
            System.out.println("largo = " + longitud);

            for(int j = 0; j < longitud; j++){
                System.out.println(arreglo2[j]);
            }
        }
    }
/* Esto nos retorna:

------ Ejemplo 1 ------
largo = 12
array = t
array = r
array = a
array = b
array = a
array = l
array = e
array = n
array = g
array = u
array = a
array = s
------ Ejemplo 2 ------
largo = 4
tr
b
lengu
s


    AVANCE 3
    ========
*/
    public class EjemploStringMetodosArreglo {
        public static void main(String[] args) {
            
            String trabalenguas = "trabalenguas";

            System.out.println("------ Ejemplo 1 ------");

            // arreglo = {'t','r','a','b','a','l','e','n','g','u','a','s'}
            char[] arreglo = trabalenguas.toCharArray();
            int largo = arreglo.length;
            System.out.println("largo = " + largo);
            
            for(int i = 0; i < largo; i++){
                System.out.print("\narray = " + arreglo[i]);
            }

            System.out.println("\n------ Ejemplo 2 ------");

            // arreglo2 = {"tr","b","lengu","s"}
            String[] arreglo2 = trabalenguas.split("a");
            int longitud = arreglo2.length;
            System.out.println("largo = " + longitud);

            for(int j = 0; j < longitud; j++){
                System.out.println(arreglo2[j]);
            }

            System.out.println("------ Ejemplo 3 ------");

            String archivo = "alguna.imagen.pdf";
            // archivoArr = {"alguna","imagen","pdf"}
            String[] archivoArr = archivo.split("\\."); // Lo mismo ----> archivo.split("[.]")
            int largo2 = archivoArr.length;
            System.out.println("largo2 = " + largo2);
            
            for(int j = 0; j < largo2; j++){
                System.out.println(archivoArr[j]);
            }

            System.out.println("extension = " + archivoArr[largo2 - 1]);
        }
    }
/* Esto nos retorna:

------ Ejemplo 1 ------
largo = 12
array = t
array = r
array = a
array = b
array = a
array = l
array = e
array = n
array = g
array = u
array = a
array = s
------ Ejemplo 2 ------
largo = 4
tr
b
lengu
s
------ Ejemplo 3 ------
largo2 = 3
alguna
imagen
pdf
extension = pdf

*/