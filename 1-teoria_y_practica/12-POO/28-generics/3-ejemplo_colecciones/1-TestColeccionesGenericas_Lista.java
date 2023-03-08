package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        // List<String> miLista = new ArrayList<String> <---- Tambien podriamos utilizarlo asi
        List<String> miLista = new ArrayList<>();

        // De esta manera cuando llamamos al metodo 'add', en lugar de proporcionar objetos de tipo 'Object'
        // sino que, ahora va almacenar elementos de tipo 'String' ----> Antes: add(Object e) ---> Ahora: add(String e).
        // Esto traera varias ventajas para evitar problemas, ya que, un tipo Object es demasiado generico, asi que
        // lo ideal es que indiquemos el tipo que realmente vamos a trabajar en nuestra Lista, ya sea, un tipo
        // interface o una Clase padre y posteriormente agregar nuestros tipos de la Clase indicada o de Clases que
        // implementen la interface o Clases hijas. 

//      miLista.add(1); <------------- Error!
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");

        // No solamente tenemos validacion al agregar elementos, sino, tambien al recuperarlos. Ya no tenemos que hacer
        // la conversion de 'Object' al tipo que deseemos. Podemos recuperar directamente un elemento del tipo 'String'.

        String elemento = miLista.get(0);
        System.out.println("elemento = " + elemento);  // elemento = Lunes        

        imprimir(miLista);
/*
        elemento = Lunes
        elemento = Martes   
        elemento = Miercoles
        elemento = Jueves   
        elemento = Viernes 
*/        

    }
    
    // Si queremos trabajar 'solo' con elementos de tipo 'String' tambien podemos especificarlo.
    // Especificar que no trabaje con elementos de tipo 'Object', si no, unicamente con colecciones que
    // soporte elementos de tipo 'String'.

    public static void imprimir(Collection<String> coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });

//        for(Object elemento: coleccion){
//            System.out.println("elemento = " + elemento);
//        }
    }

}