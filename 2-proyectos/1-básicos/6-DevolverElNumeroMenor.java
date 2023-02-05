/*  ======================================================
    ============== DEVOLVER EL NUMERO MENOR ==============
    ======================================================

    Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores 
    enteros, usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una 
    sentencia FOR iterar el numero de veces (ingresado) para pedir el numero entero, entonces se 
    requiere:

        -	Calcular el menor número e imprimir el valor.

        -	Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, 
            imprimir " el numero menor es igual o mayor que 10!".

*/
import java.util.Scanner;

public class DevolverElNumeroMenor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros a comparar: ");
        int cantidad = scanner.nextInt();

        // Peguntamos si es menor a 10
        // (buscamos el número menor de mínimo 10 valores enteros)
        if (cantidad < 10) {
            System.out.println("Error: Debe comparar al menos 10 números enteros!");
        } else {

            int menor = Integer.MAX_VALUE; // asignamos un valor máximo por defecto como número
                                           // menor para comenzar.
                                           // menor = 2147483647
                                           
            int numero;
            
            for (int i = 1; i <= cantidad; i++ ){
                System.out.println("Ingrese el número " + i + ": ");
                numero = scanner.nextInt();
                menor = (numero < menor) ? numero : menor;
            }

            System.out.println("El número menor es: " + menor);

            if (menor < 10) {
                System.out.println("El número " + menor + " es menor que 10!");
            } else {
                System.out.println("El número " + menor + " es igual o mayor que 10!");
            }
        }


    }
}