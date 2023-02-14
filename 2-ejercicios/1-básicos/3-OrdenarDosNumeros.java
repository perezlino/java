/*  ======================================================
    ================== ORDENAR DOS NUMEROS ===============
    ======================================================

    El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor. Podría 
    ser utilizando operador ternario.

*/
import java.util.Scanner;

public class OrdenarDosNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero:");
        int num2 = scanner.nextInt();

        String resultado = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;

        System.out.println("El orden es = " + resultado);
    }
    