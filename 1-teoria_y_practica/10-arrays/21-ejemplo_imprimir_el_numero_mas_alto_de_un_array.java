/*  ======================================================
    ======= IMPRIMIR EL NUMERO MAS ALTO DE UN ARRAY ======
    ======================================================

    Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99), 
    por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.

*/
    import java.util.Scanner;

    public class ProgramaImprimirMasAlto {

        public static void main(String[] args) {
            
            int[] array = new int[7];

            array[0] = 14;
            array[1] = 33;
            array[2] = 15;
            array[3] = 36;
            array[4] = 78;
            array[5] = 21;
            array[6] = 43;

            // CODIGO PARA PEDIR NUMEROS POR TERMINAL 

            // Scanner scanner = new Scanner(System.in);
            // for (int i = 0; i < 7; i++) {
            //     System.out.println("Ingrese un numero de 11 a 99: ");
            //     arreglo[i] = scanner.nextInt();
            // }

            int max = 0;

            // luego obtenemos el valor mayor
            for (int i = 0; i < 7; i++) {
                max = (max > array[i])? max: array[i];
            }
/* 
            max = (0 > array[0]) ? max : array[0]
            max = (0 > 14) ? 0 : 14

            max = (14 > array[1]) ? max : array[1]
            max = (14 > 33) ? 14 : 33

            max = (33 > array[2]) ? max : array[2]
            max = (33 > 15) ? 33 : 15

            max = (33 > array[3]) ? max : array[3]
            max = (33 > 36) ? 33 : 36

            max = (36 > array[4]) ? max : array[4]
            max = (36 > 78) ? 36 : 78

            max = (78 > array[5]) ? max : array[5]
            max = (78 > 21) ? 78 : 21

            max = (78 > array[6]) ? max : array[6]
            max = (78 > 43) ? 78 : 43

            max = 78
*/
            System.out.println("El valor mas alto es: " + max);
        }
/* 
        El valor mas alto es: 78
*/        
    }