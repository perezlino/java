package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    public static void main(String[] args) {

    //  LEER ARCHIVO    
    //  var nombreArchivo = "c:\\ruta\\prueba.txt"  <--- En Windows
        var nombreArchivo = "prueba.txt";
        crearArchivo(nombreArchivo);

    //  ESCRIBIR EN EL ARCHIVO
    //  Con este metodo, cada vez que llamemos al metodo con un texto nuevo, este sobreescribirá
    //  al anterior.
    //  var nombreArchivo = "c:\\ruta\\prueba.txt"  <--- En Windows
        var nombreArchivo = "prueba.txt";  //  <--------------------------- Repeti la variable para efectos del ejemplo
        escribirArchivo(nombreArchivo, "Hola desde Java");
        escribirArchivo(nombreArchivo, "Adios");

    //  Para que no suceda lo anterior, utilizamos el metodo 'AnexarArchivo'
    //  Para que no se pierda la informacion que enviamos previamente.
    //  var nombreArchivo = "c:\\ruta\\prueba.txt"  <--- En Windows
        var nombreArchivo = "prueba.txt";  //  <--------------------------- Repeti la variable para efectos del ejemplo      
        anexarArchivo(nombreArchivo, "Hola desde Java");
        anexarArchivo(nombreArchivo, "adios");

    //  LEER ARCHIVO
        leerArchivo(nombreArchivo);
    }
}