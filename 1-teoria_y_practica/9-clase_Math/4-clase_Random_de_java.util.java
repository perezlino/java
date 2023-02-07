/*  ======================================================
    ============= CLASE RANDOM DE JAVA.UTIL ==============
    ======================================================

*/
    import java.util.Random;

    public class EjemploClaseMathRandom {
        public static void main(String[] args) {

            Random randomObj = new Random();

            // Enteros aleatorios
            int randomInt = randomObj.nextInt();
            System.out.println("randomInt = " + randomInt);

            // Si quiero un rango de enteros aleatorios entre 0 y 15
            int randomInt2 = randomObj.nextInt(15);
            System.out.println("randomInt2 = " + randomInt2);

            // Si quiero un rango de enteros aleatorios entre 5 y 15
            int randomInt3 = 5 + randomObj.nextInt(15 - 5);
            System.out.println("randomInt3 = " + randomInt3);

            // Numeros del tipo Long aleatorios
            long randomLong = randomObj.nextLong();
            System.out.println("randomLong = " + randomLong);

            // Colores aleatorios
            String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
            randomInt = randomObj.nextInt(colores.length);
            System.out.println("randomInt = " + randomInt);
            System.out.println("colores = " + colores[randomInt]);
        }
    }
/* 

randomInt = 400541178
randomInt2 = 2
randomInt3 = 13
randomLong = -8615843923207301127
randomInt = 3
colores = verde 

*/