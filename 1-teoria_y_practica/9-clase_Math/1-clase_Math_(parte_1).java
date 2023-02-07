/*  ======================================================
    ================ CLASE MATH (PARTE 1) ================
    ======================================================

    En general, la clase matemática, es muy parecido a la clase System, es una clase que no se puede 
    instanciar y son solamente métodos estáticos, es decir, que se invocan con el nombre de la 
    clase Math.<el nombre del método o la operación>.

    Si revisamos la clase Math, podemos ver que es una Clase final. Esto significa que no puede tener 
    herencia, no se puede extender de ella. No podemos crear una clase hija a partir de la clase matemática, 
    más que nada por diseño. El constructor es privado, por lo tanto, no permite crear instancias con el 
    operador new.

    De esa forma está hecha por diseño para que sus métodos sean y se invoquen de forma estática.
*/
public class EjemploClaseMath {
    public static void main(String[] args) {
        
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);
        
        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);
        
        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);
        
        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);
        
        double techo = Math.ceil(3.5); // Redondear hacia arriba
        System.out.println("techo = " + techo);
        
        double piso = Math.floor(3.5); // Redondear hacia abajo
        System.out.println("piso = " + piso);
        
        long entero = Math.round(Math.PI); // Desde 3.5 hacia arriba redondea a 4
        System.out.println("entero = " + entero);
    }
}
/* 

absoluto = 3
absoluto = 3
max = 3.5
min = 1.2
techo = 4.0
piso = 3.0
entero = 3 

*/