public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS; 
    private Motor motor;                                    
    private Estanque estanque;   
    private Persona conductor;                                      
    private Rueda[] ruedas;                                           

    private TipoAutomovil tipo;

    private static Color colorPatente = Color.NARANJO;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

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

    public Automovil(String fabricante, String modelo, Color color, Motor motor){
        this(fabricante, modelo, color); 
        this.motor = motor; 
    }                                   

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque){
        this(fabricante, modelo, color, motor);
        this.estanque = estanque; 
    } 

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

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    // Modificamos
    public Estanque getEstanque() {
        if(estanque == null){
            this.estanque = new Estanque();
        }
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

    // -----------------------------------------------------------------------------------------------
    // Modificamos
    public String verDetalle() {
        String detalle =  "auto.id = " + this.id +
                "\nauto.fabricante = " + this.getFabricante() +
                "\nauto.modelo = " + this.getModelo();

        if(this.getTipo() != null) {
            detalle += "\nauto.tipo = " + this.getTipo().getDescripcion();
        }

        detalle += "\nauto.color = " + this.color.getColor() +
                "\nauto.patenteColor = " + colorPatente.getColor();

        if(this.motor != null) {
            detalle += "\nauto.cilindrada = " + this.motor.getCilindrada();
        }

        return detalle;
    }
    // -----------------------------------------------------------------------------------------------    

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
        return km / (porcentajeBencina * this.getEstanque().getCapacidad()); // 'getEstanque()' por 'estanque'
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km / (this.getEstanque().getCapacidad()*(porcentajeBencina/100f)); // 'getEstanque()' por 'estanque'      
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