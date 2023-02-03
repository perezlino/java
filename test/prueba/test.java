package test.prueba;

public class test {

    public static void main(String[] args) {
            
        String archivo = "imagen.png";
        System.out.println("Cantidad de caracteres del valor de 'archivo' = " + archivo.length());
        System.out.println("Capturar la extensión del archivo = " + archivo.substring(archivo.indexOf(".") + 1));

        String foto = "imagen.hd.jpeg";
        int i = foto.lastIndexOf(".");
        System.out.println("Cantidad de caracteres del valor de 'archivo' = " + foto.length());
        System.out.println("Capturar la extensión del archivo = " + foto.substring(i + 1));
    }
}