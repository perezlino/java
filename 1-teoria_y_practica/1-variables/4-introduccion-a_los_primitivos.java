/*  ======================================================
    ============ INTRODUCCION A LOS PRIMITIVOS ===========
    ======================================================

    PRIMITIVOS
    ==========
    
    Son tipos de datos escalares que contienen un solo valor.

    Como to en Java es de tipado estático, es decir, se define el tipo de dato de la variable
    a la hora de definir esta.
     ______________   _____________   ____________   ___________
    |              | |             | |            | |           |
    |   enteros    | |  flotantes  | | caracteres | | booleanos |
    |______________| |_____________| |____________| |___________|
    
    El tipo de dato se escribe completamente en "minúsculas".


    BOOLEAN
    =======

    - Este es el tipo más simple de un solo bit
    - Un boolean expresa un valor de verdad, puede ser VERDADERO O FALSO.
    - Para especificar un literal boolean, se usan las palabras clave 'true' o 'false',
      ambas escritas en minúsculas.  
*/
                                boolean a = false;
                                boolean b = true;  
/*   

    CHAR
    ====

    A diferencia de un String, CHAR va con comilla simple y contiene en este caso un solo carácter, 
    pero también puede tener más de un carácter. Cuando se trata de un código UNICODE, por ejemplo, 
    siempre se coloca la barra invertida y u y luego el código. Ese código 0021 corresponde al signo 
    de exclamación invertida ( ! ) en la tabla.

    - Usa el código UNICODE y cada caracter ocupa 16 bits
*/ 
                                char a = 'a';
                                char b = '1';
                                char c = '\u0021';
/*
                            |---------------------|---------------------|
                            | Secuencia de escape |       Simbolo       |
                            |---------------------|---------------------|
                            |          \b         | Retroceso           |    
                            |          \n         | Nueva linea         |
                            |          \r         | Retorno del carro   |
                            |          \t         | Tabulador           |
                            |          \\         | Diagonal invertida  |
                            |          \"         | Comillas dobles     |
                            |---------------------|---------------------|


    NUMEROS ENTEROS
    ===============                            

    Recuerde que el bit es más pequeño, el short es casi intermedio, solamente 16 bits. El integer de 
    32 bit y el long de 64. Cada uno tiene sus límites, tanto positivos como negativos. Es importante 
    saber que los enteros no tienen precisión. Son parte del conjunto de los números Z que van entre su 
    rango dependiendo del tipo.

    - Son 4 tipos: 'byte', 'short', 'int' y 'long'
    - Un entero es un numero del conjunto Z = {..., -2, -1, 0, 1, 2, ...}
    - Difieren en las precisiones y pueden ser positivos o negativos
*/
                                // entre -128 a 127
                                byte enteroByte  = 127;

                                // entre -32768 a 32767
                                short enteroShort  = 32767;

                                // entre -2147483648 a 2147483647
                                int enteroInt  = 2147483647;

                                // entre -9223372036854775808 a 9223372036854775807
                                long enteroLong  = 9223372036854775807L;
/*

    NUMEROS REALES
    ==============
    
    - Es un tipo de dato para guardar números reales en coma flotante con precisión simple y doble
    - Los números de punto flotante (también conocidos como "flotantes", "dobles" o "números reales")
*/
                                // entre -1.4E-45 a 3.4028235E38
                                float realFloat = 3.1416f;

                                // entre -4.9E-324 a 1.7976931348623157E308
                                double realDouble = 4.7029235E3;
/* 

    Todo primitivo tiene su clase que envuelve al primitivo, que se le conoce como clase equivalente o 
    clase wrapper. Viene de anidar, de envolver el valor de primitivo para darle funcionalidad extra. 
    Métodos para convertir a diferentes tipos de datos dentro de sus propios tipos.

    Si es un tipo numérico o entero, puede convertir a los demás tipos numéricos enteros como el byte, 
    short, el integer o el long, siempre y cuando estén dentro de los rangos del alcance, porque, por 
    ejemplo, si convertimos un long en un byte, obviamente uno es un número mucho más grande que un byte. 
    Por lo tanto, se va a romper y va a haber pérdida de información.

    El valor por defecto de un CHAR es null que corresponde al valor UNICODE u0000.


    TABLA DE RESUMEN
    ================

    |---------|-------------------------------|---------|------|-------------------|-------------------|
    |         | Descripción                   | Tamaño  | Byte | Clase equivalente | Valor por defecto |
    |---------|-------------------------------|---------|------|-------------------|-------------------|
    | boolean | Valor lógico                  | 1 bit   |      |    Boolean        | false             | 
    | char    | Caracter                      | 16 bits |  2   |    Character      | u0000             | 
    | byte    | Entero muy pequeño            | 8 bits  |  1   |    Byte           | 0                 |     
    | short   | Entero pequeño                | 16 bits |  2   |    Short          | 0                 | 
    | int     | Entero                        | 32 bits |  4   |    Integer        | 0                 |     
    | long    | Entero grande                 | 64 bits |  8   |    Long           | 0L                |         
    | float   | Numero real precisión simple  | 32 bits |  4   |    Float          | 0.0f              | 
    | double  | Numero real precisión doble   | 64 bits |  8   |    Double         | 0.0d              | 
    |---------|-------------------------------|---------|------|-------------------|-------------------|
 */   