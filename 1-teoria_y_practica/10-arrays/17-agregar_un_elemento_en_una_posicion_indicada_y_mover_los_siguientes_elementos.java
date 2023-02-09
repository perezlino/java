/*  =============================================================================
    AGREGAR UN ELEMENTO EN UNA POSICION INDICADA Y MOVER LOS SIGUIENTES ELEMENTOS 
    =============================================================================

       VALORES ORIGINALES                               VALORES DESPLAZADOS
     _______________________                           _______________________
    |   indice  |   valor   |    INSERTAMOS EL 100    |   indice  |   valor   |
    |-----------|-----------|    EN LA POSICION 5     |-----------|-----------|   
    |     0     |     1     |                         |     0     |     1     |
    |     1     |     2     |                         |     1     |     2     |   
    |     2     |     3     |                         |     2     |     3     |
    |     3     |     4     |                         |     3     |     4     |
    |     4     |     5     |                         |     4     |     5     |
    |     5     |     6     |                         |     5     |   100     |
    |     6     |     7     |                         |     6     |     6     |
    |     7     |     8     |                         |     7     |     7     |
    |     8     |     9     |                         |     8     |     8     |
    |     9     |  (vacio)  |                         |     9     |     9     |
    |-----------|-----------|                         |-----------|-----------|


*/
    import java.util.Scanner;

    public class EjemploArreglosDesplazarPosicion2 {
        public static void main(String[] args) {

            int[] a = new int[10];
            int elemento, posicion;

            a[0] = 1;
            a[1] = 2;
            a[2] = 3;
            a[3] = 4;
            a[4] = 5;
            a[5] = 6;
            a[6] = 7;
            a[7] = 8;
            a[8] = 9;            

            // CODIGO PARA PEDIR NUMEROS POR TERMINAL

            // Scanner s = new Scanner(System.in);

            // for(int i = 0; i < a.length-1; i++){
            //     System.out.print("Ingrese el número:");
            //     a[i] = s.nextInt();
            // }
            // System.out.println();

            System.out.println("Nuevo elemento:");
            elemento = s.nextInt();
/*  
            Nuevo elemento: 
            100
*/

            System.out.println("Posición donde agregar (de 0 a 9)");
            posicion = s.nextInt();
/*  
            Posición donde agregar (de 0 a 9)
            5
*/            
            // i = (10 - 2) ; i >= 5 ; i--
            // i = 8 ; i >= 5 ; i--
            for(int i = a.length -2; i >= posicion; i--){
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

            Luego se sale del for ya que no se cumple la condicion con i = 4
*/

            a[posicion] = elemento;
/*  
            a[5] = 100 
*/            

            System.out.println("El array:");
            for(int i = 0; i < a.length; i++){
                System.out.println("a[" + i + "] = " + a[i]);
            }
/* 
            El array:
            a[0] = 1
            a[1] = 2
            a[2] = 3
            a[3] = 4
            a[4] = 5
            a[5] = 100
            a[6] = 6
            a[7] = 7
            a[8] = 8
            a[9] = 9
*/            
        }
    }