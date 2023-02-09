/*  ======================================================
    == ELIMINAR UN ELEMENTO DEL ARRAY Y COPIAR UN ARRAY ==
    ======================================================

    Eliminar un elemento en una posicion sin dejar hueco.


       VALORES ORIGINALES                               VALORES DESPLAZADOS
     _______________________                           _______________________
    |   indice  |   valor   |    ELIMINAMOS EL 6      |   indice  |   valor   |
    |-----------|-----------|    EN LA POSICION 5     |-----------|-----------|   
    |     0     |     1     |                         |     0     |     1     |
    |     1     |     2     |                         |     1     |     2     |   
    |     2     |     3     |                         |     2     |     3     |
    |     3     |     4     |                         |     3     |     4     |
    |     4     |     5     |                         |     4     |     5     |
    |     5     |     6     |                         |     5     |     7     |
    |     6     |     7     |                         |     6     |     8     |
    |     7     |     8     |                         |     7     |     9     |
    |     8     |     9     |                         |     8     |    10     |
    |     9     |    10     |                         |     9     |    10     |
    |-----------|-----------|                         |-----------|-----------|

*/
    import java.util.Scanner;

    public class EjemplosArreglosEliminarElemento {
        public static void main(String[] args) {

            int[] a = new int[10];

            a[0] = 1;
            a[1] = 2;
            a[2] = 3;
            a[3] = 4;
            a[4] = 5;
            a[5] = 6;
            a[6] = 7;
            a[7] = 8;
            a[8] = 9;
            a[9] = 10;

            // CODIGO PARA PEDIR NUMEROS POR TERMINAL

            // Scanner s = new Scanner(System.in);

            // for(int i = 0; i < a.length; i++){
            //     System.out.print("Ingrese un número: ");
            //     a[i] = s.nextInt();
            // }
            // System.out.println();


            System.out.println("Ingrese una posición a eliminar entre 0 - 9:");
            int posicion = s.nextInt();
/*  
            Ingrese una posición a eliminar entre 0 - 9: 
            5
*/          
            // i = 5 ; i < 9 ; i++
            for(int i = posicion; i < a.length - 1; i++){
                a[i] = a[i+1];
            }
/* 
            a[5] = a[5 + 1]
            a[5] = 7

            a[6] = a[6 + 1]
            a[6] = 8

            a[7] = a[7 + 1]
            a[7] = 9

            a[8] = a[8 + 1]
            a[8] = 10

            Luego se sale del FOR, dado que 'i' no cumple la condicion, 9 < 9
*/ 
            for(int i = 0; i < a.length;i++){
                System.out.println("a[" + i + "] = " + a[i]);
            }
/* 
            a[0] = 1
            a[1] = 2
            a[2] = 3
            a[3] = 4
            a[4] = 5
            a[5] = 7
            a[6] = 8
            a[7] = 9
            a[8] = 10
            a[9] = 10
*/
            // Con este FOR tenemos retornado una opcion sin la duplicidad de valores
            for(int i = 0; i < a.length - 1;i++){
                System.out.println("a[" + i + "] = " + a[i]);
            }
/* 
            a[0] = 1
            a[1] = 2
            a[2] = 3
            a[3] = 4
            a[4] = 5
            a[5] = 7
            a[6] = 8
            a[7] = 9
            a[8] = 10
*/

            // Dado que el array obtenido repite el último numero, para eliminar esa duplicidad
            // tambien podemos crear un nuevo array con menos elementos, necesitamos solo 9 en este caso.
            // Copiaremos los elementos del Array A al Array B.
            
            // int[] b = new int[8];
            int[] b = new int[a.length-1];
            // System.arraycopy(Array_a, indice_inicial, Array_b, indice_inicial, n_elementos_que_copiaremos_desde_a_hacia_b)
            // n_elementos_que_copiaremos_desde_a_hacia_b = seran 8 elementos los que copiemos
            System.arraycopy(a, 0, b, 0, b.length);

            for(int i = 0; i < b.length; i++){
                System.out.println("b[" + i + "] = " + b[i]);
            }
/* 
            b[0] = 1
            b[1] = 2
            b[2] = 3
            b[3] = 4
            b[4] = 5
            b[5] = 7
            b[6] = 8
            b[7] = 9
            b[8] = 10
*/
            // En este caso REDIMENCIONAMOS al Array A con el numero de elementos del Array B.
            a = b;
            for(int i = 0; i < a.length; i++){
                System.out.println("a[" + i + "] = " + a[i]);
            }
/* 
            a[0] = 1
            a[1] = 2
            a[2] = 3
            a[3] = 4
            a[4] = 5
            a[5] = 7
            a[6] = 8
            a[7] = 9
            a[8] = 10
*/                      
        }
    }