/*  ======================================================
    ============= SISTEMA DE NOTAS DE ALUMNOS ============
    ======================================================

    Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin 
    usar el símbolo de multiplicación (*).

    Puede utilizar una sentencia FOR para realizar la multiplicación y tener en cuenta los unarios, 
    donde menos por menos es positivo.

*/
import java.util.Scanner;

public class MultiplicarDosNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número a:");
        int a = scanner.nextInt();

        System.out.println("Ingrese el número b:");
        int b = scanner.nextInt();        

        int resultado = 0;

        // Verificamos los signos de cada número , si es positivo o negativo
        boolean positivoA = a > -1;
        boolean positivoB = b > -1;

        // Calculamos el valor absoluto de 'a'
        int absolutoA = positivoA ? a : -a; // equivalente a Math.abs(a);

        // Sumamos tantas veces el valor de 'b', según el valor de 'a'
        for (int i = 0; i < absolutoA; i++) {
            resultado = resultado + b;
        }

        // Si ambos son negativos o si solo 'a' es negativo, damos vuelta el signo
        // No agregamos a 'b' porque en el paso anterior realizamos la operación 'resultado' con 'b'
        // y si b fuese negativo, 'resultado' seria negativo por defecto, por tanto, no es necesario
        // modificar su signo.
        if ((!positivoA && !positivoB) || !positivoA) {
            resultado = -resultado;
        }

        System.out.println("El resultado es: " + resultado);

    }
}