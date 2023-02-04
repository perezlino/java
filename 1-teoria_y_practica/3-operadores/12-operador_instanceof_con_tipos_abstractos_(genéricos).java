/*  ======================================================
     OPERADOR INSTANCEOF CON TIPOS ABSTRACTOS (GENERICOS) 
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
    public class OperadorInstanceOfTiposGenericos {
        public static void main(String[] args) {

            Object texto = "Creando un objeto de la clase String ... que tal!";

            // Por defecto, 7 se asocia a un tipo 'int', de manera automática
            Number num = 7;
            //Number num = Integer.valueOf(7); Es lo mismo

            // Por defecto, 45.54 se asocia a un tipo double, de manera automática
            Number decimal = 45.54;

            Boolean b1 = texto instanceof String;

            System.out.println("texto es del tipo String = " + b1); // texto es del tipo String = true

            b1 = texto instanceof Object;
            System.out.println("texto es del tipo Object = " + b1); // texto es del tipo Object = true

            b1 = texto instanceof Integer;
            System.out.println("texto es del tipo Integer = " + b1); // texto es del tipo Integer = false

            b1 = num instanceof Integer; 
            System.out.println("num es del tipo Integer = " + b1); // num es del tipo Integer = true

            b1 = num instanceof Number;
            System.out.println("num es del tipo Number = " + b1); // num es del tipo Number = true

            b1 = num instanceof Object;
            System.out.println("num es del tipo Object = " + b1); // num es del tipo Object = true

            b1 = num instanceof Long;
            System.out.println("num es del tipo Long = " + b1); // num es del tipo Long = false

            b1 = num instanceof Double;
            System.out.println("num es del tipo Double = " + b1); // num es del tipo Double = false



            Number flotante = Float.valueOf(45.54f);

            b1 = flotante instanceof Double;
            System.out.println("flotante es del tipo Double = " + b1); // flotante es del tipo Double = false

            b1 = flotante instanceof Float;
            System.out.println("flotante es del tipo Float = " + b1); // flotante es del tipo Float = true

            b1 = flotante instanceof Integer;
            System.out.println("flotante es del tipo Integer = " + b1); // flotante es del tipo Integer = false

            b1 = flotante instanceof Number;
            System.out.println("flotante es del tipo Number = " + b1); // flotante es del tipo Number = true

            b1 = b1 instanceof Boolean;
            System.out.println("b1 es del tipo Boolean = " + b1); // b1 es del tipo Boolean = true
        }
    }