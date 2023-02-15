public class Automovil {

    // Vamos a generar un id para cada objeto a medida que se van creando
    // Por defecto, comienza en cero. No es necesario indicar ningun valor.
    private int id;

    private String fabricante;
    private String modelo;
    private String color = "Gris";
    private double cilindrada;
    private int capacidadEstanque = 40;
    private static String colorPatente = "Naranja";

    // Por defecto, comienza en cero. No es necesario indicar ningun valor.
    private static int ultimoId;

    // -----------------------------------------------------------------------------------------
    public Automovil(){
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo){
        this(); // <======================================== Asi llamamos al parametro anterior
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
    // -----------------------------------------------------------------------------------------

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
    
    // -----------------------------------------------------------------------------------------
    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    // -----------------------------------------------------------------------------------------

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

    // ------------------------------------------------------------------------------------------------
    // Un metodo 'get' para un atributo estatico, tiene que ser estatico. Lo mismo para el metodo 'set'.
    public static String getColorPatente(){
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente){
        Automovil.colorPatente = colorPatente;
    }
    // ------------------------------------------------------------------------------------------------

    public String verDetalle(){
        return  "auto.id = " + this.id +   // <====================== Agregamos el 'id' al metodo
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