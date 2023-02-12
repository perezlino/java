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

        // Aqui tambien modificamos el argumento del color por la constante 'final' del color azul.
        Automovil.setColorPatente(Automovil.COLOR_AZUL);

        // Llamamos a las constantes 'final'
        System.out.println("Automovil.VELOCIDAD_MAX_CARRETERA = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Automovil.ELOCIDAD_MAX_CIUDAD = " + Automovil.VELOCIDAD_MAX_CIUDAD);
/* 
        Automovil.VELOCIDAD_MAX_CARRETERA = 120
        Automovil.ELOCIDAD_MAX_CIUDAD = 60 
*/        

        Automovil subaru = new Automovil("Subaru", "Impreza");

        subaru.setCilindrada(2.0);
        subaru.setColor(Automovil.COLOR_BLANCO); // <===== Utilizamos las constantes 'final'. Esto para utilizar un
                                                 // valor del color blanco ya indicado como una constante para los
                                                 // automoviles, y de esta manera, no existan errores como que un
                                                 // automovil lleve de color 'vlanco' o errores de ese tipo. Será
                                                 // el valor del color blanco indicado en la constante.        

        System.out.println(subaru.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(subaru.acelerarFrenar(3000));
        System.out.println("Kilometros por litro: " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("Kilometros por litro: " + subaru.calcularConsumo(300, 60));
/* 
        auto.id = 1                  
        auto.fabricante = Subaru
        auto.modelo = Impreza   
        auto.color = Blanco     
        auto.patenteColor = Azul
        auto.cilindrada = 2.0   
        El auto Subaru acelerando a 3000 rpm
        Subaru Impreza frenando!
        El auto Subaru acelerando a 3000 rpm
        Subaru Impreza frenando!
        Kilometros por litro: 12.5
        Kilometros por litro: 12.5
*/  
        // Aqui tambien modificamos el argumento del color por la constante 'final' del color rojo.
        Automovil mazda = new Automovil("Mazda", "BT-50", Automovil.COLOR_ROJO, 3.0);

        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerar(3000));
        System.out.println(mazda.frenar()); 
        System.out.println(mazda.acelerarFrenar(4000));                         
/* 
        auto.id = 2                
        auto.fabricante = Mazda
        auto.modelo = BT-50
        auto.color = Rojo
        auto.patenteColor = Azul
        auto.cilindrada = 3.0
        El auto Mazda acelerando a 3000 rpm
        Mazda BT-50 frenando!
        El auto Mazda acelerando a 4000 rpm
        Mazda BT-50 frenando!
*/
        // Aqui tambien modificamos el argumento del color por la constante 'final' del color gris.
        Automovil nissan = new Automovil("Nissan", "Navara", Automovil.COLOR_GRIS, 3.5, 50); 
        
        System.out.println(nissan.verDetalle());
        System.out.println("Kilometros por litro: " + nissan.calcularConsumo(300, 60));
/* 
        auto.id = 3                  
        auto.fabricante = Nissan
        auto.modelo = Navara
        auto.color = Gris Oscuro
        auto.patenteColor = Azul
        auto.cilindrada = 3.5
        Kilometros por litro: 9.999999
*/        
    }
}  