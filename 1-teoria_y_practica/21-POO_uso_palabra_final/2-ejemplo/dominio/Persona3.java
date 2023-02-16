package dominio;

public final class Persona3 {

    // Estea tributo va a ser 'publico' y lo marcaremos como 'final'. Como hemos comentado
    // una variable marcada como 'final' normalmente se combina con la palabra 'static',
    // esto para que podamos mandar a llamar esta variable solamente utilizando el nombre
    // de la Clase, sin necesidad de crear una instancia y debido a que es 'final' ya no
    // vamos a poder modificar su valor. Y a esto en JAVA se le conoce como una 
    // "CONSTANTE". Cuando combinamos 'final static' y ademas 'public', para que podamos
    // acceder directamente a esta constante. Y se recomienda que las constantes las 
    // definamos en mayusculas.

    public final static int MI_CONSTANTE = 10;

    private String nombre;

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

}
