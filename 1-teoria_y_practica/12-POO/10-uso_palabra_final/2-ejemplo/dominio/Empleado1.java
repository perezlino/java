package dominio;

public class Empleado1 extends Persona1{ // <=== Se genera un ERROR porque 
                                       //      la Clase 'Persona' fue declarada
                                       //      como 'final', por lo que, no puede
                                       //      tener Clases hijas.
    
}
