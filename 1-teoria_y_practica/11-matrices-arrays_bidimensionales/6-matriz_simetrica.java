/*  ======================================================
    ================== MATRIZ SIMETRICA ==================
    ======================================================
  
    Una matriz simétrica es una matriz de orden n con el mismo número de filas y columnas donde 
    su matriz traspuesta es igual a la matriz original. En otras palabras, una matriz simétrica 
    es una matriz cuadrada y es idéntica a la matriz de después de haber cambiado las filas por 
    columnas y las columnas por filas.

*/
    public class EjemploMatricesSimetrica {
        public static void main(String[] args) {
            boolean simetrica = true;

            int[][] matriz = {
                    {1,2,3,4},
                    {2,1,0,5},
                    {3,0,1,6},
                    {4,5,6,7}
            };
/* 
                         _______________________________
                        |	0	|	1	|	2	|	3	|	 
             _______	|-------|-------|-------|-------|
            |   0   |	|	1	|	2	|	3	|   4	|
            |	1   |	|	2	|   1	|   0	|	5	|		
            |   2   |   |   3   |   0   |   1   |   6   |     
            |   3   |   |   4   |   5   |   6   |   7   |
            |-------|   |-------|-------|-------|-------|
*/             
                        // i = 0 ; i < 4 ; i++
            salir:  for(int i = 0; i < matriz.length; i++){ 
                            // j = 0 ; j < i ; j++
                        for(int j = 0; j < i; j++){
                            // Se utilizo la logica de que si una matriz no es igual a su transpuesta
                            // no existe simetria
                            if(matriz[i][j] != matriz[j][i]){
                                simetrica = false;
                                break salir;
                            }
                        }
                    }
/* 
            Con i = 0 no se ejecuta porque no cumple la condicion j < i
            
            Con i= 1
            --------
            si (matriz[1][0] != matriz[0][1]) FALSE
            si (2 != 2)

            Con i= 2
            --------            
            si (matriz[2][0] != matriz[0][2]) FALSE
            si (3 != 3)
            si (matriz[2][1] != matriz[1][2]) FALSE
            si (0 != 0)

            Con i= 3
            --------            
            si (matriz[3][0] != matriz[0][3]) FALSE
            si (4 != 4)
            si (matriz[3][1] != matriz[1][3]) FALSE
            si (5 != 5) 
            si (matriz[3][2] != matriz[2][3]) FALSE
            si (6 != 6)                         
*/
            if(simetrica){
                System.out.println("La matriz es simétrica");
            } else{
                System.out.println("La matriz no es simétrica");
            }
/* 
            La matriz es simétrica
*/            
        }
    }