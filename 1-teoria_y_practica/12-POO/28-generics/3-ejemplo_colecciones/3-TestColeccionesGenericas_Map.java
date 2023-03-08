package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {    
  
        Map<String,String> miMapa = new HashMap<>();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        
        // Ya no tenemos que realizar la conversion de tipo
        String elementoMapa = miMapa.get("valor1");
        System.out.println("elementoMapa = " + elementoMapa);  // elementoMapa = Juan
        
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
    
    // Se mantiene el tipo 'Collection'. No se explico por qué. Pero funciona y devuelve un resultado correcto.
    // Recordar que 'Map' es la interface padre.

    public static void imprimir(Collection<String> coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });

//        for(String elemento: coleccion){
//            System.out.println("elemento = " + elemento);
//        }
    }

}