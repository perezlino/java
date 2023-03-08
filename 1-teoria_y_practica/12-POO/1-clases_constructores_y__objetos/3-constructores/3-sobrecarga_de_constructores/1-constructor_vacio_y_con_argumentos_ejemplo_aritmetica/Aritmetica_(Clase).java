// public: nos permite utilizar una clase o metodo desde cualquier otra clase
// void: indicamos que un metodo no va a regresar nada, ningun tipo de informacion (no hay 'return')

public class Aritmetica {

    // Atributos de la clase
    int a;
    int b;

    // Constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando constructor vacio");
    }

    // Constructor con argumentos
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con arg");
    }


    // Metodos de la clase
    public void sumar(){

        int resultado = this.a + this.b;
        System.out.println("Resultado: " + resultado);

    }

    public int sumarConRetorno(){

        return this.a + this.b; 
    }

    public int sumarConArgumentos(int a, int b){

        this.a = a;
        this.b = b;
        //return this.a + this.b;             //  <========= Podemos usarlo asi  
        return this.sumarConRetorno();   //  <========= o podemos usarlo asi

    }
}