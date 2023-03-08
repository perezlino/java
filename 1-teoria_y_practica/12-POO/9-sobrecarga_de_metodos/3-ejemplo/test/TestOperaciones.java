package test;

import operaciones.Operaciones;

public class TestOperaciones {

    public static void main(String[] args) {
        
        int resultado1 = Operaciones.sumar(5,3);
        System.out.println("resultado = " + resultado1);

        double resultado2 = Operaciones.sumar(2.0,3);
        System.out.println("resultado = " + resultado2);
    }
    
}
/* 
sumar(int a, int b)
resultado = 8
sumar(double a, double b)
resultado = 5.0 
*/