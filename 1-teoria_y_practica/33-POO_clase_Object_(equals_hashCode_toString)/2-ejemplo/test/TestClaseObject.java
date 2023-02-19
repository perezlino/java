package test;

import dominio.Empleado;

public class TestClaseObject {
    public static void main(String[] args) {

        // Recordemos que los objetos almacenan referencias en memoria, por lo tanto, cuando vemos 
        // la palabra 'new' lo que significa es que estamos solicitando, generar una nueva referencia
        // en memoria para este nuevo Objeto.

        Empleado empleado1 = new Empleado("juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);
        
        if(empleado1 == empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }
        else{
            System.out.println("Tienen distinta referencia en memoria");
        }
        
        if( empleado1.equals(empleado2) ){
            System.out.println("Los objetos son iguales en contenido");
        }
        else{
            System.out.println("Los objetos son distintos en contenido");
        }
        
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("el valor hashcode es igual");
        }
        else{
            System.out.println("el valor hashcode es distinto");
        }
        
    }
}