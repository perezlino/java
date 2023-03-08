/*  ======================================================
    ======= INTRODUCCION A TIPOS GENERICOS EN JAVA =======
    ======================================================

    Tipos genericos que se pueden utilizar:
     ______________________________________________________________________________________________________
    |   Nombre Tipo Generico   |                     Significado del Tipo Generico                         |
    |--------------------------|---------------------------------------------------------------------------|
    |            E             | Element (utilizado generalmente por el framework de Colecciones de Java)  | 
    |--------------------------|---------------------------------------------------------------------------|
    |            K             | Key (Llave, utilizado en mapas)                                           | 
    |--------------------------|---------------------------------------------------------------------------|
    |            N             | Number (utilizado para numeros)                                           |
    |--------------------------|---------------------------------------------------------------------------|
    |            T             | Type (representa un tipo, es decir, una Clase)                            |
    |--------------------------|---------------------------------------------------------------------------|
    |            V             | Value (representa un valor, tambien se usa en mapas)                      |
    |--------------------------|---------------------------------------------------------------------------|
    |         S,U,V,etc        | Usado para representar otros tipos                                        |
    |--------------------------|---------------------------------------------------------------------------| 
    
    Básicamente un Tipo Genérico en Java es como un tipo comodín, en el cual cuando definimos nuestra Clase, no 
    vamos a indicar el tipo de dato que va a almacenar o utilizar nuestra Clase, sino, que hasta el momento en 
    que creamos un Objeto de esta Clase, entonces, es que vamos a especificar el tipo de dato que vamos a utilizar. 
    A esto se le conoce como un Tipo Genérico. Y existen diferentes nomenclaturas para indicar un Tipo Genérico, 
    por ejemplo, la '<E>' se puede utilizar para element, que es utilizado por el API de Collection. Por ejemplo, 
    cuando revisamos el Javadoc de la interface de Collection, en la cual, entre pico paréntesis se indicaba el 
    tipo '<E>' y básicamente significa que podemos agregar un elemento de cierto tipo, pero el tipo lo vamos a 
    especificar hasta que utilicemos la Clase, por lo tanto, se declara de manera genérica y hasta que se utilice 
    esta Clase, se cree un Objeto, es que se va a indicar el tipo. Posteriormente, existe la letra 'K', también para 
    definir tipos genéricos, normalmente se utiliza para definir una clave, un key y utilizado también en tipos map. 
    La letra 'N' se utiliza para elementos de tipo Number. La letra 'T' representa un tipo, es decir, una Clase. La 
    letra 'V' se utiliza para representar un valor. Y además, tenemos otros tipos como puede ser 'S, U, V, etcétera', 
    utilizado para representar otros tipos genéricos. Pero vamos a aterrizar este concepto, ya que, hasta aquí puede 
    er muy abstracto, vamos a ver cómo crear una Clase que utiliza un Tipo Generico y en lecciones posteriores, vamos 
    a ver cómo utilizar nuestro API de Collection, pero utilizando también Tipos Genericos. 

*/