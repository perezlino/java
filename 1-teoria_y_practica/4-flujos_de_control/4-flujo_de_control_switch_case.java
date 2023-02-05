/*  ======================================================
    =========== FLUJO DE CONTROL - SWITCH CASE ===========
    ======================================================

    
    SWITCH CASE
    ===========
*/
import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        int num = 4;
        char abc = 'a';
        String nombre = "alfonso";

        switch(num){
        
            case 0:
                System.out.println("El número es cero");
                break;
            case 1:
                System.out.println("El número es uno");
                break;
            case 2:
                System.out.println("El número es dos");
                break;
            case 3:
                System.out.println("El número es tres");
                break;
            default:
                System.out.println("Número desconocido");             
        }

        switch(abc){
        
            case 'a':
                System.out.println("El caracter es 'a'");
                break;
            case 'b':
                System.out.println("El caracter es 'b'");
                break;
            case 'c':
                System.out.println("El caracter es 'c'");
                break;
            case 'd':
                System.out.println("El caracter es 'd'");
                break;
            default:
                System.out.println("Caracter desconocido");             
        }

        switch(nombre){
        
            case "alfonso":
                System.out.println("Hola alfonso!");
                break;
            case "andres":
                System.out.println("Hola andres!");
                break;
            case "tomas":
                System.out.println("Hola tomas!");
                break;
            case "nicolas":
                System.out.println("Hola nicolas!");
                break;
            default:
                System.out.println("Nombre desconocido");             
        }
    }
}
/* 

Número desconocido
El caracter es 'a'
Hola alfonso!   

*/