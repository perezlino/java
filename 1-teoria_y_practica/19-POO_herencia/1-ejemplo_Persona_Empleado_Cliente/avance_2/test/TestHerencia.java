package directorio;

public class TestHerencia {

    public static void main(String[] args) {
        
                            // Estamos utilizando el constructor de la Clase 'Empleado'
        Empleado empleado1 = new Empleado("Alfonso", 5000.00);
        System.out.println("empleado1 = " + empleado1); // Ahora al imprimir 'empleado1' nos devolvera
                                                        // una cadena, dado que modificamos el metodo 'toString'
                                                        // de la Clase 'Persona' y estará llamando al metodo
                                                        // 'toString' creado en la Clase 'Empleado'. Podriamos 
                                                        // utilizar empleado1.toString(), pero no es necesario. 
    }
}
/* 
empleado1 = Empleado [idEmpleado=1, sueldo=5000.0, Persona [nombre=Alfonso, genero=, edad=0, direccion=null]}]
*/