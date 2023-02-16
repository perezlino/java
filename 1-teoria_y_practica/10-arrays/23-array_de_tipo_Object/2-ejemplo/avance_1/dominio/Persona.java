package dominio;

public class Persona {
    
    private String nombre;

    // Constructor que va a inicializar el atributo 'nombre'
    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
