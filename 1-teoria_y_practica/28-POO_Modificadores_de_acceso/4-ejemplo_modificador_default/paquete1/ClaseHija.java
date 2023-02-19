package paquete1;

public class ClaseHija extends Clase1 {

    // Creamos un constructor para la ClaseHija
    public ClaseHija(){
        super(); // Llamamos al constructor vacio de la Clase padre
        this.atributoDefault = "Modificacion atributo default";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoDefault();
    } 
}