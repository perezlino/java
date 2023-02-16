package appfacturas.modelo;

public class ItemFactura {

    private int cantidad;

    // Recordar que un item de factura está asociado a un solo producto y también podría tener 
    // una relación con Factura, pero no necesario. No es tan importante que un detalle, una línea, 
    // tenga la referencia de su factura, porque nunca vamos a consultar una línea en particular 
    // y querer saber de qué factura pertenece. Siempre se miran los items o la línea dentro de la 
    // Factura, es decir, en conjunto, es parte de la factura. Nunca vamos a consultar de forma individual.
    // Siempre con la factura. Entonces solamente 'private Producto producto'.

    private Producto producto;

    //---------------------------------------------------------------------------------------------
    // Podríamos tener un constructor que inicie inicialice cantidad y producto.
    public ItemFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }
    //---------------------------------------------------------------------------------------------

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //---------------------------------------------------------------------------------------------
    // 'getter' y 'setter' de Producto    
    public Producto getProducto() {
        return producto;
    }
    //---------------------------------------------------------------------------------------------

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    //---------------------------------------------------------------------------------------------
    // Calculamos el total de la línea o importe que sería el precio del producto por la cantidad.
    public float calcularImporte(){
        return this.cantidad * this.producto.getPrecio();
    }
    //---------------------------------------------------------------------------------------------
}
