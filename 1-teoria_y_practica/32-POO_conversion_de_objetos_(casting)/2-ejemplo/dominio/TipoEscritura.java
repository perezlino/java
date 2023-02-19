package dominio;

public enum TipoEscritura {
    CLASICO("Escritura a Mano"),
    MODERNO("Escritura Digital");
    
    // final: una vez que se le asigne un valor, ya no se puede modificar
    private final String descripcion;
    
    // Constructor con un argumento
    private TipoEscritura(String descripcion){
        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
}