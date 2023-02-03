/*  =======================================================
    ========= PRIMITIVO BOOLEAN O LOGICO BINARIO ==========
    =======================================================


    boolean
    =======
*/
    public class PrimitivosBoolean {
        public static void main(String[] args) {
            
            boolean datoLogico = true;
            System.out.println("datoLogico = " + datoLogico);
        }
    }
/* Esto nos devuelve:

datoLogico = true


    Podemos ejemplificar utilizando el valor de la variable en el siguiente ejemplo:
*/
    public class PrimitivosBoolean {
        public static void main(String[] args) {
            
            boolean datoLogico = true;
            System.out.println("datoLogico = " + datoLogico);
            
            double numeroDouble = 98765.43e-3; // 98.76543
            System.out.println("numeroDouble = " + numeroDouble);
            
            float numeroFloat = 1.2345e2f; // 123.45
            System.out.println("numeroFloat = " + numeroFloat);
            
            datoLogico = numeroDouble > numeroFloat;
            System.out.println("datoLogico = " + datoLogico);
        }
    }
/* Esto nos devuelve:

datoLogico = true
numeroDouble = 98.76543
numeroFloat = 123.45   
datoLogico = false   


    Otro ejemplo de variables boolean:
*/
    public class PrimitivosBoolean {
        public static void main(String[] args) {
            
            boolean esIgual = (3-2 == 1);
            System.out.println("esIgual = " + esIgual);
        }
    }
/* Esto nos devuelve:

esIgual = true

*/