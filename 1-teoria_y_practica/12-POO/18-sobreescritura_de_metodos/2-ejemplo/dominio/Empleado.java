package dominio;

public class Empleado {

    // Recordar que las Clases hijas pueden acceder a estos atributos sin la necesidad de crear
    // los metodos get y set.
    protected String nombre;
    protected double sueldo;
    
    // Constructor con dos argumentos
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public String obtenerDetalles(){
        return "Nombre: " + this.nombre + ", sueldo: " + this.sueldo; 
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}