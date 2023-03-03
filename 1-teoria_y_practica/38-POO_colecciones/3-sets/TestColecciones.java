package test;

import java.util.*;

//  Los 'sets' son similares a las listas, sin embargo, la coleccion de tipo 'set' no mantiene 
//  ningun orden. 

//  En los 'sets' no se pueden duplicar elementos.

public class TestColecciones {

    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        imprimir(miLista);
/* 
        elemento = Lunes
        elemento = Martes   
        elemento = Miercoles
        elemento = Jueves
        elemento = Viernes

        Mandamos a llamar el método 'add' y aquí vemos una de las ventajas de utilizar una interface padre 
        para las interfaces hijas, en este caso las interfaces hijas 'List' y 'Set', ambas utilizan el método 
        'add', pero este método no está definido en ninguna de estas interfaces, sino, que está definido en 
        la interface padre, en la interface 'Collection'. Así que la interface padre es la que define el 
        método 'add' y posteriormente las interfaces hijas 'Set' y 'List' heredan este método 'add' y 
        posteriormente las clases que implementan las interfaces deben agregar la implementación del método 
        'add'. Por lo tanto, tanto la clase 'HashSet', como la clase 'ArrayList', implementan el método 'add' 
        y por ello es que podemos observar el mismo método en ambas interfaces, tanto en la interface 'List' 
        vemos el método 'add' y en la interface 'Set' vemos el método 'add'. Y de esta forma es que el API de 
        Java pone en práctica el concepto de interfaces.         
        
        De igual manera este metodo 'add' puede recibir cualquier elemento del tipo 'Object', no solamente
        Objetos del tipo String.         */

        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");
        imprimir(miSet);
/* 
        elemento = Viernes
        elemento = Miercoles
        elemento = Martes
        elemento = Viernes
        elemento = Lunes
        elemento = Jueves
*/
    }

    public static void imprimir(Collection coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });

//       for(Object elemento: coleccion){
//           System.out.println("elemento = " + elemento);
//       }

    }

}