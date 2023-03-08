package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {    
  
        // Indicamos el tipo 
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");

        imprimir(miSet)
/* 
        elemento = Viernes
        elemento = Miercoles
        elemento = Martes
        elemento = Viernes
        elemento = Lunes
        elemento = Jueves
*/

        Map miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        

        String elemento = (String) miMapa.get("valor1");
        System.out.println("elemento = " + elemento);  
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    
    // Recordemos que ahora ya recibe una coleccion de tipo 'String' y debido a que 'Collection' es la interface 
    // padre de la interface 'Set' podemos volver a utilizar el mismo codigo. 

    public static void imprimir(Collection<String> coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });

//        for(Object elemento: coleccion){
//            System.out.println("elemento = " + elemento);
//        }
    }

}