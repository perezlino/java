/*  ======================================================
    =============== OPERADORES ARITMETICOS ===============
    ======================================================

    Un detalle importante que mencionar: cuando tenemos variables que son del mismo tipo, por 
    ejemplo, 2 variables integers o 2 variables del tipo string, se pueden definir en una sola 
    línea.
*/    
    import javax.swing.*;

    public class OperadoresAritmeticos {
        public static void main(String[] args) {

            int i = 5, j = 4, suma = i + j;

            // -------------------- SUMA --------------------
            System.out.println("suma = " + suma); // suma = 9
            System.out.println("i + j = " + i + j); // i + j = 54
            System.out.println(i + j + "i + j"); // 9i + j
            System.out.println("i + j = " + (i + j)); // i + j = 9
            
            // -------------------- RESTA --------------------
            int resta = i - j;
            System.out.println("resta = " + resta); // resta = 1
            System.out.println("(i - j) = " + (i - j)); // (i - j) = 1

            // -------------------- MULTIPLICACIÓN --------------------
            int multi = i * j;
            System.out.println("multiplicación = " + multi); // multiplicación = 20
            
            // -------------------- DIVISIÓN --------------------
            int div = i / j;
            float div2 = i / j; // redondea hacia abajo
            float div3 = (float) i / j;
            float div4 = (float) i / (float) j;
            System.out.println("división = " + div); // división = 1
            System.out.println("división = " + div2); // división = 1.0
            System.out.println("división = " + div3); // división = 1.25
            System.out.println("división = " + div4); // división = 1.25
            
            // -------------------- RESTO --------------------
            int resto = i % j;
            System.out.println("resto = " + resto); // resto = 1
            
            resto = 8 % 5;
            System.out.println("resto = " + resto); // resto = 3

            // -------------------- COMPROBACIÓN IF --------------------
            int numero = 4;
            if(numero % 2 == 0){
                System.out.println("numero par = " + numero);
            } else {
                System.out.println("numero impar = " + numero);
            }
            // numero = 4
        }
    }