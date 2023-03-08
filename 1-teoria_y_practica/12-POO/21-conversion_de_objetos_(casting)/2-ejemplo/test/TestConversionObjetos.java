package test;

import dominio.*;

public class TestConversionObjetos {

    public static void main(String[] args) {
        
        Empleado empleado;

        empleado = new Escritor("Alfonso", 5000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        // empleado = Escritor{tipoEscritura=CLASICO} Empleado{nombre=Alfonso, sueldo=5000.0}


/*      Podemos observar que estamos utilizando una variable de tipo padre y estamos accediendo a la información 
        de la Clase hija, ya que, estamos incluyendo el 'tipo de escritura' y esto es debido al polimorfismo que 
        hemos estudiado anteriormente, ya que, con esta misma variable de la Clase padre 'empleado' podemos mandar 
        a llamar información de la Clase hija o de la Clase de padre, es decir, que vamos a poder mandar a llamar 
        los métodos que tengamos en común entre las 2 Clases y dependiendo del Objeto al cual esté apuntando en 
        memoria, por ejemplo, en este caso está apuntando a un Objeto de la Clase 'Escritor', entonces ejecuta el 
        método en común de las 2 Clases, pero toma prioridad el de la Clase hija. Por ello el método 'obtenerDetalles()' 
        que se manda a llamar es el de la Clase hija. 

        Por ejemplo, si presionamos control clic sobre el método 'obtenerDetalles()' podemos observar que nos lleva al 
        detalle pero de la Clase padre, de la Clase 'Empleado'. Sin embargo, aquí no estamos viendo el atributo de la 
        Clase hija ('TipoEscritura'), por lo tanto, esto quiere decir que el compilador no puede saber cuál es realmente 
        el método que se ejecuta. A nivel de compilación podemos observar que el polimorfismo no lo podemos definir, 
        esto lo vamos a definir hasta el momento en que ejecutamos nuestro programa y debido a que esta variable de 
        empleado está apuntando a un Objeto de la Clase hija, entonces el método que se ejecuta es el método de la 
        Clase hija. 
*/

        System.out.println(empleado.obtenerDetalles());
        // Nombre: Alfonso, sueldo: 5000.0, tipoEscritura: Escritura a Mano
    

/*      Podemos observar que el IDE ya no nos da la ayuda y nos está indicando además que a nivel de compilación tenemos 
        un error. No podemos acceder al método 'getTipoEscritura()' de la Clase hija, en este caso de la Clase de 'Escritor'. 
        Esto se debe a que el método 'getTipoEscritura()' no es común tanto en la Clase 'Empleado' como en la Clase 'Escritor'.
        Este método 'getTipoEscritura()' solamente está definido dentro de la Clase 'Escritor' y no está definido en la Clase 
        'Empleado', por lo tanto, querer mandar a llamar el método desde un tipo de la Clase 'Empleado' no es posible. ¿Qué 
        tenemos que hacer para poder mandar a llamar este método? Tenemos que hacer una conversión, aquí es donde entra el 
        tema de conversión de Objetos. 
 

        // empleado.getTipoEscritura(); =============> Nos devuelve un ERROR


        Entre paréntesis indicamos la Clase a la cual queremos convertir esta variable y en este caso la queremos convertir 
        a un tipo de la Clase hija, para que podamos acceder a los atributos y métodos de la Clase hija que no tengamos en 
        común con el tipo de la Clase padre. Así que ponemos 'Escritor'. Ahota tenemos 2 opciones: podemos asignarlo a una 
        variable o simplemente envolver todo esto entre paréntesis y con esto ya tenemos la sintaxis que convierte a un tipo 
        de la Clase padre a un tipo de la Clase hija. Luego, si ponemos punto entonces podemos acceder al método 
        'getTipoEscritura()'. A esto se le conoce como 'DOWNCASTING'.     */

        // DOWNCASTING
        // ===========
        System.out.println(((Escritor) empleado).getTipoEscritura());   // CLASICO

        // Esto es lo mismo:
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();   // CLASICO

        // ---------------------------------------------------------------------------------------------------------------

/*      Pero si queremos asignar una variable de tipo hija hacia una variable de tipo padre, no tenemos que agregar la 
        conversión de manera explícita, no es necesario, ya que, asignar una variable de tipo hija hacia una variable de 
        tipo padre, el compilador no marca ningún problema. 

        Así que el 'UPCASTING' no es necesario hacer una conversión explícita, pero el 'DOWNCASTING' si es necesario indicar el 
        tipo al cual vamos a convertir la variable, ya que, esto es muy similar cuando trabajamos tipos primitivos. Los tipos 
        que tienen más bytes soportan sin ningún problema tipos con menor cantidad de bytes, pero viceversa no aplica igual 
        y tenemos que indicar una conversión de manera explícita, tal cual como lo vimos en el tema de tipos primitivos. Aquí 
        es exactamente lo mismo pero trabajando ya con la jerarquía de Clases que aparecen en el diagrama de introducción. 
 
*/
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
        // Nombre: Alfonso, sueldo: 5000.0, tipoEscritura: Escritura a Mano


        // empleado2.getTipoEscritura(); =============> Nos devuelve un ERROR

    }
}