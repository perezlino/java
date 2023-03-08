package mx.com.gm.ventas;

import java.util.Arrays;

public class Orden {

	private int idOrden;
	private Producto productos[];
	private static int contadorOrdenes;
    
    // Esta variable nos va a ayudar para saber cuantos Objetos de tipo Producto se han agregado al Array de productos[].
    // Esta variable no es del tipo 'static', ya que, nos va permitir saber cuantos Objetos del tipo Producto se han 
    // agregado al Objeto Orden, por ello, no se relaciona con la Clase Orden, si no, mas bien, con nuestro arreglo de 
    // productos.
	private int contadorProductos;

	private final static int MAX_PRODUCTOS = 10;
	
    // Constructor 
	public Orden() {
/* 
		Al crear el objeto 'orden1':

			Orden orden1 = new Orden();

		De manera automatica, el constructor inicializa las variables 'idOrden' y 'productos':

			orden1.idOrden = 1;
			orden1.productos = new Producto[10];

		Asi mismo si creamos un segundo Objeto Orden:

			Orden orden2 = new Orden();

		De manera automatica, el constructor inicializa las variables 'idOrden' y 'productos':

			orden2.idOrden = 2;
			orden2.productos = new Producto[10];													*/

		this.idOrden = ++Orden.contadorOrdenes;
		this.productos = new Producto[Orden.MAX_PRODUCTOS]; // this.productos = new Producto[10];
	}
		
	public void agregarProducto(Producto producto) {
		if(this.contadorProductos < Orden.MAX_PRODUCTOS) {

/* 			Indicamos en que posicion vamos a agregar nuestro nuevo producto. Recordemos que 'contadorProductos' es una
			variable que es 'privada' y no 'estatica', y que se asocia con cada Objeto de tipo Orden que creemos y su
			valor por default va a ser de 0. 

			Y por cada producto que cargemos a nuestro arreglo, entonces vamos a incrementar esta variable. Recordemos
			que esto es un 'postIncremento' primero se asigna el valor, en este caso el valor de 0, ya que el indice 0
			lo vamos a necesitar para poder apuntar al primer elemento de nuestro arreglo 'productos'. Y ya una vez que
			hemos terminado de agregar el producto, entonces se incrementa esta variable.

			Y lo que le vamos a asignar a este indice va a ser nuestro nuevo 'producto' que estamos recibiendo como
			argumento en el metodo 'agregarProducto'


			Producto producto1 = new Producto("Camisa", 50.00);
			Producto producto2 = new Producto("Pantalon", 100.00);

			Orden orden1 = new Orden();			

			orden1.agregarProducto(producto1) 
			              |
						  |
						  ˅
			if(orden1.contadorProductos < 10) { // Si 'producto1' es el primer producto que agregamos al arreglo

				orden1.productos[0] = producto1;
			}


			Ahora si agregamos un segundo producto a la 'orden1':

			orden1.agregarProducto(producto2) 
			              |
						  |
						  ˅
			if(orden1.contadorProductos < 10) { // Si 'producto2' es el segundo producto que agregamos al arreglo

				orden1.productos[1] = producto2;
			}																						*/


			this.productos[this.contadorProductos++] = producto;
		}else {
			System.out.println("Maximo de productos alcanzado");
		}
		
	}
	
	public double calcularTotal() {
		double total = 0;
		for (int i = 0; i < this.contadorProductos; i++) {
			total += this.productos[i].getPrecio();

			// o tambien:
			// Producto producto = this.productos[i];
			// total += producto.getPrecio(); // total = total + producto.getPrecio();	
		}
		return total;
	}
	
	public void mostrarOrden() {
		System.out.println("Id orden: " + this.idOrden);
		double totalOrden = this.calcularTotal();
		System.out.println("Total de orden: " + totalOrden);
		System.out.println("Productos de la orden: ");
		for (int i = 0; i < this.contadorProductos; i++) {
			System.out.println("Producto: " + i + " - " + this.productos[i]);
			
		}	
    }	
}