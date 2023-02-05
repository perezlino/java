/*  ======================================================
    = CLASES WRAPPER NUMÉRICAS Y OPERADORES RELACIONALES =
    ======================================================

    Al ejecutar, vemos que son los mismos números, pero hay una diferencia. Son objetos más que 
    números. Son objetos que contienen un valor anidado, encapsulado, dentro de la instancia del 
    Integer.

*/

    public class WrapperOperadoresRelacionales {
        public static void main(String[] args) {
    
            Integer num1 = Integer.valueOf(1000);
            Integer num2 = num1;

            System.out.println("num1 = " + num1); // num1 = 1000
            System.out.println("num2 = " + num2); // num2 = 1000


            // Pero bien vamos a imprimir para saber si son iguales. Entonces con paréntesis num1 si 
            // es == a num2. Debería ser 'True' porque num2 contiene la instancia del num1, la referencia, 
            // el objeto, apunta hacia el mismo objeto, por lo tanto, ambas instancias son exactamente 
            // iguales, es la misma. Es decir, es un objeto que está asignado a dos variables del tipo Integer.

            System.out.println("Son el mismo objeto? : " + (num1 == num2)); // Son el mismo objeto? : true


            // Si ahora a 'num2' le asignamos un valor, se mantendrá la igualdad?:
            num2 = 1000;

            System.out.println("num1 = " + num1); // num1 = 1000
            System.out.println("num2 = " + num2); // num2 = 1000

            /* A pesar de que ambos son 1000, no son el mismo objeto, es decir, contienen el mismo valor, pero 
               no la misma instancia, ese el punto, ya que, al num2 se le asigna otro objeto, otra instancia que 
               contiene el mismo valor y acaba con el ==. Cuando son tipos de referencias o clase wrapper compara 
               por el objeto y no por su valor. A diferencia de los primitivos, los primitivos siempre va a 
               comparar por valor, porque los primitivos no son objetos, son valores. 

               Entonces, cuando usamos el == en primitivos compara por el valor, pero cuando usamos el == en 
               objetos, compara por la instancia, compara si estas dos instancias corresponden a lo mismo. O dicho 
               de otra forma, si estos dos objetos corresponden a la misma instancia.   */

            System.out.println("Son el mismo objeto? " + (num1 == num2)); // Son el mismo objeto? : false
/*           ______________________________________________________________________________________________________
            |                                                                                                      | 
            |   Ahora hay una excepción muy particular en Java. Esto se aplica solamente a tipos o números que     | 
            |   sean menor a 128.                                                                                  |         
            |                                                                                                      | 
            |   Bueno, porque JAVA hasta 127 como máximo, va a comparar de forma automática por el valor, a pesar  | 
            |   de que sean instancias. Entonces, si es 127 o menor, va a comparar siempre por valor y no por la   | 
            |   instancia, pero si es mayor a 127, ya cambia el escenario, siempre a comparar el == por la         | 
            |   instancia, por el objeto.                                                                          |     
            |______________________________________________________________________________________________________|    
*/
            num2 = 127;
            System.out.println("Son el mismo objeto? " + (num1 == num2)); // Son el mismo objeto? : true


            // Con .equals podemos comparar dos objetos de referencia por el valor:    
            System.out.println("tienen el mismo valor? " + (num1.equals(num2))); // tienen el mismo valor? : true

            // En vez de usar el .equals, podemos convertir de forma explícita cada uno a un primitivo:
            System.out.println("tienen el mismo valor? " + (num1.intValue() == num2.intValue())); // tienen el mismo valor? : true
            
            
            /* Cuando usamos el >, >=, <, <= y los operadores aritméticos de suma, multiplicación, resta, división, 
               calcular el resto, cualquier operación aritmética y relacional, excepto el ==, de forma automática 
               también puedo trabajar con tipos de referencia y por debajo se convierten usando UNBOXING. */
            
            num2 = 500;

            System.out.println("condicion = " + (num1 > num2)); // condicion = true

            boolean condicion = num1 > num2;
            System.out.println("condicion = " + condicion); // condicion = true

            boolean condicion2 = num1.intValue() < num2.intValue();
            System.out.println("condicion2 = " + condicion2);  // condicion2 = false
        }
    }
