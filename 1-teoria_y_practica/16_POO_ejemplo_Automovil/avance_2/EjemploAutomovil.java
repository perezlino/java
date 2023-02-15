/*  ======================================================
    =========== CREANDO NUESTRA PRIMERA CLASE ============
    ======================================================

*/
import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        // Creamos un objeto, instanciamos a la clase 'Automovil'
        Automovil auto = new Automovil();

        // Asignamos valores propios para el objeto para los atributos de la clase 
        auto.fabricante = "Subaru";
        auto.modelo = "Impreza";
        auto.cilindrada = 2.0;
        // Aunque el atributo "color" de la lcase Automovil tiene un valor asignado "Gris"
        // para el objeto 'auto' le daremos un valor propio
        auto.color = "Blanco";

        System.out.println("auto.fabricante = " + auto.fabricante);
        System.out.println("auto.fabricante = " + auto.modelo);
        System.out.println("auto.fabricante = " + auto.color);
        System.out.println("auto.fabricante = " + auto.cilindrada);
/* 
        auto.fabricante = Subaru
        auto.fabricante = Impreza
        auto.fabricante = Blanco
        auto.fabricante = 2.0
*/  
        // Creamos una nueva instancia (nuevo objeto)
        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.cilindrada = 3.0;
        mazda.color = "Rojo";

        System.out.println("mazda.fabricante = " + mazda.fabricante);
        System.out.println("mazda.fabricante = " + mazda.modelo);
        System.out.println("mazda.fabricante = " + mazda.color);
        System.out.println("mazda.fabricante = " + mazda.cilindrada);        
/* 
        mazda.fabricante = Mazda 
        mazda.fabricante = BT-50 
        mazda.fabricante = Rojo  
        mazda.fabricante = 3.0 
*/
    }
}    