/*  ATRIBUTOS "FINAL"
    =================

    "final" significa 'constante' en JAVA , es decir, que no puede ser modificado. No es una variable.

    Vamos a crear acá un atributo del tipo final. Puede ser 'público' o 'private', pero el 99% de las 
    veces va a ser 'estático'. Claro, porque no tiene sentido utilizar una constante que sea del objeto, 
    ya que es constante. En realidad se aplica para cualquier objeto, debería ser para la clase. Por lo 
    tanto, tiene que ser un atributo estático, es decir, de la clase, pero constante. Lo que sí puede ser 
    'private', en caso de que utilicemos esta constante solamente dentro de la clase y no queremos que 
    sea visible fuera de la clase. Pero típicamente es 'pública', la idea es que la podemos utilizar 
    dentro y fuera, es lo más típico, lo más común.    
*/    

public class Automovil {


    private int id;
    private String fabricante;
    private String modelo;
    private String color = "Gris";
    private double cilindrada;
    private int capacidadEstanque = 40;
    private static String colorPatente = "Naranja";
    private static int ultimoId;

    // -----------------------------------------------------------------------------------------------------
    // Cambia un poco la nomenclatura de cómo se tiene que escribir esta constante. A diferencia de los 
    // atributos variable de la clase, se escriben en mayúscula, completamente mayúscula y palabra compuesta.
    // Se separa con guión bajo, igual como la constante en el sistema operativo.

    // Va a depender si queremos trabajar más, orientado a  Objeto usamos 'Integer' (la clase wrapper). Si 
    // queremos trabajar solamente con el valor, utilizamos 'int'.

    // Para la constante 'final' es obligación asignarle un valor. Se define en la clase y debo darle un valor.
    // Y tampoco no se puede modificar ni dentro ni fuera de la clase.

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;

    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    // Por otro lado 'final' puede ir situado en cualquier lugar:
    // public static final int VELOCIDAD_MAX_CIUDAD = 60;
    // final public static int VELOCIDAD_MAX_CIUDAD = 60;
    // public final static int VELOCIDAD_MAX_CIUDAD = 60;
    // final static public int VELOCIDAD_MAX_CIUDAD = 60;
    // -----------------------------------------------------------------------------------------------------

    // Todo lo que sea color, ya sea, rojo, gris oscuro, blanco, amarillo, azul, llevarlo a constante. De esa 
    // forma, parametrizar los colores que podemos utilizar en el automóvil. Así queda todo mucho más organizado, 
    // mucho más parametrizable y customizado.

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";
    // -----------------------------------------------------------------------------------------------------

    public Automovil(){
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo){
        this(); 
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color){
        this(fabricante, modelo);               
        this.color = color;                            
    }
    
    public Automovil(String fabricante, String modelo, String color, double cilindrada){
        this(fabricante, modelo, color); 
        this.cilindrada = cilindrada;    
    }                                   
    
    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadEstanque){
        this(fabricante, modelo, color, cilindrada);
        this.capacidadEstanque = capacidadEstanque;
    } 
    
    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFabricante(){
        return this.fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }    

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }       

    public double getCilindrada(){
        return this.cilindrada;
    }

    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }        

    public int getcapacidadEstanque(){
        return this.capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque){
        this.capacidadEstanque = capacidadEstanque;
    }        

    public static String getColorPatente(){
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente){
        Automovil.colorPatente = colorPatente;
    }

    public String verDetalle(){
        return  "auto.id = " + this.id +   
                "\nauto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo + 
                "\nauto.color = " + this.color +
                "\nauto.patenteColor = " + Automovil.colorPatente + 
                "\nauto.cilindrada = " + this.cilindrada;
    }

    public String acelerar(int rpm){
        return "El auto " + this.fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }
   
    public float calcularConsumo(int km, float porcentajeBencina){
        return km / (porcentajeBencina * capacidadEstanque);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km / (capacidadEstanque*(porcentajeBencina/100f));        
    }
  
    // MODIFICACION Metodo 'equals'    
    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }

        if(!(obj instanceof Automovil)){   
            return false;                 
        }                                  
                                           
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null && 
                this.fabricante.equals(a.getFabricante()) && 
                this.modelo.equals(a.getModelo()));
    }

    // MODIFICACION Metodo 'toString' 
    @Override
    public String toString(){
        return this.id + " : " + fabricante + " " + modelo;
    }

}

