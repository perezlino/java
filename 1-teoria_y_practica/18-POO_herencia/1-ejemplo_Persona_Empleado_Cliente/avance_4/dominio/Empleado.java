package directorio;

public class Empleado extends Persona{

	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;

	public Empleado(){
		this.idEmpleado = ++Empleado.contadorEmpleado;  
	}
	
	public Empleado(String nombre, double sueldo) {
/*	2.-	Hemos comentado que la linea 'super' tiene que ser la primera linea, EXCEPTO cuando
		llamamos a un constructor interno. Por tanto, solo podemos utilizar uno o el otro, no
		los dos. Asi que, 'super' no podemos seguir utilizandolo. Ahora, llamaremos al constructor
		vacio:	*/
		this();
		//super(nombre);  <======================= NO PODEMOS UTILIZARLO, entonces ahora como podemos
		//										   inicializar el atributo 'nombre' de la Clase padre
		//										   'Persona' ?????
		this.nombre = nombre;	// <============ Lo inicializamos accediendo a el directamente                                         
		this.sueldo = sueldo;

/* 	1.-	Vamos a hacer un cambio con respecto a la inicializacion de la variable 'idEmpleado'.
		Este atributo 'idEmpleado' la idea es que no importa la forma en que creemos nuestro
		Objeto 'Empleado', SIEMPRE se inicialice la variable 'idEmpleado' de manera automatica.
		Dado que esta variable SOLO SE INICIALIZA cuando se llama al constructor con dos
		argumentos hasta el momento. Asi que para ello lo que vamos a hacer es agregar la 
		'Sobrecarga de constructores', para agregar el constructor vacio de la Clase 'Empleado' 
		y en ese constructor inicializaremos a 'idEmpleado'.  */
		
		//this.idEmpleado = ++Empleado.contadorEmpleado;  
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

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