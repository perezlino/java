/*  ===============================================================================
    AGREGAR UN ELEMENTO EN UNA POSICION ADECUADA DE MANERA QUE SE MANTENGA ORDENADO 
    ===============================================================================

    En un Array ordenado agregar un elemento en una posicion adecuada de manera que siga
    ordenado. Es decir, no se puede agregar en cualquier parte del Array.


       VALORES ORIGINALES                               VALORES DESPLAZADOS
     _______________________                           _______________________
    |   indice  |   valor   |    INSERTAMOS EL 21     |   indice  |   valor   |
    |-----------|-----------|    DE MANERA QUE SIGA   |-----------|-----------|   
    |     0     |    15     |    ORDENADA             |     0     |    15     |
    |     1     |    17     |                         |     1     |    17     |   
    |     2     |    19     |                         |     2     |    19     |
    |     3     |    23     |                         |     3     |    21     |
    |     4     |    25     |                         |     4     |    23     |
    |     5     |    27     |                         |     5     |    25     |
    |     6     |  (vacio)  |                         |     6     |    27     |
    |-----------|-----------|                         |-----------|-----------|

*/
    import java.util.Scanner;

    public class EjemploArreglosDesplazarPosicion3 {
        public static void main(String[] args) {

            int[] a = new int[7];
            int numero, posicion;

            a[0] = 15;
            a[1] = 17;
            a[2] = 19;
            a[3] = 23;
            a[4] = 25;
            a[5] = 27;            

            // CODIGO PARA PEDIR NUMEROS POR TERMINAL

            // Scanner s = new Scanner(System.in);

            // for(int i = 0; i < a.length - 1; i++){
            //     System.out.print("Ingrese un número: ");
            //     a[i] = s.nextInt();
            // }
            // System.out.println();

            System.out.println("Ingrese un número a insertar:");
            numero = s.nextInt();
/*  
            Ingrese un número a insertar: 
            21
*/            
            posicion = 0;
            //posicion < 6 && 21 > a[posicion]
            //posicion++            
            while(posicion < 6 && numero > a[posicion]){
                posicion++;
            }
/*  
            0 < 6 && 21 > a[0]
            posicion = 1

            1 < 6 && 21 > a[1]
            posicion = 2
            
            2 < 6 && 21 > a[2]
            posicion = 3
            
            Luego posicion = 3  no intenta entrar al bucle pero no cumple la condicion 21 > 23 
            
            Finalmente, posicion = 3
*/             
            // i = 5 ; i >= 3 ; i--
            for(int i = a.length - 2; i >= posicion; i--){
                a[i+1] = a[i];
            }
/* 
            a[5 + 1] = a[5]
            a[6] = 27

            a[4 + 1] = a[4]
            a[5] = 25

            a[3 + 1] = a[3]
            a[4] = 23

            Luego nos saca del for, dado que no se cumple condicion 2 >= 3

*/
            a[posicion] = numero;
/*  
            a[3] = 21
*/ 
            System.out.println("El nuevo arreglo ordenado:");
            for(int i = 0; i < a.length; i++){
                System.out.println("a[" + i + "] = " + a[i]);
            }
/* 
            El nuevo arreglo ordenado:
            a[0] = 15
            a[1] = 17
            a[2] = 19
            a[3] = 21
            a[4] = 23
            a[5] = 25
            a[6] = 27
*/            
        }
    }