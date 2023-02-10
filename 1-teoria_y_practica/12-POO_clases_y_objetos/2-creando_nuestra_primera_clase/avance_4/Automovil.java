public class Automovil {

    String fabricante;
    String modelo;
    String color = "Gris";
    double cilindrada;

    // La idea es que los métodos ejecuten algún proceso, lleven a cabo alguna tarea, pero que no sea 
    // imprimir datos en la consola. La idea es que maneje datos y cualquier información, en vez de 
    // imprimirla, la debería de devolver. Por lo tanto, acá podríamos tener un 'return'. Devolver los 
    // datos resumidos en un detalle. El 'StringBuilder' lo utilizamos para concatenar, también podriamos
    // utilizar '+'.

/*  public String detalle (){
        String sb = "this.fabricante = " + this.fabricante +
                    "\nthis.fabricante = " + this.modelo + 
                    "\nthis.fabricante = " + this.color +
                    "\nthis.fabricante = " + this.cilindrada;
        return sb;
    }

    Seria lo mismo:
    ---------------

    public String detalle (){
        return  "this.fabricante = " + this.fabricante +
                "\nthis.fabricante = " + this.modelo + 
                "\nthis.fabricante = " + this.color +
                "\nthis.fabricante = " + this.cilindrada;
    }
*/

    // Ojo que borramos el 'void', dado que =====> 'Void' methods cannot 'return' a value Java
    public String detalle (){
        StringBuilder sb = new StringBuilder();
        sb.append("this.fabricante = " + this.fabricante);
        sb.append("\nthis.fabricante = " + this.modelo);
        sb.append("\nthis.fabricante = " + this.color);
        sb.append("\nthis.fabricante = " + this.cilindrada);
        return sb.toString();
    }
}