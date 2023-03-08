package test;

import java.util.*;

/*      Si existiese una duplicacion del valor de una 'clave', se tomara el ultimo valor para esa clave, 
        es decir, 'valor3 -> Alfonso' será el valor que quedará.

        Map miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario"); <------
        miMapa.put("valor3", "Alfonso"); <------

*/

public class TestColecciones {

    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
//        imprimir(miLista);

        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");
//        imprimir(miSet);

//      La interface 'Map' en lugar de 'add' utiliza el metodo 'put'. De igual manera, este meetodo
//      recibe como argumentos dos valores del tipo 'Object', ya sea, para el valor de 'key' y el 'value'.
 
        Map miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        
        //  Este metodo obtenemos el valor asociado a una clave.
        //  El metodo 'get' devuelve un valor del tipo 'Object', pero como 'elemento' es del tipo 'String'
        //  debemos forzar su casteo al tipo 'String'.

        String elemento = (String) miMapa.get("valor1");
        System.out.println("elemento = " + elemento);  // elemento = Juan
        
        imprimir(miMapa.keySet());
/*
        elemento = valor1
        elemento = valor3
        elemento = valor2
*/
        imprimir(miMapa.values());
/*
        elemento = Juan
        elemento = Rosario
        elemento = Karla
*/
    }
    
    public static void imprimir(Collection coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });

//        for(Object elemento: coleccion){
//            System.out.println("elemento = " + elemento);
//        }
    }

}