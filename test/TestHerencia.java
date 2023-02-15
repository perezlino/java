package test;

public class TestHerencia {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Alfonso", 5000.00);
        System.out.println("empleado1 = " + empleado1); // Recordar que al imprimir 'empleado1' nos devolvera
                                                        // una cadena, dado que modificamos el metodo 'toString'
                                                        // en la Clase 'Persona'. Podriamos utilizar 
                                                        // empleado1.toString(), pero no es necesario. 
    }
}
