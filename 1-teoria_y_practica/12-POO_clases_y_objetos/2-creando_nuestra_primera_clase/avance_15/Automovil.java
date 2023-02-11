/*  METODOS Y ATRIBUTOS ESTATICOS
    =============================

    Entonces, recordando un atributo o método estático de la clase, no le pertenece a la instancia del
    objeto en sí, sino de la clase. Por lo tanto, es compartido por cualquier objeto de esa clase. De 
    tal forma que si un objeto en particular modifica este valor estático, se va a modificar también
    para el resto. Se podría decir que es un atributo genérico y compartido por todas la instancias de 
    la clase.

*/
public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "Gris";
    private double cilindrada;
    private int capacidadEstanque = 40;

    // Vamos a crear un 'atributo estatico'. Por ahora lo dejamos en 'default'. Sin 'private' ni 'public'.
    // Por lo tanto cualquier objeto 'Automóvil' va a tener un color de patente naranja y estático. Por lo 
    // tanto, para todos igual. Un objeto en particular, por ejemplo, un Subaru no podría tener un color de 
    // patente distinta que Nissan o cualquier otro, no, son todos iguales.
    static String colorPatente = "Naranja";

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
        return  "auto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo + 
                "\nauto.color = " + this.color +
                "\nauto.patenteColor = " + Automovil.colorPatente + // Podemos llamarla como 'colorPatente' también
                                                               // pero no se utiliza el 'this' en atributos 
                                                               // estaticos.
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
        return fabricante + " " + modelo;
    }

}