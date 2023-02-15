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

        Automovil subaru = new Automovil();

        //3 Ahora llamamos a los metodos que nos permiten modificar los atributos
        subaru.asignarFabricante("Subaru");
        subaru.asignarModelo("Impreza");
        subaru.asignarCilindrada(2.0);
        subaru.asignarColor("Blanco");

        //1 Cuando llamamos a un atributo 'privado' desde fuera de la clase 'Automovil', no podemos acceder 
        //  a el. Por lo tanto, está oculto. No podemos ni leer ni modificar los atributos.

        //2 Entonces, ahora para poder acceder a los atributos de la clase 'Automovil' desde otras clases, 
        //  otros objetos, por ejemplo, en el 'main' tenemos que utilizar métodos para modificar y para leer 
        //  por cada atributo. Esos métodos se crean en la clase 'Automovil'.

        System.out.println(subaru.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(subaru.acelerarFrenar(3000));
        System.out.println("Kilometros por litro: " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("Kilometros por litro: " + subaru.calcularConsumo(300, 60));
/* 
        this.fabricante = Subaru
        this.fabricante = Impreza
        this.fabricante = Blanco
        this.fabricante = 2.0
        El auto Subaru acelerando a 3000 rpm
        Subaru Impreza frenando!
        El auto Subaru acelerando a 3000 rpm
        Subaru Impreza frenando!
        Kilometros por litro: 12.5
        Kilometros por litro: 12.5
*/  
        Automovil mazda = new Automovil();
        mazda.asignarFabricante("Mazda");
        mazda.asignarModelo("BT-50");
        mazda.asignarCilindrada(3.0);
        mazda.asignarColor("Rojo");

        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerar(3000));
        System.out.println(mazda.frenar()); 
        System.out.println(mazda.acelerarFrenar(4000));                         
/* 
        this.fabricante = Mazda
        this.fabricante = BT-50
        this.fabricante = Rojo
        this.fabricante = 3.0
        El auto Mazda acelerando a 3000 rpm
        Mazda BT-50 frenando!
        El auto Mazda acelerando a 4000 rpm
        Mazda BT-50 frenando!
*/
    }
}   