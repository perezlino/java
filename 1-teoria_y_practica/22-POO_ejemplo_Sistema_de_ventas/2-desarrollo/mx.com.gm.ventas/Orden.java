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
		this.idOrden = ++Orden.contadorOrdenes;
		this.productos = new Producto[Orden.MAX_PRODUCTOS];
	}
		
	public void agregarProducto(Producto producto) {
		if(this.contadorProductos < Orden.MAX_PRODUCTOS) {
			productos[contadorProductos++] = producto;
		}else {
			System.out.println("Maximo de productos alcanzado");
		}
		
	}
	
	public double calcularTotal() {
		double total = 0;
		for (int i = 0; i < contadorProductos; i++) {
			Producto producto = this.productos[i];
			total += producto.getPrecio();//total = total + producto.getPrecio();
			// o tambien:
			//total += this.productos[i].getPrecio();
			//evito usar las 2 linesa anteriores al "//"
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