//  CONSTRUCTOR
//  ===========

//  Entonces para resumir el constructor es "void", no devuelve nada, pero el "void" tampoco se coloca 
//  en la declaración de constructor, no va. Y tampoco es un miembro de la clase. No es un método, 
//  solo es invocado cuando se crea el objeto con el operador 'new' y no se puede llamar, no se puede 
//  invocar de forma explícita como si fuera otro método, solamente con el 'new'.


public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "Gris";
    private double cilindrada;
    private int capacidadEstanque = 40;

    // Nos permite crear el objeto 'nissan' sin parametros. Ahora tenemos dos versiones del mismo constructor 
    // generandose una "sobrecarga de constructores".
    public Automovil(){

    }

    // Un detalle importante que hay que saber es que los constructores solamente se pueden llamar con
    // el 'new'. No se pueden invocar como método, por ejemplo, no puedo colocar 'mazda.el_constructor'.
    // No, porque no es un método común y corriente, es un método especial para crear la instancia, para
    // inicializar el objeto con valores por defecto, pasando parámetros, inicializando en los atributos.
    public Automovil(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
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