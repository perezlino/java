/*  ======================================================
    ============ INTRODUCCION A LAS VARIABLES ============
    ======================================================

    Lo primero es que JAVA es fuertemente tipado. Cualquier variable que se defina en la aplicación tiene 
    que estar asociada a un tipo de dato, ya sea si es primitivo, representa un solo valor o bien si es un 
    objeto, un tipo de una clase.


    VARIABLES
    =========

    - Son lo más importante de un lenguaje, son las entidades, contienen valores o datos
    - Una declarión de variable siempre contiene dos partes, el tipo de dato de la variable y su nombre

                                    TipoDeDato nombreVariable;

    - El tipo de la variable determina los valores que la variable puede contener y las operaciones que se
      pueden realizar con ella.                                    
    

    CATEGORIAS DE TIPOS
    ===================

    Existen dos categorias de datos principales:
     ______________   ______________
    |              | |              |
    |  primitivos  | |  referencia  | 
    |______________| |______________|
    
    - Los tipos primitivos contienen un solo valor, no es un objeto, no es una instancia. Incluyen los tipos 
      como los enteros, flotante, los caracteres, booleanos, etc.
    
    - Como tipos de datos referenciados tenemos los arreglos (arrays), las clases y las interfaces

                                          int numero;
                                          int numero = 10;
                                          Integer numero = 10;
                                          String nombre = "Andres";
                                          Usuario usuario = new Usuario ("Andres");

    Por ahora entender que int es primitivo, Integer es de referencia, la clase Integer. String también es de 
    referencia.                                          

/*                                      =============================

    Los tipos de referencia, por ejemplo, los tipos de una clase o un objeto. Un objeto es una instancia de una 
    clase. Es un tipo de referencia. Tiene una estructura de datos más compleja, ya que no es solamente un valor, 
    sino representa una entidad completa, con características, con atributos, con comportamiento (atributos son 
    las variables o características) y funciones (que son los métodos). Un arreglo (array), por ejemplo, también 
    es un tipo de referencia, también tiene atributos y hay otros más que también lo vamos a ver. Por ejemplo, 
    las interfaces y también los enumeradores. La interface también es un tipo de dato que sirve para indicar 
    comportamiento de un objeto en particular, por ejemplo, un objeto está asociado a una interfaz y esa interfaz 
    dice qué cosa o qué operaciones va a realizar ese objeto. Es como un contrato de implementación, pero no se 
    preocupen porque estos temas lo vamos a ver después con mayor profundidad.

/*                                      =============================


    REGLAS PARA DEFINIR NOMBRES DE VARIABLES
    ========================================

    - Por convención, los nombres de las variables empiezan con una letra minúscula.
    - Debe ser un juego de caracteres comprendido en la codificación Unicode.
    - No puede ser el mismo que una palabra clave (reservadas del lenguaje) o el nombre de un valor booleano  
      (true o false).
    - No deben tener el mismo nombre que otras variables cuyas declaraciones aparezcan en el mismo ámbito.
    - Si una variable está compuesta de más de una palabra, como "nombreDato" las palabras se ponen juntas y
      cada palabra después de la primera empieza con una letra mayúscula.
    - Pueden comenzar por una letra, un subrayado o un simbolo de dólar, siendo los siguientes caracteres
      letras o digitos.

  */