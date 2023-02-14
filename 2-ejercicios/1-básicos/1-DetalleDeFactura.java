/*  ======================================================
    ================== DETALLE DE FACTURA ================
    ======================================================

    La tarea consiste en crear una nueva clase con el método main llamada 'DetalleDeFactura', se requiere 
    desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:

        1.	Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de 
            la factura con espacios.

        2.	Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con 
            decimales (,).

        3.	Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%

    Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el 
    impuesto y el monto total neto incluyendo impuesto.

    Por ejemplo, el resultado podría ser algo así:

    La factura "producto de oficina" tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después 
    de impuesto es de 160.3882.
*/
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner detalleDeFactura = new Scanner(System.in);

        System.out.println("Ingrese un nombre para la factura:");
        String nombre = detalleDeFactura.nextLine();

        System.out.println("Ingrese un precio de producto:");
        double precio1 = detalleDeFactura.nextDouble();

        System.out.println("Ingrese un segundo precio de producto:");
        double precio2 = detalleDeFactura.nextDouble();

        double totalBruto = precio1 + precio2;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;

        String detalle = "La factura " + nombre + " tiene un total bruto de " + totalBruto
                        + ", con un impuesto de " + impuesto 
                        + " y el monto después de impuesto es de " + totalNeto;
    
        System.out.println(detalle);                        
    }
}  