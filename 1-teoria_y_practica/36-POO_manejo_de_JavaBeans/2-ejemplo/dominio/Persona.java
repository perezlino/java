package dominio;

import java.io.Serializable;

public class Persona implements Serializable {

    private String name;
    private String apellido;

    public Persona(){

    }

    // Este constructor no es requerido, pero lo estamos agregando para poder inicializar desde la creacion
    // del Objeto, los atributos de nuestra Clase. Pero lo que si es requerido, es que los atributos sean
    // privados y ademas tener un constructor publico y vacio.

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Es requerido tambien, tener metedos 'get y 'set' asociado por cada atributo 'privado' de nuestra Clase.

    // Todos estos metodos deben ser publicos

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }    

    // Este metodo no es requerido
    @Override
    public String toString(){
        return "Persona{nombre = " + nombre + ", apellido = " + apellido + "}";
    }
}