package test;

import java.util.*;

//  En las 'listas' si se puden duplicar los elementos.

public class TestColecciones {

    public static void main(String[] args) {

        // - 'ArrayList' es la Clase que implementa la Interface 'List'
        // -  Un 'List' es similar a un 'Array', pero una de sus ventajas es que puede crecer
        //    dinamicamente. No debemos indicar la cantidad de elementos con el que vamos a 
        //    inicializar esta lista y dinamicamente podemos ir agregando mas elementos a esta lista.
        // -  Ademas una Lista mantiene el orden de los elementos conforme se van agregando.
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");

        //  Debido a que en este caso, la lista tiene elementos del tipo 'Object', entonces el elemento que
        //  vamos a recuperar tambien es del tipo 'Object'
        for (Object elemento : miLista) {
            System.out.println("elemento = " + elemento);
        }
/* 
        elemento = Lunes
        elemento = Martes   
        elemento = Miercoles
        elemento = Jueves   
        elemento = Viernes 
*/

        // Funcion del tipo 'Lambda'
        // De manera automatica, la variable 'elemento' va a ser del tipo del que sea la Coleccion.
        // En esta coleccion no se está indicando el tipo, por lo tanto, todos los elementos que maneja de
        // manera interna son elementos del tipo 'Object'.
        miLista.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
/* 
        elemento = Lunes
        elemento = Martes   
        elemento = Miercoles
        elemento = Jueves   
        elemento = Viernes 
*/

    }
}