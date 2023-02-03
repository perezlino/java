/*  ======================================================
    ========== CONVERSION DE PRIMITIVOS A STRING =========
    ======================================================
*/
    public class ConversionDeTipos {
        public static void main(String[] args) {

            int numeroInt = 100;
            System.out.println("numeroInt = " + numeroInt);
            
            // Primera forma: Int a String
            String numeroStr = Integer.toString(numeroInt);
            System.out.println("numeroStr = " + numeroStr);
            
            // Segunda forma: Int a String
            numeroStr = String.valueOf(numeroInt);
            System.out.println("numeroStr = " + numeroStr);

                // Ejemplos
                numeroStr = String.valueOf(numeroInt + 10);
                System.out.println("numeroStr = " + numeroStr);          
                
                numeroStr = String.valueOf(numeroStr + 10);
                System.out.println("numeroStr = " + numeroStr);                  

            // Real | Float | Double a String
            double RealDouble = 1.23456;
            String RealStr = Double.toString(RealDouble);
            System.out.println("RealStr = " + RealStr);

                double otroRealDouble = 1.23456e2;
                RealStr = Double.toString(otroRealDouble);
                System.out.println("RealStr = " + RealStr);
            
            RealStr = String.valueOf(1.23456e2f);
            System.out.println("RealStr = " + RealStr);
        }
    }
/* Esto nos devuelve el terminal:

numeroInt = 100
numeroStr = 100
numeroStr = 100
numeroStr = 110
numeroStr = 11010
RealStr = 1.23456
RealStr = 123.456
RealStr = 123.456

*/