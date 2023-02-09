/*  ======================================================
    ========== DESPLAZAR UNA POSICION EN UN ARRAY ========
    ======================================================

       VALORES ORIGINALES               VALORES DESPLAZADOS
     _______________________          _______________________
    |   indice  |   valor   |        |   indice  |   valor   |
    |-----------|-----------|        |-----------|-----------|   
    |     0     |     1     |        |     0     |    10     |
    |     1     |     2     |        |     1     |     1     |   
    |     2     |     3     |        |     2     |     2     |
    |     3     |     4     |        |     3     |     3     |
    |     4     |     5     |        |     4     |     4     |
    |     5     |     6     |        |     5     |     5     |
    |     6     |     7     |        |     6     |     6     |
    |     7     |     8     |        |     7     |     7     |
    |     8     |     9     |        |     8     |     8     |
    |     9     |    10     |        |     9     |     9     |
    |-----------|-----------|        |-----------|-----------|

*/
    import java.util.Scanner;

    public class  EjemploArreglosDesplazarPosicion {
        public static void main(String[] args) {

            int[] a = new int[10];
            int ultimo;

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
                //     System.out.print("Ingrese el número:");
                //     a[i] = s.nextInt();
                // }
                // System.out.println();

            ultimo = a[a.length-1];

/*          ultimo = a[9] = 10         */   

            // i = 8 ; i >= 0; i--
            for(int i = a.length -2; i >= 0; i--){
                a[i+1] = a[i];
            }
/* 
            a[8 + 1] = a[8]
            a[9] = 9

            a[7 + 1] = a[7]
            a[8] = 8

            a[6 + 1] = a[6]
            a[7] = 7

            a[5 + 1] = a[5]
            a[6] = 6

            a[4 + 1] = a[4]
            a[5] = 5

            a[3 + 1] = a[3]
            a[4] = 4

            a[2 + 1] = a[2]
            a[3] = 3

            a[1 + 1] = a[1]
            a[2] = 2

            a[0 + 1] = a[0]
            a[1] = 1
*/

            a[0] = ultimo;

/*          a[0] = 10         */               

            System.out.println("El arreglo:");
            for(int i = 0; i < a.length; i++){
                System.out.println("a[" + i + "] = " + a[i]);
            }

        }
    }