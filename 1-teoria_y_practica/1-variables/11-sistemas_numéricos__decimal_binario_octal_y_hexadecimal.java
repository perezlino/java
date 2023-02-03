/*  ==========================================================
    SISTEMAS NUMERICOS - DECIMAL, BINARIO, OCTAL Y HEXADECIMAL 
    ==========================================================

    Acá tenemos que anteponer un "0b". Entonces con "0b" el compilador de Java asume que esta combinación 
    de ceros y unos, corresponde a un sistema binario.

    Para convertir al sistema octal simplemente anteponemos el cero "0". Entonces de esta forma el compilador 
    de Java automáticamente asume que este valor entero corresponde al sistema octal.

    Para convertir al sistema hexadecimal simplemente anteponemos el cero "0x". Entonces de esta forma el 
    compilador de Java automáticamente asume que este valor entero corresponde al sistema hexadecimal.  
*/
    public class SistemasNumericos {
        public static void main(String[] args) {

            int numeroDecimal = 500;
            System.out.println("numeroDecimal = " + numeroDecimal);
            System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
            System.out.println("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
            System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
            
            int numeroBinario = 0b111110100;
            System.out.println("numeroBinario = " + numeroBinario);

            int numeroOctal = 0764;
            System.out.println("numeroOctal = " + numeroOctal);

            int numeroHex = 0x1f4;
            System.out.println("numeroHex = " + numeroHex);
        }
    }
/* Esto nos devuelve:

numeroDecimal = 500
numero binario de 500 = 111110100
numero octal de 500 = 764
numero hexadecimal de 500 = 1f4
numeroBinario = 500
numeroOctal = 500
numeroHex = 500

*/