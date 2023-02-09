/*  ======================================================
    ============ MAYOR OCURRENCIA EN UN ARRAY ============
    ======================================================

    Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9). Escriba 
    un programa que imprima el número que tiene más ocurrencias en el arreglo y también imprimir la 
    cantidad de veces que aparece en el array.

    Por ejemplo, para el array: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}

    Como resultado debería imprimir lo siguiente:

        - La mayor ocurrencias es: 3 
        - El elemento que mas se repite es: 5

    En el ejemplo, el elemento que más se repite en el array es el número 5 con una ocurrencia de 
    3 veces.

*/
    import java.util.Scanner;

    public class ProgramaImprimirMasOcurrencias {

        public static void main(String[] args) {
            
            int[] array = new int[10];

            array[0] = 1;
            array[1] = 2;
            array[2] = 3;
            array[3] = 3;
            array[4] = 4;
            array[5] = 5;
            array[6] = 5;
            array[7] = 5;
            array[8] = 6;
            array[9] = 7;

            // CODIGO PARA PEDIR NUMEROS POR TERMINAL 
            
            // Scanner scanner = new Scanner(System.in);
            // for (int i = 0; i < 10; i++) {
            //     System.out.println("Ingrese un numero de 1 a 9: ");
            //     arreglo[i] = scanner.nextInt();
            // }

            // Creamos un segundo Array llamado 'arregloCantidadValores' (de igual largo)
            // para guardar las cantidades de veces que se repite cada elemento 
            // del Array principal
            int[] arregloCantidadValores = new int[10];

            // Luego llenamos este segundo array con las cantidades de ocurrencia
            // de los elementos del primer array
            for (int i = 0; i < array.length; i++) {
                int cantidad = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        cantidad++;
                    }
                }
/* 
                si (array[0] == array[0]) --> si (1 == 1) --> cantidad = 1
                si (array[0] == array[1]) --> si (1 == 2)
                si (array[0] == array[2]) --> si (1 == 3)  
                si (array[0] == array[3]) --> si (1 == 3)  
                si (array[0] == array[4]) --> si (1 == 4)  
                si (array[0] == array[5]) --> si (1 == 5)  
                si (array[0] == array[6]) --> si (1 == 5)  
                si (array[0] == array[7]) --> si (1 == 5)  
                si (array[0] == array[8]) --> si (1 == 6)
                si (array[0] == array[9]) --> si (1 == 7)     
                
                si (array[1] == array[0]) --> si (2 == 1) 
                si (array[1] == array[1]) --> si (2 == 2) --> cantidad = 2
                si (array[1] == array[2]) --> si (2 == 3)  
                si (array[1] == array[3]) --> si (2 == 3)  
                si (array[1] == array[4]) --> si (2 == 4)  
                si (array[1] == array[5]) --> si (2 == 5)  
                si (array[1] == array[6]) --> si (2 == 5)  
                si (array[1] == array[7]) --> si (2 == 5)  
                si (array[1] == array[8]) --> si (2 == 6)
                si (array[1] == array[9]) --> si (2 == 7) 

                si (array[2] == array[0]) --> si (3 == 1) 
                si (array[2] == array[1]) --> si (3 == 2)
                si (array[2] == array[2]) --> si (3 == 3) --> cantidad = 3  
                si (array[2] == array[3]) --> si (3 == 3) --> cantidad = 4  
                si (array[2] == array[4]) --> si (3 == 4)  
                si (array[2] == array[5]) --> si (3 == 5)  
                si (array[2] == array[6]) --> si (3 == 5)  
                si (array[2] == array[7]) --> si (3 == 5)  
                si (array[2] == array[8]) --> si (3 == 6)
                si (array[2] == array[9]) --> si (3 == 7)    

                si (array[3] == array[0]) --> si (3 == 1) 
                si (array[3] == array[1]) --> si (3 == 2)
                si (array[3] == array[2]) --> si (3 == 3) --> cantidad = 5  
                si (array[3] == array[3]) --> si (3 == 3) --> cantidad = 6  
                si (array[3] == array[4]) --> si (3 == 4)  
                si (array[3] == array[5]) --> si (3 == 5)  
                si (array[3] == array[6]) --> si (3 == 5)  
                si (array[3] == array[7]) --> si (3 == 5)  
                si (array[3] == array[8]) --> si (3 == 6)
                si (array[3] == array[9]) --> si (3 == 7)    
                
                si (array[4] == array[0]) --> si (4 == 1) 
                si (array[4] == array[1]) --> si (4 == 2)
                si (array[4] == array[2]) --> si (4 == 3)  
                si (array[4] == array[3]) --> si (4 == 3)  
                si (array[4] == array[4]) --> si (4 == 4) --> cantidad = 7 
                si (array[4] == array[5]) --> si (4 == 5)  
                si (array[4] == array[6]) --> si (4 == 5)  
                si (array[4] == array[7]) --> si (4 == 5)  
                si (array[4] == array[8]) --> si (4 == 6)
                si (array[4] == array[9]) --> si (4 == 7)    

                si (array[5] == array[0]) --> si (5 == 1) 
                si (array[5] == array[1]) --> si (5 == 2)
                si (array[5] == array[2]) --> si (5 == 3)  
                si (array[5] == array[3]) --> si (5 == 3)
                si (array[5] == array[4]) --> si (5 == 4)  
                si (array[5] == array[5]) --> si (5 == 5) --> cantidad = 8    
                si (array[5] == array[6]) --> si (5 == 5) --> cantidad = 9    
                si (array[5] == array[7]) --> si (5 == 5) --> cantidad = 10    
                si (array[5] == array[8]) --> si (5 == 6)
                si (array[5] == array[9]) --> si (5 == 7)    

                si (array[6] == array[0]) --> si (5 == 1) 
                si (array[6] == array[1]) --> si (5 == 2)
                si (array[6] == array[2]) --> si (5 == 3)  
                si (array[6] == array[3]) --> si (5 == 3)
                si (array[6] == array[4]) --> si (5 == 4)  
                si (array[6] == array[5]) --> si (5 == 5) --> cantidad = 11    
                si (array[6] == array[6]) --> si (5 == 5) --> cantidad = 12   
                si (array[6] == array[7]) --> si (5 == 5) --> cantidad = 13    
                si (array[6] == array[8]) --> si (5 == 6)
                si (array[6] == array[9]) --> si (5 == 7)      
                
                si (array[7] == array[0]) --> si (5 == 1) 
                si (array[7] == array[1]) --> si (5 == 2)
                si (array[7] == array[2]) --> si (5 == 3)  
                si (array[7] == array[3]) --> si (5 == 3)
                si (array[7] == array[4]) --> si (5 == 4)  
                si (array[7] == array[5]) --> si (5 == 5) --> cantidad = 14    
                si (array[7] == array[6]) --> si (5 == 5) --> cantidad = 15   
                si (array[7] == array[7]) --> si (5 == 5) --> cantidad = 16    
                si (array[7] == array[8]) --> si (5 == 6)
                si (array[7] == array[9]) --> si (5 == 7)                 

                si (array[8] == array[0]) --> si (6 == 1) 
                si (array[8] == array[1]) --> si (6 == 2)
                si (array[8] == array[2]) --> si (6 == 3)  
                si (array[8] == array[3]) --> si (6 == 3)
                si (array[8] == array[4]) --> si (6 == 4)  
                si (array[8] == array[5]) --> si (6 == 5)     
                si (array[8] == array[6]) --> si (6 == 5)  
                si (array[8] == array[7]) --> si (6 == 5)   
                si (array[8] == array[8]) --> si (6 == 6) --> cantidad = 17 
                si (array[8] == array[9]) --> si (6 == 7)  

                si (array[9] == array[0]) --> si (7 == 1) 
                si (array[9] == array[1]) --> si (7 == 2)
                si (array[9] == array[2]) --> si (7 == 3)  
                si (array[9] == array[3]) --> si (7 == 3)
                si (array[9] == array[4]) --> si (7 == 4)  
                si (array[9] == array[5]) --> si (7 == 5)    
                si (array[9] == array[6]) --> si (7 == 5)   
                si (array[9] == array[7]) --> si (7 == 5)   
                si (array[9] == array[8]) --> si (7 == 6)
                si (array[9] == array[9]) --> si (7 == 7) --> cantidad = 18                   
*/
                arregloCantidadValores[i] = cantidad;
                System.out.println(arregloCantidadValores[i]);
                }
