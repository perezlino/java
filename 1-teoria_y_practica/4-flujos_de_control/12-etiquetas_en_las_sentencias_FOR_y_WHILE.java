/*  ======================================================
    ======= ETIQUETAS EN LAS SENTENCIAS FOR Y WHILE ======
    ======================================================

    Utilizando un BREAK y el CONTINUE “etiquetado”, podemos indicar qué bucle vamos a interrumpir 
    o continuar su ejecución.
*/
    public class SentenciasBucleEtiquetas {
        public static void main(String[] args) {

            System.out.println("------------ EJEMPLO 1 ------------");
            bucle:  // <--- Etiquetamos el bucle
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (i == 2) {
                        continue bucle;
                    }
                    System.out.println("i = " + i + " , j = " + j);
                }
            }
        /*

        ------------ EJEMPLO 1 ------------
        i = 0 , j = 0
        i = 0 , j = 1
        i = 0 , j = 2
        i = 0 , j = 3
        i = 0 , j = 4
        i = 1 , j = 0
        i = 1 , j = 1
        i = 1 , j = 2
        i = 1 , j = 3
        i = 1 , j = 4
        i = 3 , j = 0
        i = 3 , j = 1
        i = 3 , j = 2
        i = 3 , j = 3
        i = 3 , j = 4
        i = 4 , j = 0
        i = 4 , j = 1
        i = 4 , j = 2
        i = 4 , j = 3
        i = 4 , j = 4

        */            

        System.out.println("------------ EJEMPLO 2 ------------");

        // Sin bucle obtenemos lo mismo. Sin embargo, este "continue" afecta al 'for' más interno
        //bucle:  // <--- Etiquetamos el bucle
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue; //bucle;
                }
                System.out.println("i = " + i + " , j = " + j);
            }
        }
    /*

        ------------ EJEMPLO 2 ------------
        i = 0 , j = 0
        i = 0 , j = 1
        i = 0 , j = 2
        i = 0 , j = 3
        i = 0 , j = 4
        i = 1 , j = 0
        i = 1 , j = 1
        i = 1 , j = 2
        i = 1 , j = 3
        i = 1 , j = 4
        i = 3 , j = 0
        i = 3 , j = 1
        i = 3 , j = 2
        i = 3 , j = 3
        i = 3 , j = 4
        i = 4 , j = 0
        i = 4 , j = 1
        i = 4 , j = 2
        i = 4 , j = 3
        i = 4 , j = 4

        */  

        System.out.println("------------ EJEMPLO 3 ------------");
        bucle1:
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 8; j++) {
                if (i == 6 || i == 7) {
                    System.out.println("Dia " + i + ": descanso de fin de semana!");
                    continue bucle1;
                }
                System.out.println("Dia " + i + ", trabajando a las " + j + "hrs.");
            }
        }
    /*

    ------------ EJEMPLO 3 ------------
    Dia 1, trabajando a las 1hrs.
    Dia 1, trabajando a las 2hrs.
    Dia 1, trabajando a las 3hrs.
    Dia 1, trabajando a las 4hrs.
    Dia 1, trabajando a las 5hrs.
    Dia 1, trabajando a las 6hrs.
    Dia 1, trabajando a las 7hrs.
    Dia 1, trabajando a las 8hrs.
    Dia 2, trabajando a las 1hrs.
    Dia 2, trabajando a las 2hrs.
    Dia 2, trabajando a las 3hrs.
    Dia 2, trabajando a las 4hrs.
    Dia 2, trabajando a las 5hrs.
    Dia 2, trabajando a las 6hrs.
    Dia 2, trabajando a las 7hrs.
    Dia 2, trabajando a las 8hrs.
    Dia 3, trabajando a las 1hrs.
    Dia 3, trabajando a las 2hrs.
    Dia 3, trabajando a las 3hrs.
    Dia 3, trabajando a las 4hrs.
    Dia 3, trabajando a las 5hrs.
    Dia 3, trabajando a las 6hrs.
    Dia 3, trabajando a las 7hrs.
    Dia 3, trabajando a las 8hrs.
    Dia 4, trabajando a las 1hrs.
    Dia 4, trabajando a las 2hrs.
    Dia 4, trabajando a las 3hrs.
    Dia 4, trabajando a las 4hrs.
    Dia 4, trabajando a las 5hrs.
    Dia 4, trabajando a las 6hrs.
    Dia 4, trabajando a las 7hrs.
    Dia 4, trabajando a las 8hrs.
    Dia 5, trabajando a las 1hrs.
    Dia 5, trabajando a las 2hrs.
    Dia 5, trabajando a las 3hrs.
    Dia 5, trabajando a las 4hrs.
    Dia 5, trabajando a las 5hrs.
    Dia 5, trabajando a las 6hrs.
    Dia 5, trabajando a las 7hrs.
    Dia 5, trabajando a las 8hrs.
    Dia 6: descanso de fin de semana!
    Dia 7: descanso de fin de semana!

    */

        System.out.println("------------ EJEMPLO 4 ------------");
        //bucle1:
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 8; j++) {
                if (i == 6 || i == 7) {
                    System.out.println("Dia " + i + ": descanso de fin de semana!");
                    continue; //bucle1;
                }
                System.out.println("Dia " + i + ", trabajando a las " + j + "hrs.");
            }
        }
    }
}

    /*

    ------------ EJEMPLO 4 ------------
    Dia 1, trabajando a las 1hrs.
    Dia 1, trabajando a las 2hrs.
    Dia 1, trabajando a las 3hrs.
    Dia 1, trabajando a las 4hrs.
    Dia 1, trabajando a las 5hrs.
    Dia 1, trabajando a las 6hrs.
    Dia 1, trabajando a las 7hrs.
    Dia 1, trabajando a las 8hrs.
    Dia 2, trabajando a las 1hrs.
    Dia 2, trabajando a las 2hrs.
    Dia 2, trabajando a las 3hrs.
    Dia 2, trabajando a las 4hrs.
    Dia 2, trabajando a las 5hrs.
    Dia 2, trabajando a las 6hrs.
    Dia 2, trabajando a las 7hrs.
    Dia 2, trabajando a las 8hrs.
    Dia 3, trabajando a las 1hrs.
    Dia 3, trabajando a las 2hrs.
    Dia 3, trabajando a las 3hrs.
    Dia 3, trabajando a las 4hrs.
    Dia 3, trabajando a las 5hrs.
    Dia 3, trabajando a las 6hrs.
    Dia 3, trabajando a las 7hrs.
    Dia 3, trabajando a las 8hrs.
    Dia 4, trabajando a las 1hrs.
    Dia 4, trabajando a las 2hrs.
    Dia 4, trabajando a las 3hrs.
    Dia 4, trabajando a las 4hrs.
    Dia 4, trabajando a las 5hrs.
    Dia 4, trabajando a las 6hrs.
    Dia 4, trabajando a las 7hrs.
    Dia 4, trabajando a las 8hrs.
    Dia 5, trabajando a las 1hrs.
    Dia 5, trabajando a las 2hrs.
    Dia 5, trabajando a las 3hrs.
    Dia 5, trabajando a las 4hrs.
    Dia 5, trabajando a las 5hrs.
    Dia 5, trabajando a las 6hrs.
    Dia 5, trabajando a las 7hrs.
    Dia 5, trabajando a las 8hrs.
    Dia 6: descanso de fin de semana!
    Dia 6: descanso de fin de semana!
    Dia 6: descanso de fin de semana!
    Dia 6: descanso de fin de semana!
    Dia 6: descanso de fin de semana!
    Dia 6: descanso de fin de semana!
    Dia 6: descanso de fin de semana!
    Dia 6: descanso de fin de semana!
    Dia 7: descanso de fin de semana!
    Dia 7: descanso de fin de semana!
    Dia 7: descanso de fin de semana!
    Dia 7: descanso de fin de semana!
    Dia 7: descanso de fin de semana!
    Dia 7: descanso de fin de semana!
    Dia 7: descanso de fin de semana!
    Dia 7: descanso de fin de semana!

    */