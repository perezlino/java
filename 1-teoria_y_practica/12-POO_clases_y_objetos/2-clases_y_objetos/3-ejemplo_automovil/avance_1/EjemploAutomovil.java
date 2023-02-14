/*  ======================================================
    =========== CREANDO NUESTRA PRIMERA CLASE ============
    ======================================================

*/
import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        // Creamos un objeto, instanciamos a la clase 'Automovil'
        Automovil auto = new Automovil();

        // Vemos si los atributos de la clase Automovil tienen algun valor asignado
        System.out.println("auto.fabricante = " + auto.fabricante);
        System.out.println("auto.fabricante = " + auto.modelo);
        System.out.println("auto.fabricante = " + auto.color);
        System.out.println("auto.fabricante = " + auto.cilindrada);
/* 
        auto.fabricante = null
        auto.fabricante = null
        auto.fabricante = null
        auto.fabricante = 0.0
*/            
        
    }
}    