/* 
                arregloCantidadValores[0] = 1 (Luego entra al primer FOR y se reinicia 'cantidad')
                arregloCantidadValores[1] = 1
                arregloCantidadValores[2] = 2
                arregloCantidadValores[3] = 2
                arregloCantidadValores[4] = 1
                arregloCantidadValores[5] = 3
                arregloCantidadValores[6] = 3
                arregloCantidadValores[7] = 3
                arregloCantidadValores[8] = 1
                arregloCantidadValores[9] = 1
*/

                // Luego obtenemos el valor de la mayor ocurrencia (mas veces repetido)
                // y el indice o pocicion para obtener el numero mas repetido
                int indice = 0; // indice del elemento con la mayor ocurrencia (mas repetido)
                int max = 0; // la cantidad mayor de veces (la mayor ocurrencia)
                for (int i = 0; i < 10; i++) {
                if (max < arregloCantidadValores[i]) {
                    max = arregloCantidadValores[i];
                    indice = i;
                }
                }
/* 
                si (0 < arregloCantidadValores[0]) ==> true
                max = 1
                indice = 0
                si (1 < arregloCantidadValores[1]) ==> false
                si (1 < arregloCantidadValores[2]) ==> true
                max = 2
                indice = 2
                si (2 < arregloCantidadValores[3]) ==> false
                si (2 < arregloCantidadValores[4]) ==> false
                si (2 < arregloCantidadValores[5]) ==> true
                max = 3
                indice = 5
                si (3 < arregloCantidadValores[6]) ==> false
                si (3 < arregloCantidadValores[7]) ==> false
                si (3 < arregloCantidadValores[8]) ==> false
                si (3 < arregloCantidadValores[9]) ==> false
*/

                System.out.println("La mayor ocurrencia es: " + max);
                System.out.println("El elemento que mas se repite es: " + array[indice]);
                System.out.println("el elemento " + array[indice] + " esta repetido " + max + " veces!");
                }
/* 
                La mayor ocurrencia es: 3
                El elemento que mas se repite es: array[5] = 5
                el elemento 5 esta repetido 3 veces!
*/        
}