/*  ======================================================
    ==== FLUJO DE CONTROL - FOR (SENTENCIA FOR EACH) =====
    ======================================================


    FOR EACH
    =====
*/
    public class SentenciaForEach {
        public static void main(String[] args) {
            
            System.out.println("------------ EJEMPLO 1 ------------");
            int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
            for(int num: numeros){
                System.out.println("num = " + num);
            }

            System.out.println("------------ EJEMPLO 2 ------------");

            String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
            
            for(String nombre : nombres){
                System.out.println("nombre = " + nombre);
            }
        }
    }
/*

------------ EJEMPLO 1 ------------
num = 1
num = 3
num = 5
num = 7
num = 9
num = 11
num = 13
num = 15
------------ EJEMPLO 2 ------------
nombre = Andres
nombre = Pepe
nombre = Maria
nombre = Paco
nombre = Lalo
nombre = Bea
nombre = Pato
nombre = Pepa

*/