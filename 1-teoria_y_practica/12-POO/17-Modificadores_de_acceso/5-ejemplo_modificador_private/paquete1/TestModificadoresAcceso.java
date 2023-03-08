package paquete1;

public class TestModificadoresAcceso {

    public static void main(String[] args) {
        
        // Utilizamos el constructor publico de la Clase1 para poder crear un Objeto
        Clase1 clase1 = new Clase1("Publico");

        clase1.setAtributoPrivado("Cambio valora tributo");

        System.out.println("atributoPrivado = " + clase1.getAtributoPrivado());
    }
/*
Constructor privado
Constructor publico
atributoPrivado = Cambio valora tributo
*/

}