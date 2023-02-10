/*  ======================================================
    ===== TAMAÑOS DE COLUMNAS VARIABLE EN UNA MATRIZ =====
    ======================================================
  
*/
    public class EjemploMatricesColumnasVariable {
        public static void main(String[] args) {

            // Vamos a definir qué va a tener tres filas, pero las columnas va a ser variable.
            // Por lo tanto omitimos el numero (la cantidad).
            int[][] matriz = new int[3][];

            matriz[0] = new int[2]; // fila 0 con 2 elementos (2 columnas)
            matriz[1] = new int[3]; // fila 1 con 3 elementos (3 columnas)
            matriz[2] = new int[4]; // fila 2 con 4 elementos (4 columnas)

            System.out.println("matriz length: " + matriz.length);
            System.out.println("fila 0 length: " + matriz[0].length);
            System.out.println("fila 1 length: " + matriz[1].length);
            System.out.println("fila 2 length: " + matriz[2].length);
/* 
            matriz length: 3
            fila 0 length: 2
            fila 1 length: 3
            fila 2 length: 4 
*/
            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz[i].length; j++){
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();
/* 
            0       0
            0       0       0
            0       0       0       0
*/
            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz[i].length; j++){
                    matriz[i][j] = i*j;
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
/* 
            0       0
            0       1       2
            0       2       4       6 
*/        
        }
    }