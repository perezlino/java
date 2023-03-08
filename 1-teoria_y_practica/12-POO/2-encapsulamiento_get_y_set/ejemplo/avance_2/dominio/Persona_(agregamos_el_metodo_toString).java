package ejemplo.dominio;

public class Persona {
    
    // Tambien podriamos utilizar 'String nombre;', es decir, de manera 'Default', dado que de esta
    // manera solo pueden acceder a este atributo aquellas clases que pertenecen al mismo paquete
    // que la Clase 'Persona'.
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    // Creamos un constructor con argumentos
    public Persona(String nombre, double sueldo, boolean eliminado){

        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }   
    
    public double getSueldo(){
        return this.sueldo;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }    

    // Para los tipos 'boolean' no utilizamos 'get', sino, utilizamos 'is'
    public boolean isEliminado(){
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }   
    
    // Agregamos el metodo toString
    public String toString(){

        return "Persona [nombre: " + this.nombre + 
                         ", sueldo: " + this.sueldo +
                         ", eliminado: " + this.eliminado + "]";
    }

}