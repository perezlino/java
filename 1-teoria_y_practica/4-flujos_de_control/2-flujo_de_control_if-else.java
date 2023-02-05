/*  ======================================================
    ============= FLUJO DE CONTROL - IF-ELSE =============
    ======================================================

    
    IF ELSE
    =======
*/
    public class SentenciaIfElse {
        public static void main(String[] args) {

            float promedio = 5.5f;

            // EJEMPLO 1
            if (promedio >= 6.5) {
                System.out.println("Felicitaciones, excelente promedio!");
            } else {
                System.out.println("Necesitas esforzarte un poco más!");
            }            

            // EJEMPLO 2            
            if(promedio >= 6.5) {
                System.out.println("Felicitaciones, excelente promedio!");
            } else if(promedio >= 6.0){
                System.out.println("Muy buen promedio!");
            } else if(promedio >= 5.5){
                System.out.println("Buen promedio!");
            } else if(promedio >= 5.0){
                System.out.println("Regular, necesitas esforzarte un poco más!");
            } else if(promedio >= 4.0){
                System.out.println("Insuficiente, necesitas estudiar más!");
            } else {
                System.out.println("Reprobado!");
            }

            System.out.println("tu promedio es " + promedio);
        }
    }
/* 

Necesitas esforzarte un poco más!
Buen promedio!    
tu promedio es 5.5

*/