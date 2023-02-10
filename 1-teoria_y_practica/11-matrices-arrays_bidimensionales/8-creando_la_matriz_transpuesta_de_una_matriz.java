/*  ======================================================
    ==== CREANDO LA MATRIZ TRANSPUESTA DE UNA MATRIZ =====
    ======================================================
  
*/
    public class EjemploMatricesTransponerMatriz {
        public static void main(String[] args) {

            int[][] a, b;
            a = new int[8][4];
            b = new int[4][8];

            for(int i = 0; i < a.length; i++){
                for(int j = 0; j < a[i].length; j++){
                    a[i][j] = i+j*3;
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }
/* 
            0       3       6       9
            1       4       7       10
            2       5       8       11
            3       6       9       12
            4       7       10      13
            5       8       11      14
            6       9       12      15
            7       10      13      16
*/            

            for(int i = 0; i < a.length; i++){
                for(int j = 0; j < a[i].length; j++){
                    b[j][i] = a[i][j];
                }
            }

            System.out.println("La matriz transpuesta b:");
            for(int i = 0; i < b.length; i++){
                for(int j = 0; j < b[i].length; j++){
                    System.out.print(b[i][j] + "\t");
                }
                System.out.println();
            }
/* 
            La matriz transpuesta b:
            0       1       2       3       4       5       6       7
            3       4       5       6       7       8       9       10
            6       7       8       9       10      11      12      13
            9       10      11      12      13      14      15      16 
*/            
        }
    }