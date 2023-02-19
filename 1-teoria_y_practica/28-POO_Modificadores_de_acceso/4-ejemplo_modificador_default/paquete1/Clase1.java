package paquete1;

/* 
Básicamente este modificador de acceso lo que significa es ausencia del modificador y este modificador de 
acceso puede aplicar desde la Clase. Así que desde la definición de la Clase podemos definir una Clase que 
sea 'default'. Sin embargo, esto en automático va a provocar un error en la Clase hija, ya que, la Clase hija 
está dentro de otro paquete, por lo tanto, una Clase definida con el modificador de acceso 'default' no puede 
ser utilizada fuera de este paquete. Así que esto es lo que significa a nivel de Clase. Esta Clase solamente 
va a poder ser utilizada dentro del mismo paquete. Así que solamente vamos a poder trabajar dentro del mismo 
paquete cuando utilizamos este modificador de acceso.
*/

class Clase1 {

    // Ahora vamos a modificar nuestro atributo, va a ser 'default'. Recordemos que en ausencia de un modificador 
    // de acceso el atributo va a ser de tipo 'default'.
    String atributoDefault = "Valor atributo default";

    // De igual manera en los constructores, la ausencia de un modificador de acceso para este constructor se dice 
    // que es 'default'.
    Clase1 (){

        System.out.println("Constructor default");
    }

    // De igual manera, en ausencia del modificador de acceso entonces este método será 'default'.
    void metodoDefault(){

        System.out.println("Metodo default");
    }
}
