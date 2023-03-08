package directorio;

import dominio.Empleado;

public class TestHerencia {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado();
        System.out.println("empleado1 = " + empleado1); // Recordar que al imprimir 'empleado1' nos devolvera
                                                        // una cadena, dado que modificamos el metodo 'toString'
                                                        // en la Clase 'Persona'. Podriamos utilizar 
                                                        // empleado1.toString(), pero no es necesario. 
    }
}
/* 
Podemos observar que no hemos definido nada realmente en la Clase 'Empleado', pero por el simple hecho de
que extiende de la Clase 'Persona', entonces, podemos acceder a los atributos de dicha Clase, a cada uno
de sus metodos y tambien a sus constructores. Sin embargo, los constrcutores no se heredan, esa es una de
las caracteristicas de Java, pero podemos accederlos a traves de la palabra 'super'. Asi que las Clases hijas
van a poder acceder a los constructores de la Clase padre utilizando la palabra reservada 'super' y
posteriormente seleccionando el constructor que deseen utilizar. Y para saber que constructor queremos utilizar,
simplemente lo va a definir el numero de argumentos que pasemos. Si no pasamos ningun argumento, entonces se
va a utilizar el constructor vacio de la Clase padre. 


empleado1 = Persona [nombre=null, genero=, edad=0, direccion=null] 
*/