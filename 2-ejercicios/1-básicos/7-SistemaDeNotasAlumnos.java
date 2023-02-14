/*  ======================================================
    ============= SISTEMA DE NOTAS DE ALUMNOS ============
    ======================================================

    Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). 
    Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de 
    notas 1, ademas mostrar el promedio total.

    Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una 
    para realizar los cálculos (contadores, sumas).

    Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de 
    error finalizando el programa.


*/
import java.util.Scanner;

public class SistemaDeNotasAlumnos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota; // La nota a ingresar
        int contNotas1 = 0; // El contador de notas 1
        int contNotasMayoresA5 = 0; // Contador de notas mayores a 5
        int contNotasMenoresA4 = 0; // Contador de notas mayores a 4
        double sumaNotasMayoresA5 = 0; // Suma de notas mayores a 5
        double sumaNotasMenoresA4 = 0; // Suma de notas mayores a 4
        double sumaTotal = 0; // Suma total de notas

        double promedioNotasMayoresA5, promedioNotasMenoresA4; // Los promedios de notas mayores a 5 y menores a 4

        boolean error = false;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Introduce una nota (entre 1 y 7) N°" + i + ":");
            nota = scanner.nextDouble();

            if (nota <= 0) {
                error = true;
                break;
            } else if (nota == 1) {
                contNotas1++;
            } else {
                if (nota >= 5) {
                    contNotasMayoresA5++;
                    sumaNotasMayoresA5 += nota;
                } else {
                    contNotasMenoresA4++;
                    sumaNotasMenoresA4 += nota;
                }
            }

            sumaTotal += nota; 
        }

        if (error) {
            System.out.println("Error: No pueden haber notas con valor 0, ha finalizado la ejecución del programa");
            System.exit(1);
        }

        // Mostramos la cantidad de notas 1
        System.out.println("El número de notas 1 es igual a : " + contNotas1);

        // Trabajamos con las notas iguales o superiores a 5
        if (contNotasMayoresA5 == 0) {
            System.out.println("No se puede calcular el promedio de notas iguales o mayores a 5");
        } else {
            promedioNotasMayoresA5 = sumaNotasMayoresA5 / contNotasMayoresA5;
            System.out.println("Promedio de notas iguales o mayores a 5: " + promedioNotasMayoresA5);
        }

        // Trabajamos con las notas iguales o inferiores a 4
        if (contNotasMenoresA4 == 0) {
            System.out.println("No se puede calcular el promedio de notas iguales o menores a 4");
        } else {
            promedioNotasMenoresA4 = sumaNotasMenoresA4 / contNotasMenoresA4;
            System.out.println("Promedio de notas iguales o mayores a 5: " + promedioNotasMenoresA4);
        }
        
        // Promedio total de las notas
        double promedioTotalNotas = sumaTotal / 20;
        System.out.println("Promedio general de notas: " + promedioTotalNotas);

    }
}