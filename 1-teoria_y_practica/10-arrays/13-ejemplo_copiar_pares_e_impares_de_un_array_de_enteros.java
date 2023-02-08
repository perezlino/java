/*  ======================================================
    ==== COPIAR PARES E IMPARES DE UN ARRAY DE ENTEROS ===
    ======================================================

    Ahora la idea es distinta, detectar en un array de enteros, cuales son impares y pares. Pero 
    además crear un array para cada uno, es decir, un array para los pares, otro para los impares
    y vamos a copiar los pares en el nuevo array de los pares y los impares en el array de los 
    impares.

*/
    public class EjemploArreglosParesImpares {
        public static void main(String[] args) {

            int[] a, pares, impares;
            int totalPares = 0, totalImpares = 0;
            a = new int[10];
    
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
    
            for(int i = 0; i < a.length; i++){
    
                if(a[i]%2 == 0){
                    totalPares++;
                } else {
                    totalImpares++;
                }
            }
            System.out.println("totalPares = " + totalPares);   // totalPares = 5
            System.out.println("totalPares = " + totalImpares); // totalImpares = 5
    
    
            pares = new int[totalPares];      // pares = new int[5];
            impares = new int[totalImpares];  // impares = new int[5]
    
            int j = 0;
            int k = 0;
            for(int i = 0; i < a.length; i++){
                if(a[i] % 2 == 0){
                    pares[j++] = a[i];
                } else {
                    impares[k++] = a[i];
                }
            }
    /* 
            if(a[0] % 2 == 0) ==> if(1 % 2 == 0) ==> false
            else
            impares[0] = a[0] = 1     -----------> Luego 'k' se aumenta en 1    
    
            if(a[1] % 2 == 0) ==> if(2 % 2 == 0) ==> true
            pares[0] = a[1] = 2     -----------> Luego 'j' se aumenta en 1  
    
            if(a[2] % 2 == 0) ==> if(3 % 2 == 0) ==> false
            else
            impares[1] = a[2] = 3     -----------> Luego 'k' se aumenta en 1    
    
            if(a[3] % 2 == 0) ==> if(4 % 2 == 0) ==> true
            pares[1] = a[3] = 4     -----------> Luego 'j' se aumenta en 1  
    
            if(a[4] % 2 == 0) ==> if(5 % 2 == 0) ==> false
            else
            impares[2] = a[4] = 5     -----------> Luego 'k' se aumenta en 1    
    
            if(a[5] % 2 == 0) ==> if(6 % 2 == 0) ==> true
            pares[2] = a[5] = 6     -----------> Luego 'j' se aumenta en 1  
    
            if(a[6] % 2 == 0) ==> if(7 % 2 == 0) ==> false
            else
            impares[3] = a[6] = 7     -----------> Luego 'k' se aumenta en 1    
    
            if(a[7] % 2 == 0) ==> if(8 % 2 == 0) ==> true
            pares[3] = a[7] = 8     -----------> Luego 'j' se aumenta en 1  
    
            if(a[8] % 2 == 0) ==> if(9 % 2 == 0) ==> false
            else
            impares[4] = a[8] = 9     -----------> Luego 'k' se aumenta en 1    
    
            if(a[9] % 2 == 0) ==> if(10 % 2 == 0) ==> true
            pares[4] = a[9] = 10     -----------> Luego 'j' se aumenta en 1 
    
            Se sale del FOR dado que no se cumple la condicion 10 < 10
    */
    
            System.out.println("Pares");
            for(int i = 0; i < pares.length; i++){
                System.out.print(pares[i] + " ");
            }
    /* 
            Pares
            2 4 6 8 10
    */
    
            System.out.println("\nImpares");
            for(int i = 0; i < impares.length; i++){
                System.out.print(impares[i] + " ");
            }
    /* 
            Impares
            1 3 5 7 9
    */             
        }
    }