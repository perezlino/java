public class Automovil {

    String fabricante;
    String modelo;
    String color = "Gris";
    double cilindrada;

    // Por ejemplo, si colocamos 'void' en inglés es vacío, no retorna nada.
    // Es un procedimiento que hace algo, pero no devuelve nada.

    // Cuando estamos dentro de la misma clase, el nombre que una instancia se llama 'this'
    // y esa es la importancia del objeto. Dice que se refiere a sí mismo dentro de la clase. 
    // Hago referencia a su instancia, al mismo objeto.
    public void detalle (){
        System.out.println("this.fabricante = " + this.fabricante);
        System.out.println("this.fabricante = " + this.modelo);
        System.out.println("this.fabricante = " + this.color);
        System.out.println("this.fabricante = " + this.cilindrada);
    }


//   IMPORTANTE
//  ============

/*     
    Podriamos no utilizar 'this' y solo el atributo. Y tambien es correcto.
    Estariamos llamando a los atributos de la clase.

    public void detalle (){
        System.out.println("this.fabricante = " + fabricante);
        System.out.println("this.fabricante = " + modelo);
        System.out.println("this.fabricante = " + color);
        System.out.println("this.fabricante = " + cilindrada);
    }
*/    

/*     
    Pero hay que tener cuidado en el caso de que exista una 'variable local' con el mismo nombre, es 
    decir, una variable dentro del metodo con el mismo nombre que un atributo de la clase. En ese caso, 
    va a llamar a la variable que esta dentro del metodo. Por eso, hay que tener precaucion y anteponer
    con el 'this' cuando queremos utilizar y llamar un atributo de la clase.

    public void detalle (){
        String fabricante = "Toyota";
        System.out.println("this.fabricante = " + this.fabricante);
        System.out.println("this.fabricante = " + modelo);
        System.out.println("this.fabricante = " + color);
        System.out.println("this.fabricante = " + cilindrada);
    }
*/    
}