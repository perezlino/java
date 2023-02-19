package appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente; // --------------> Factura tiene relacion con Cliente y debemos generar su
                             //                 'getter' y 'setter' también.
    
    private ItemFactura[] items; // ---------------> Tiene relacion con las lineas de ItemFactura, que no es
                                 //                  una linea, sino, varias, por tanto, va como Array.   
    private int indiceItems;     //----------------> Pero como es un arreglo, también tenemos que tener este 
                                 //                  índice para ir agregando los elementos, los items, con 
                                 //                  el método 'addItemFactura'. Entonces tenemos que incrementar 
                                 //                  el índice en donde vamos a guardar este elemento en el Array. 
    
    //---------------------------------------------------------------------------------------------
    // Inicializamos Factura

    public static final int MAX_ITEMS = 12;
    private static int ultimoFolio;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }
    //---------------------------------------------------------------------------------------------

    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    //---------------------------------------------------------------------------------------------
    // 'getter' y 'setter' de Cliente
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    //---------------------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------------------
    // El metodo 'get' solamente, porque no vamos a tener 'set', vamos a tener el método 'add' de 
    // agregar. Recordar que la relación en UML, cuando es desde 'muchos', por ejemplo, 'Factura' 
    // tiene muchos item factura, la relación se le conoce como 'agregación' de agregar. Entonces 
    // por eso tenemos que agregar este método, para agregar item.   

    public ItemFactura[] getItems() {
        return items;
    }

    // Pero también tenemos que inicializar este Array en algún lugar, porque si no creamos el new del 
    // arreglo va a lanzar un NullPointerException.

    public void addItemFactura(ItemFactura item) {
        if (indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }
    //---------------------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------------------
    // Calculamos el total de la factura. Entonces la idea de iterar en el Array de ItemFactura por 
    //cada ítem e ir sumando cada importe.

    public float calcularTotal() {
        float total = 0.0f;
        for (ItemFactura item : this.items) {
            if (item == null) {
                continue;
            }
            total += item.calcularImporte();
        }
        return total;
    }
    //---------------------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------------------
    // verDetalle()
    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura Nº: ");
        sb.append(folio)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\t NIF: ")
                .append(cliente.getNif())
                .append("\nDescripción: ")
                .append(this.descripcion)
                .append("\n");
    //---------------------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------------------
    // Agregar la fecha de emisión de la factura.

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha Emisión: ")
                .append(df.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");
    //---------------------------------------------------------------------------------------------

        for(ItemFactura item: this.items){
            if(item == null){
                continue;
            }
            sb.append(item.getProducto().getCodigo())
                    .append("\t")
                    .append(item.getProducto().getNombre())
                    .append("\t")
                    .append(item.getProducto().getPrecio())
                    .append("\t")
                    .append(item.getCantidad())
                    .append("\t")
                    .append(item.calcularImporte())
                    .append("\n");
        }
        sb.append("\nGran Total: ")
                .append(calcularTotal());

        return sb.toString();
    }
}