package paquete1;

/* 
El modificador privado no funciona en Clases. No podemos definir una Clase como privada. 
*/

public class Clase1 {

    // Cuando trabajamos el modificador de acceso 'privado' en atributos, quiere decir que ya no se puede modificar 
    // este valor desde otras Clases, sin importar si la Clase se encuentra dentro del mismo paquete, si es una 
    // Clase hija o cualquier otra condición, no podemos modificar este atributo directamente desde otra Clase. 
    // Para ello recordemos que vimos el concepto de encapsulamiento, así que para poder acceder a este atributo, 
    // ya sea, para leerlo o para modificarlo, tenemos que agregar el método 'get' o 'set' para poder accederlo. 
    private String atributoPrivado = "Valor atributo privado";

    // El constructor privado lo que provoca es que no podamos crear Objetos de la Clase utilizando el constructor 
    // vacio. Así que este constructor privado solamente se va a poder utilizar dentro de esta misma Clase. 
    private Clase1 (){
        System.out.println("Constructor privado");
    }

    // Creamos un constructor publico, de lo contrario, no vamos a poder crear Objetos de esta Clase1.
    public Clase1(String argumento){

        // La unica forma de llamar al constructor privado
        this();
        System.out.println("Constructor publico");
    }

    // 
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivado(){
        return this.atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado){
        this.atributoPrivado = atributoPrivado;
    }
}
