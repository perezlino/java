package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;

public class VentasTest {

    public static void main(String[] args) {
        
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalon", 100.00);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);

        orden1.mostrarOrden();
/* 
        Id orden: 1
        Total de orden: 150.0
        Productos de la orden: 
        Producto: 0 - Producto [idProducto=1, nombre=Camisa, precio=50.0]   
        Producto: 1 - Producto [idProducto=2, nombre=Pantalon, precio=100.0]
*/
    }
    
}
