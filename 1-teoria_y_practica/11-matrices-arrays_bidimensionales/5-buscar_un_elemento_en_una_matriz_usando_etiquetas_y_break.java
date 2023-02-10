/*  ======================================================
    ========== BUSCAR UN ELEMENTO EN UNA MATRIZ ==========
    ======================================================
  
*/
    public class EjemploMatricesBuscar {
        public static void main(String[] args) {

            int[][] matrizDeEnteros = {
                    {35, 90, 3, 1978},
                    {15, 2020, 10, 5},
                    {677, 127, 32767, 1999}
            };
/* 
                         _______________________________
                        |	0	|	1	|	2	|	3	|	 
             _______	|-------|-------|-------|-------|
            |   0   |	|	35	|	90	|	  3	| 1978	|
            |	1   |	|	15	| 2020	|    10	|	 5	|		
            |   2   |   |  677  |  127  | 32767 | 1999  |     
            |-------|   |-------|-------|-------|-------|
*/        
    
            System.out.println(matrizDeEnteros.length); // 3
            
            int elementoBuscar = 1999;
            boolean encontrado = false;
    
            int i;
            int j = 0;
                    // i = 0 ; i < 3 ; i++
            buscar: for(i = 0; i < matrizDeEnteros.length; i++){
                        // j = 0 ; j < 4 ; j++
                        for(j = 0; j < matrizDeEnteros[i].length; j++){
                            if(matrizDeEnteros[i][j] == elementoBuscar){
                                encontrado = true;
                                break buscar;
                            }
                        }
                    }
/* 
                    si (matrizDeEnteros[0][0] = 1999) FALSE
                    si (35 == 1999)
                    si (matrizDeEnteros[0][1] = 1999) FALSE
                    si (90 == 1999) 
                    si (matrizDeEnteros[0][2] = 1999) FALSE
                    si (3 == 1999)
                    si (matrizDeEnteros[0][3] = 1999) FALSE
                    si (1978 == 1999)
    
                    si (matrizDeEnteros[1][0] = 1999) FALSE
                    si (15 == 1999)
                    si (matrizDeEnteros[1][1] = 1999) FALSE
                    si (2020 == 1999) 
                    si (matrizDeEnteros[1][2] = 1999) FALSE
                    si (10 == 1999)
                    si (matrizDeEnteros[1][3] = 1999) FALSE
                    si (5 == 1999)
    
                    si (matrizDeEnteros[2][0] = 1999) FALSE
                    si (677 == 1999)
                    si (matrizDeEnteros[2][1] = 1999) FALSE
                    si (127 == 1999) 
                    si (matrizDeEnteros[2][2] = 1999) FALSE
                    si (32767 == 1999)
                    si (matrizDeEnteros[2][3] = 1999) TRUE !!!
                    si (1999 == 1999)
*/
            if(encontrado){
                System.out.println("Encontrado " + elementoBuscar + " en las coordenadas " + i + "," + j);
            } else {
                System.out.println(elementoBuscar + " no se encontró en la matriz!");
            }
/*
            Encontrado 1999 en las coordenadas 2,3
*/        
        }
    }