/*  ======================================================
    =============== CLASE WRAPPER INTEGER ================
    ======================================================

    
    Estas dos formas serían exactamente iguales. Una es 'explícita' y la otra es 'implícita'. 
    Pero ambas son correctas. "Implícito" se refiere a que se realiza de manera automática por 
    debajo, no lo vemos. "Explícito" lo contrario, lo hacemos nosotros.

    "Unboxing" y "Autoboxing" no es lo mismo, el primero es para pasar de un wrapper a un primitivo, 
    autoboxing (o "Boxing") es para pasar de un primitivo a un wrapper.


    PRIMITIVO O LITERAL INTEGER A CLASE WRAPPER INTEGER (AUTOBOXING O BOXING)
    =========================================================================

    Forma de convertir un primitivo o una literal entera en un objeto de referencia Integer, en una 
    clase wrapper integer.
*/
    public class WrapperInteger {
        public static void main(String[] args) {

            // Primitivo o literal integer a Clase wrapper Integer

            // Forma 1 (Deprecated)
            Integer IntObjeto = new Integer(32768);

            // AUTOBOXING O BOXING

            // Esta seria la forma explicita de crear un objeto del tipo Integer.
            // Forma 1
            Integer IntObjeto2 = Integer.valueOf(32768);

            // Esta seria la forma implicita
            // Forma 2
            Integer IntObjeto3 = 32768;

            // Forma 3 - Usando la variable del Entero primitivo
            int intPrimitivo = 32768;
            Integer IntObjeto4 = Integer.valueOf(intPrimitivo);
            Integer IntObjeto5 = intPrimitivo;
/*


    CLASE WRAPPER INTEGER A PRIMITIVO O LITERAL INTEGER (UNBOXING)
    ==============================================================
*/
            // Clase wrapper integer a Primitivo o literal integer

            // UNBOXING (Automática o Implícita)
            // Forma 1
            int num = IntObjeto4;

            // UNBOXING (Explícita)
            // Forma 2
            int num2 = IntObjeto4.intValue();
/*


    STRING A CLASE WRAPPER INTEGER
    ==============================
*/
            String valorTvLcd = "67000";
            Integer valor = Integer.valueOf(valorTvLcd);

        }
    }