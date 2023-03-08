package test;

import enumeracion.Dias;

public class TestEnumeraciones{

    public static void main(String[] args) {
        
        // Para poder acceder a los elementos de la Enumeracion, es como si fuera un 'atributo'. Pero
        // recordemos que ese 'atributo' es 'estatico', 'publico' y 'final'. Asi que lo vamos a manejar
        // como si fuera un 'atributo estatico', de hecho, eso es.

        System.out.println("Dia 1 de la semana: " + Dias.LUNES); // Dia 1 de la semana: LUNES

        indicarDiaSemana(Dias.LUNES);

    }

    private static void indicarDiaSemana(Dias dias){

        switch{dias}{

            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break; 
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;                                                                                               
        }
    }



}