package directorio;

import dominio.Empleado;

public class TestHerencia {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Alfonso", 5000.00);
        System.out.println("empleado1 = " + empleado1); 

    }
}
/* 
empleado1 = Empleado [idEmpleado=1, sueldo=5000.0, Persona [nombre=Alfonso, genero=, edad=0, direccion=null]}]
*/