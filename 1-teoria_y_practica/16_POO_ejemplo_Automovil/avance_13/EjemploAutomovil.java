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
public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");

        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

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
        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);

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
        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50); 
        
        System.out.println(nissan.verDetalle());
        System.out.println("Kilometros por litro: " + nissan.calcularConsumo(300, 60));
/* 
        this.fabricante = Nissan
        this.fabricante = Navara
        this.fabricante = Gris oscuro
        this.fabricante = 3.5
        Kilometros por litro: 9.999999
      
        -------------------------------------------------------------------------------------
        REVISAR 'avance_12' para ver este desarrollo. 

        // Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50); 

        // System.out.println("Son el mismo objeto?" + (nissan == nissan2)); // false
        // System.out.println("Tienen el mismo valor?" + nissan.equals(nissan2)); // false
        // System.out.println("Tienen el mismo valor?" + nissan.equals(nissan2)); // true
        // System.out.println("Tienen el mismo valor?" + nissan.equals(nissan)); // true
        -------------------------------------------------------------------------------------

 
        Estoy imprimiendo un objeto. Justamente lo que hace el 'toString' es convertir, dar una representación 
        de texto (de una cadena) a un objeto. Por lo tanto, podemos imprimir el objeto como un 'string'. Por 
        defecto trae su propia implementación que corresponde al nombre de la clase, pero además le concatena 
        un '@' y le concatena un identificador. Recuerden que todos los objetos son únicos en nuestra aplicación 
        y tienen un identificador que se le conoce como 'hashcode'. Pero, el 'toString' lo que hace es tomar 
        este entero único y lo convierte a un tipo hexadecimal, a un tipo numérico hexadecimal, como texto, 
        como 'string'.

        Otro tema importante que el 'toString' no es necesario invocarlo, de forma automática cuando se imprime 
        o cuando se envía a la salida de nuestra aplicación, como por ejemplo por medio del método print line 
        o cualquier tipo de salida, se va a ejecutar este método de forma explícita, automática. No lo vemos, 
        pero se invoca.
*/
        // Forma implicita
        System.out.println(nissan); // Automovil@15db9742

        // Forma explicita
        System.out.println(nissan.toString()); // Automovil@15db9742  
        
        // Modificamos el metodo 'toString' dentro de la clase Automovil
        System.out.println(nissan); // Nissan Navara
    }
}   