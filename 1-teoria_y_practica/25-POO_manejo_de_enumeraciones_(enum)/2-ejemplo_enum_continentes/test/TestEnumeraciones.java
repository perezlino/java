package test;

import enumeracion.Continentes;

public class TestEnumeraciones{

    public static void main(String[] args) {
        
        System.out.println("Continente n°4 : " + Continentes.AMERICA);

        System.out.println("Nro. Paises en el 4to Continente :" + Continentes.AMERICA.getPaises());
    }
}    