/*  ======================================================
    ======= OPERADORES DE INCREMENTO Y DECREMENTO ========
    ======================================================

*/ 
    public class OperadoresIncrementales {
        public static void main(String[] args) {

            // Pre incremento: Primero se incrementa el valor en 1 de i y luego se asigna a j.
            int i = 1;
            int j = ++i; // i = i + 1

            System.out.println("i = " + i); // i = 2
            System.out.println("j = " + j); // j = 2
            
            // Post incremento: Primero se asigna el valor de i a la variable j y luego se incrementa el 
            //                  valor en 1 de i.
            i = 2;
            System.out.println("inicial de i = " + i); // inicial de i = 2
            j = i++;
            System.out.println("i = " + i); // i = 3
            System.out.println("j = " + j); // j = 2

            // Pre decremento: Primero se decrementa el valor en 1 de i y luego se asigna a j.
            i = 3;
            j = --i; // i = i - 1 = 2

            System.out.println("i = " + i); // i = 2
            System.out.println("j = " + j); // j = 2

            // Post decremento: Primero se asigna el valor de i a la variable j y luego se decrementa el valor 
            //                  en 1 de i.
            i = 4;
            j = i--;
            System.out.println("i = " + i); // i = 3
            System.out.println("j = " + j); // j = 4

            System.out.println("j = " + (++j)); // j = 5
            System.out.println("j = " + (j++)); // j = 5
            System.out.println("j = " + j); // j = 6
        }
    }