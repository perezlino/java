/*  =================================================================
    IMPRIMIENDO EL I-ESIMO POR EL PRINCIPIO Y EL I-ESIMO POR EL FINAL
    =================================================================

*/
    public class EjemploArreglosOrdenPrincipioFinal {
        public static void main(String[] args) {

            int[] numeros = new int[10];
            int[] a = new int[10];

            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = i + 1;
                System.out.println("numeros[" + i + "] = " + numeros[i]);
            }
/*          
            numeros[0] = 1
            numeros[1] = 2     
            numeros[2] = 3     
            numeros[3] = 4     
            numeros[4] = 5     
            numeros[5] = 6     
            numeros[6] = 7     
            numeros[7] = 8     
            numeros[8] = 9     
            numeros[9] = 10 
*/
            int aux = 0;
            for (int i = 0; i < numeros.length - i; i++) {
                a[aux++] = numeros[i];
                a[aux++] = numeros[numeros.length - 1 - i];
            }
/* 
                a[0] = numeros[0] = 1           ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 1
                a[1] = numeros[10 - 1 - 0] = 10 ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 2
                a[2] = numeros[1] = 2           ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 3
                a[3] = numeros[10 - 1 - 1] = 9  ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 4
                a[4] = numeros[2] = 3           ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 5
                a[5] = numeros[10 - 1 - 2] = 8  ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 6
                a[6] = numeros[3] = 4           ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 7
                a[7] = numeros[10 - 1 - 3] = 7  ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 8
                a[8] = numeros[4] = 5           ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 9
                a[9] = numeros[10 - 1 - 4] = 6  ===> y el indice 'aux' aumenta en 1 ===> Aumenta a 10
                
                Pero ya no se cumple la condicion del for, dado que, 5 < 5 no se cumple.

                Por tanto el Array 'a' queda de la siguiente manera:

                a[0] = 1
                a[1] = 10
                a[2] = 2
                a[3] = 9
                a[4] = 3
                a[5] = 8
                a[6] = 4
                a[7] = 7
                a[8] = 5                                                                                                                                
                a[9] = 6                


*/
            for (int i = 0; i < a.length; i++) {
                System.out.println("indice = " + i + " valor: " + a[i]);
            }

        }
    }
/* 

indice = 0 valor: 1
indice = 1 valor: 10
indice = 2 valor: 2
indice = 3 valor: 9
indice = 4 valor: 3
indice = 5 valor: 8
indice = 6 valor: 4
indice = 7 valor: 7
indice = 8 valor: 5
indice = 9 valor: 6 

*/