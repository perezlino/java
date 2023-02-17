/*  ======================================================
    ============= INTRODUCCION A LOS VARARGS =============
    ======================================================

    Básicamente los argumentos variables es cuando vamos a pasar un argumento hacia un método, así que en 
    este caso tenemos que trabajar con métodos de manera obligatoria. Para ello vamos a definir un método 
    que va a imprimir una cierta cantidad de números, sin embargo, el concepto de argumentos variables, no 
    tenemos que especificar cuántos valores vamos a pasar al método, precisamente de ahí el nombre de 
    argumentos variables. 

    El concepto de argumentos variables es definir el tipo, y la sintaxis es utilizar 3 puntos, así que 
    cuando utilizamos un tipo y posteriormente 3 puntos, quiere decir que vamos a recibir argumentos 
    variables, por lo tanto, no sabemos la cantidad de elementos que vamos a recibir, sino que, hasta el 
    momento en que se ejecuta el código, es que se va a definir cuántos elementos va a recibir este método. 

*/
package directorio;

public class TestArgumentosVariables{

    public static void main(String[] args) {
        
        // Vamos a llamar al metodo 'imprimirNumeros' y recibir una cantidad indefinida de elementos 
        imprimirNumeros(3, 4, 5, 6);
        imprimirNumeros(1, 2);
        variosParametros("Alfonso", 8, 9, 10, 11);

    }

    // Metodo con un solo parametro
    private static void imprimirNumeros(int... numeros){ // Una vez que ya estamos dentro del método 'imprimirNumeros', 
                                                         // esta variable se va a convertir en un arreglo. Sin embargo, 
                                                         // la diferencia con un arreglo, con un arreglo de elementos,
                                                         /* Ejemplo:
                                                         
                                                            private static void imprimirNumeros(int[] numeros){
                                                                                                --------------
                                                            }    */

                                                         // desde el momento que estamos pasando la información ya 
                                                         // tendríamos que saber cuántos elementos vamos a pasar a este 
                                                         // arreglo. Así que la diferencia con arreglos y con el manejo 
                                                         // de argumentos variables, es que no necesitamos saber cuántos
                                                         // elementos vamos a pasar a este método. Sin embargo, internamente 
                                                         // se va a tratar exactamente igual que un arreglo, pero eso ya 
                                                         // cuando estamos dentro del método que tiene el argumento variable. 

        for(int = 0; i < numeros.length; i++){
            System.out.println("elemento: " + numeros[i]);
        } 
    }   

    // Metodo con varios parametros
    // Basicamente aqui lo que estamos mostrando es la sintaxis de que si tenemos varios argumentos definidos para un
    // metodo, entonces el argumento variable debe de ser el ultimo parametro.

    private static void variosParametros(String nombre, int... numeros){

        System.out.println("nombre: " + nombre);
        imprimirNumeros(numeros);
    }

}