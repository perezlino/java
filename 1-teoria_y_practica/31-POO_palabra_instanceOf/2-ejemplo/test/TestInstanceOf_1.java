package test;

import dominio.*;

public class TestInstanceOf {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan", 5000);
        determinarTipo(empleado); // Es de tipo Empleado

        empleado = new Gerente("Karla", 10000, "Contabilidad");
        determinarTipo(empleado); // Es de tipo Gerente
    }

    public static void determinarTipo(Empleado empleado) {

        // Aqui no estamos preguntando si la variable 'empleado' es del tipo 'Empleado', si no, si el 
        // tipo que estamos apuntando en memoria es de tipo 'Gerente'
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente");

        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");

        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
}