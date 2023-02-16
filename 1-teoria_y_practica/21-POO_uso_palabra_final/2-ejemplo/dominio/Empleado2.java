package dominio;

public class Empleado2 extends Persona2{
    
    // No podemos modificar el comportamiento de un metodo de la Clase padre 'Persona2'
    // Nos arroja un ERROR, porque este metodo es 'final' en la Clase padre.
    @Override
    public void imprimir(){
        System.out.println("Metodo imprimir desde la Clase hija");
    }

    // Por tanto, para modificarlo, la unica alternativa es borrar el 'final' desde
    // el metodo de la Clase padre.
}
