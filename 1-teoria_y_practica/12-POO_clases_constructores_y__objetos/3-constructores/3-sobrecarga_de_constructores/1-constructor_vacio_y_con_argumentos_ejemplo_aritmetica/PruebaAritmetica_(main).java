package directorio; // Como la Clase 'Aritmetica' se encuentra en el mismo directorio que
                    // la clase 'PruebaAritmetica' no es necesario realizar un 'import' de
                    // de la clase 'Aritmetica'.

public class PruebaAritmetica {

    public static void main(String[] args) {
        
        // con 'new Aritmetica()' estamos llamando al Constructor vacio. En caso de que nosotros
        // no lo creemos, este se creará de manera automatica por el compilador JAVA, aunque no lo 
        // veamos. Sin embargo, si agregamos un Constructor distinto al vacio, entonces el Constructor
        // vacio ya no se crea de manera automatica. El compilador JAVA solo crea el Constructor 
        // vacio de manera automatica, siempre y cuando no tengamos definido otro Constructor. 
        
        // Por tanto, si no existiera el Constructor vacio que creamos, este codigo nos devolveria error
        // o nos pediria que ingresasemos argumentos, debido que existe un Constructor con argumentos.
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 a: " + aritmetica1.b);
/*
Ejecutando constructor vacio
a: 0
b: 0
*/       
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 a: " + aritmetica2.a);
        System.out.println("aritmetica2 a: " + aritmetica2.b);
/*
Ejecutando constructor con arg
a: 5
b: 8
*/ 

    }
}
