// public: nos permite utilizar una clase o metodo desde cualquier otra clase
// void: indicamos que un metodo no va a regresar nada, ningun tipo de informacion (no hay 'return')

public class Aritmetica {

    // Atributos de la clase
    int a;
    int b;

    // Constructor vacio

    // A diferencia de los metodos, los metodos deben regresar forzosamente un 'tipo de retorno', por
    // ejemplo, int, String, etc., incluso en el caso de que no regrese nada, debemos especificarlo, 
    // agregando la palabra 'void'. En cambio los constructores, a parte que se llaman exactamente igual
    // que la 'Clase', no regresan ningun tipo de dato.

    // Un constructor es un metodo, pero es un metodo especial. Este metodo la unica vez que se puede
    // mandar a llamar es cuando creamos nuestro objeto, asi que como podemos observar que solamente cuando
    // usamos la palabra 'new' es cuando se puede mandar a llamar este metodo especial. Ya que su objetivo 
    // es construir un objeto, reservar espacio de memoria y opcionalmente inicializar los atributos de
    // nuestra clase.
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
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