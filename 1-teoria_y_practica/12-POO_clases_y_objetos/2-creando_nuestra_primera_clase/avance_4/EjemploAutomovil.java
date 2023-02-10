/*  ======================================================
    =========== CREANDO NUESTRA PRIMERA CLASE ============
    ======================================================

    ATRIBUTOS
    =========

    - El modificador 'static' hace que el atributo sea de la clase y no de la instancia.

    - El modificador 'final' hace que el atributo sea una constante que no se puede modificar.
      Solamente se define una vez en la clase y después se puede utilizar.

    METODOS
    =======

    - El método también puede ser estático y puede ser final.

    - Un 'metodo static' se pueden invocar de forma directa con la clase, sin crear el objeto con 
      la clase, el nombre de la clase punto, el método. Porque ese método no es del objeto, le pertenece 
      a la clase. No es necesario tener que crear la instancia.

    - Un 'metodo final' evita que ese método se modifique en la herencia.

*/
import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        // renombramos el nombre del objeto (de la instancia de la clase a 'subaru')
        Automovil subaru = new Automovil();

        subaru.fabricante = "Subaru";
        subaru.modelo = "Impreza";
        subaru.cilindrada = 2.0;
        subaru.color = "Blanco";

        System.out.println(subaru.detalle());
/* 
        this.fabricante = Subaru
        this.fabricante = Impreza
        this.fabricante = Blanco
        this.fabricante = 2.0
*/  
        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.cilindrada = 3.0;
        mazda.color = "Rojo";

        System.out.println(mazda.detalle());          
/* 
        this.fabricante = Mazda 
        this.fabricante = BT-50 
        this.fabricante = Rojo  
        this.fabricante = 3.0 
*/
    }
}   