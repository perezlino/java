package directorio;

public class PalabraThis{

    public static void main(String[] args) {

        // 1. Al instanciar el Objeto 'persona' se manda a llamar al constructor 'Persona'
        Persona persona = new Persona("Alfonso","Perez"); 
        System.out.println("persona.nombre = " + persona.nombre); // 4. Esto es lo tercero en imprimirse
        System.out.println("persona.apellido = " + persona.apellido); // 5. Esto es lo cuarto en imprimirse
    }
}

class Persona {

    String nombre;
    String apellido;

    Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto 'persona' usando 'this': " + this); // 2. Esto es lo 1ero en imprimirse
        // Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this); // 3. Esto es lo segundo en ejecutarse
    }
}

class Imprimir {

    public void imprimir(Persona persona){
        System.out.println("´persona' desde 'Imprimir': " + persona);
        System.out.println("Impresion del Objeto actual (this): " + this); // Apunta al Objeto del tipo 'Imprimir'
    }                                                                      // creado en el constructor 'Persona'
}
/* 
Objeto 'persona' usando 'this': test.Persona@15db9742
´persona' desde 'Imprimir': test.Persona@15db9742
Impresion del Objeto actual (this): test.Imprimir@6d06d69c
persona.nombre = Alfonso
persona.apellido = Perez
*/  