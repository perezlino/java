package test;

import dominio.*;

public class TestInstanceOf {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan", 5000);
        determinarTipo(empleado);

        // Recordar que 'empleado' es del tipo 'Empleado', es por, eso que no le antepusimos nada.
        // Pero esta apuntando al tipo de referencia 'Gerente'.
        empleado = new Gerente("Karla", 10000, "Contabilidad");
        determinarTipo(empleado);
    }

    public static void determinarTipo(Empleado empleado) {

/*      Uno de los detalles extras dónde podemos utilizar instanceOf, es para convertir un tipo de dato una vez 
        que ya hemos identificado de qué tipo es. Por ejemplo, en este caso de tipo Gerente, entonces podemos 
        convertir la variable de tipo padre a una variable de tipo hijo y esto básicamente lo podemos hacer para 
        volver a tener acceso a los atributos o métodos de la Clase hija, ya que, por ejemplo, en este caso si 
        utilizamos la variable de 'empleado' y queremos acceder al método de 'departamento' o atributo de 
        'departamento', desde este tipo no va a ser posible.            */

        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente");

/*          Podemos observar que nos manda error ya que este método no se encuentra definido dentro de la clase 
            'Empleado'. No podemos acceder directamente al método de 'getDepartamento'. 

            empleado.getDepartamento();  ==============> NOS DEVUELVE UN ERROR
            
            
            Para esto primero tenemos que convertir la variable 'empleado' a una variable de tipo hijo y 
            posteriormente acceder al método de 'getDepartamento'. Para ello existen 2 formas:                 


            FORMA 1
            -------
            La primera forma sería declarar una variable local de tipo hijo y asignar la referencia de la variable 
            de tipo padre. Pero para esto tenemos que hacer una conversión y la conversión en Java es muy similar a 
            lo que hemos trabajado con tipos primitivos cuando convertíamos, por ejemplo, un tipo flotante a un tipo 
            entero o cualquier conversión de tipo primitivo que hayamos visto. Así que en este caso tenemos que 
            especificar el tipo al cual queremos convertir esta variable. Así que lo que estamos haciendo es que del 
            lado derecho tenemos nuestra variable 'empleado' de tipo 'Empleado' y con estos paréntesis estamos indicando 
            qué queremos convertir al tipo 'Gerente'. Y con esta conversión entonces, ya podemos asignar esta conversión 
            a la variable 'gerente' de tipo 'Gerente'.               */

            Gerente gerente = (Gerente) empleado;
            System.out.println("gerente = " + gerente.getDepartamento());


            // FORMA 2
            //((Gerente) empleado).getDepartamento();

        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            System.out.println("empleado = " + empleado.getNombre());
        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
            empleado.toString();
        }
    }
}