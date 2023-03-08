package test;

import dominio.*;

public class TestSobreescritura {
    public static void main(String[] args) {

       Empleado empleado = new Empleado("Juan", 5000);
       //System.out.println("empleado = " + empleado.obtenerDetalles()); 
       // empleado = Nombre: Juan, sueldo: 5000.0
       
       
       imprimir(empleado); // empleado = Nombre: Juan, sueldo: 5000.0
		
	
       Gerente gerente = new Gerente("Karla", 10000, "Contabilidad");
       //System.out.println("gerente = " + gerente.obtenerDetalles()); 
       // gerente = Nombre: Karla, sueldo: 10000.0, departamento:Contabilidad


       imprimir(gerente); // empleado = Nombre: Karla, sueldo: 10000.0, departamento:Contabilidad
    	

       // Recordar que 'empleado' es del tipo 'Empleado', es por, eso que no le antepusimos nada.
       // Pero esta apuntando al tipo de referencia 'Gerente'.
       empleado = new Gerente("Karla", 10000, "Contabilidad");
       
       //System.out.println("gerente = " + gerente.obtenerDetalles());
       // gerente = Nombre: Karla, sueldo: 10000.0, departamento:Contabilidad
       
       
       imprimir(empleado); // empleado = Nombre: Karla, sueldo: 10000.0, departamento:Contabilidad
    }
    
 
/*  ¿En qué momento ocurre el 'Polimorfismo'? Vamos a hacer lo siguiente, vamos a definir un método que se 
    va a encargar de mandar a llamar el método 'obtenerDetalles()', pero aqui lo interesante es que se va a 
    ejecutar el método 'obtenerDetalles()', ya sea, de la Clase padre o de la Clase hija, dependiendo de la 
    referencia del Objeto que esté pasando al momento de ejecutar nuestro programa. Así que aquí es donde 
    se va a aplicar el concepto de 'Polimorfismo'.      

    Aquí lo interesante, es que vamos a recibir un tipo, pero este tipo va a ser un tipo de la Clase padre. 
    Por ello, en lecciones anteriores decíamos que vamos a utilizar tipos compatibles, en este caso debido 
    a que tenemos la Clase padre 'Empleado' y la Clase hija 'Gerente', entonces en este método 'imprimir' 
    para que podamos recibir referencias de la Clase padre, como de la Clase hija, entonces vamos a utilizar 
    el tipo más genérico, es decir, el tipo de la Clase de padre. Así que utilizamos el tipo de la Clase padre. 

    Es importante tener en cuenta, que se necesita que estos métodos se llaman igual para poder aplicar el 
    'Polimorfismo', metodo 'obtenerDetalles()', tanto, para la Clase padre, como para la Clase hija.  */

    public static void imprimir(Empleado empleado){    
        String detalles = empleado.obtenerDetalles();
        System.out.println("empleado = " + detalles);
    }

/*  Si enviamos a imprimir la información de la Clase hija podemos observar que no solamente se está mandando a 
    imprimir la información de la Clase padre, sino que, también se está imprimiendo la información de la Clase 
    hija.
     
*/    
}