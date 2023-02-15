/* 
Vamos a definir qué esta Clase de 'Empleados' según el diagrama que hemos visto, debe de extender 
de la Clase 'Persona', así que para ello vamos a utilizar la palabra reservada 'extends' y 
posteriormente 'Persona'. Si no agregamos este código, entonces no vamos a poder acceder a ninguna 
de las propiedades ni métodos directamente de la Clase 'Persona', sería como una Clase completamente 
externa. Pero eso no sería el concepto de herencia, sino, simplemente estaríamos utilizando la Clase 
de 'Persona' de manera distinta. Así que según el diagrama de Clases que hemos visto tenemos que 
agregar la palabra reservada 'extends' e indicar cuál es la Clase padre. 

De manera implícita, según hemos comentado anteriormente, cuando una Clase no indica que extendemos 
de ninguna otra Clase, entonces, Java de manera automática hace lo siguiente:

                            package directorio;

                            public class Persona extends Object {

                                protected String nombre;
                                protected char genero;
                                protected int edad;
                                protected String direccion;

                                ....


Se utiliza 'extends Object'. Así que todas las Clases en Java que no indiquen de qué Clase extienden 
entonces de manera automática van a extender de la Clase 'Object', así que de manera directa o indirecta 
siempre todas las Clases de una u otra forma heredan de la Clase 'Object'. Sin embargo, esto no es 
necesario agregarlo, esto el compilador lo agrega de manera automática.

En Java hay solamente hay 'Herencia simple', mientras que en otros lenguajes de programación como Python, 
tenemos 'Herencia multiple', pero en Java tenemos solamente 'Herencia simple'. Así que en este caso no 
podríamos indicar alguna otra Clase, por ejemplo:

                            package directorio;

                            public class Empleado extends Persona, Object{

                                private int idEmpleado;
                                private double sueldo;
                                private static int contadorEmpleado;


No podemos hacer ese tipo de sintaxis, no podemos indicar que heredamos de varias Clases. Simplemente 
podemos tener una jerarquía de Clases simple. Y esto ayuda al diseño de nuestras Clases, ya que, el manejo 
de 'Herencia multiple' podríamos llegar a tener más problemas de diseño, aunque viene aplicado no debería 
haber ningún problema, pero Java simplifica este concepto y solamente hay 'Herencia simple'. 

*/
package directorio;

public class Empleado extends Persona{

	// Si esta clase Empleados tiene Subclases es buena practica utilizar 'protected', 
	// de lo contrario, utilizamos 'private'. Esto dado que 'protected' se utiliza
	// cuando vamos a tener Clases hijas de esta Clase.

	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;
	
	public Empleado(String nombre, double sueldo) {
		super(nombre); // Dado que los constructores de la Clase padre no se heredan, hacemos
		               // uso de 'super', y asi si podemos utilizarlo.
		this.sueldo = sueldo;
		this.idEmpleado = ++Empleado.contadorEmpleado;  // Incrementar el contador por cada Objeto Empleado nuevo
        												// Las variables estaticas se asocian con la Clase
														// Asignar el nuevo valor a la variable idEmpleado
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	// El metodo 'toString' fue sobrescrito en la Clase 'Persona', el comportamiento de este metodo fue 
	// sobreescrito de la Clase padre 'Object', dado que dicho metodo pertenece a esa Clase. Ahora, vamos
	// a volver sobreescribir dicho metodo pero ahora en nuestra Clase 'Empleado' , lo que vamos a hacer
	// es sobreescribir el comportamiento heredado de la Clase padre, es decir, de la Clase 'Persona'.

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [idEmpleado=").append(this.idEmpleado);
		builder.append(", sueldo=").append(this.sueldo);
		builder.append(", ").append(super.toString()); // llamamos al metodo 'toString' de la Clase 'Persona'
		builder.append("}");
		builder.append("]");
		return builder.toString();
	}	
}