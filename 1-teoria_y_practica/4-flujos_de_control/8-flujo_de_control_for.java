/*  ======================================================
    =============== FLUJO DE CONTROL - FOR ===============
    ======================================================

    
    FOR
    ===

    Ejemplo 1
    ---------
*/
    public class SentenciaFor {
        public static void main(String[] args) {

            for(int i = 0; i <= 10; i++) {
                System.out.println("i = " + i);
            }
        }
    }
/*

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


    Ejemplo 2
    ---------
*/
    public class SentenciaFor {
        public static void main(String[] args) {

            for(int i = 10; i >= 0; i--) {
                System.out.println("i = " + i);
            }
        }
    }
/*

i = 10
i = 9
i = 8
i = 7
i = 6
i = 5
i = 4
i = 3
i = 2
i = 1
i = 0


    Ejemplo 3
    ---------
*/
    public class SentenciaFor {
        public static void main(String[] args) {

            for(int i = 1, j = 10; i <= j; i++, j--) {
                System.out.println(i + " - " + j);
            }
        }
    }
/*

1 - 10
2 - 9
3 - 8
4 - 7
5 - 6


    Ejemplo 4
    ---------
*/
    public class SentenciaFor {
        public static void main(String[] args) {

            for(int i = 0; i <= 10; i++) {
                if(i % 2 == 0) {
                    System.out.println("i = " + i);
                }
                
            }
        }
    }
/*

i = 0
i = 2
i = 4
i = 6
i = 8
i = 10


    Ejemplo 5
    ---------
*/
    public class SentenciaFor {
        public static void main(String[] args) {

            for(int i = 0; i <= 10; i++) {
                if(!(i % 2 == 0)) {
                    System.out.println("i = " + i);
                }
                
            }
        }
    }
/*

i = 1
i = 3
i = 5
i = 7
i = 9


    Ejemplo 6
    ---------
*/
    public class SentenciaFor {
        public static void main(String[] args) {

            for(int i = 0; i <= 10; i++) {
                if(!(i % 2 == 0)) {
                    continue;
                }
                System.out.println("i = " + i);
            }
        }
    }
/*

i = 0
i = 2
i = 4
i = 6
i = 8
i = 10

*/