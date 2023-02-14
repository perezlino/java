/*  ======================================================
    ============ INTRODUCCION A LA SOBRECARGA ============
    ======================================================


    ¿QUE ES LA SOBRECARGA?
    ======================

    -   La sobrecarga se refiere a la posibilidad de tener dos o más métodos con el mismo nombre pero con 
        funcionalidad diferente!

        int sumar(int a, int b) { 
        return a + b;
        }

    - Lo que importa es que los argumentos sean distintos, ya sea en tipo de dato, pero también en 
      cantidad.

    - Entonces, para resumir y finalizar, no importa el tipo de retorno, si es entero, flotante, si es
      void o si el double o del tipo string. Al final lo que importa son los parámetros que se recibe 
      en el método que sean diferente en tipo y también en cantidad.

    - No solamente se aplica para tipos de datos numéricos o primitivos, también para tipos de referencia
      objetos.

        float sumar(float a, float b) { ... }
        float sumar(int a, float b) { ... }
        float sumar(float a, int b) { ... }
        double sumar(double x, double y, double z) { ... }
        int sumar(String a, String b) { ... }
        int sumar(int a, int b, int c, int d) { ... }

*/    