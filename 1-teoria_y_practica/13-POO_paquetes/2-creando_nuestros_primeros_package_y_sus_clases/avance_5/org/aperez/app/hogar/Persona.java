package org.aperez.app.hogar;

public class Persona {

    // Pero también 'Default' se aplica a atributos y métodos. Quitemos el 'public'
    String nombre; // Ya no podremos acceder a el desde otros paquetes. Sucede lo mismo que la clase 'Gato'
    public String apellido; // 'apellido' si podemos utilizarlo desde otros paquetes 
    
}
