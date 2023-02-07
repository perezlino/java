/*  ======================================================
    ======== CLASE MATH (PARTE 2 - TRIGONOMETRIA) ========
    ======================================================

*/
public class EjemploClaseMath {
    public static void main(String[] args) {
        
        double exp = Math.exp(1);
        System.out.println("exp = " + exp);
        
        double log = Math.log(10);
        System.out.println("log = " + log);
        
        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);
        
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("convertir de radianes a grados = " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("convertir de grados a radianes = " + radianes);

        System.out.println("sin(90): " + Math.sin(radianes)); // Siempre usamos radianes
        System.out.println("cos(90): " + Math.cos(radianes));

        radianes = Math.toRadians(180.00);
        System.out.println("cos(180): " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("cos(0): " + Math.cos(radianes));

    }
}
/* 

exp = 2.718281828459045
log = 2.302585092994046
potencia = 1000.0
raiz = 2.23606797749979
convertir de radianes a grados = 90.0
convertir de grados a radianes = 1.5707963267948966
sin(90): 1.0
cos(90): 6.123233995736766E-17
cos(180): -1.0
cos(0): 1.0 

*/