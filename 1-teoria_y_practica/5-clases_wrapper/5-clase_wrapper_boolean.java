/*  ======================================================
    =============== CLASE WRAPPER BOOLEAN ================
    ======================================================

    Para tener en cuenta con respecto a los boolean, podemos comparar con el ==  y va a comparar 
    por el valor boolean y no por por el objeto, no por la instancia.

*/
    public class WrapperBoolean {
        public static void main(String[] args) {

            Integer num1, num2;
            num1 = 1;
            num2 = 2;
            boolean primBoolean = num1 > num2; //false

            // ------ Primitivo o literal boolean a Clase wrapper boolean ------

            // * AUTOBOXING O BOXING *

            // Esta seria la forma explicita de crear un objeto del tipo Boolean
            // Forma 1
            Boolean objBoolean = Boolean.valueOf(primBoolean);

            // Forma 2 - Usando la variable del entero primitivo
            Boolean objBoolean2 = Boolean.valueOf("false");
            Boolean objBoolean3 = primBoolean;

            // Esta seria la forma implicita
            // Forma 3
            Boolean objBoolean4 = false;

            System.out.println("primBoolean = " + primBoolean); // primBoolean = false
            System.out.println("objBoolean = " + objBoolean); // objBoolean = false
            System.out.println("objBoolean2 = " + objBoolean2); // objBoolean2 = false
            System.out.println("objBoolean3 = " + objBoolean3); // objBoolean3 = false
            System.out.println("objBoolean4 = " + objBoolean4); // objBoolean4 = false

            System.out.println("comparando dos objetos boolean: " + (objBoolean == objBoolean2)); // comparando dos objetos boolean: true
            System.out.println("comparando dos objetos boolean: " + (objBoolean.equals(objBoolean2))); // comparando dos objetos boolean: true
            System.out.println("comparando dos objetos boolean: " + (objBoolean2 == objBoolean3)); // comparando dos objetos boolean: true
            System.out.println("comparando dos objetos boolean: " + (objBoolean == objBoolean3)); // comparando dos objetos boolean: true
            

            // ------ Clase wrapper boolean a Primitivo o literal boolean ------

            // * UNBOXING (Explicita)*
            // Forma 1
            boolean primBoolean2 = objBoolean2.booleanValue();

            // * UNBOXING (Automatico o Implicita)*
            // Forma 2
            boolean primBoolean3 = objBoolean2;            

            System.out.println("primBoolean2 = " + primBoolean2); // primBoolean2 = false
            System.out.println("primBoolean3 = " + primBoolean3); // primBoolean3 = false
        }
    }