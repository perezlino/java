/*  ======================================================
    =========== INTRODUCCION A LAS INTERFACES ============
    ======================================================


Una 'interface' se va a ser parecida a una Clase 'abstracta' en el sentido de que los métodos de una 'interface' 
tampoco tienen una implementación, así que también son métodos abstractos. Sin embargo, una 'interface' es un 
nuevo tipo en Java y similar a las claves 'abstractas', todos los métodos que definamos dentro de una 'interface' 
van a ser abstractos. Y también otro detalle es que si agregamos atributos a una 'interface' van a ser constantes, 
esto quiere decir que en automático son atributos de tipo 'public', 'final' y 'static', los tres atributos asociados 
a una constante. Así que, cualquier variable que definamos dentro de una 'interface' va a ser una constante. 

Ahora, ¿cuál es la diferencia entonces entre una Clase 'abstracta' y una 'interface'? ¿si ambos tienen métodos 
abstractos, entonces, cuando utilizar una Clase 'abstracta' o una 'interface'? La respuesta es simple, cuando las 
características de nuestra Clase son muy parecidas, por ejemplo, en este caso 'FiguraGeométrica' está relacionada 
con las Clases de 'Cuadrado', 'Triángulo' y 'Círculo', entonces, esto quiere decir que tenemos una relación de 
Herencia y por lo tanto, en este tipo de caso lo más conveniente es utilizar una Clase 'abstracta', como lo vimos 
en el ejercicio anterior. Sin embargo, cuando la relación entre Clases no es tanto por características, sino más 
bien, por comportamiento, entonces, es más conveniente utilizar una 'interface'. En el siguiente ejercicio que vamos 
a crear una 'interface' llamada 'AccesoDatos' y esa 'interface' llamada 'AccesoDatos' la va a implementar tanto 
a una 'interface' de MySql (que es una base de datos). Pero también la vamos a implementar utilizando Oracle. En este 
ejercicio todavía no nos vamos a conectar a una base de datos, pero es un buen ejercicio para poner en práctica cuando 
utilizar 'interface's. Ya más adelante, en otros niveles vamos a conectarnos a una base de datos real, pero lo queremos 
ejemplificar es que podemos utilizar este ejercicio para poner en práctica el concepto de 'interface'. Así que las 
Clases de Oracle y MySql, no están relacionadas con el concepto de Herencia de Clases 'abstractas', sino más bien, por 
comportamiento de base de datos, ya que, tanto en la base de datos de MySql, como en la base de datos de Oracle, ambos 
tienen métodos para insertar, leer información, actualizar o eliminar. Así que este ejercicio es un candidato ideal 
para establecer una 'interface' que tenga los métodos más genéricos y posteriormente de las Clases de MySql y Oracle 
van a implementar los métodos definidos en una 'interface'. Así que, una 'interface' la vamos a utilizar más para el 
comportamiento de nuestras Clases, no tanto por las características que heredemos, sino más bien, por comportamiento 
en común. 

*/