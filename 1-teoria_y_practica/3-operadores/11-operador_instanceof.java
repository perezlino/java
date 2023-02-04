/*  ======================================================
    ================ OPERADOR INSTANCEOF =================
    ======================================================

    ______________________________________________________________________________________________________
   |                                                                                                      |  
   |    Instanceof = Si es instancia de                                                                   |  
   |    -------------------------------                                                                   |      
   |                                                                                                      |  
   |    Object es la clase padre de todos los objetos, es decir, toda clase de Java, cualquier clase,     |  
   |    hereda de Object. Aunque no se ve, pero de forma implícita todos los tipos, todas las clases y    |   
   |    los objetos son del tipo Object, porque hereda.                                                   |  
   |                                                                                                      |  
   |    Number = tipo genérico de tipos numéricos como Integer, Float, Double,                            |  
   |    ------   Short, Long, etc..                                                                       |  
   |                                                                                                      |  
   |    Object = es el tipo genérico padre de todo                                                        |      
   |    ------                                                                                            |                                
   |______________________________________________________________________________________________________|


   EJEMPLO 1
   =========
*/
    public class OperadorInstanceOf {
        public static void main(String[] args) {

            // Es lo mismo que: String texto = new String("Creando un objeto de la clase String ... que tal!");
            String texto = "Creando un objeto de la clase String ... que tal!";

            // Es lo mismo que: Integer num = new Integer(7);
            Integer num = 7;

            Boolean b1 = texto instanceof String;

            System.out.println("texto es del tipo String = " + b1);

            b1 = texto instanceof Object;
            System.out.println("texto es del tipo Object = " + b1);

            b1 = num instanceof Integer;
            System.out.println("num es del tipo Integer = " + b1);

            b1 = num instanceof Number;
            System.out.println("num es del tipo Number = " + b1);

            b1 = num instanceof Object;
            System.out.println("num es del tipo Object = " + b1);

            Double decimal = 45.54;
            b1 = decimal instanceof Number;
            System.out.println("decimal es del tipo Number = " + b1);

            b1 = b1 instanceof Boolean;
            System.out.println("b1 es del tipo Boolean = " + b1);
        }
    }
/* Retorna lo siguiente:

texto es del tipo String = true
texto es del tipo Object = true
num es del tipo Integer = true
num es del tipo Number = true
num es del tipo Object = true
decimal es del tipo Number = true
b1 es del tipo Boolean = true

*/