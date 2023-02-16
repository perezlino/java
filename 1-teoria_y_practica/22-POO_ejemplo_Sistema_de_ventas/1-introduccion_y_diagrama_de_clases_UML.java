/*  ======================================================
    ======= INTRODUCCION Y DIAGRAMA DE CLASES UML ========
    ======================================================

    CLASE 'Orden'
    =============
    Esta clase de orden va a tener los siguientes atributos:

    - idOrden ==> va a almacenar un identificador único por cada Objeto que se cree de tipo Orden.
    
    - Productos[] : Producto ==> posteriormente tenemos un arreglo de objetos de tipo Producto, ya que, 
                                 en lo que vamos a hacer es simular un sistema de ventas, en el cual vamos 
                                 a poder crear una orden y esta orden le podemos agregar varios productos, 
                                 cada producto va a tener un precio y vamos a poder calcular el total de la 
                                 orden, es decir, la suma de todos los productos que se han agregado a una 
                                 orden. Así que esta clase de Orden, por ello es que va a tener un Array de 
                                 productos, para poder almacenar cada uno de los productos que vamos a agregar 
                                 a nuestra orden.
                                 
    - contadorOrdenes ==> posteriormente tenemos un atributo privado llamado contadorOrdenes. Este atributo está 
                          subrayado, ya que, es un atributo de tipo estático, así que los atributos estáticos en 
                          UML van subrayados y eso es lo mismo que ya hemos aplicado en lecciones anteriores, es 
                          una variable que vamos a incrementar en el constructor de nuestra clase por cada objeto 
                          de tipo Orden que creemos y también nos va a ayudar para asignar un valor único a nuestra 
                          variable de idOrden, por ello es una variable estática, para que se relacione con la clase 
                          Orden y no con los Objetos de tipo Orden.
                          
    - MAX_PRODUCTOS ==> y también vamos a definir el máximo de productos que vamos a poder agregar a nuestro arreglo 
                        de productos, por ello esta variable va a ser una constante, así que es 'pública' de tipo 
                        'static' y además de tipo 'final'. Por ello es que también está subrayada, ya que, también es 
                        de tipo 'estático' y podemos inicializarla con cualquier valor, en este caso nosotros vamos 
                        a utilizar el valor de 10, pero puede contener cualquier cantidad de elementos según lo definan 
                        en esta constante.
                        
    - Orden() ==> también esta clase va a tener un constructor, un constructor vacío y se va a encargar de incrementar 
                  el contador de órdenes e inicializar el valor del atributo idOrden y además también va a inicializar 
                  el arreglo de productos utilizando la constante MAX_PRODUCTOS, así que, este constructor se va a 
                  encargar de esas 2 tareas, tanto de inicializar el idOrden y también de inicializar el arreglo de 
                  productos.                         

    - agregarProducto(producto : Producto): void ==> posteriormente vamos a tener un método para agregar producto. Este 
                                                     método es público y va a recibir un Objeto de tipo Producto. Esta 
                                                     sintaxis no es de Java, esta sintaxis es de UML, así que primero 
                                                     especificamos el nombre de la variable, posteriormente : el nombre 
                                                     de la Clase o el tipo que vamos a utilizar, en este caso el tipo o 
                                                     la Clase es de tipo Producto y finalmente después de los : especificamos 
                                                     el tipo de retorno, así que esta sintaxis es de UML. Por lo tanto, con 
                                                     este método de 'agregarProducto' vamos a recibir un nuevo Objeto de 
                                                     tipo Producto y lo vamos a agregar al arreglo de productos, pero 
                                                     verificando siempre que no nos pasemos del máximo de productos 
                                                     permitidos que tenemos para agregar en este arreglo.  
                                                     
    - calcularTotal() ==> posteriormente tenemos el método 'calcularTotal' y este método va a sumar todos los precios de 
                          cada producto que tengamos en nuestra orden, pero recordemos que los productos se encuentran en 
                          el arreglo de productos, así que de esto se va a encargar este método.
                          
    - mostrarOrden() ==> finalmente tenemos un método para mostrar la orden, para mandar a consola el detalle tanto de la 
                         orden con su ID y  posteriormente cada uno de los productos y finalmente el total de la orden como 
                         si fuera un ticket de venta. Así que vamos a mandar a consola la información de nuestro ticket de 
                         venta bien eso por un lado ya tenemos nuestra clase de orden.
                         

    CLASE 'Producto'
    ================
    Ahora por otro lado vamos a tener nuestra clase Producto. La clase de producto como hemos comentado se va a agregar a 
    una orden, por ello la relación se conoce como relación de agregación y para ello UML utiliza esta sintaxis y lo que 
    significa es que una Clase de tipo Producto se agrega a una orden y debe de ir en el sentido de la clase Producto hacia 
    la clase Orden y por ello el rombo en este caso apunta hacia la clase Orden.

    Esta clase Producto va a tener lo siguientes atributos:
    
    - idProducto ==> va a ser privado de tipo entero 

    - contadorProductos ==> y también vamos a tener una variable llamada 'contadorProductos' de tipo estático para poder 
                            inicializar este atributo de 'idProducto'. Así que no vamos a pasar este valor por los 
                            constructores, sino, que internamente la variable 'contadorProductos', que es estática, va a 
                            inicializar esta variable de 'idProducto' por cada Objeto de tipo Producto que creemos. 

    - nombre y precio ==> También esta clase Producto va a tener un atributo de nombre y precio. El nombre es de tipo String 
                          y el precio es del tipo double.
                          
    - Producto() ==> vamos a tener un constructor vacío y además va a ser privado. Y este constructor únicamente se va a 
                     encargar de incrementar y asignar nuestra variable 'idProducto'. Así que incrementa la variable 
                     'contadorProductos' y asigna su valor al 'idProducto', para poder inicializar nuestra variable 
                     'idProducto', esto por cada Objeto de tipo Producto que se cree.                         
    
    - Producto(nombre : String, precio : double) ==> posteriormente vamos a crear un constructor que va a recibir 2 argumentos, 
                                                     por un lado, va a recibir el nombre de tipo String y va a recibir el 
                                                     precio de tipo double e internamente este constructor va a mandar a llamar 
                                                     el constructor vacío que es privado, para poder inicializar el atributo 
                                                     'idProducto'. Así que realmente cuando creemos Objetos de Producto vamos a 
                                                     utilizar el constructor de dos argumentos, ya que, el constructor privado 
                                                     no se puede mandar a llamar, ya que, es privado a esta Clase. 

    - Una una vez que ya hemos creado objetos de tipo Producto, entonces también agregamos sus métodos get y set. Recordemos que 
      el idProducto no se va a poder modificar, por ello es que no ponemos el método set, sino, solamente el método get y tampoco 
      quiere decir que vamos a utilizar este método, sin embargo, nuestra Clase ya va a estar preparada para poder utilizarlo en 
      dado caso que sea necesario, pero no quiere decir que vamos a utilizar todos los métodos de tipo get o set que definamos, 
      simplemente son buenas prácticas.
      
    - toString() ==> y finalmente agregamos el método toString para poder mandar a imprimir el estado de esta clase Producto con 
                     cada uno de los valores de los atributos de esta clase. 



    - : significa 'privado'
    + : significa 'publico'
     ______________________                                                      ___________________________           
    |   mx.com.gm.ventas   | <--------------------------------------------------|   mx.com.gm.ventas.test   |
    |----------------------|-------------------------------------------|        |---------------------------|-----------|    
    |    ______________________________________________                |        |    _______________________________    |
    |   |                     Orden                    |               |        |   |   Ventas Test                 |   |
    |   |----------------------------------------------|               |        |   |-------------------------------|   |
    |   | - idOrden : int                              |               |        |   | + main(args: String[]): void  |   |
    |   | - productos[] : Producto                     |               |        |   |-------------------------------|   |
    |   | - contadorOrdenes : int                      |               |        |   | Responsabilidades             |   |
    |   | MAX_PRODUCTOS int = 10                       |               |        |   | -- Ejecutar la prueba de la   |   |
    |   |----------------------------------------------|               |        |   |    aplicacion de ventas       |   |    
    |   | + Orden()                                    |               |        |   |-------------------------------|   |
    |   | + agregarProducto(producto : Producto): void |               |        |                                       |
    |   | + calcularTotal() : double                   |               |        |---------------------------------------|
    |   | + mostrarOrden() : void                      |               | 
    |   |----------------------------------------------|               | 
    |   | Responsabilidades                            |               | 
    |   | -- Crear Objetos Orden                       |               | 
    |   | -- Administrar los productos                 |               | 
    |   |----------------------------------------------|               |              
    |                        / \                                       | 
    |                        \ /                                       | 
    |                         |                                        | 
    |                         | << Un Producto se agrega a una Orden   | 
    |                         |                                        | 
    |      _______________________________________________             |             
    |     |                    Producto                   |            | 
    |     |-----------------------------------------------|            | 
    |     | - idProducto : int                            |            | 
    |     | - nombre : String                             |            | 
    |     | - precio : double                             |            | 
    |     | - contadorProductos : int                     |            | 
    |     |-----------------------------------------------|            | 
    |     | - Producto()                                  |            | 
    |     | + Producto(nombre : String, precio : double)  |            | 
    |     | + getIdProducto() : int                       |            |     
    |     | + getNombre() : String                        |            | 
    |     | + setNombre(nombre : String): void            |            | 
    |     | + getPrecio() : double                        |            | 
    |     | + setPrecio(precio : double) : void           |            | 
    |     | + toString() : String                         |            | 
    |     |-----------------------------------------------|            | 
    |     | Responsabilidades                             |            | 
    |     | -- Crear Objetos de tipo Producto             |            | 
    |     |-----------------------------------------------|            | 
    |                                                                  | 
    |__________________________________________________________________|                                       
*/