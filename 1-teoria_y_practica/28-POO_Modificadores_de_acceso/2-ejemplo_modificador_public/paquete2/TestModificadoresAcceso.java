package paquete2;

public class TestModificadoresAcceso {

    public static void main(String[] args) {
        
        Clase1 clase1 = new Clase1();

        System.out.println("clase1.atributoPublico = " + clase1.atributoPublico);

        clase1.metodoPublico();

    }
/* 
    Constructor publico
    clase1.atributoPublico = Valor atributo publico
    Metodo publico 
*/
}