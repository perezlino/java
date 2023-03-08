// El metodo 'main' basicamente lo que hace es permitirnos ejecutar nuestro programa

public class PruebaAritmetica {

    public static void main(String[] args) {
        
        Aritmetica aritmetica1 = new Aritmetica();
        Aritmetica aritmetica2 = new Aritmetica();

        // También podriamos crear el objeto de la siguiente manera:
        
        // Aritmetica aritmetica1;
        // aritmetica1 = new Aritmetica();

        aritmetica1.a = 10;
        aritmetica1.b = 20;
        aritmetica1.sumar();

        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Variable resultado = " + resultado);

        resultado = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("Variable resultado = " + resultado);
     
    }
}
/* 
Resultado: 30
Variable resultado = 30
Variable resultado = 13
*/
