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
        
        // Obtenemos la referencia de cada Objeto creado. Y nos aseguramos que son Objetos distintos.

        System.out.println("persona[0] = " + personas[0]); // persona[0] = Persona {nombre = Alfonso}, test.Persona@15db9742
        System.out.println("persona[1] = " + personas[1]); // persona[1] = Persona {nombre = Javiera}, test.Persona@6d06d69c

        
        // Iteramos los objetos
        for(int i = 0; i < personas.length; i++){
            System.out.println("personas[" + i + "] = " + personas[i]);
        }
/* 
        personas[0] = Persona {nombre = Alfonso}, test.Persona@15db9742
        personas[1] = Persona {nombre = Javiera}, test.Persona@6d06d69c 
*/   
    }
}