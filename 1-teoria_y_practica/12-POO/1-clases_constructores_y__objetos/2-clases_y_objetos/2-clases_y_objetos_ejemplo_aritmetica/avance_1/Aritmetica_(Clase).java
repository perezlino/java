// public: nos permite utilizar una clase o metodo desde cualquier otra clase
// void: indicamos que un metodo no va a regresar nada, ningun tipo de informacion (no hay 'return')

public class Aritmetica {

    // Atributos de la clase
    int a;
    int b;

    // Metodos de la clase
    public void sumar(){

        int resultado = a + b;
        System.out.println("Resultado: " + resultado);

    }

    // Este metodo no utiliza 'void' por tanto podemos retornar un valor, utilizar 'return'
    public int sumarConRetorno(){

        return a + b;
    }

    public int sumarConArgumentos(int arg1, int arg2){

        a = arg1;
        b = arg2;
        //return a + b;             //  <========= Podemos usarlo asi  
        return sumarConRetorno();   //  <========= o podemos usarlo asi

    }
}