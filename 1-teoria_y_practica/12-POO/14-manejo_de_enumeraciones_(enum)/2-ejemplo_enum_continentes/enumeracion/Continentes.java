package enumeracion;

public enum Continentes {

/*  Vamos a agregar atributos y metodos a estas Enumeraciones, a cada uno de sus elementos. Asi que
    esto va aser muy parecido a crear una nueva clase, pero del tipo Enumeracion.

    Así que lo que queremos lograr ahora es que a cada uno de los Continentes le podemos proporcionar 
    la cantidad de países que tiene cada Continente. Para ello vamos a definir un 'atributo' en esta 
    enumeración, tal cual como lo hemos trabajado en nuestras clases.

*/    
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);

    // El atributo va a ser 'privado', 'final' del tipo entero, llamado 'países'. 'final' porque una vez 
    // que le hemos asignado un valor, ya no queremos que se modifique, por ello, va a ser 'final'.
    private final int paises;

    // Posteriormente,  lo que vamos a hacer es que debido a que en cada uno de estos elementos (AFRICA, 
    // EUROPA, etc…) le tenemos que pasar un valor entre paréntesis, la cantidad de países, por ejemplo 
    // África tiene 53 países, entonces, vamos a definir un constructor para poder utilizar este argumento 
    // en cada uno de los elementos de la enumeración. Así que ese constructor se va a asociar a cada uno de 
    // los elementos de esta enumeración. 
    Continentes(int paises) {
        this.paises = paises;
    }

    // Sin embargo, debido a que este atributo 'países' asociado a cada uno de los elementos de la enumeración 
    // es 'privado', entonces este atributo está encapsulado. Por lo tanto, vamos a agregar el método 'get' 
    // para recuperar ese valor. No vamos a agregar el método 'set', ya que, este valor es 'final' así que no 
    // vamos a poder modificar el valor de este atributo una vez que el valor se le ha asignado, solamente 
    // podemos recuperarlo.
    public int getPaises() {
        return this.paises;
    }
}