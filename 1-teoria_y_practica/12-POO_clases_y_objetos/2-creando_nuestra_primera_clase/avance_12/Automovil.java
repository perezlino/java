
/*  ORDEN DE LA CLASE 
    =================

    Siempre primero vienen los atributos. Luego el constructor o los constructores. Después vienen los 
    métodos setter o getter. Y después, los métodos de operación que realizan cálculo, consultas, lo 
    que sea. Y después, por ejemplo, pueden ir los métodos que queramos sobrescribir o reemplazar de la 
    clase padre (sobre escritura de método).

*/


public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "Gris";
    private double cilindrada;
    private int capacidadEstanque = 40;

    public Automovil(){

    }

    public Automovil(String fabricante, String modelo){
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

    public String verDetalle(){
        return  "this.fabricante = " + this.fabricante +
                "\nthis.fabricante = " + this.modelo + 
                "\nthis.fabricante = " + this.color +
                "\nthis.fabricante = " + this.cilindrada;
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

    // Vamos a modificar el metodo 'equals' que pertenece a la clase Object y vamos a darle una
    // función customizada. Realizará la comparación enfocandose solo en el valor de 'fabricante'
    // y 'modelo'.

/*  @Override
    ---------    
    Esta anotación es una marca que le indica el compilador en tiempo ejecución de que estamos 
    sobreescribiendo un método de clase padre, nada más, solamente informativo, solamente de 
    documentación, no tiene ninguna funcionalidad extra. De hecho lo podríamos quitar y no pasa 
    nada.
*/    
    @Override
    public boolean equals(Object obj) {

        // Si ambos son iguales por referencia, retornamos 'true' automaticamente. Ya no es necesario
        // comparar por atributos.
        if(this == obj){
            return true;
        }

        // Este 'if' lo escribimos para evitar comparar un objeto que no sea una instancia de la
        // clase Automovil. Por ejemplo, comparar una instancia de una clase Date o una clase String
        if(!(obj instanceof Automovil)){    // Por ejemplo: Date fecha = new Date()
            return false;                   // System.out.println(nissan.equals(fecha));
        }                                   // Acá, estamos comparando dos objetos que provienen de una
                                            // clase distinta. Peras con manzanas.  

        Automovil a = (Automovil) obj;
        // el valor de 'fabricante' y 'modelo' no deben ser Nulos
        return (this.fabricante != null && this.modelo != null && 
                this.fabricante.equals(a.getFabricante()) && 
                this.modelo.equals(a.getModelo()));
    }

}