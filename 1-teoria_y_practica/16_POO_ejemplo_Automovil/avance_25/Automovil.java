public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS; 
    private Motor motor; //private double cilindrada;                     <=======                  
    private Estanque estanque; //private int capacidadEstanque = 40;      <======= 
    private Persona conductor; //                                         <======= 
    private Rueda[] ruedas;    //                                         <======= 

    private TipoAutomovil tipo;

    private static Color colorPatente = Color.NARANJO;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    // Dado que estamos utilizando el enum 'Color' estas constantes ya no las usamos

    // public static final String COLOR_ROJO = "Rojo";
    // public static final String COLOR_AMARILLO = "AMARILLO";
    // public static final String COLOR_AZUL = "Azul";
    // public static final String COLOR_BLANCO = "Blanco";
    // public static final String COLOR_GRIS = "Gris Oscuro";

    public Automovil(){
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo){
        this(); 
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
    public Automovil(String fabricante, String modelo, Color color){
        this(fabricante, modelo);               
        this.color = color;                            
    }

    // Modificamos 'double cilindrada' por 'Motor motor'
    public Automovil(String fabricante, String modelo, Color color, Motor motor){
        this(fabricante, modelo, color); 
        this.motor = motor; //this.cilindrada = cilindrada;    
    }                                   

    // Modificamos 'double cilindrada' por 'Motor motor' y 'int capacidadEstanque' por 'Estanque estanque'
    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque){
        this(fabricante, modelo, color, motor);
        this.estanque = estanque; //this.capacidadEstanque = capacidadEstanque;
    } 

    // Agregamos
    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
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
   
    public Color getColor(){
        return this.color;
    }
 
    public void setColor(Color color){
        this.color = color;
    }       

    // -------------------------------------------------------------------------------------------------
    // Esto lo debemos eliminar:

    // public double getCilindrada(){
    //     return this.cilindrada;
    // }

    // public void setCilindrada(double cilindrada){
    //     this.cilindrada = cilindrada;
    // }        

    // public int getcapacidadEstanque(){
    //     return this.capacidadEstanque;
    // }

    // public void setCapacidadEstanque(int capacidadEstanque){
    //     this.capacidadEstanque = capacidadEstanque;
    // }  
    // -------------------------------------------------------------------------------------------------      
  
    public static Color getColorPatente(){
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente){
        Automovil.colorPatente = colorPatente;
    }

    public TipoAutomovil getTipo(){
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo){
        this.tipo = tipo;
    }

    // ------------------------------------------------------------------------------------------------- 
    //Agregamos
    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        // if(estanque == null){
        //     this.estanque = new Estanque();
        // }
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    // ------------------------------------------------------------------------------------------------- 


    public String verDetalle(){
        return  "auto.id = " + this.id +   
                "\nauto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo + 
                "\nauto.tipo = " + this.getTipo().getDescripcion() + 
                "\nauto.color = " + this.color.getColor() +
                "\nauto.patenteColor = " + Automovil.colorPatente.getColor() + 
                "\nauto.cilindrada = " + this.motor.getCilindrada(); // this.cilindrada
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
        return km / (porcentajeBencina * this.estanque.getCapacidad()); // capacidadEstanque
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km / (this.estanque.getCapacidad()*(porcentajeBencina/100f)); // capacidadEstanque      
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