/*  ======================================================
    ========== INTRODUCCION A LOS CONSTRUCTORES ==========
    ======================================================

     _________________________________________       _____________________________________________   
    |                                         |     |                                             |      
    |   Creacion Objeto tipo Aritmetica       |     |   Creacion Objeto tipo Aritmetica           |  
    |   Sin inicializar valores               |     |   Inicializando valores                     |  
    |   (uso del constructor vacio)           |     |   (uso de constructor NO vacio)             |  
    |                                         |     |                                             |  
    |   int a; ==========> a = 0              |     |   a = 5;                                    |  
    |   int b; ==========> b = 0              |     |   b = 10;                                   |  
    |                                         |     |                                             |  
    |   Aritmetica var1 = new Aritmetica();   |     |   Aritmetica var1 = new Aritmetica(5,10);   |
    |                     ----------------    |     |                     --------------------    |         
    |_________________________________________|     |_____________________________________________|
    
    En este caso nuestra clase debe de tener dos constructores, el constructor vacio para poder crear 
    Objetos sin inicializar los valores de los atributos. Y por otro lado debe tener un constructor
    que reciba argumentos, para poder inicializar desde el momento que se crea nuestro Objeto los 
    valores.

    ¿Para que nos sirve un constructor?
    -----------------------------------

    Basicamente para crear los Objetos con diferentes valores desde la creacion del Objeto. Asi que 
    podemos tener uno o varios constructores definidos en nuestra clase.
*/