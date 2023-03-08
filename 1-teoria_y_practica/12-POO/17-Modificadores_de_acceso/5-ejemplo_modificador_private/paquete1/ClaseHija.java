package paquete1;

public class ClaseHija extends Clase1 {

    // Creamos un constructor para la ClaseHija
    // Solamente tenemos acceso al constructor publico de la Clase padre
    public ClaseHija(){
        super("Publico"); 
        // this.atributoDefault = "Modificacion atributo default";
        // this.metodoDefault();
    } 
}