/*  ======================================================
    ======= INTRODUCCION A LAS CLASES ABSTRACTAS =========
    ======================================================

    CLASES ABSTRACTAS EN JAVA
    =========================

    A continuación vamos a ver el tema de Clases abstractas en la cual vamos a trabajar con 2 Clases, en primer 
    lugar la Clase padre llamada 'FiguraGeometrica' y a partir de esta Clase vamos a crear algunas Clases hijas, 
    como puede ser la Clase 'Rectángulo'. Ahora, ¿por qué una Clase abstracta? Básicamente, una Clase abstracta, 
    vamos a utilizar la palabra reservada abstract y la vamos a utilizar para definir métodos que no tienen ninguna 
    implementación, por lo tanto, también estos métodos se van a marcar como abstractos. Pero si una Clase contiene 
    un método abstracto por lo menos, entonces toda la Clase se tiene que marcar como abstracta, incluso podemos 
    crear Clases abstractas que no tengan métodos abstractos, pero lo común es que si una Clase está marcada como 
    abstracta es porque por lo menos tiene un método abstracto dentro de sus métodos. 

    Así que en este caso estamos utilizando un método abstracto llamado 'dibujar' debido a que la Clase padre llamada 
    'FiguraGeometrica' es muy genérica para saber qué tipo de figura geométrica va a dibujar. Si no establecemos qué 
    tipo de figura geométrica vamos a usar, difícilmente vamos a saber qué tipo de figura geométrica se va a dibujar. 
    Sin embargo, si implementamos una Clase hija, por ejemplo, llamada 'Rectángulo' que extiende de la Clase padre 
    abstracta y llamada 'FiguraGeometrica', entonces vamos a implementar el comportamiento del método 'dibujar' y en 
    este momento es que entonces ya sabemos cuál va a ser el comportamiento, debido a que la Clase de hija ya está 
    especificando un tipo de figura geométrica, en este caso el tipo de 'FiguraGeometrica' 'Rectángulo'. Así que cuando 
    mandemos a llamar el método 'dibujar' debe de imprimir que va a dibujar un rectángulo. En este momento no es que 
    vayamos a dibujar figuras geométricas, solamente vamos a mandar el texto de que se debe dibujar un tipo de la 
    Clase hija, pero básicamente es para que podamos entender cuál es el concepto de las Clases abstractas. Así que 
    básicamente el concepto es que no podemos mandar a llamar el método 'dibujar' en una Clase muy genérica y por lo 
    tanto si todavía no tenemos el conocimiento de qué es lo que va a ser la Clase padre, entonces se marca como un 
    método abstracto y no estamos obligados a agregar ningún comportamiento por default y con esto además obligamos 
    a las Clases hijas a implementar el comportamiento definido en las Clases padres. Así que una Clase hija debe de 
    agregar el comportamiento de los métodos abstractos definidos en la Clase padre. De no hacerlo, entonces la Clase 
    hija se tiene que marcar como abstracta. 

    
                                    public abstract class FiguraGeometrica {

                                        // La clase padre no define comportamiento
                                        abstract void dibujar();
                                    }

                                    public class Rectangulo extends FiguraGeometrica {

                                        void dibujar(){

                                            // Comportamiento de la subclase
                                        }
                                    }


*/