// El metodo 'main' basicamente lo que hace es permitirnos ejecutar nuestro programa

public class PruebaPersona {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        // También podriamos crear el objeto de la siguiente manera:
        
        // Persona persona1;
        // persona1 = new Persona();

        persona1.nombre = "Alfonso";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();

        persona2.nombre = "Maria Javiera";
        persona2.apellido = "Zarate";
        persona2.desplegarInformacion();        



    }
}
/* 
Nombre: Alfonso
Apellido: Perez
Nombre: Maria Javiera
Apellido: Zarate
*/
