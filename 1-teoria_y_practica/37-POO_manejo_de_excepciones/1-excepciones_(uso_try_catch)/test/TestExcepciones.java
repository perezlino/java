package test;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = 10/0;
        // El error que nos devuelve esta division por cero es de la Clase 'java.lang.ArithmeticException'
        // Por tanto 'Exception' es el Generico (Clase padre) a todos los errores 'Exception'
        // La letra 'e' captura el error. Puede ser cualquier letra o texto.
        }catch(Exception e){
            System.out.println("Ocurrió un error: ");
            e.printStackTrace(System.out);
        }    
        System.out.println("resultado = " + resultado);
    }
}