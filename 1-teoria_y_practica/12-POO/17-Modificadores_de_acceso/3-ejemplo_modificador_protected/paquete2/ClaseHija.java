package paquete2;

import paquete1.Clase1;

public class ClaseHija extends Clase1 {

    // Creamos un constructor para la ClaseHija
    public ClaseHija(){
        super(); // Llamamos al constructor vacio de la Clase padre

        // De esta manera podemos acceder a los atributos 'protected' de la Clase1. Desde una Clase hija.
        this.atributoProtected = "Modificacion atributo protected";
        System.out.println("ClaseHija.atributoProtected = " + this.atributoProtected);
        this.metodoProtected();
    } 
}