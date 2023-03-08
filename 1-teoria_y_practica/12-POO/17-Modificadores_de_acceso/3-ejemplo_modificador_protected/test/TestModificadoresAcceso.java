package test;

import paquete2.ClaseHija;

public class TestModificadoresAcceso {

    public static void main(String[] args) {
        
/*      Nos devuelve error, a menos, que nos encontremos en el mismo paquete que Clase1
        -------------------------------------------------------------------------------

        Clase1 clase1 = new Clase1();

        System.out.println("clase1.atributoProtected = " + clase1.atributoProtected);

        clase1.metodoProtected();
/* 
Constructor protected
clase1.atributoPublico = Valor atributo protected
Metodo protected
*/
        // Por medio de la ClaseHija podemos obtener atributos y metodos de Clase1, si que es que
        // la Clase main se encuentra en otro paquete.
        ClaseHija claseHija1 = new ClaseHija();

        System.out.println("ClaseHija = " + claseHija1);

    }
/*
Constructor protected
ClaseHija.atributoProtected = Modificacion atributo protected
Metodo protected
ClaseHija = test.paquete2.ClaseHija@15db9742
*/

}