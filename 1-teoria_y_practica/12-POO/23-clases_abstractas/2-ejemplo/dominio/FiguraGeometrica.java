package dominio;

// Al tener un metodo abstracto, la clase tambien debe ser abstracta
public abstract class FiguraGeometrica {

    protected String tipoFigura;
    
    // Constructor de un argumento
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    // Metodo abstracto
    // ================
    // Vamos a agregar un método abstracto. Este método va a ser público y debido a que no vamos a agregar 
    // ninguna implementación, entonces lo marcamos como abstracto, ya que, en este momento no podemos saber 
    // cómo es que se va a dibujar un tipo de figura geométrica. Tenemos que definir un tipo de la clase hija, 
    // ya sea rectángulo, círculo o cualquier otro tipo de figura geométrica y entonces, ya podremos saber cómo 
    // se implementa el método dibujar. Así que arreglamos el método dibujar que es abstracto, no recibe ningún 
    // argumento y en este caso a diferencia de los métodos que hemos trabajado hasta el momento, siempre estábamos 
    // abriendo y cerrando el cuerpo de este método. En los métodos abstractos no sucede esto simplemente ponemos ; . 
    // Así que con eso estamos definiendo un método abstracto. 

    public abstract void dibujar();


    // Metodos get y set

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    // Metodo de sobreescritura de toString
    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
    
}