package genericos;

//  Vamos a porporcionar una 'T'. Para indicar el tipo que vamos a proporcionar al momento que vamos
//  a utilizar la Clase ClaseGenerica. Asi que internamente esta clase va a utilziar un atributo, 
//  pero el tipo del atributo no lo vamos a conocer hasta el momento en que utilicemos esta Clase.
//  Asi que esta plantilla de la Clase va a quedar generica. Hasta que se utilice un Objeto de esta
//  Clase es que vamos a poder indicar el tipo que vamos a utilizar finalmente.

public class ClaseGenerica<T> {
    
    // Definimos el Tipo Generico
    private T objeto;

    // Constructor 
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }

    // De esta manera vamos a poder mandar a imprimir el tipo que finalmente se utilizo para crear una
    // instancia de esta Clase.
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
}
