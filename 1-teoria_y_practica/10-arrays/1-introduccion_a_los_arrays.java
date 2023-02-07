/*  ======================================================
    ============= INTRODUCCION A LOS ARRAYS ==============
    ======================================================

    
    Lo primero que hay que saber es que son tipos de datos de referencia, es decir, son objetos. 
    Un arreglo es una instancia, una referencia, incluso como todo objeto en Java es del tipo object. 
    Por lo tanto, extiende, hereda de Object, pero es un objeto especial que contiene varios elementos. 
    Agrupa es una colección ordenada de elementos y podemos guardar, pero también acceder a estos 
    valores, a estos elementos, mediante una llave.


    ¿QUE SON LOS ARRAYS?
    ====================

    - Son tipos de datos de referencia que contienen varios elementos ordenados, una colección.
    - Sus elementos o valores están asociados a una llave o indice y puede contener tipos de referencia
      o primitivos.
    - Pero siempre asociado a un solo tipo de datos

    ---> Comienza en el indice 0
    ---> Total de elementos: length = 10
    ---> int 5 se encuentra en el indice 4
     ___________________________________________________________ 
    |  0  |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  | INDICE
    |-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|
    |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  | 10  | ELEMENTOS       
    |-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|


    DECLARACION E INSTANCIACION
    ===========================
    
    - La declaracion de un Array tiene dos partes: el tipo de datos del array seguido de 
      corchetes y el nombre de la variable.
    
                                    int [] numeros;

    - Un tipo de array incluye el tipo de dato de los elementos que va a contener

    - Cuando se crea un Array, se utiliza el operador 'new' más el tipo de dato de los elementos,
      más el número de elementos.

                                    int [] numeros = new int[3]
    
    Por lo tanto, los arrays contienen un tamaño fijo de elementos y este tamaño fijo no se puede 
    modificar. Es decir, el arreglo se crea una sola vez con cierta cantidad de espacio, con un tamaño 
    determinado, explícito y después no podemos volver a modificar, por lo tanto, en este sentido poco 
    flexible.

    - Pero no solo podemos almacenar elementos del tipo primitivos, sino que, también del tipo de 
      referencia

                                    Producto [] productos = new Producto[3];
                                    String [] nombres = new String[5];


    INICIALIZACIÓN DE ELEMENTOS
    ===========================

    - Asignamos elementos mediante la llave o índice

                                    int [] numeros = new int[3];
                                    numeros[0] = 1;
                                    numeros[1] = 2;
                                    numeros[2] = 3; 

                                    Producto [] productos = new Producto[3];
                                    productos[0] = new Producto("Mesa Comedor");
                                    productos[1] = new Producto("TV Sony LED 55");
                                    productos[2] = new Producto("Bicicleta Oxford");

                                    String [] nombres = new String[5];
                                    nombres[0] = "Alfonso";
                                    nombres[1] = "Andres";
                                    nombres[2] = "Tomas";
                                    nombres[3] = "Maria";
                                    nombres[4] = "Javiera";


    OBTENCIÓN DE ELEMENTOS
    ======================

    - Accedemos a los elementos del array mediante la llave o indice
    
    int num1 = numeros[0];
    int num2 = numeros[1];
    int num3 = numeros[2];

    Producto mesa = productos[0];
    Producto tvSony = productos[1];
    Producto bicicleta = productos[2];

    String nombre1 = nombres[0];
    String nombre2 = nombres[1];
    String nombre3 = nombres[2];
    String nombre4 = nombres[3];
    String nombre5 = nombres[4];


    DECLARACION, INSTANCIACION Y INICIALIACION DE UN ARRAY
    ======================================================

    Pero tenemos otra forma de declarar instancias e inicializar todo en una sola instrucción un arreglo. 
    Entonces, en vez de usar el operador new como en el ejemplo anterior, simplemente se puede declarar, 
    inicializar, instanciar un objeto de forma directa, utilizando las llaves y dentro los elementos 
    separados por coma. Pero esta nomenclatura es útil solamente cuando conocemos bien la cantidad de 
    elementos que va a contener el arreglo.

    - Se usa cuando ya conocemos la cantidad de elementos que va a contener

                                        int [] numeros = {1, 2, 3};


    - Se usa cuando ya conocemos la cantidad de elementos que va a contener
    
    int [] numeros = {1, 2, 3};

    Producto [] productos = {new Producto("Mesa Comedor"), new Producto("TV Sony LED 55"), 
                             new Producto("Bicicleta Oxford")};

    String [] nombres = {"Andres", "Maria", "Jose", "Isabel", "Juan"};                            


    RECORRER ARRAY USANDO 'FOR'
    ===========================

    String [] nombres = {"Andres", "Maria", "Jose", "Isabel", "Juan"};  

    for (int i = 0; i < nombres.length; i++) {
        System.out.println("nombre = " + nombres[i]);
    }


    RECORRER ARRAY USANDO 'FOR EACH'
    ================================
    
    String [] nombres = {"Andres", "Maria", "Jose", "Isabel", "Juan"};  

    for (String nom : nombres) {
        System.out.println("nombre = " + nom);
    }    
    

    ¿CUALES SON LAS VENTAJAS DE LOS ARRAYS?
    =======================================
    
    Bueno, son tipos de datos para guardar elementos optimizados. Es decir, podemos acceder y ordenar 
    elementos de un arreglo de forma eficiente, de acceso rápido. Podemos obtener cualquier elemento 
    ubicado en una posición de índice específica.

    La desventaja es el tamaño o límite. Sólo podemos almacenar un tamaño fijo de elementos, es decir, 
    no podemos hacer que su tamaño aumente o crezca en tiempo de ejecución, no es dinámico. Entonces, 
    para resolver este problema podemos utilizar el API de colección de Java del tipo "list" o "collection" 
    de Java o "set", o bien replicar, crear una copia de un array, pero con mayor capacidad y así poblar 
    este nuevo array con los datos del array anterior.
    
*/