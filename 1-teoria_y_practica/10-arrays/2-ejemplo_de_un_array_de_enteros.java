/*  ======================================================
    =========== EJEMPLO DE UN ARRAY DE ENTEROS ===========
    ======================================================

*/    
public class EjemploArreglos {
    public static void main(String[] args) {

        int[] enteros = new int[4];
        //int enteros[] = new int[4];

        enteros[0] = 1;
        enteros[1] = 2;
        enteros[2] = 3;
        enteros[3] = 4;

        int i = enteros[0];
        int j = enteros[1];
        int k = enteros[2];
        int l = enteros[3]; // int l = enteros[enteros.length - 1]

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
/* 

i = 1
j = 2
k = 3
l = 4 

*/