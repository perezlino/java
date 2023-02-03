/*  ======================================================
    ======= METODOS IMPORTANTES DEL OBJETO STRING ========
    ======================================================

*/
    public class EjemploStringExtensionArchivo {
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
/*

Cantidad de caracteres del valor de 'archivo' = 10
Capturar la extensión del archivo = png
Cantidad de caracteres del valor de 'archivo' = 14
Capturar la extensión del archivo = jpeg

*/
