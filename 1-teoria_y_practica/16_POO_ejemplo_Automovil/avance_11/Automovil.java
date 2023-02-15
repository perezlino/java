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

    // Vemos que dentro de los conductores se repite codigo. Es por esto es que vamos a optimizar
    // el manejo de los conductores. ¿Como? Reutilizando. Haremos referencia al constructor de la misma 
    // clase y pasa reutilizar los parámetros.

    public Automovil(String fabricante, String modelo, String color){
        this(fabricante, modelo); // ===================> Esto es una forma de llamar a los argumentos del
                                  //                      constructor anterior que ya fueron inicializados.
        this.color = color;      //                       Es por eso, que 'color' no podemos agregarlo.
    }
    
    public Automovil(String fabricante, String modelo, String color, double cilindrada){
        this(fabricante, modelo, color); // ===================> En este caso si viene agregado 'color'
        this.cilindrada = cilindrada;    //                      porque ya fue inicializado por el comstructor
    }                                    //                      anterior.
    
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
}