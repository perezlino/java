/*  ======================================================
    === OBTENER EL NUMERO MAYOR DE UN ARRAY DE ENTEROS ===
    ======================================================

*/
    import java.util.Scanner;

    public class EjemploArreglosNumMayor {
        public static void main(String[] args) {

            int[] a = new int[5];
            Scanner s = new Scanner(System.in);

            System.out.println("Ingrese 5 enteros:");
            for(int i = 0; i < a.length; i++){
                a[i] = s.nextInt();
            }
/* 
            Ingrese 5 enteros:
            10                 ====> a[0]
            9                  ====> a[1]
            8                  ====> a[2]
            7                  ====> a[3]
            20                 ====> a[4]
*/

            int max = 0;
            for(int i = 1; i < a.length; i++){
                max = (a[max] > a[i])? max: i;
            }
/* 
            max = (a[0] > a[1]) ? max : i;
            max = (10 > 9) ? max : i;
            max = 0

            max = (a[0] > a[2]) ? max : i;
            max = (10 > 8) ? max : i;
            max = 0

            max = (a[0] > a[3]) ? max : i;
            max = (10 > 7) ? max : i;
            max = 0

            max = (a[0] > a[4]) ? max : i;
            max = (10 > 20) ? max : i;
            max = 4
*/
            System.out.println("max = " + a[max]);

/*          max = 20                                    */

        }
    }
/*


    SIN UTILIZAR SCANNER
    ====================
*/
    public class EjemploArreglosNumMayor {

        public static void main(String[] args) {

            int[] a = new int[5];
            
            a[0] = 10;
            a[1] = 9;
            a[2] = 8;
            a[3] = 7;
            a[4] = 20;

            int max = 0;
            for(int i = 1; i < a.length; i++){
                max = (a[max] > a[i])? max: i;
            }
/* 
            max = (a[0] > a[1]) ? max : i;
            max = (10 > 9) ? max : i;
            max = 0

            max = (a[0] > a[2]) ? max : i;
            max = (10 > 8) ? max : i;
            max = 0

            max = (a[0] > a[3]) ? max : i;
            max = (10 > 7) ? max : i;
            max = 0

            max = (a[0] > a[4]) ? max : i;
            max = (10 > 20) ? max : i;
            max = 4
*/

        System.out.println("max = " + a[max]);

/*          max = 20                                    */

    }
}