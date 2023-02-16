package test;

import dominio.Persona;

public class TestArrayObject {
    
    public static void main(String[] args) {
        
        Persona personas[] = new Persona[2];

        personas[0] = new Persona("Alfonso");
        personas[1] = new Persona("Javiera");

        // Obtenemos las referencias de los Objetos
        // Debemos modificar el metodo 'toString' para obtener
        // el resultado que buscamos        
        System.out.println("persona[0] = " + personas[0]); // persona[0] = test.Persona@15db9742
        System.out.println("persona[1] = " + personas[1]); // persona[1] = test.Persona@6d06d69c
    }
}
