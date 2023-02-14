// public: nos permite utilizar una clase o metodo desde cualquier otra clase
// void: indicamos que un metodo no va a regresar nada, ningun tipo de informacion

public class Persona {

    // Atributos de la clase
    String nombre;
    String apellido;

    // Metodos de la clase
    public void desplegarInformacion(){

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
}
