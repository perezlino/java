/*  ======================================================
    ============= PASAR ARGUMENTO POR VALOR ==============
    ======================================================

    Entonces, para poner en contexto toda variable primitiva siempre, siempre se pasa por valor y no 
    por referencia, porque no es un objeto, es un primitivo. Entonces, cuando se pasa esta variable 
    a otro método por argumento, se pasa por valor.

    -	'public': un método público.
    -	'static': un método estático. Por lo tanto, se puede invocar sin necesidad de crear el objeto, 
                  simplemente usando el nombre de la clase o de forma directa si estamos en otro método 
                  estático como el 'main'. Por tanto, el 'main' puede invocar este método sin ningún 
                  problema, ya que, ambos son estático. 
    -	'void': no devuelve ningún valor, no 'retorna' nada (no podemos utilizar 'return')

    Dado que el metodo 'main' es 'estatico' solo puede llamar a otros metodos que sean 'estaticos'.
*/
    public class PasarPorValor {
        public static void main(String[] args) {

            int i = 10;

            System.out.println("iniciamos el método main con i = " + i);
            test(i);
            System.out.println("Finaliza el método main con el valor de i (se mantiene igual) = " + i);
        }

        public static void test(int i){
            System.out.println("Iniciamos el método test con i = " + i);
            i = 35;
            System.out.println("Finaliza el método test con i = " + i);
        }
    }
/* 

iniciamos el método main con i = 10
Iniciamos el método test con i = 10
Finaliza el método test con i = 35
Finaliza el método main con el valor de i (se mantiene igual) = 10 

*/       