package directorio;

public class Persona {

    private int idPersona;
    private String nombre;
    private static int contadorPersonas;

    // Constructor
    public Persona(String nombre){

        this.nombre = nombre;
        
        // Incrementar el contador por cada Objeto nuevo
        // Las variables estaticas se asocian con la Clase
        Persona.contadorPersonas++;

        // Asignar el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersonas;
    }

    public int getIdPersona(){
        return idPersona;
    }

    public int setIdPersona(int idPersona){
        this.idPersona = idPersona;
    }   
    
    public String getNombre(){
        return this.nombre;
    }

    public int setNombre(String nombre){
        this.nombre = nombre;
    } 
    
    public static int getContadorPersonas(){
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas){
        contadorPersonas = aContadorPersonas;
    }   

    // Modificamos el metodo 'toString'
    @Override
    public String toString(){
        return "Persona{" + "idPersona = " + idPersona + ", nombre = " + nombre + "}";
    }
    
}
