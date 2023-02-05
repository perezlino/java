/*  ============================================================
    == EJEMPLO BUSCAR CON SENTENCIAS FOR ANIDADAS Y ETIQUETAS ==
    ============================================================

*/
    public class SentenciasBucleEtiquetasBuscar {
        public static void main(String[] args) {

            System.out.println("------------ EJEMPLO 1 ------------");

            String frase = "tres tristes tigres tragan trigo en un trigal";
            
            int maxFrase = frase.length(); // cuenta los espacios

            System.out.println("\"frase\" tiene " + maxFrase + " caracteres");

            int cantidad = 0;
            char letra = 't';
            for(int i = 0; i < maxFrase; i++) {
                if (frase.charAt(i) != letra) {
                    continue;
                }
                cantidad++;
            }
            System.out.println("Se encontró " + cantidad + " veces el caracter '"+letra+"' en la frase");
    /*

    ------------ EJEMPLO 1 ------------
    "frase" tiene 45 caracteres
    Se encontró 7 veces el caracter 't' en la frase 

    */

            System.out.println("------------ EJEMPLO 2 ------------");

            String frase2 = "tres tristes tigres tragan trigo en un trigal";
            String palabra = "trigo";
            
            int maxFrase2 = frase2.length(); // cuenta los espacios
            int maxPalabra = palabra.length();

            System.out.println("\"frase\" tiene " + maxFrase2 + " caracteres");            
            System.out.println("\"palabra\" tiene " + maxPalabra + " caracteres");

            int cantidad2 = 0;
            
            buscar:
            for(int i = 0; i < maxFrase2; i++) {
                int k = i;
                for(int j = 0; j < maxPalabra; j++) {
                    if (frase2.charAt(k++) != palabra.charAt(j)) {
                        continue buscar;
                    }
        /*  i = 0, k = 0, j = 0  ----> 't'res tristes tigres tragan trigo en un trigal
                                     // No entra al "if", dado que, frase2.charAt(0) = palabra.charAt(0)
        
            i = 0, k = 1, j = 1  ----> t'r'es tristes tigres tragan trigo en un trigal
                                     // No entra al "if", dado que, frase2.charAt(1) = palabra.charAt(1)                                     

            i = 0, k = 2, j = 2  ----> tr'e's tristes tigres tragan trigo en un trigal
                                     // Entra al "if", dado que, frase2.charAt(2) ≠ palabra.charAt(2)
                                     
            i = 1, k = 1, j = 0  ----> t'r'es tristes tigres tragan trigo en un trigal
                                     // Entra al "if", dado que, frase2.charAt(1) ≠ palabra.charAt(0)
                                     
            i = 2, k = 2, j = 0  ----> tr'e's tristes tigres tragan trigo en un trigal
                                     // Entra al "if", dado que, frase2.charAt(2) ≠ palabra.charAt(0)  
                                     
            i = 3, k = 3, j = 0  ----> tre's' tristes tigres tragan trigo en un trigal
                                     // Entra al "if", dado que, frase2.charAt(3) ≠ palabra.charAt(0)  
            
            ...

            i = 27, k = 27, j = 0  ----> tres tristes tigres tragan 't'rigo en un trigal
                                     // No entra al "if", dado que, frase2.charAt(27) = palabra.charAt(0)
                                     
            i = 27, k = 28, j = 1  ----> tres tristes tigres tragan t'r'igo en un trigal
                                     // No entra al "if", dado que, frase2.charAt(28) = palabra.charAt(1)  
                                     
            i = 27, k = 29, j = 2  ----> tres tristes tigres tragan tr'i'go en un trigal
                                     // No entra al "if", dado que, frase2.charAt(29) = palabra.charAt(2)  
                                     
            i = 27, k = 30, j = 3  ----> tres tristes tigres tragan tri'g'o en un trigal
                                     // No entra al "if", dado que, frase2.charAt(30) = palabra.charAt(3)  
                                     
            i = 27, k = 31, j = 4  ----> tres tristes tigres tragan trig'o' en un trigal
                                     // No entra al "if", dado que, frase2.charAt(31) = palabra.charAt(4) 
                                     
                Y luego j toma el valor de  5, y como j = 5 no es menor a 5, sale del 'for' más interno 
                y toma 'cantidad++', aumentando cantidad en 1.                     
                
            */

                }
            cantidad2++;
            }

            System.out.println("Se encontró " + cantidad2 + " veces la palabra '"+palabra+"' en la frase");
    /*

    ------------ EJEMPLO 2 ------------
    "frase" tiene 45 caracteres
    "palabra" tiene 5 caracteres
    Se encontró 1 veces la palabra 'trigo' en la frase

    */

            System.out.println("------------ EJEMPLO 3 ------------");
            // El funcionamiento es igual, pero recorre menos veces y de forma más optimizada el FOR.
            // Entonces la búsqueda comenzará después de la palabra encontrada, al final de esta, en la frase.

            String frase3 = "tres tristes tigres tragan trigo en un trigal";
            String palabra2 = "trigo";
            
            int maxFrase3 = frase3.length(); // 45
            int maxPalabra2 = palabra2.length(); // 5

            System.out.println("\"frase\" tiene " + maxFrase2 + " caracteres");            
            System.out.println("\"palabra\" tiene " + maxPalabra2 + " caracteres");

            int cantidad3 = 0;
            
            buscar:
            for(int i = 0; i <= maxFrase2; i++) {
                int k = i;
                for(int j = 0; j < maxPalabra; j++) {
                    if (frase2.charAt(k++) != palabra.charAt(j)) {
                        continue buscar;
                    }
        /*  i = 0, k = 0, j = 0  ----> 't'res tristes tigres tragan trigo en un trigal
                                    // No entra al "if", dado que, frase2.charAt(0) = palabra.charAt(0)

            i = 0, k = 1, j = 1  ----> t'r'es tristes tigres tragan trigo en un trigal
                                    // No entra al "if", dado que, frase2.charAt(1) = palabra.charAt(1)                                     

            i = 0, k = 2, j = 2  ----> tr'e's tristes tigres tragan trigo en un trigal
                                    // Entra al "if", dado que, frase2.charAt(2) ≠ palabra.charAt(2)
                                    
            i = 1, k = 1, j = 0  ----> t'r'es tristes tigres tragan trigo en un trigal
                                    // Entra al "if", dado que, frase2.charAt(1) ≠ palabra.charAt(0)
                                    
            i = 2, k = 2, j = 0  ----> tr'e's tristes tigres tragan trigo en un trigal
                                    // Entra al "if", dado que, frase2.charAt(2) ≠ palabra.charAt(0)  
                                    
            i = 3, k = 3, j = 0  ----> tre's' tristes tigres tragan trigo en un trigal
                                    // Entra al "if", dado que, frase2.charAt(3) ≠ palabra.charAt(0)  
            
            ...

            i = 27, k = 27, j = 0  ----> tres tristes tigres tragan 't'rigo en un trigal
                                    // No entra al "if", dado que, frase2.charAt(27) = palabra.charAt(0)
                                    
            i = 27, k = 28, j = 1  ----> tres tristes tigres tragan t'r'igo en un trigal
                                    // No entra al "if", dado que, frase2.charAt(28) = palabra.charAt(1)  
                                    
            i = 27, k = 29, j = 2  ----> tres tristes tigres tragan tr'i'go en un trigal
                                    // No entra al "if", dado que, frase2.charAt(29) = palabra.charAt(2)  
                                    
            i = 27, k = 30, j = 3  ----> tres tristes tigres tragan tri'g'o en un trigal
                                    // No entra al "if", dado que, frase2.charAt(30) = palabra.charAt(3)  
                                    
            i = 27, k = 31, j = 4  ----> tres tristes tigres tragan trig'o' en un trigal
                                    // No entra al "if", dado que, frase2.charAt(31) = palabra.charAt(4) 
                                    
                Y luego j toma el valor de  5, y como j = 5 no es menor a 5, sale del 'for' más interno 
                y toma 'cantidad++', aumentando cantidad en 1.                     
                
            */

                }
            cantidad3++;

            i = i + maxPalabra2; // 'i' llega con el valor = 27 y se le suma '5', tomando el valor de '32'.
                                // Esto lo que hace es comenzar desde la posicion 32, es decir, comenzamos
                                // a buscar despues de la palabra 'trigo'.

            }

            System.out.println("Se encontró " + cantidad3 + " veces la palabra '"+palabra2+"' en la frase");
    }
}
    /*

    ------------ EJEMPLO 2 ------------
    "frase" tiene 45 caracteres
    "palabra" tiene 5 caracteres
    Se encontró 1 veces la palabra 'trigo' en la frase

    */    