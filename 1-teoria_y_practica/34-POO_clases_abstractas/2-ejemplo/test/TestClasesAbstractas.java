package test;

import dominio.*;

public class TestClasesAbstractas {
    public static void main(String[] args) {

        // Otra de las reglas de las Clases abstractas es que no podemos crear Objetos de una Clase 
        // marcada como abstracta.

        //FiguraGeometrica figura = new FiguraGeometrica(); ===========> Devuelve ERROR
        
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar(); // Se imprime un: Rectangulo
    }
   
}