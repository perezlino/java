package test;

public class TestBloquesInicializacion {

    public static void main(String[] args) {
        
        Persona persona1  = new Persona();
        System.out.println("persona1 = " + persona1);

        Persona persona2  = new Persona();
        System.out.println("persona2 = " + persona2);
    }
/* 
    Ejecucion Bloque estatico  // Se ejecuta solo una vez
    Ejecucion Bloque no estatico
    Ejecucion del constructor
    persona1 = Persona{idPersona: 1}

    Ejecucion Bloque no estatico
    Ejecucion del constructor
    persona2 = Persona{idPersona: 2}
*/
    
}
