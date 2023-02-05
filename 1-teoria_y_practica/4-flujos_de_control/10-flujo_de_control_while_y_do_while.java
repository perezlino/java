/*  ======================================================
    ========= FLUJO DE CONTROL - WHILE Y DO WHILE ========
    ======================================================

    
    WHILE
    =====
*/
    public class SentenciaWhile {
        public static void main(String[] args) {

            System.out.println("------------ EJEMPLO 1 ------------");
            int i = 0;
            while(i <= 5){
                System.out.println("i = " + i);
                i++;
            }

            System.out.println("------------ EJEMPLO 2 ------------");
            i = 0;
            boolean prueba = true;

            while(prueba){

                if(i == 7){
                    prueba = false;
                }
                System.out.println("i = " + i);
                i++;
        }
/*

------------ EJEMPLO 1 ------------
i = 0
i = 1
i = 2
i = 3
i = 4
i = 5
------------ EJEMPLO 2 ------------
i = 0
i = 1
i = 2
i = 3
i = 4
i = 5
i = 6
i = 7



    DO WHILE
    ========
*/
public class SentenciaWhile {

    public static void main(String[] args) {

        System.out.println("------------ EJEMPLO 1 ------------");
        prueba = false;
        do {
            System.out.println("se ejecuta al menos una vez");
        } while (prueba);


        System.out.println("------------ EJEMPLO 2 ------------");

        prueba = true;
        i = 0;

        do {
            if(i == 10){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        } while (prueba);
    }
}
/*

------------ EJEMPLO 1 ------------
se ejecuta al menos una vez
------------ EJEMPLO 2 ------------
i = 0
i = 1
i = 2
i = 3
i = 4
i = 5
i = 6
i = 7
i = 8
i = 9
i = 10

*/