/*  ======================================================
    ============= DETECTAR ORDEN DEL ARRAY ===============
    ======================================================

    Veamos un ejemplo que detecta si un Array está ordenado de forma ascendente o descendente, o bien
    si está desordenado.


    CASO 1
    ======
*/
    public class EjemploArreglosDetectarOrden {
        public static void main(String[] args) {

            int[] a = new int[7];
    
            a[0] = 10;
            a[1] = 9;
            a[2] = 8;
            a[3] = 7;
            a[4] = 6;
            a[5] = 5;
            a[6] = 4;
    
            boolean ascendente = false;
            boolean descendente = false;
    
            for(int i = 0; i < a.length - 1; i++){
    
                if(a[i] > a[i+1]){
                    descendente = true;
                }
    /* 
                a[0] > a[0 + 1] ==> 10 > 9 ==> true ==> descendente = true  // La variable 'descendente' acaba de
                a[1] > a[1 + 1] ==> 9 > 8 ==> true                             modificar su valor de 'false' a 'true'
                a[2] > a[2 + 1] ==> 8 > 7 ==> true                             y este se mantendrá aunque una 
                a[3] > a[3 + 1] ==> 7 > 6 ==> true                             comparación sea 'false', porque en 
                a[4] > a[4 + 1] ==> 6 > 5 ==> true                             ningun lado nos dice que si una 
                a[5] > a[5 + 1] ==> 5 > 4 ==> true                             comparacion es falsa la variable 
                                                                               tomará el valor 'false'.
    */                                                                         
    
                if(a[i] < a[i+1]){
                    ascendente = true;
                }
    /* 
                a[0] < a[0 + 1] ==> 10 < 9 ==> false
                a[1] < a[1 + 1] ==> 9 < 8 ==> false
                a[2] < a[2 + 1] ==> 8 < 7 ==> false
                a[3] < a[3 + 1] ==> 7 < 6 ==> false
                a[4] < a[4 + 1] ==> 6 < 5 ==> false
                a[5] < a[5 + 1] ==> 5 < 4 ==> false
    
            Se sale del FOR dado que ya no se cumple la condicion 6 < (7 - 1) = 6 < 6
    
            Las variables terminan con los siguietnes valores:
    
            descendente = true
            ascendente = false
    */
            }
    
            if(ascendente == true && descendente == true){
                System.out.println("Arreglo = desordenado");
            }
    
            if(ascendente == false && descendente == false){
                System.out.println("Arreglo = todos son iguales");
            }
    
            if(ascendente == true && descendente == false){
                System.out.println("Arreglo = ordenado de forma ascendente");
            }
    
            if(ascendente == false && descendente == true){
                System.out.println("Arreglo = ordenado de forma descendente");
            }
        }
    }
/*

Arreglo = ordenado de forma descendente


    CASO 2
    ======
*/
    public class EjemploArreglosDetectarOrden {
        public static void main(String[] args) {

            int[] a = new int[7];

            a[0] = 10;
            a[1] = 9;
            a[2] = 8;
            a[3] = 60; // <=============== Modificamos este numero
            a[4] = 6;
            a[5] = 5;
            a[6] = 4;

            boolean ascendente = false;
            boolean descendente = false;

            for(int i = 0; i < a.length - 1; i++){

                if(a[i] > a[i+1]){
                    descendente = true;
                }
    /* 
                a[0] > a[0 + 1] ==> 10 > 9 ==> true ==> descendente = true 
                a[1] > a[1 + 1] ==> 9 > 8 ==> true 
                a[2] > a[2 + 1] ==> 8 > 60 ==> false
                a[3] > a[3 + 1] ==> 60 > 6 ==> true
                a[4] > a[4 + 1] ==> 6 > 5 ==> true
                a[5] > a[5 + 1] ==> 5 > 4 ==> true
    */                

                if(a[i] < a[i+1]){
                    ascendente = true;
                }
    /* 
                a[0] < a[0 + 1] ==> 10 < 9 ==> false
                a[1] < a[1 + 1] ==> 9 < 8 ==> false
                a[2] < a[2 + 1] ==> 8 < 60 ==> true ==> ascendente = true  // La variable 'ascendente' acaba de
                a[3] < a[3 + 1] ==> 60 < 6 ==> false                          modificar su valor de 'false' a 'true'
                a[4] < a[4 + 1] ==> 6 < 5 ==> false
                a[5] < a[5 + 1] ==> 5 < 4 ==> false

            Se sale del FOR dado que ya no se cumple la condicion 6 < (7 - 1) = 6 < 6

            Las variables terminan con los siguietnes valores:

            descendente = true
            ascendente = true
    */
            }

            if(ascendente == true && descendente == true){
                System.out.println("Arreglo = desordenado");
            }

            if(ascendente == false && descendente == false){
                System.out.println("Arreglo = todos son iguales");
            }

            if(ascendente == true && descendente == false){
                System.out.println("Arreglo = ordenado de forma ascendente");
            }

            if(ascendente == false && descendente == true){
                System.out.println("Arreglo = ordenado de forma descendente");
            }
        }
    }
/* 

Arreglo = desordenado

*/