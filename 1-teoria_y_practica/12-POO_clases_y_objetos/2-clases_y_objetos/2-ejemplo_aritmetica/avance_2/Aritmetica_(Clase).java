// public: nos permite utilizar una clase o metodo desde cualquier otra clase
// void: indicamos que un metodo no va a regresar nada, ningun tipo de informacion (no hay 'return')

public class Aritmetica {

    // Atributos de la clase
    int a;
    int b;

    // Metodos de la clase
    public void sumar(){

        int resultado = this.a + this.b; // <=========== Aqui tambien podemos utilizar 'this'
        System.out.println("Resultado: " + resultado);

    }

    // Este metodo no utiliza 'void' por tanto podemos retornar un valor, utilizar 'return'
    public int sumarConRetorno(){

        return this.a + this.b; // <=========== Aqui tambien podemos utilizar 'this'
    }

    //---------------------------------------------------------------------------------------------------
    // public int sumarConArgumentos(int arg1, int arg2){

    //     a = arg1;
    //     b = arg2;
    //     //return a + b;             //  <========= Podemos usarlo asi  
    //     return sumarConRetorno();   //  <========= o podemos usarlo asi

    // }
    //---------------------------------------------------------------------------------------------------
    
    // Utilizar 'this' es opcional, pero con el vamos a saber que los atributos utilizados junto a 'this'
    // pertenecen a la Clase, lo mismo con los metodos. A si sabemos que pertenecen a la Clase y no a una
    // Clase externa.

    // Recordar que 'this' hace referencia hacia el objeto sobre el cual se actua.

    // Lo que tambien es comun es que los argumentos del metodo se llamen igual que los atributos de 
    // nuestra clase.
    public int sumarConArgumentos(int a, int b){

        this.a = a;
        this.b = b;
        //return this.a + this.b;             //  <========= Podemos usarlo asi  
        return this.sumarConRetorno();   //  <========= o podemos usarlo asi

    }
}