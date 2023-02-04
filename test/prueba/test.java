package test.prueba;

public class test {

    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = i + j + k / 3;
        System.out.println("promedio = " + promedio);

        double promedios = i + j + k / 3d;
        System.out.println("promedio = " + promedios);

        double promedio2 = (i + j + k) / 3;
        System.out.println("promedio2 = " + promedio2);

        double promedio3 = (i + j + k) / 3d;
        System.out.println("promedio2 = " + promedio3);

        // De izq a der = Primero divide (k/3d) y luego realiza la multiplicación (k/3d) * 10
        double promedio4 = i + j + k / 3d * 10; 
        System.out.println("promedio = " + promedio4);

        // Primero resuelve operación de Paréntesis (3d * 10) y luego realiza la división k / (3d * 10)
        double promedio5 = i + j + k / (3d * 10); 
        System.out.println("promedio = " + promedio5);

        // De izq a der = Primero resuelve operación de Paréntesis (i + j + k) y luego realiza la 
        // operación de Paréntesis (3d * 10) y finalmente divide (i + j + k) / (3d * 10)
        double promedio6 = (i + j + k) / (3d * 10); 
        System.out.println("promedio = " + promedio6);

        // Primero resuelve operacion de (--i + j++), luego realiza la división (k/3d) y luego realiza
        // la multiplicación (k/3d) * 10
        double promedio7 = --i + j++ + k / 3d * 10; 
        System.out.println("promedio = " + promedio7);

    }
}