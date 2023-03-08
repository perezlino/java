/*  ======================================================
    ========= INTRODUCCION AL CONTEXTO ESTATICO ==========
    ======================================================

    Cuando estamos trabajando con JAVA tenemos 2 contextos básicamente, el contexto cuando estamos 
    trabajando con las "Clases" se conoce como 'CONTEXTO ESTATICO' y una vez que ya tenemos cargada 
    a la Clase en memoria y empezamos a crear Objetos de esta Clase, entonces a ese contexto se le 
    conoce como "CONTEXTO DINAMICO". Así que la "Carga de Clases" vamos a conocerlo como "Contexto 
    estático", y cuando ya podemos crear Objetos de la Clase que ya está en memoria, entonces se 
    conoce como "Contexto Dinamico" y por consiguiente lo que sucede es que el "Contexto estatico" 
    no puede acceder al "Contexto dinamico", ya que, se necesita que las Clases ya estén creadas 
    para poder crear Objetos, así que el "Contexto estatico" no puede acceder al "Contexto dinamico", 
    ya que, en primer lugar debemos de crear la Clase y ésta posteriormente después de creada y 
    cargada la Clase en memoria, entonces es que podemos crear Objetos. Sin embargo, el "Contexto 
    dinamico" sí puede acceder al "Contexto estatico", esto debido a que cuando ya creamos los 
    Objetos, podemos acceder al "Contexto dinamico", que es cuando ya creamos Objetos, pero también 
    ya podemos acceder a las Clases, es decir, al "Contexto estatico". 
     ________________________________________________________________________________________________________
    |                                                                                                        |                               
    |   Ahora, por qué estamos viendo esto, porque siempre que veamos la palabra reservada 'static', tiene   |   
    |   que ver con el "Contexto estatico" y esto quiere decir que los atributos o métodos que definamos     |   
    |   con la palabra 'static' se van a asociar con nuestra Clase y no con los Objetos.                     |   
    |________________________________________________________________________________________________________|
     ________________________________________________________________________________________________________
    |                                                                                                        |                      
    |   Por otro lado tenemos el "Contexto dinamico", es decir, como hemos trabajado hasta el momento, y si  |   
    |   no utilizamos la palabra reservada 'static' ya sean atributos o métodos, quiere decir que se asocia  |   
    |   con los Objetos, así que los atributos y métodos que no tengan la palabra 'static', se van a asociar |
    |   con los Objetos.                                                                                     |   
    |________________________________________________________________________________________________________|

    Ahora, según hemos comentado, cuando utilizamos la palabra reservada 'static', ya sea, en atributos o en 
    métodos, entonces son atributos y métodos que se asocian con nuestra Clase, por lo tanto estos atributos 
    o métodos pueden ser accedidos desde cualquier Objeto, ya que, la información no se va a asociar con los 
    Objetos como hemos venido trabajando, sino, con nuestra Clase directamente. Por lo tanto, la información 
    que modifiquemos a nivel de Clase la van a poder visualizar todos los Objetos que queramos de nuestra 
    Clase. 

     _______________________
    |     NombreObjeto1     | 
    |-----------------------|  ------------------------------
    | + AtributoNoEstatico1 |                                |          _________________________________
    | + AtributoNoEstatico2 |                                |         |            NombreClase          |    
    | etc...                |   Comparten los Atributos y    |         |---------------------------------| 
    |_______________________|   Metodos Estaticos            |-------->| + AtributoEstatico              |    
                                                             |         |---------------------------------|
     _______________________                                 |         | + MetodoEstatico(arg) : return  |   
    |     NombreObjeto2     |                                |         |_________________________________|
    |-----------------------|  ------------------------------
    | + AtributoNoEstatico1 |
    | + AtributoNoEstatico2 |
    | etc...                |
    |_______________________|        


    
    Y los atributos que no tengan la palabra 'static', ni tampoco los métodos, entonces hemos visto que 
    se asocian con los Objetos, por lo tanto, la información de los atributos no estáticos no se comparte 
    entre los Objetos. Si los atributos son no estáticos, entonces cada vez que creamos un nuevo Objeto 
    hemos visto que cada Objeto mantiene su información por separado, no comparten información entre estos 
    Objetos. Sin embargo, el atributo estático y el método estático se asocian con la Clase, por tanto, 
    comparten información con cada uno de los Objetos. 
    
    Y vamos a ver la sintaxis para acceder a estos atributos, en lugar de utilizar el nombre del Objeto, 
    vamos a utilizar el nombre de la Clase, ya que, los atributos y métodos estáticos, como hemos comentado, 
    se asocian con la Clase y no con los Objetos. Por lo tanto, podemos utilizar el nombre de la Clase 
    directamente y posteriormente el atributo o metodo estatico. Ya que, si utilizamos la palabra 'static' 
    todo se va a asociar directamente con el nombre de la Clase.

                                        NombreClase.atributoEstatico
                                        NombreClase.metodoEstatico
*/