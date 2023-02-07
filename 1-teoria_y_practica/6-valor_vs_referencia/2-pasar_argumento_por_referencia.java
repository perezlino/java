/*  ======================================================
    =========== PASAR ARGUMENTO POR REFERENCIA ===========
    ======================================================

    Cualquier cambio o cualquier método que modifica el String, lo que hace es retornar una nueva 
    instancia, pero la original se mantiene intacta, no varía. El resultado se tiene que guardar 
    en otra variable. 
*/
    public class PasarPorReferencia {
        public static void main(String[] args) {

            int[] edad = {10, 11, 12};

            System.out.println("iniciamos el método main");
            for(int i = 0; i < edad.length; i++){
                System.out.println("edad[i] = " + edad[i]);
            }

            System.out.println("Antes de llamar al método test");
            System.out.println("================================");
            test(edad);

            System.out.println("================================");
            System.out.println("Después de llamar al método test");
            for(int i = 0; i < edad.length; i++){
                System.out.println("edad[i] = " + edad[i]);
            }

            System.out.println("Finaliza el método main con los datos del arreglo modificados!");
        }

        public static void test(int[] edadArr){
            System.out.println("Iniciamos el método test");
            for(int i = 0; i < edadArr.length; i++){
                edadArr[i] = edadArr[i] + 20;
                System.out.println("edadArr[i] = " + edadArr[i]);
            }
            System.out.println("Finaliza el método test");
        }
    }
/* 

iniciamos el método main
edad[i] = 10
edad[i] = 11
edad[i] = 12
Antes de llamar al método test
================================
Iniciamos el método test
edadArr[i] = 30
edadArr[i] = 31
edadArr[i] = 32
Finaliza el método test
================================
Después de llamar al método test
edad[i] = 30
edad[i] = 31
edad[i] = 32
Finaliza el método main con los datos del arreglo modificados! 

*/    
