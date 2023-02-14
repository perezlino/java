/*  ======================================================
    =========== PRECEDENCIA DE LOS OPERADORES ============
    ======================================================

*/
    public class PrecedenciaOperadores {
        public static void main(String[] args) {

            int i = 14;
            int j = 8;
            int k = 20;

            double promedio = i + j + k / 3;
            System.out.println("promedio = " + promedio); // promedio = 28.0

            double media = i + j + k / 3d;
            System.out.println("promedio = " + media); // media = 28.666666666666668

            double promedio2 = (i + j + k) / 3;
            System.out.println("promedio2 = " + promedio2); // promedio2 = 14.0

            double promedio3 = (i + j + k) / 3d;
            System.out.println("promedio3 = " + promedio3); // promedio3 = 14.0

            // De izq a der = Primero divide (k/3d) y luego realiza la multiplicación (k/3d) * 10
            double promedio4 = i + j + k / 3d * 10; 
            System.out.println("promedio4 = " + promedio4); // promedio4 = 88.66666666666667

            // Primero resuelve operación de Paréntesis (3d * 10) y luego realiza la división k / (3d * 10)
            double promedio5 = i + j + k / (3d * 10); 
            System.out.println("promedio5 = " + promedio5); // promedio5 = 22.666666666666668

            // De izq a der = Primero resuelve operación de Paréntesis (i + j + k) y luego realiza la 
            // operación de Paréntesis (3d * 10) y finalmente divide (i + j + k) / (3d * 10)
            double promedio6 = (i + j + k) / (3d * 10); 
            System.out.println("promedio6 = " + promedio6); // promedio6 = 1.4

            // Primero resuelve operacion de (--i + j++), luego realiza la división (k/3d) y luego realiza
            // la multiplicación (k/3d) * 10
            double promedio7 = --i + j++ + k / 3d * 10; // 13 + 9 + 20 / 3d * 10
            System.out.println("promedio7 = " + promedio7); // promedio7 = 87.66666666666667

        }
    }