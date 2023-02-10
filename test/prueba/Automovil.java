package test.prueba;


public class Automovil {

    String fabricante;
    String modelo;
    String color = "Gris";
    double cilindrada;

    // Los métodos tanto como los atributos siempre deben comenzar con minúscula.
    // En el caso de ser una palabra compuesta, utilizamos mayuscula. Ejemplo: verDetalle

    public String verDetalle(){
        return  "this.fabricante = " + this.fabricante +
                "\nthis.fabricante = " + this.modelo + 
                "\nthis.fabricante = " + this.color +
                "\nthis.fabricante = " + this.cilindrada;
    }

    // Creamos dos nuevos metodos:

    public String acelerar(int rpm){
        return "El auto " + this.fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    // Vamos a crear un metodo que llame a los metodos 'acelerar' y 'frenar' al mismo tiempo
    // También usamos la palabra 'this' para referirnos también a métodos, no solamente atributos.

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }
}