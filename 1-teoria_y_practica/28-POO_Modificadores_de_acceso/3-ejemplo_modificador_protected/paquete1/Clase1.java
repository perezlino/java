package paquete1;

/* 
Bien básicamente cuando estamos trabajando con 'protected', la idea es permitir a las clases hijas, en este caso 
las clases hijas de la 'Clase1', poder acceder a los atributos, constructores o métodos definidos en esta Clase 
padre. Aunque los constructores no se heredan, recuerden que podemos utilizar 'super' para hacer uso de los 
constructores de la Clase padre. Así que, si un constructor está definido como privado en la Clase padre, incluso 
utilizando 'super', no vamos a poder mandarlo a llamar. Así que por ello 'protected' puede aplicar también a 
constructores, no quiere decir qué se hereden, sino que vamos a poder accederlos utilizando la palabra 'super', 
así que no es lo mismo utilizar 'super' para acceder a los constructores que utilizar herencia. Herencia es cuando 
accedemos directamente a los atributos o métodos de la clase sin tener que utilizar la palabra 'super'. Recordemos 
que el modificador 'protected' no está permitido a nivel de clase, así que a este nivel no vamos a poder utilizarlo.
*/

public class Clase1 {

    // Al definir el atributo como 'protected' quiere decir que lo vamos a poder acceder desde las Clases hijas.
    // Tanto de la Clase padre, como de las Clases hijas. Y ademas vamos a poder acceder a este atributo si
    // nos encontramos dentro del mismo paquete.
    protected String atributoProtected = "Valor atributo protected";

    // Definimos un Constructor protected. Este constructor se mandara a llamar cuando se cree un Objeto Clase1.
    // Importante recordar que al definir el constructor como 'protected' quiere decir que lo vamos a poder acceder 
    // desde las Clases hijas. Y ademas vamos a poder acceder a este constructor si se crea un Objeto Clase 1 en 
    // una Clase main dentro del mismo paquete.
    protected Clase1 (){

        System.out.println("Constructor protected");
    }

    // Creamos un constructor publico, para poder crear un Objeto Clase1, cuando estemos llamando al constructor
    // 'protected' desde otro paquete.
    public Clase1(String arg){

        System.out.println("Constructor publico");
    }

    protected void metodoProtected(){

        System.out.println("Metodo protected");
    }
}
