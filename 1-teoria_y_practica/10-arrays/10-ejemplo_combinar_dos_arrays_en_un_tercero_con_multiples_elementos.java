/*  =========================================================
    COMBINAR DOS ARRAYS EN UN TERCERO CON MULTIPLES ELEMENTOS
    =========================================================

    Veamos otro ejemplo. Ahora la idea es copiar de cada array de A y B no solamente un elemento, sino 
    dos elementos o más. Por ejemplo, que vaya por cada iteración, dos elementos de A y dos elementos de B
    o tres elementos de A y tres elementos de B. Para este ejemplo, se van a agregar 2 elementos por array,
    agregandose en total 4 elementos por cada iteración al array C. Es importante, tener en cuenta que 
    el numero de elementos del array C debe ser múltiplo de la cantidad de elementos que se irán agregando,
    es decir, si son dos tiene que ser múltiplo de dos. En este caso 24 es múltiplo de dos. Así que ningún 
    problema. Si fueran tres, 24 tambien es multiplo de 3 o  el tamaño tendría que ser 9 o 12 y 24, por 
    ejemplo.

*/
    public class EjemploArreglosCombinados {

        public static void main(String[] args) {

            int[] a, b, c;
            a = new int[12];
            b = new int[12];
            c = new int[24];

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
            a[10] = 11
            a[11] = 12
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
            b[10] = 55
            b[11] = 60
*/
            int aux = 0;
            for (int i = 0; i < b.length; i+=3) {
                for(int j = 0; j < 3; j++) {
                    c[aux++] = a[i+j];
                }
/*
            c[0] = a[0 + 0] = 1           ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 1
            c[1] = a[0 + 1] = 2           ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 2
            c[2] = a[0 + 2] = 3           ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 3

                    =========== Sale del FOR (Continua en el FOR de b) ===========
                             =========== Regresa al FOR a ===========

            c[6] = a[3 + 0] = 4          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 7
            c[7] = a[3 + 1] = 5          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 8
            c[8] = a[3 + 2] = 6          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 9

                    =========== Sale del FOR (Continua en el FOR de b) ===========
                             =========== Regresa al FOR a ===========                    

            c[12] = a[6 + 0] = 7          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 13
            c[13] = a[6 + 1] = 8          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 14
            c[14] = a[6 + 2] = 9          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 15  
            
                    =========== Sale del FOR (Continua en el FOR de b) =========== 
                             =========== Regresa al FOR a ===========                               

            c[18] = a[9 + 0] = 10          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 19
            c[19] = a[9 + 1] = 11          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 20
            c[20] = a[9 + 2] = 12          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 21   

                    =========== Sale del FOR (Continua en el FOR de b) =========== 

*/
                for(int j = 0; j < 3; j++) {
                    c[aux++] = b[i+j];
                }
            }
/* 
            c[3] = b[3 + 0] = 5           ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 4
            c[4] = b[3 + 1] = 10          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 5
            c[5] = b[3 + 2] = 15          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 6
                    
                                =========== Sale del FOR ===========
                =========== i toma el valor de 3 e ingresa al FOR de a ===========
                             =========== Regresa al FOR b ===========                

            c[9] = b[3 + 0] = 20           ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 10
            c[10] = b[3 + 1] = 25          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 11
            c[11] = b[3 + 2] = 30          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 12               

                                =========== Sale del FOR ===========
                =========== i toma el valor de 6 e ingresa al FOR de a ===========
                             =========== Regresa al FOR b ===========                

            c[15] = b[6 + 0] = 35          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 16
            c[16] = b[6 + 1] = 40          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 17
            c[17] = b[6 + 2] = 45          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 18               

                                =========== Sale del FOR ===========
                =========== i toma el valor de 9 e ingresa al FOR de a ===========  
                             =========== Regresa al FOR b ===========                              

            c[21] = b[9 + 0] = 50          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 22
            c[22] = b[9 + 1] = 55          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 23
            c[23] = b[9 + 2] = 60          ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 24 
            
                                =========== Sale del FOR ===========
              =========== i toma el valor de 12 PERO ESTO NO CUMPLE LA CONDICION ===========              

                    Se termina el bucle FOR dado que no se cumple que 12 < 12

*/
            for (int i = 0; i < c.length; i++) {
                System.out.println("c[" + i + "] = " + c[i]);
            }
/*
Por lo tanto, para el array C obtengo lo siguiente:

            c[0] = 1
            c[1] = 2
            c[2] = 3
            c[3] = 5
            c[4] = 10
            c[5] = 15
            c[6] = 4
            c[7] = 5
            c[8] = 6
            c[9] = 20
            c[10] = 25
            c[11] = 30
            c[12] = 7
            c[13] = 8
            c[14] = 9
            c[15] = 35
            c[16] = 40
            c[17] = 45
            c[18] = 10
            c[19] = 11
            c[20] = 12
            c[21] = 50
            c[22] = 55
            c[23] = 60
*/            
        }
    }