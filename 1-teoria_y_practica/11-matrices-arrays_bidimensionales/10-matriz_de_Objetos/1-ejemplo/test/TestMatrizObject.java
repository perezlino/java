package test;

import dominio.Persona;

public class TestMatrizObject {
    
    public static void main(String[] args) {
        
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        personas[0][2] = new Persona("Alfonso");
        personas[1][0] = new Persona("Javiera");
        personas[1][1] = new Persona("Maria");
        personas[1][2] = new Persona("Tomas");        
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz[" + i + "]" + "[" + j + "] = " + matriz[i][j]);
            }
        }
/*
        matriz[0][0] = Persona {nombre = Juan}, test.Persona@15db9742
        matriz[0][1] = Persona {nombre = Karla}, test.Persona@6d06d69c
        matriz[0][2] = Persona {nombre = Alfonso}, test.Persona@7852e922
        matriz[1][0] = Persona {nombre = Javiera}, test.Persona@4e25154f
        matriz[1][1] = Persona {nombre = Maria}, test.Persona@70dea4e
        matriz[1][2] = Persona {nombre = Tomas}, test.Persona@5c647e05
*/      
    }           
}