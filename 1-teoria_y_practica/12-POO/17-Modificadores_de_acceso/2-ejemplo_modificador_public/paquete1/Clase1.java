package paquete1;

/* 
    Lo primero que vamos a hacer es trabajar con el modificador de acceso 'public' y como revisamos en la tabla 
    introductoria, el modificador de acceso 'public' aplica tanto para clases, variables, métodos y constructores, 
    así que vamos a analizar el elemento 'public' en cada uno de estos elementos de una clase. Por lo tanto, 
    podemos observar que 'public' puede aplicar a una clase y esto significa que esta clase puede ser utilizada 
    desde otra clase, ya sea, en el mismo paquete o en un paquete externo. Al ser público se puede utilizar en 
    cualquier parte de nuestro proyecto, ya sea, en una clase externa (en otro paquete) o en una clase dentro de 
    este mismo paquete.
 */

public class Clase1 {

    // Aqui basicamente lo que significa es que de otra Clase vamos a poder acceder directamente a este atributo,
    // debido a que el atributo es 'publico'.
    public String atributoPublico = "Valor atributo publico";

    // Definimos un Constructor publico. Este constructor se mandara a llamar cuando se cree un Objeto Clase1.
    public Clase1 (){

        System.out.println("Constructor publico");
    }

    public void metodoPublico(){

        System.out.println("Metodo publico");
    }
}
