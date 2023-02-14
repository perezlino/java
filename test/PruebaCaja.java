/*  ======================================================
    =============== CALCULAR VOLUMEN CAJA ================
    ======================================================

    Se solicita crear una Clase llamada 'Caja' con las siguientes caracteristicas:
    
    - Debe tener 3 atributos de tipo entero (ancho, alto y profundo)
    - Debe tener 2 constructores, uno vacio y uno con 3 argumentos, uno por cada atributo de
      la clase
    - Debe tener el metodo que calcule el volumen de la caja segun la siguiente formula:
      
                          volumen = ancho * alto * profundidad

    - Crear una clase de prueba para crear dos Objetos de tipo Caja, uno vacio y otro que
      tenga como valores: ancho: 3, alto: 2 y profundo: 6, y que mande a imprimir el volumen
      de la caja , segun los valores proporcionados anteriormente.                          

*/    
package test;

public class PruebaCaja {

    public static void main(String[] args) {

        Caja volumen1 = new Caja();
        System.out.println("volumen1 a: " + volumen1.a);
        System.out.println("volumen1 b: " + volumen1.b);
        System.out.println("volumen1 c: " + volumen1.c);
        
        int resultado = volumen1.calcularVolumen();
        System.out.println("Variable resultado = " + resultado);
/*
        Ejecutando constructor vacio
        volumen1 a: 0
        volumen1 b: 0
        volumen1 c: 0
        Variable resultado = 0  
*/       
        Caja volumen2 = new Caja(5, 8, 3);
        System.out.println("volumen2 a: " + volumen2.a);
        System.out.println("volumen2 b: " + volumen2.b);
        System.out.println("volumen2 c: " + volumen2.c);
        
        resultado = volumen2.calcularVolumen();
        System.out.println("Variable resultado = " + resultado);
/*
        Ejecutando constructor con arg
        volumen2 a: 5
        volumen2 b: 8
        volumen2 c: 3
        Variable resultado = 120  
*/  
    }
}