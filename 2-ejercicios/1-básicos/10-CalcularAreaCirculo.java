/*  ======================================================
    ============ CALCULAR AREA DE UN CIRCULO =============
    ======================================================

    Pedir el radio de un círculo y calcular su área. Utilizar la formula:

    area = PI*r² (Constante PI multiplicado por el radio al cuadrado).

    Recomiendo primero implementar la tarea en el IDE para probarla y revisarla bien, luego publica 
    tu código de la clase main por esta vía.

*/
    import java.util.Scanner;

    public class CalcularAreaCirculo {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            double area; // El area a calcular

            double radio; // El radio a ingresar

            System.out.println("Ingrese el radio del circulo: "); // 2
            radio = scanner.nextDouble();

            area = Math.PI * Math.pow(radio, 2);

            // El área de su circunferencia de radio 2.0 es igual a: 12.566370614359172
            System.out.println("El área de su circunferencia de radio " + radio + " es igual a: " + area);
        }
    }