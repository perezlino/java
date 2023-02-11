
/*  VISIBILIDAD O OCULTACION DE LOS ATRIBUTOS
    =========================================

    Como buena práctica y también un principio, es que los atributos de la clase tienen que ser "privados" 
    siempre, siempre privados y que solamente se puedan exponer, ya sea, para editar o para leer mediante 
    métodos, es en ese caso cuando se les conoce como "métodos de lectura". Por ejemplo, 'leerNombre', 
    'leerFabricante', 'leerModelo', leer algún atributo que lo "retorne", retorne la variable o bien otro 
    para 'modificar', se pasa por argumentumo un valor y modifica el contenido de este atributo.

*/

public class Automovil {

    // Cuando es "privado" solamente se puede acceder a este atributo, ya sea para leer o para modificar 
    // dentro de la misma clase 'Automovil'. Tal como lo estamos haciendo acá, lo estamos obteniendo por acá.
    // En cada método, por ejemplo, 'verDetalle' obtenemos y retornamos los datos. En 'acelerar' y 'frenar' 
    //también. 
    private String fabricante;
    private String modelo;
    private String color = "Gris";
    private double cilindrada;
    private int capacidadEstanque = 40;

    // Para leer el atributo
    public String leerFabricante(){
    //  return fabricante  ----> También podriamos colocarlo de esta manera
        return this.fabricante;
    }

    // Para modificar el atributo
    public void asignarFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String leerModelo(){
        return this.modelo;
    }

    public void asignarModelo(String modelo){
        this.modelo = modelo;
    }    

    public String leerColor(){
        return this.color;
    }

    public void asignarColor(String color){
        this.color = color;
    }       

    public double leerCilindrada(){
        return this.cilindrada;
    }

    public void asignarCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }        

    public int capacidadEstanque(){
        return this.capacidadEstanque;
    }

    public void asignarCapacidadEstanque(int capacidadEstanque){
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