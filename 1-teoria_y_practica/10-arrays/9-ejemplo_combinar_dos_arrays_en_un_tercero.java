/*  ======================================================
    ========= COMBINAR DOS ARRAYS EN UN TERCERO ==========
    ======================================================

    La idea es llenar el array A y el array B y a partir de los datos, crear o poblar los datos del 
    array C, es decir, de manera combinada.

*/
    public class EjemploArreglosCombinados {

        public static void main(String[] args) {

            int[] a, b, c;
            a = new int[10];
            b = new int[10];
            c = new int[20];
    
            for (int i = 0; i < a.length; i++) {
                a[i] = i + 1;
                System.out.println("a[" + i + "] = " + a[i]);
            }
    /* 
            a[0] = 1
            a[1] = 2
            a[2] = 3
            a[3] = 4
            a[4] = 5
            a[5] = 6
            a[6] = 7
            a[7] = 8
            a[8] = 9
            a[9] = 10     
    */    
    
            for (int i = 0; i < b.length; i++) {
                b[i] = (i + 1) * 5;
                System.out.println("b[" + i + "] = " + b[i]);
            }
    /* 
            b[0] = 5
            b[1] = 10
            b[2] = 15
            b[3] = 20
            b[4] = 25
            b[5] = 30
            b[6] = 35
            b[7] = 40
            b[8] = 45
            b[9] = 50
    */        
    
            int aux = 0;
            for (int i = 0; i < b.length; i++) {
                c[aux++] = a[i];
                c[aux++] = b[i];
            }
    /* 
            c[0] = a[0] = 1           ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 1
            c[1] = b[0] = 5           ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 2
            c[2] = a[1] = 2           ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 3
            c[3] = b[1] = 10          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 4
            c[4] = a[2] = 3           ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 5
            c[5] = b[2] = 15          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 6
            c[6] = a[3] = 4           ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 7
            c[7] = b[3] = 20          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 8
            c[8] = a[4] = 5           ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 9
            c[9] = b[4] = 25          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 10
            c[10] = a[5] = 6           ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 9
            c[11] = b[5] = 30          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 10
            c[12] = a[6] = 7           ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 9
            c[13] = b[6] = 35          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 10
            c[14] = a[7] = 8           ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 9
            c[15] = b[7] = 40          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 10
            c[16] = a[8] = 9           ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 9
            c[17] = b[8] = 45          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 10
            c[18] = a[9] = 10           ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 9
            c[19] = b[9] = 50          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 10                                
    
            
            Pero ya no se cumple la condicion del for, dado que, 10 < 10 no se cumple.
    
            Por tanto el Array 'c' queda de la siguiente manera:
    */
            for (int i = 0; i < c.length; i++) {
                System.out.println("c[" + i + "] = " + c[i]);
            }        
    /*
            c[0] = 1
            c[1] = 5
            c[2] = 2
            c[3] = 10
            c[4] = 3
            c[5] = 15
            c[6] = 4
            c[7] = 20
            c[8] = 5
            c[9] = 25
            c[10] = 6
            c[11] = 30
            c[12] = 7
            c[13] = 35
            c[14] = 8
            c[15] = 40
            c[16] = 9
            c[17] = 45
            c[18] = 10
            c[19] = 50  
    */        
        }
    }