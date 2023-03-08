/*  ======================================================
    ======= INTRODUCCION AL MANEJO DE EXCEPCIONES ========
    ======================================================

                                           ___________________________                                                                                 
                                          |         Exception         |           
                                          |---------------------------|                
                                          |                           |                 
                                          |---------------------------|             
                                          |                           |                 
                                          |---------------------------|                                             
                                                        ᐃ                                                       
                                                        |                                                   
                                       _________________|_______________                                                      
                                      |                                 |                                   
                         _____________|_____________       _____________|_____________                                                                            
                        |     RuntimeException      |     |        SQLException       |          
                        |---------------------------|     |---------------------------|             
                        |                           |     |                           |              
                        |---------------------------|     |---------------------------|         
                        |                           |     |                           |             
                        |---------------------------|     |---------------------------|    
                                     ᐃ
                                     |  
                                     |
                        _____________|_____________                                                                                 
                       |    NullPointerException   |           
                       |---------------------------|                
                       |                           |                 
                       |---------------------------|             
                       |                           |                 
                       |---------------------------|         


    Cómo podemos observar en la figura tenemos diferentes tipos de excepciones y la Clase padre de todas las 
    excepciones es la Clase de Throwable. Sin embargo, la Clase de Throwable normalmente no la vamos a utilizar 
    en nuestro código, por ello es que en el diagrama no aparece esta Clase y la Clase Exception es la Clase 
    hija de la Clase Throwable y por lo tanto esta Clase de Exception es la Clase de padre que vamos a estar 
    utilizando realmente nuestros programas. Así que vemos la Clase Exception y a partir de esta Clase podemos 
    crear nuestras propias Clases de Excepción. Lo que vimos en el primer ejemplo fue una Clase de tipo 
    RuntimeException. Así que vamos a tener 2 clasificaciones grandes cuando trabajamos con excepciones. Si la 
    Clase de excepción con la que estamos lidiando es una Clase que hereda de la Clase Exception, entonces, se 
    conoce como de tipo CheckedException, ya que, el compilador nos va a obligar agregar un bloque try y catch o 
    a propagar esta excepción. Más adelante vamos a ver qué significa eso de propagar. Pero básicamente las Clases 
    que hereden de la Clase Exception, entonces, se conocen como de tipo CheckedException y las Clases que heredan 
    de la Clase RuntimeException, se conocen como un UncheckedException. Es decir, que el compilador no nos obliga 
    a agregar un bloque try catch, ni tampoco a reportar estas excepciones. De igual manera, más adelante vamos a 
    ver a qué nos referimos con reportar una excepción. 

    Por ejemplo en nuestro primer ejemplo que vimos, la excepción de tipo ArithmeticException, hereda de la Clase 
    RuntimeException, por lo tanto, si quitamos el bloque de código try catch, podemos observar que el compilador 
    no nos marca ningún problema, así que todas las excepciones de tipo UncheckedException, es decir, que heredan 
    de la Clase RuntimeException, no tienen que reportarse y el compilador no nos va a marcar ningún problema. Sin 
    embargo, este problema va a ocurrir en tiempo de ejecución, por ello es que las Clases de ese tipo, como la 
    Clase ArithmeticException se conocen como de tipo RuntimeException, ya que, son excepciones que ocurren solamente 
    en tiempo de ejecución, hasta que ejecutamos nuestro programa es que nos damos cuenta que puede haber un problema. 
    Por lo tanto, también otro ejemplo es la excepción de tipo NullPointerException. Cualquier variable que quiera 
    acceder a un atributo o método y no esté apuntando a ningún objeto válido y por lo tanto tenga asignado el valor 
    de null, entonces, si trata de acceder a un atributo o método, entonces, va a marcar la excepción de tipo 
    NullPointerException. Sin embargo, el compilador no sabe de esta excepción, hasta que se ejecuta nuestro programa, 
    pero ahí excepciones que heredan de la Clase Exception y esas excepciones, entonces, tenemos que procesarlas 
    utilizando un bloque try catch o tenemos que reportarla en la firma del método. 

    Vamos a ver cómo crear una Clase personalizada para que cuando ejecutemos la operación de división, el compilador 
    nos obligue a agregar la sintaxis de try catch. 
                        
*/    