/*  ======================================================
    ======= INTRODUCCION Y DIAGRAMA DE CLASES UML ========
    ======================================================

    Vamos a crear un ejercicio que simule un 'Catálogo de películas'. Para este ejercicio vamos a almacenar la 
    información del 'Catálogo de películas' en un archivo de texto y este archivo lo vamos a depositar en una 
    carpeta definida por nosotros, por ejemplo, la carpeta 'c:\CatalogoPeliculas\peliculas.txt' y el archivo lo 
    depositamos dentro de esta carpeta y el archivo se puede llamar 'películas.txt'. Vamos a crear varios paquetes, 
    cada uno con tareas específicas a desarrollar en el programa. El primer paquete que vamos a crear es el 
    'Paquete de excepciones' y similar a la lección de Excepciones, según mostramos en este diagrama, vamos a crear 
    el paquete de 'mx.com.peliculas.excepciones' y dentro de este paquete vamos a crear las excepciones, 
    'AccesoDatosEx', 'EscrituraDatosEx' y 'LecturaDatosEx'. Posteriormente, vamos a crear el Paquete 
    'mx.com.gm.peliculas.datos' y este paquete va a contener lo siguiente: por un lado va a tener la interface 
    'AccesoDatos' y por otro lado una Clase que implementa dicha interface, llamada 'AccesoDatosImpl'. El objetivo 
    de estas Clases es agregar la funcionalidad para interactuar con el archivo donde se va a guardar la información 
    del 'Catálogo de películas'. Como siguiente paso, creamos el 'Paquete de negocio' y este paquete incluye la 
    interface de 'CatálogoPeliculas' y también una Clase que implementa dicha interface, llamado 'CatalogoPeliculasImpl'. 
    Este paquete lo vamos a utilizar para aplicar las reglas de negocio de nuestra aplicación. Y finalmente, vamos a 
    crear un paquete llamado 'cpllaboratoriofinal', el cual significa, 'Curso de Programación Java' y también vamos a 
    crear una Clase que va a contener el método 'main', llamada 'CPJLaboratorioFinal'. A continuación, vamos a ver a 
    más detalle cada uno de los paquetes de la aplicación 'Catálogo de películas' a desarrollar.  


                                         _____________________
                                        | cpjlaboratoriofinal |
                                        |----------------------------------
                                        |   ___________________________   |  
                                        |  |                           |  |  
                                        |  |    CPJLaboratorioFinal    |  | 
                                        |  |___________________________|  |  
                                        |_________________________________|

 ____________________________           _____________________________              _____________________________
| mx.com.gm.peliculas.domain |         | mx.com.gm.peliculas.negocio |            | mx.com.gm.peliculas.datos   | 
|----------------------------------    |--------------------------------------    |-------------------------------------- 
|   ___________________________   |    |                  ◯                 |    |                  ◯                 |
|  |                           |  |    |          Catalogo Peliculas         |    |              AccesoDatos            |
|  |         Peliculas         |  |    |                  ᐃ                                          ᐃ                  
|  |___________________________|  |    |                  |                  |    |                   |                 |   
|_________________________________|    |     _____________|_____________     |    |      _____________|_____________    |
                                       |    |                           |    |    |     |                           |   |
                                       |    |   CatalogosPeliculasImpl  |    |    |     |      AccesoDatosImpl      |   |
                                       |    |___________________________|    |    |     |___________________________|   |
                                       |_____________________________________|    |_____________________________________|
                                       
                                       _________________________________
                                      | mx.com.gm.peliculas.excepciones |
                                      |--------------------------------------------------------  
                                      |             _____________________________             |  
                                      |            |                             |            |  
                                      |            |        AccesoDatosEx        |            |  
                                      |            |_____________________________|            |  
                                      |                           ᐃ                             
                                      |                           |                           |      
                                      |              _____________|_____________              |  
                                      |             |                           |             |  
                                      |  ___________|__________       __________|___________  |       
                                      | |                      |     |                      | |  
                                      | |   EscrituraDatosEx   |     |    LecturaDatosEx    | |
                                      | |______________________|     |______________________| |  
                                      |                                                       |  
                                      |_______________________________________________________|

    - : significa 'privado'
    + : significa 'publico'

    CLASE Película
    ==============

    Esta Clase nos servirá para representar el Objeto 'Película'. En esta aplicación vamos a dejar muy simple la 
    definición de este Objeto, sin embargo, podría tener más atributos y hacer más compleja esta aplicación, pero 
    el objetivo es que podamos desarrollar esta aplicación con la estructura planteada y no agregar más 
    complejidad de la necesaria para aplicar los conceptos estudiados a lo largo de este curso, por ello este 
    Objeto se debe codificar con lo indicado en el diagrama de Clase mostrado. Así que esta Clase contiene un 
    atributo llamado 'nombre' de tipo 'String' y podemos observar que es de tipo 'privado' y también va a contener 2 
    constructores, el constructor vacío de tipo 'public' y el constructor de un argumento de tipo 'String' llamado 
    'nombre', este es el argumento que va a recibir este constructor y también es de tipo 'público'. También definimos 
    los métodos 'get' y 'set' para el atributo de 'nombre' y agregamos el método 'toString' a esta Clase, el cual 
    internamente va a imprimir el atributo de nombre y las responsabilidades de esta Clase es que representan los 
    Objetos 'Pelicula' utilizados en la aplicación 'Catálogo de Películas'.
    ______________________________________
   |      mx.com.gm.peliculas.domain      |       
   |--------------------------------------|   
   |            Peliculas                 |  
   |--------------------------------------|
   | + Pelicula()                         |  
   | + Pelicula(nombre: String)           |  
   | + getNombre(): String                |  
   | + setNombre(nombre: String)          |  
   | + toString(): String                 |  
   |--------------------------------------|
   | Responsabilidades                    |  
   | -- Representa los Objetos Pelicula   | 
   |    utilizados en la aplicacion       |  
   |    Catalogo de Peliculas             |  
   |______________________________________|


    INTERFACE AccesoDatos
    =====================

    Cómo siguiente paso vamos a ver la Interface 'AccesoDatos'. Esta Interface define los métodos para interactuar con el 
    archivo que administrará el 'Catalogo de Películas'. La Clase 'AccesoDatosImpl' es la que finalmente se encargará de 
    agregar el comportamiento de cada uno de los métodos descritos en esta Interface. A partir de este proyecto 
    empezaremos a separar los paquetes y Clases según la funcionalidad de cada una de ellas, en el caso del paquete de 
    'AccesoDatos' su función es definir la forma en que se interactúa con el archivo que es donde se almacenará la 
    información, sin embargo, el uso de Interfaces y su implementación empieza a tomar importancia, debido a que en 
    cursos posteriores vamos a aplicar precisamente este tipo de conceptos, por ejemplo, en el curso de Java con JDBC, 
    cuando empecemos a guardar información en bases de datos, por ello es importante definir la Interface, que es la que 
    contiene los métodos que se utilizarán por otras Clases en la aplicación, pero la implementación podemos definir 
    cuál es la que se va a utilizar, por ejemplo, que guarda la información en un archivo o alguna otra implementación 
    que guarde la información en una base de datos. La Interface será la misma pero podríamos tener distintas 
    implementaciones y como hemos comentado una de las implementaciones podría guardar la información simplemente en un 
    archivo de texto, pero otra de las implementaciones podria guardar esta información en una base de datos y así 
    definimos una misma Interface pero distintas implementaciones y ya depende de nuestro programa cuál es la 
    implementación que va a utilizar. Por último, cabe mencionar que la implementación de esta Interface es completamente 
    técnica respecto al uso de manejos de archivos, por lo que a diferencia del paquete de negocios que veremos a 
    continuación, el paquete de datos realiza las tareas más técnicas que tienen que ver con la manipulación directa del 
    archivo, en cambio, el paquete de negocios se encarga más del definir las operaciones y funcionalidad desde el punto 
    de vista de lo que necesita realizar la aplicación pero de alguna manera no le interesa si la información se almacena 
    o proviene de un archivo, ya que, de eso se encargará precisamente este paquete de datos.
    ______________________________________
   |      mx.com.gm.peliculas.datos       |       
   |--------------------------------------|   
   |            AccesoDatos               |  
   |--------------------------------------------------------------------------------
   | + existe(nombreArchivo: String): Boolean                                      |  
   | + listar(nombre: String): List<Pelicula>                                      | 
   | + escribir(pelicula: Pelicula, nombreArchivo: String, anexar: Boolean): void  |
   | + buscar(nombreArchivo: String, buscar: String): String                       |  
   | + crear(nombreArchivo: String): void                                          |  
   | + borrar(nombreArchivo: String): void                                         | 
   |-------------------------------------------------------------------------------|  
   | Responsabilidades                                                             |     
   | -- Contiene las operaciones a ejecutar en el archivo de peliculas.txt         | 
   |_______________________________________________________________________________|


    INTERFACE CatalogoPeliculas Y CLASE CatalogoPeliculasImpl
    ==========================================================

    En el paquete mostrado de mx.com.gm.peliculas.negocio contiene las Clases que implementarán las reglas de negocio 
    de nuestra aplicación y a su vez, este es el paquete que será el intermediario entre la interfaz con el usuario, 
    es decir, el método main y el guardado de la información, es decir, el Paquete de Datos. Similar al Paquete de 
    Datos, este paquete hemos agregado también una interfaz y una implementación, de esta manera la Interface de usuario, 
    es decir, en método main, hará uso de la Interface y será la implementación de CatálogoPelículasImpl quien 
    finalmente ejecutará las tareas necesarias para esta aplicación. A su vez, la implementación del Catálogo de 
    Películas será quien utilice la Interface AccesoDatos.java, por lo que al hacer uso de Interfaces, es que en 
    cualquier momento podríamos cambiar la implementación y afectaríamos lo menos posible al código que hemos programado. 
    A esta característica se le conoce como bajo acoplamiento, ya que, un cambio en un componente o una Clase afecta lo 
    menos posible a otras Clases, así que es solo una de las muchas ventajas de programar utilizando Interfaces y no 
    utilizar directamente la implementación de las funcionalidad que necesitamos. Ese tipo de conceptos lo vamos a 
    empezar a aplicar en cursos posteriores, por ejemplo en el Curso de java con JDBC.
    ______________________________________
   |      mx.com.gm.peliculas.negocio     |       
   |--------------------------------------|   
   |            CatalogoPeliculas         |  
   |--------------------------------------------------------------------------------
   | + agregarPelicula(nombrePelicula: String, nombreArchivo: String): void        |  
   | + listarPeliculas(nombreArchivo: String): void                                | 
   | + buscarPelicula(nombreArchivo: String, buscar: String): void                 |   
   | + iniciarArchivo(nombreArchivo: String): void                                 | 
   |-------------------------------------------------------------------------------|  
   | Responsabilidades                                                             |     
   | -- Contiene las operaciones necesarias de la aplicacion CatalogoPeliculas     | 
   |_______________________________________________________________________________|

    ______________________________________
   |      mx.com.gm.peliculas.negocio     |       
   |--------------------------------------|   
   |         CatalogoPeliculasImpl        | 
   |--------------------------------------|
   |          datos: AccesoDatos          |  
   |--------------------------------------------------------------------------------
   | + CatalogoPeliculasImpl()       |                                             | 
   | + agregarPelicula(nombrePelicula: String, nombreArchivo: String): void        |     
   | + listarPeliculas(nombreArchivo: String): void                                | 
   | + buscarPelicula(nombreArchivo: String, buscar: String): void                 |   
   | + iniciarArchivo(nombreArchivo: String): void                                 | 
   |-------------------------------------------------------------------------------|  
   | Responsabilidades                                                             |     
   | -- Contiene la implementacion de las operaciones necesarias de la aplicacion  | 
   |    CatalogoPeliculas                                                          | 
   |_______________________________________________________________________________|


    CLASE main
    ==========

    Esta Clase representa la Interface con la que el usuario va a interactuar. Esta Clase solicita via consola la 
    acción requerida por parte del usuario y solicita opciones como: iniciar catálogo de películas, agregar una 
    película, listar películas, buscar una película y salir, y dependiendo de la opción elegida por el usuario es 
    la acción que vamos a ejecutar. Esta Clase se apoya de la Clase CatalogoPeliculas para realizar las operaciones 
    que necesita esta aplicación. A su vez la variable opcion es la variable que se encargará de almacenar la opción 
    seleccionada por parte del usuario y el nombre del archivo indica la ruta donde se almacenará el archivo, por 
    ejemplo, la cadena java que se puede utilizar si estamos en Windows es c:\\CatalogoPeliculas\\peliculas.txt. 
    Debemos recordar que la carpeta sobre la que vayamos a trabajar, ya debe estar creada y en caso necesario debe 
    tener permisos de escritura, aunque esto depende del sistema operativo sobre el cual estemos trabajando.
    ______________________________________
   |         cpjlaboratoriofinal          |       
   |--------------------------------------|   
   |            CPJLaboratorioFinal       |  
   |------------------------------------------------------------
   | scanner.java.util.Scanner                                 |  
   | opcion: int                                               | 
   | nombreArchivo: String                                     |   
   | CatalogoPeliculas: CatalogoPeliculas                      | 
   |-----------------------------------------------------------|
   | + main(args: String[]): void                              | 
   |-----------------------------------------------------------|  
   | Responsabilidades                                         |
   | -- Contiene el menu que permite al usuario seleccionar    |
   |    la accion a ejecutar sobre el Catalogo de Peliculas    |
   |___________________________________________________________|


    SALIDA DEL PROGRAMA
    ===================

    Elige opcion:
    1.- Iniciar catalogo peliculas
    2.- Agregar Pelicula
    3.- Listar peliculas
    4.- Buscar Pelicula
    0.- Salir
    2
    Introduce el nombre de una pelicula a agregar:
    Batman
    Se ha escrito correctamente el archivo


    Elige opcion:
    1.- Iniciar catalogo peliculas
    2.- Agregar Pelicula
    3.- Listar peliculas
    4.- Buscar Pelicula
    0.- Salir
    3
    Pelicula:Batman

*/