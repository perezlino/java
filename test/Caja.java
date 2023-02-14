package test;

public class Caja {

    // Atributos de la clase
    int a;
    int b;
    int c;

    // Constructor vacio
    public Caja(){
        System.out.println("Ejecutando constructor vacio");
    }

    // Constructor con argumentos
    public Caja(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Ejecutando constructor con arg");
    }

    // Metodos de la clase
    public int calcularVolumen(){

        return this.a * this.b * this.c;
    
    }
}