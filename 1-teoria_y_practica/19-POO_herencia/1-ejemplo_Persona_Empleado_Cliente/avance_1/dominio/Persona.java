package directorio;

public class Persona {

    // Al utilizar 'protected', las Clases hijas podran acceder desde cualquier paquete
    // y pueden modificar directamente.
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    // Constructor vacio
    public Persona(){

    }

    // Constructor con un argumento
    public Persona(String nombre){
        this.nombre = nombre;
    }

    // Cosntructor con todos los argumentos
    public Persona(String nombre, char genero, int edad, String direccion){
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getGenero() {
		return this.genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + "]";
	}  
}