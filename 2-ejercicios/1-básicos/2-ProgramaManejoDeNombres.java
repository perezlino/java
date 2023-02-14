/*  ======================================================
    ============== PROGRAMA MANEJO DE NOMBRES ============
    ======================================================

    La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:

        1. Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o 
           amigos como argumentos de línea de comandos.

        2. Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo 
           caracter, pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres 
           de la persona. Por ejemplo, para Andres debe quedar como N.es

        3. Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única 
           variable).

    Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:

                                            N.es_A.ia_E.pe
*/
import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre del primer integrante:");
        String primeroStr = scanner.nextLine();
        String primeroStr2 = primeroStr.toUpperCase().charAt(1) + "." + 
                             primeroStr.substring(primeroStr.length() - 2);

        System.out.println("Ingrese nombre del segundo integrante:");
        String segundoStr = scanner.nextLine();
        String segundoStr2 = segundoStr.toUpperCase().charAt(1) + "." + 
                             segundoStr.substring(segundoStr.length() - 2);     

        System.out.println("Ingrese nombre del tercer integrante:");
        String tercerStr = scanner.nextLine();
        String tercerStr2 = tercerStr.toUpperCase().charAt(1) + "." + 
                            tercerStr.substring(tercerStr.length() - 2);

        String concat = primeroStr2.concat("_").concat(segundoStr2).concat("_").concat(tercerStr2);

        System.out.println(concat);
                            
    }
}
/* Por consola nos retorna:

Ingrese nombre del primer integrante:
Alfonso                     ------------> Valor ingresado
Ingrese nombre del primer integrante:
Gonzalo                     ------------> Valor ingresado
Ingrese nombre del primer integrante:
Victoria                    ------------> Valor ingresado
L.so_O.lo_I_ia

*/