package test;

import dominio.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5, 6, 8, 9};
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }

        // -------------------------------------------------------------------------------------
        
        Persona personas[] = {new Persona("Juan"), new Persona("Karla"), new Persona("Agustin")};
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }

/*      También podriamos hacerlo asi:

        Persona personas[] = new Persona[3];

        personas[0] = new Persona("Alfonso");
        personas[1] = new Persona("Javiera");
        personas[2] = new Persona("Maria");

        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }        
*/
/*
edad = 5
edad = 6
edad = 8
edad = 9
persona = Persona{nombre=Juan}   
persona = Persona{nombre=Karla}  
persona = Persona{nombre=Agustin}
*/

    }  
}