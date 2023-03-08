package test;

import genericos.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {
        
        // No podemos utilizar 'primitivos'
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();  // El tipo T es: Integer

        ClaseGenerica<String> objetoString = new ClaseGenerica("Juan");
        objetoString.obtenerTipo();  // El tipo T es: String
    }   
}