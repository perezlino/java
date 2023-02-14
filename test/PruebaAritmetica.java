package test; 

public class PruebaAritmetica {

    public static void main(String[] args) {
        
        // Variables locales
        int a = 50;
        int b = 100;
        // Dado que el metodo 'main' es 'estatico' solo puede llamar a otros metodos que sean
        // 'estaticos'.
        miMetodo();
/* 
        Otro metodo
*/

        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 a: " + aritmetica1.b);
/*
Ejecutando constructor vacio
a: 0
b: 0
*/       
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 a: " + aritmetica2.a);
        System.out.println("aritmetica2 a: " + aritmetica2.b);
/*
Ejecutando constructor con arg
a: 5
b: 8
*/  
    }
        
    public static void miMetodo(){

        // No podemos hacer uso de las variables locales x e y dentro de este metodo
        // Estan fuera del alcance donde fue definida
        // x = 200; ----> Devolvera error
        System.out.println("Otro metodo");
    }
}
