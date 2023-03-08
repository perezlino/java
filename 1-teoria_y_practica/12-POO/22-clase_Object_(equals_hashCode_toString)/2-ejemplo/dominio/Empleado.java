package dominio;

import java.util.Objects;

public class Empleado {
    protected String nombre;
    protected double sueldo;
    
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public String obtenerDetalles(){
        return "Nombre: " + this.nombre + ", sueldo: " + this.sueldo; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }

/*  Lo que hace es regresar un tipo entero. Así que con base en los atributos de nuestra Clase hace un cálculo 
    para generar un valor de tipo entero, lo más único posible. Ahora. ¿por qué decimos que lo más único posible? 
    porque bien podría repetirse este cálculo con algún otro Objeto, incluso con valores distintos podría ser el 
    mismo valor del número entero. No importa que sea el mismo valor, sin embargo, debemos de asegurarnos que la 
    posibilidad de que este número se repita con otro Objeto, incluyendo valores distintos en sus atributos, debe 
    de ser lo menor posible. Así que la posibilidad de que este número se repita debe de ser la menor. Por ello es 
    que internamente se hace un cálculo y eso se conoce como un número hash, se utiliza un número hash en este caso 
    el valor de 3 e internamente se hace un cálculo con los valores de los atributos de nuestra Clase, así que 
    podemos observar que estamos utilizando el atributo de nombre y el atributo de sueldo. La forma en que se 
    realiza este cálculo no es realmente importante, ya que, este cálculo puede variar de IDE en IDE o de 
    implementación en implementación. Pero básicamente lo que se está buscando aquí es que consigamos un valor 
    entero único para este Objeto considerando los valores de los atributos de esta Clase. En resumen, el concepto 
    de 'hashCode()' es el de generar un valor de entero único, lo más único posible con los valores de los atributos 
    del Objeto en cuestión.  
*/

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        return hash;
    }


/*  Ahora en qué consiste equals(). Este nos regresa true o false y podemos observar que hace varias comparaciones 
    para saber si el Objeto con el que estamos trabajando, es decir, el operador this,  la referencia de this, es 
    igual a un Objeto que vamos a recibir. En primer lugar la variable obj es del tipo Object, así que estamos 
    trabajando con el tipo más genérico de Java y posteriormente conforme vamos avanzando en las validaciones, 
    preguntamos si this tiene la misma referencia en memoria, si tiene la misma referencia en memoria, entonces por 
    consiguiente ambos Objetos son iguales y por ello se regresa true. Si no son iguales entonces continuamos y 
    preguntamos si el Objeto que queremos comparar es igual a null, entonces quiere decir que en automático son 
    distintos, ya que, si estamos, utilizando this es porque este Objeto no es nulo y por lo tanto obj que es el 
    Objeto con el que queremos comparar si es nulo, entonces ya no hay nada que comparar, this es diferente a null y 
    obj es igual a null. Por lo tanto, no son iguales y en dado caso de que todavía no podamos decidir si son iguales,
    entonces continuamos y preguntamos mandando a llamar el método getClass(), este método también está definido en la 
    Clase Object y esto nos regresa el tipo de la Clase del Objeto con el cual estamos trabajando, así que preguntamos 
    si el tipo de la Clase son diferentes, entonces regresamos falso, así que esto querría decir que los Objetos son 
    distintos. Pero si aun así continuamos con las validaciones, entonces ya podemos pensar que el Objeto que estamos 
    recibiendo también es del mismo tipo y por lo tanto podemos hacer este cast, según lo que vimos en la lección 
    anterior, estamos haciendo un cast, del tipo Object hacia la Clase hija, la Clase de Empleado y entonces lo que 
    vamos a hacer es comparar los atributos de nuestra Clase, tanto utilizando this, como utilizando la variable de 
    other, que es la variable que declaramos en este momento. De igual manera todo este algoritmo lo generó de manera 
    automática el IDE, pero esto es muy similar a como lo haría cualquier idea o la implementación manualmente que 
    nosotros podríamos agregar. Y finalmente si el atributo de sueldo en ambos Objetos es distinto, entonces quiere 
    decir que los Objetos son distintos y si continuamos quiere decir que podemos comparar finalmente el atributo de 
    nombre, en ambos casos, utilizamos la Clase Objects, que es otra Clase en Java que tiene el método equals() y este 
    método equals() nos va a permitir comparar 2 valores de cada uno de los Objetos para saber si son iguales y en este 
    caso es posible aplicarlo debido a que nombre es de tipo String, por lo tanto, un tipo String lo está comparando con 
    otro tipo String, no compara referencias, sino, compara contenidos, así que aquí está preguntando si el contenido 
    de la variable del atributo nombre es igual al otro Objeto que estamos recibiendo, entonces, continuamos, de lo 
    contrario, si son diferentes regresan falso y si continuamos entonces ya hizo todas las comprobaciones posibles del 
    método equals() y quiere decir que si llegamos hasta la línea ‘return true’ es porque ambos Objetos son iguales y 
    son iguales en contenido, ya que, pudimos observar que lo que se utilizó fue el contenido de cada uno de los 
    atributos de la Clase que estamos comparando.  

*/    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

}