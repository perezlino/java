/*  ======================================================
    ========= INTRODUCCION A LAS CLASES WRAPPER ==========
    ======================================================

    
    Continuando con las clases Envoltorio o Wrapper, que representan a un primitivo pero en forma de 
    objeto, es decir, envuelven, anidan este valor primitivo para dar mayor funcionalidad, método de 
    comprobación, método para validar y conversiones de datos a tipos compatibles. Partamos primero
    con un resumen:


    TIPOS DE DATOS DE REFERENCIA BASADOS EN TIPOS PRIMITIVOS
    ========================================================

    - Cada tipo primitivo tiene su equivalente en un tipo de referencia o clase
    - Dan mayor funcionalidad para operaciones de comprobaciones y conversiones

     ________________________________________
    |                  |                     |   
    |  Tipo primitivo  |  Clase equivalente  |
    |------------------|---------------------|
    |   byte           |    Byte             |   
    |   short          |    Short            |   
    |   int            |    Integer          |   
    |   long           |    Long             |   
    |   float          |    Float            |   
    |   double         |    Double           |   
    |   char           |    Character        |   
    |   boolean        |    Boolean          |   
    |__________________|_____________________|


    CLASE 'INTEGER'
    ===============

    - Cada tipo numerico tiene su propia clase de objetos
    - Así el tipo 'int' tiene la clase 'Integer'
    - Se implementan varios métodos útiles dentro de la clase envoltorio 'Integer'

        Integer i = Integer.valueOf(1234567);
        String s = i.toString();
        int j = i.intValue();
        long l = i.longValue();
        float f = i.floatValue();
        double d = i.doubleValue();
        int k = Integer.parseInt("2147483647");
    
    - Constantes de Integer

        Integer.MIN_VALUE
        Integer.MAX_VALUE
    
    - Métodos estáticos

        String Integer.toString(int i, int base)
        String Integer.toString(int i)
        int Integer.parseInt(String s, int base)
        int Integer.parseInt(String s)
        Integer Integer.valueOf(String s, int base)
        Integer Integer.valueOf(String s)

    - Métodos de la instancia

        int intValue()
        long longValue()
        float floatValue()
        double doubleValue()
        String toString()
        int hashCode()
        boolean equals(Object obj)
        byte byteValue()
        short shortValue()


    CLASE 'LONG'
    ===============

    - Cada tipo numerico tiene su propia clase de objetos
    - Así el tipo 'long' tiene la clase 'Long'
    - Se implementan varios métodos útiles dentro de la clase envoltorio 'Long'

        Long l = Long.valueOf(2147483648L);
        String s = l.toString();
        int i = l.intValue();
        long j = l.longValue();
        float f = l.floatValue();
        double d = l.doubleValue();
        long k = Long.parseLong("9223372036854775807");
    
    - Constantes de Long

        Long.MIN_VALUE
        Long.MAX_VALUE
    
    - Métodos estáticos

        String Long.toString(long l, int base)
        String Long.toString(long l)
        long Long.parseLong(String s, int base)
        long Long.parseLong(String s)
        Long Long.valueOf(String s, int base)
        Long Long.valueOf(String s)

    - Métodos de la instancia

        int intValue()
        long longValue()
        float floatValue()
        double doubleValue()
        String toString()
        int hashCode()
        boolean equals(Object obj)
        byte byteValue()
        short shortValue()        


    CLASE 'DOUBLE'
    ==============

    - Cada tipo numerico tiene su propia clase de objetos
    - Así el tipo 'double' tiene la clase 'Double'
    - Se implementan varios métodos útiles dentro de la clase envoltorio 'Double'

        Double d = Double.valueOf(3.14159);
        String s = d.toString();
        int i = d.intValue();
        long l = d.longValue();
        float f = d.floatValue();
        double j = d.doubleValue();
        double k = Double.parseDouble("3.1459E-2");
    
    - Constantes de Double

        Double.MIN_VALUE
        Double.MAX_VALUE
        Double.POSITIVE_INFINITY
        Double.NEGATIVE_INFINITY
    
    - Métodos estáticos

        String Double.toString(double d)
        double Double.parseDouble(String s)
        Double Double.valueOf(double d)
        Double Double.valueOf(String s)
        boolean Double.isNaN(d)
        boolean Double.isInfinite(d)
        long Double.doubleToLongBits(d)
        double Double.longBitsToDouble(l)

    - Métodos de la instancia

        int intValue()
        long longValue()
        float floatValue()
        double doubleValue()
        String toString()
        boolean equals(Object obj)
        byte byteValue()
        short shortValue()  
        boolean isNaN()         
        boolean isInfinite()


    CLASE 'FLOAT'
    =============

    - De la misma forma que con la clase Double, se han codificado varias funciones útiles dentro
      de los métodos de la clase Float

        Float f = Float.valueOf(3.14159F);
        String s = f.toString();
        int i = f.intValue();
        long l = f.longValue();
        float j = f.floatValue();
        double d = f.doubleValue();
        float k = Float.parseFloat("3.1459E-2f"); 


    CLASE 'CHARACTER'
    =================

    - La clase 'Character' también tiene métodos para comprobaciones y conversiones

        Character c = Character.valueOf('A');
        String s = c.toString();
        char c2 = c.charValue();
        char c3 = Character.toLowerCase(c);
        boolean b = Character.isDigit(c);
        boolean b2 = Character.isAlphabetic(c);
        boolean b3 = Character.isUpperCase(c);
        boolean b4 = Character.isLowerCase(c);
        boolean b5 = Character.isLetter(c);
        boolean b6 = Character.isSpaceChar(c);
        boolean b7 = Character.isSpaceChar(' ');
        boolean b8 = Character.isDigit('7');
    
        - Métodos estáticos

            - Conversiones de caracteres

              Character Character.valueOf(c);
              char Character.toLowerCase(c);
              char Character.toUpperCase(c);

            - Comprobaciones booleanas

              boolean Character.isDigit(c);
              boolean Character.isAlphabetic(c);
              boolean Character.isUpperCase(c);
              boolean Character.isLowerCase(c);
              boolean Character.isLetter(c);
              boolean Character.isSpaceChar(c);

        - Métodos de la instancia

          String toString();
          char charValue();
          boolean equals(Object obj)


    CLASE 'BOOLEAN'
    =================

    - El primitivo boolean también tienen su tipo asociado Boolean, aunque en este caso hay menos
      métodos implementados que para el resto de las clases numéricas.
      
        Boolean c = Boolean.valueOf(true);
        Boolean c2 = Boolean.valueOf("true");
        String s = c.toString();
        boolean c3 = c.booleanValue();

        - Constantes Boolean

          Boolean.TRUE
          Boolean.FALSE

        - Métodos de la instancia

          boolean booleanValue()
          String toString()
          boolean equals(Object obj)

*/    