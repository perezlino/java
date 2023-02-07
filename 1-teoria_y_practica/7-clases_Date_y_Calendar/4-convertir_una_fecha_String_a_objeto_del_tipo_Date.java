/*  ======================================================
    = CONVERTIR UNA FECHA STRING A OBJETO DEL TIPO DATE ==
    ======================================================

    Normalmente el "método parse()" recibe un string como entrada, "extrae" la información necesaria 
    de él y lo convierte en un objeto de la clase que lo llama. Por ejemplo, recibe un string y devuelve 
    la fecha que se "esconde" en este string.

    El método parse nos pide actuar junto al TRY-CATCH, por tanto, debemos activarlo.


    EJEMPLO 1
    ---------
*/
    import java.text.SimpleDateFormat;
    import java.util.Date;

    public class EjemploJavaUtilDateParse {
        public static void main(String[] args) {

            /* "SimpleDateFormat" es una clase
               "Date" es una clase
               "df" es un objeto de la clase "SimpleDateFormat"  */

            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

            Date fecha = new Date();
            System.out.println("fecha = " + fecha);
            System.out.println("fecha con formato = " + df.format(fecha));
        }
    }
/* 

fecha = Mon Feb 06 13:47:49 CLST 2023
fecha con formato = 2023-02-06 


    EJEMPLO 2
    ---------

    Date fecha = df.parse(fechaIngresada)

    La fecha ingresada en el objeto "fecha" debe ser ingresada por medio de un cuadro de mensaje. Y esta 
    fecha debe mantener el formato que nos otorga el objeto 'df'. Si ingresamos otro tipo de fecha, ya sea, 
    con / o un texto como 'hola', se genera un ERROR y por ese motivo "parse" nos pedía un TRY-CATCH.
*/
    import java.text.SimpleDateFormat;
    import java.util.Date;
    import java.text.ParseException;
    import javax.swing.*;

    public class EjemploJavaUtilDateParse {
        public static void main(String[] args) {

            /* "SimpleDateFormat" es una clase
            "Date" es una clase
            "df" es un objeto de la clase "SimpleDateFormat"  
            "parse" es un método y lo utilizamos en el objeto 'df'  */

            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

            String fechaIngresada = JOptionPane.showInputDialog("Ingrese fecha: "); // 2023-02-06 

            try{
                Date fecha = new Date();
                fecha = df.parse(fechaIngresada);
                System.out.println("fecha = " + fecha);
                System.out.println("fecha con formato = " + df.format(fecha));
            } catch (ParseException e) {
                throw new RunTimeException(e);
            }

        }
    }
/* 

fecha = Mon Feb 06 00:00:00 CLST 2023
fecha con formato = 2023-02-06 

*/
    public class EjemploJavaUtilDateParse {
        public static void main(String[] args) {

            /* "SimpleDateFormat" es una clase
            "Date" es una clase
            "df" es un objeto de la clase "SimpleDateFormat"  
            "parse" es un método y lo utilizamos en el objeto 'df'  */

            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

            String fechaIngresada = JOptionPane.showInputDialog("Ingrese fecha: "); // 2023-02-06 

            try{
                Date fecha = df.parse(fechaIngresada); // <------ Modificado, obtengo el mismo resultado anterior
                System.out.println("fecha = " + fecha);
                System.out.println("fecha con formato = " + df.format(fecha));
            } catch (ParseException e) {
                throw new RunTimeException(e);
            }

        }
    }
/* 

fecha = Mon Feb 06 00:00:00 CLST 2023
fecha con formato = 2023-02-06 

*/
    public class EjemploJavaUtilDateParse {
        public static void main(String[] args) {

            /* "SimpleDateFormat" es una clase
            "Date" es una clase
            "df" es un objeto de la clase "SimpleDateFormat"  
            "parse" es un método y lo utilizamos en el objeto 'df'  */

            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

            String fechaIngresada = JOptionPane.showInputDialog("Ingrese fecha: "); // 2023/02/06 (con barra diagonal)

            try{
                Date fecha = df.parse(fechaIngresada);
                System.out.println("fecha = " + fecha);
                System.out.println("fecha con formato = " + df.format(fecha));
            } catch (ParseException e) {
                System.out.println("Error"); // <------ Modifique esto
            }

        }
    }
/* 

Error

*/