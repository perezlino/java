/*  ======================================================
    ============ INTRODUCCION A LOS OPERADORES ===========
    ======================================================

    Java proporciona muchos tipos de operadores que se pueden usar según la necesidad. Se
    clasifican según la funcionalidad que brindan.

    Sirven para realizar cálculos matemáticos, comparar valores, para unir identificadores
    y literales, para formar expresiones lógica, toma de decisión, etc.

     _______________   _______________   ___________   ______________
    |               | |               | |           | |              |
    |  aritméticos  | |  relacionales | |  lógicos  | |  asignación  |
    |_______________| |_______________| |___________| |______________|
     _________________________________________________________________________
    |                                                                         |  
    |   unarios, incrementales, ternarios, combinados, de bits, de instancia  |  
    |_________________________________________________________________________|


    ARTIMÉTICOS
    ===========

    Se utilizan para realizar operaciones aritmeticas:

    |----------|-----------------|-----------------------------------------|-----------|   
    | Operador |	Nombre	     |              Descripcion	               | Operacion |
    |----------|-----------------|-----------------------------------------|-----------|
    |    +     | 	  Suma	     | Suma dos valores	                       |   x + y   | 	
    |    -	   |      Resta	     | Resta un valor a otro                   |   x - y   | 	
    |    *	   | Multiplicacion	 | Multiplica dos valores	               |   x * y   | 	
    |    /	   |     Division	 | Divide un valor por otro                |   x / y   | 	    
    |    %	   | Modulo o Resto	 | Devuelve el resto de la división	       |   x % y   | 	
    |    ++	   |    Incremento	 | Aumenta el valor de una variable en 1   | 	++x	   | 
    |    --	   |    Decremento	 | Disminuye el valor de una variable en 1 |    --x	   | 
    |----------|-----------------|-----------------------------------------|-----------|

                                    =============================

    ASIGNACIÓN
    ==========

    Los operadores de asignación se utilizan para asignar valores a las variables.

        COMBINADOS
        ----------
        - Operadores combinados o compuestos: -=, +=, /=, *=, etc.
        - a += 5 es equivalente: a = a + 5
            
            int a = 3
            a += 5 // a vale 8
 
        - a /= b es equivalente: a = a / b     


        INCREMENTO Y DECREMENTO
        -----------------------
        - Utilizado para incrementar o decrementar el valor en 1
        - Hay dos variedades de operador de incremento pre y post
 
        |---------|-----------------|-------------------------------------------|
        | Ejemplo |     Nombre      |                  Efecto                   |
        |---------|-----------------|-------------------------------------------|
        |   ++a   | Pre-incremento  | Incrementa 'a' en 1, y luego devuelve 'a' |
        |   a++   | Post-incremento | Devuelve 'a', y luego incrementa 'a' en 1 |
        |   --a   | Pre-decremento  | Decrementa 'a' en 1, y luego devuelve 'a' |
        |   a--   | Post_decremento | Devuelve 'a', y luego decrementa 'a' en 1 |
        |---------|-----------------|-------------------------------------------|
*/
        public class incrementoDecremento {
            public static void main(String[] args) {

                int a = 1; 
                System.out.println("a = " + a);
                int b = ++a;
                System.out.println("a = " + a + " y b = " + b);
                int c = a++;
                System.out.println("a = " + a + " y c = " + c);

            }
        } 
/*      a = 1
        a = 2 y b = 2
        a = 3 y c = 2


    Una lista de todos los operadores de asignación:

    |----------|---------|--------------|   
    | Operador | Ejemplo |  Igual que	| 
    |----------|---------|--------------|
    |     =	   |  x = 5	 |  x = 5	    |
    |    +=	   |  x += 3 |  x = x + 3	|        
    |    -=	   |  x -= 3 |	x = x - 3	|
    |    *=	   |  x *= 3 |	x = x * 3	|
    |    /=	   |  x /= 3 |	x = x / 3	|
    |    %=	   |  x %= 3 |	x = x % 3	|
    |    &=	   |  x &= 3 |	x = x & 3	|
    |    |=	   |  x |= 3 |	x = x | 3	|
    |    ^=	   |  x ^= 3 |	x = x ^ 3	|
    |   >>=	   | x >>= 3 |	x = x >> 3	|
    |   <<=	   | x <<= 3 |	x = x << 3  |
    |----------|---------|--------------|

                                    =============================

    TERNARIO O CONDICIONAL
    ======================                                    

    - El operador ternario es una versión abreviada de la sentencia if-else
    - Tiene tres operandos y de ahí el nombre ternario:
    
                        (condición) ? valor1:valor2

    - Si la condición se cumple devuelve el primer valor y, en caso contrario, el
      segundo.
    - El siguiente ejemplo asignaría a la variable 'a' un 2.

        int a = 2 > 3 ? 1 : 2 

                                    =============================

    RELACIONAL
    ==========
    
    - Se utilizan para comprobar relaciones de igualdad, mayor que, menor que
    - Devuelven un resultado booleano después de la comparación, 'true' si la comparación
      fue exitosa y 'false' en caso contrario.
    - Se usan ampliamente en las sentencias if-else, así como en bucles.

    |----------|-------------------|---------|    
    | Operador |      Nombre       | Ejemplo |   	
    |----------|-------------------|---------| 
    |    ==	   | Igual a	       | x == y	 |   
    |    !=	   | No es igual	   | x != y	 |   
    |    >	   | Mayor que	       | x > y	 |   
    |    <	   | Menor que	       | x < y	 |   
    |    >=	   | Mayor o igual que | x >= y	 |   
    |    <=	   | Menor o igual que | x <= y  |   
    |----------|-------------------|---------|

                                    =============================

    LÓGICOS
    =======

    - Los operadores lógicos permiten evaluar expresiones lógicos y trabajan con operandos booleanos
    - Realizan las operaciones lógicas de conjunción (AND), disyunción (OR) y negación (NOT).
    - && tiene mayor predominancia sobre ||

    |--------|----------|-------------|-----------------------------------------------------------------------|
    | nombre | Operador | Utilizacion |                             Resultado                                 |
    |--------|----------|-------------|-----------------------------------------------------------------------|
    |  and   |    &&    |   A && B    | verdadero cuando A y B son verdaderos. Evaluación condicional         |
    |  or    |    ||    |   A || B    | verdadero cuando A o B son verdaderos. Evaluación condicional         | 
    |  not   |     !    |     !A      | verdadero si A es falso                                               |  
    |  and   |     &    |    A & B    | verdadero cuando A y B son verdaderos. Siempre evalúa ambos operandos |  
    |  or    |     |    |    A | B    | verdadero cuando A o B son verdaderos. Siempre evalúa ambos operandos |  
    |  XOr   |     ^    |    A ^ B    | verdadero cuando A y B son diferentes.                                |                                  
    |--------|----------|-------------|-----------------------------------------------------------------------|  

    |-----------|-----------|-------|------|-------|-------|
    |     A     |     B     |  And  |  Or  |  Not  |  XOr  |
    |-----------|-----------|-------|------|-------|-------|
    |   true    |   true    | true  | true | false |   0   |
    |   true    |   false   | false | true | false |   1   |
    |   false   |   true    | false | true | true  |   1   |
    |   false   |   false   | false | false| true  |   0   |
    |-----------|-----------|-------|------|-------|-------|
*/      