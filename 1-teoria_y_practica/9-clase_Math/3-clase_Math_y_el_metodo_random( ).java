/*  ======================================================
    ========== CLASE MATH Y EL METODO RANDOM() ===========
    ======================================================

    El "método random()"" se utiliza para la generación de números aleatorios.

*/
    public class EjemploClaseMathRandom {
        public static void main(String[] args) {

            // Nos devuelve un número decimal aleatorio entre 0 y 1
            double random = Math.random();
            System.out.println("random = " + random);

            // Si necesitamos un decimal que se encuentre entre 0 y 10
            // random *= 10;
            // System.out.println("random = " + random);

            // Seleccionar un color de manera aleatoria
            String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
            random *= colores.length;
            System.out.println("random = " + random);
            
            // Redondeamos hacia abajo, dado que podria devolvernos un valor igual a 5.5 y no
            // queremos un indice igual a 6, dado que el rango del indice va entre 0 y 5
            random = Math.floor(random);
            System.out.println("random = " + random);

            System.out.println("colores = " + colores[(int) random]);
        }
    }
/* 

random = 0.6461754869403479
random = 3.877052921642087
random = 3.0 

*/    