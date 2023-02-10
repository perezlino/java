/*  ======================================================
    ========== CONVERTIR A LA MATRIZ TRANSPUESTA =========
    ======================================================
  
*/
    public class EjemploMatricesTranspuesta {
        public static void main(String[] args) {
            int[][] matriz = {
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}
            };
/* 
                         _______________________________
                        |	0	|	1	|	2	|	3	|	 
             _______	|-------|-------|-------|-------|
            |   0   |	|	1	|	2	|	3	|   4	|
            |	1   |	|	5	|   6	|   7	|	8	|		
            |   2   |   |   9   |  10   |  11   |  12   |     
            |   3   |   |  13   |  14   |  15   |  16   |
            |-------|   |-------|-------|-------|-------|
*/             

            System.out.println("Matriz original");
                // i = ; i < 4 ; i++
            for(int i = 0; i < matriz.length; i++){
                    // j = 0 ; j < 4 ; j++
                for(int j = 0; j < matriz[i].length; j++){
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
/* 
            Matriz original
            1       2       3       4
            5       6       7       8
            9       10      11      12
            13      14      15      16 
*/            
            int aux;
                // i = 0; i < 4 ; i++
            for(int i = 0; i < matriz.length; i++){
                    // j = 0 ; j < i ; j++
                for(int j = 0; j < i; j++){
                    aux = matriz[i][j];
                    matriz[i][j] = matriz[j][i];
                    matriz[j][i]= aux;
                }
            }
/* 
            Con i = 0 no se ejecuta porque no cumple la condicion j < i
            
            Con i= 1
            --------
            aux = matriz[1][0]
            matriz[1][0] = matriz[0][1]
            matriz[1][0] = 2

            Con i= 2
            --------            
            aux = matriz[2][0]
            matriz[2][0] = matriz[0][2]
            matriz[2][0] = 3

            aux = matriz[2][1]
            matriz[2][1] = matriz[1][2]
            matriz[2][1] = 7           

            Con i= 3
            -------- 
            aux = matriz[3][0]
            matriz[3][0] = matriz[0][3]
            matriz[3][0] = 4

            aux = matriz[3][1]
            matriz[3][1] = matriz[1][3]
            matriz[3][1] = 8

            aux = matriz[3][2]
            matriz[3][2] = matriz[2][3]
            matriz[3][2] = 12              
                      
*/

            System.out.println("Matriz transpuesta");
            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz[i].length; j++){
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
/* 
            Matriz transpuesta
            1       5       9       13
            2       6       10      14
            3       7       11      15
            4       8       12      16 
*/            
        }
    }