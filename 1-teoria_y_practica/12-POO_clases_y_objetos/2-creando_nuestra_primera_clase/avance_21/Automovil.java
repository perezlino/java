public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS; 
    private double cilindrada;
    private int capacidadEstanque = 40;

    // -----------------------------------------------------------------------------------------------
    // Agregamos
    private TipoAutomovil tipo;

    // -----------------------------------------------------------------------------------------------

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

    public Automovil(String fabricante, String modelo, Color color, double cilindrada){
        this(fabricante, modelo, color); 
        this.cilindrada = cilindrada;    
    }                                   

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadEstanque){
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
   
    public Color getColor(){
        return this.color;
    }
 
    public void setColor(Color color){
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
  
    public static Color getColorPatente(){
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente){
        Automovil.colorPatente = colorPatente;
    }

    // -----------------------------------------------------------------------------------------------
    public String verDetalle(){
        return  "auto.id = " + this.id +   
                "\nauto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo + 
                "\nauto.tipo = " + this.getTipo().getDescripcion() + // <============= Modificamos
                "\nauto.color = " + this.color.getColor() +
                "\nauto.patenteColor = " + Automovil.colorPatente.getColor() + 
                "\nauto.cilindrada = " + this.cilindrada;
    }

    // -----------------------------------------------------------------------------------------------
    // Agregamos
    public TipoAutomovil getTipo(){
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo){
        this.tipo = tipo;
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