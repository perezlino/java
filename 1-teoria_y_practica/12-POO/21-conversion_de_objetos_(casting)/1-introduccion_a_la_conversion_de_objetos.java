/*  ======================================================
    ====== INTRODUCCION A LA CONVERSION DE OBJETOS =======
    ======================================================

    CONVERSION DE OBJETOS EN JAVA
    =============================

    Podemos observar en el siguiente diagrama lo que vamos a hacer en este ejercicio, vamos a ver el concepto 
    de conversión de objetos en Java. Recordemos que la Clase padre de todas las Clases en Java es la Clase 
    'Object'. Posteriormente, tenemos nuestra Clase 'Empleado', la cual extiende de manera automática de la Clase 
    'Object'. Al no indicar que no se extiende de ninguna otra Clase, entonces en automático extiende de la Clase 
    'Object'. Sin embargo, tenemos nuestra Clase 'Gerente' la cual extiende directamente de la Clase 'Empleado' y 
    vamos a crear otra Clase más, la Clase de 'Escritor'. Pero bien podríamos tener más Clases, como la Clase de 
    Editor, la Clase de 'Corrector', etc. y tener una jerarquía de Clases más grande. 

    Básicamente lo que vamos a ver es que el proceso de convertir una variable que almacena una referencia a un 
    tipo padre y le asignamos a una referencia de tipo hijo, entonces a esto se le conoce como 'Downcasting'. Así 
    que ir de una Clase superior a una Clase inferior se conoce como 'Downcasting'. Convertir una referencia de tipo 
    hijo hacia un tipo padre a esto se le conoce como 'Upcasting'. En ambos casos es un casting o casteo o conversión 
    de objetos, pero dependiendo de la dirección en la que lo hagamos, se conoce como 'Downcasting', de una Clase 
    padre a una Clase hija y 'Upcasting', de una Clase hija a una Clase padre. 

                                    _____________________
                                   |                     |   
                                   |        Object       |
                                   |_____________________|
                                              ᐱ  
                                              |
                                              | <<extends>>
                                              |
                                    _____________________
                                   |                     |   
    ------------------>            |       Empleado      |                      ________________________
    |                              |_____________________|                                              |
    |                                         ᐱ                                                         
    |                                         |                                                         |
    |                                         | <<extends>>                                             |
    |                 ________________________|__________________________                               |
    |                |                                                   |                              |    
    |      _____________________    _____________________     _____________________                     |
    |     |                     |  |                     |   |                     |        <-----------
    ----  |       Editor        |  |       Gerente       |   |       Escritor      |
          |_____________________|  |_____________________|   |_____________________|                   
                                                                        ᐱ
                                                                        |
                                                                        | <<extends>>
                                                                        |
                                                              _____________________
                                                             |                     |   
                                                             |      Corrector      |
                                                             |_____________________|                                                                        

*/