/*  ===========================================================
    AGREGAR UN NUEVO ELEMENTO E INCREMENTAR EL TAMAÑO DEL ARRAY
    ===========================================================


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
    |     9     |    10     |                         |     9     |     9     |
    |-----------|-----------|                         |    10     |    10     | 
                                                      |-----------|-----------|

    CASO 1
    ======                                                      
*/
    import java.util.Scanner;

    public class EjemploArreglosDesplazarPosicion2b {
        public static void main(String[] args) {

            int[] a = new int[10];
            int elemento, posicion, ultimo;

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
            ultimo = a[a.length - 1];
/*  
            ultimo = a[9]
            ultimo = 10
*/              
            // i = (10 - 2) ; i >= 5 ; i--
            // i = 8 ; i >= 5 ; i--
            for(int i = a.length - 2; i >= posicion; i--){
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
            // int[] b = new int[11];
            int[] b = new int[a.length + 1];
            // System.arraycopy(Array_a, indice_inicial, Array_b, indice_inicial, n_elementos_que_copiaremos_desde_a_hacia_b)
            // n_elementos_que_copiaremos_desde_a_hacia_b = seran 10 elementos los que copiemos          
            System.arraycopy(a, 0, b, 0, a.length);

            b[posicion] = elemento;
/*  
            b[5] = 100
*/   
            b[b.length - 1] = ultimo;
/*  
            b[10] = 10
*/   
            for(int i = 0; i < b.length; i++){
                System.out.println("b[" + i + "] = " + b[i]);
            }
/* 
            b[0] = 1
            b[1] = 2
            b[2] = 3
            b[3] = 4
            b[4] = 5
            b[5] = 100
            b[6] = 6
            b[7] = 7
            b[8] = 8
            b[9] = 9
            b[10] = 10


            OTRA FORMA DE HACERLO ES REDIMENSIONANDO AL ARRAY A

*/
            a = b; // Así mantenemos la referencia, la instancia de B en la variable A.
            a[posicion] = elemento;
/*  
            a[5] = 100
*/             
            a[a.length - 1] = ultimo;
/*  
            a[10] = 10
*/ 
            System.out.println("El arreglo:");
            for(int i = 0; i < a.length; i++){
                System.out.println("a[" + i + "] = " + a[i]);
            }
/* 
            El arreglo:
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
            a[10] = 10 
*/
        }
    }
/* 

    CASO 2 - Ejemplo 1
    ==================  

    En un Array ordenado agregar un elemento en una posicion adecuada de manera que siga
    ordenado. Es decir, no se puede agregar en cualquier parte del Array.
*/
    import java.util.Scanner;

    public class EjemploArreglosDesplazarPosicion3b {
        public static void main(String[] args) {

            int[] a = new int[7];
            int numero, posicion, ultimo;

            a[0] = 1;
            a[1] = 2;
            a[2] = 3;
            a[3] = 4;
            a[4] = 5;
            a[5] = 6;
            a[6] = 7;

            // CODIGO PARA PEDIR NUMEROS POR TERMINAL  

            // Scanner s = new Scanner(System.in);

            // for(int i = 0; i < a.length; i++){
            //     System.out.print("Ingrese un número: ");
            //     a[i] = s.nextInt();
            // }
            // System.out.println();

            System.out.println("Ingrese un número a insertar:");
            numero = s.nextInt();
/*  
            Nuevo elemento: 
            8
*/
            ultimo = a[a.length - 1];
            posicion = 0;
/*  
            ultimo = a[7 -1] = a[6] = 7
            posicion = 0
*/
            while(posicion < 6 && numero > a[posicion]){
                posicion++;
            }
/*  
            0 < 6 && 8 > a[0]
            posicion = 1

            1 < 6 && 8 > a[1]
            posicion = 2
            
            2 < 6 && 8 > a[2]
            posicion = 3

            3 < 6 && 8 > a[3]
            posicion = 4
            
            4 < 6 && 8 > a[4]
            posicion = 5
            
            5 < 6 && 8 > a[5]
            posicion = 6            
            
            Luego posicion = 6  no intenta entrar al bucle porque no cumple la condicion 6 < 6  
            
            Finalmente, posicion = 6
*/ 

            // i = (7 - 2) ; i >= 6 ; i--
            // i = 5 ; i >= 6 ; i--            
            for(int i = a.length - 2; i >= posicion; i--){
                a[i+1] = a[i];
            }
/* 
            Esto no se cumple
*/
            // int[] b = new int[8];
            int[] b = new int[a.length + 1];
            // System.arraycopy(Array_a, indice_inicial, Array_b, indice_inicial, n_elementos_que_copiaremos_desde_a_hacia_b)
            // n_elementos_que_copiaremos_desde_a_hacia_b = seran 7 elementos los que copiemos            
            System.arraycopy(a, 0, b, 0, a.length);

            if(numero > ultimo){
                b[b.length - 1] = numero;
                // b[7] = 8
            } else {
                b[b.length - 1] = ultimo;
                b[posicion] = numero;
            }

            System.out.println("El nuevo arreglo ordenado:");
            for(int i = 0; i < b.length; i++){
                System.out.println("b[" + i + "] = " + b[i]);
            }
/* 
            b[0] = 1
            b[1] = 2
            b[2] = 3
            b[3] = 4
            b[4] = 5
            b[5] = 6
            b[6] = 7
            b[7] = 8
*/
        }
    }
/*     


    CASO 2 - Ejemplo 2
    ==================  
*/ 
    import java.util.Scanner;

    public class EjemploArreglosDesplazarPosicion3b {
        public static void main(String[] args) {

            int[] a = new int[7];
            int numero, posicion, ultimo;

            a[0] = 10;
            a[1] = 12;
            a[2] = 13;
            a[3] = 14;
            a[4] = 15;
            a[5] = 16;
            a[6] = 17;

            // CODIGO PARA PEDIR NUMEROS POR TERMINAL  

            // Scanner s = new Scanner(System.in);

            // for(int i = 0; i < a.length; i++){
            //     System.out.print("Ingrese un número: ");
            //     a[i] = s.nextInt();
            // }
            // System.out.println();

            System.out.println("Ingrese un número a insertar:");
            numero = s.nextInt();
/*  
            Nuevo elemento: 
            11
*/
            ultimo = a[a.length - 1];
            posicion = 0;
/*  
            ultimo = a[7 -1] = a[6] = 17
            posicion = 0
*/
            while(posicion < 6 && numero > a[posicion]){
                posicion++;
            }
/*  
            0 < 6 && 11 > a[0]
            posicion = 1         
            
            Luego posicion = 1  no intenta entrar al bucle porque no cumple la condicion 
            numero > a[posicion] ===> 11 > 11 
            
            Finalmente, posicion = 1
*/ 

            // i = (7 - 2) ; i >= 1 ; i--
            // i = 5 ; i >= 1 ; i--            
            for(int i = a.length - 2; i >= posicion; i--){
                a[i+1] = a[i];
            }
/* 
/* 
            a[5 + 1] = a[5]
            a[6] = 16

            a[4 + 1] = a[4]
            a[5] = 15

            a[3 + 1] = a[3]
            a[4] = 14

            a[2 + 1] = a[2]
            a[3] = 13

            a[1 + 1] = a[1]
            a[2] = 12            

            Luego se sale del for ya que no se cumple la condicion con i = 0
*/
*/
            // int[] b = new int[8];
            int[] b = new int[a.length + 1];
            // System.arraycopy(Array_a, indice_inicial, Array_b, indice_inicial, n_elementos_que_copiaremos_desde_a_hacia_b)
            // n_elementos_que_copiaremos_desde_a_hacia_b = seran 7 elementos los que copiemos            
            System.arraycopy(a, 0, b, 0, a.length);

            if(numero > ultimo){
                b[b.length - 1] = numero;
            } else {
                b[b.length - 1] = ultimo;
                b[posicion] = numero;
                // b[7] = 17
                // b[1] = 11
            }

            System.out.println("El nuevo arreglo ordenado:");
            for(int i = 0; i < b.length; i++){
                System.out.println("b[" + i + "] = " + b[i]);
            }
/* 
            El nuevo arreglo ordenado:
            b[0] = 10
            b[1] = 11
            b[2] = 12
            b[3] = 13
            b[4] = 14
            b[5] = 15
            b[6] = 16
            b[7] = 17
*/
        }
    }   