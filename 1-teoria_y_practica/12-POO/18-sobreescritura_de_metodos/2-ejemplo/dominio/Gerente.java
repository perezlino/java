package dominio;

public class Gerente extends Empleado {
    
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
/*  Ahora un detalle extra, cuando hacemos la sobreescritura de métodos, por ejemplo, si el método de la 
    Clase padre está marcado como 'protected', en la Clase de hija el método que estamos sobrescribiendo el 
    modificador de acceso que vamos a utilizar no puede ser más restrictivo, es decir, que el método 
    'obtenerDetalles()', no podríamos cambiar su modificador de acceso a 'privated', ya que, eso sería más 
    restrictivo. Pero sí podemos utilizar 'protected', ya que, sería el mismo tipo que estamos utilizando de 
    la Clase padre. También podría ser de tipo 'default' y también podría ser 'public'. Es decir, qué lo podemos
    hacer menos restrictivo, pero no lo podemos hacer más restrictivo. */

    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", departamento:" + this.departamento;
    }
    
}