/*  ======================================================
    =================== CALCULAR EDAD ====================
    ======================================================

    Calcular edad ingresando la fecha de nacimiento de una persona.

    Para esta tarea se pide ingresar una fecha de nacimiento en formato String, convertirla a una fecha 
    del tipo java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.

    Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos más adelante, también 
    se pueden apoyar de google que hay varios ejemplos.

*/
    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.util.Date;
    import java.util.Scanner;
    import java.text.DateFormat; // <----- Existe un DateFormat aparte de SimpleDateFormat


    public class CalcularEdad {
        public static void main(String[] args) {

            /* "SimpleDateFormat" es una clase
            "Date" es una clase
            "df" es un objeto de la clase "SimpleDateFormat"  
            "parse" es un método y lo utilizamos en el objeto 'df'  */            

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese una fecha de nacimiento con formato yyyy-MM-dd:"); // 1986-03-06
            String fechaStr = scanner.next();

            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

            try {
                Date fechaNacimiento = df.parse(fechaStr);
                System.out.println("fechaNacimiento = " + fechaNacimiento); // fechaNacimiento = Thu Mar 06 00:00:00 CLST 1986
                System.out.println("df = " + df.format(fechaNacimiento)); // df = 1986-03-06
                
                Date fechaActual = new Date();
                System.out.println("fechaActual = " + fechaActual); // fechaActual = Mon Feb 06 14:45:02 CLST 2023

                // creamos un patron de fecha numerico con el año, mes y dia
                df = new SimpleDateFormat("yyyyMMdd");

                // luego convertimos ambas fechas, la actual y la fecha de nacimiento (que estan en formato String)
                // en enteros que contiene el año, mes y dia
                int desde = Integer.parseInt(df.format(fechaNacimiento));
                System.out.println("desde = " + desde); // desde = 19860306
                int hasta = Integer.parseInt(df.format(fechaActual));
                System.out.println("hasta = " + hasta); // hasta = 20230206

                // Luego restamos ambas fechas y dividimos en 10000 para quitar decimales y
                // dejar la fecha en decenas o centenas
                int edad = (hasta - desde) / 10000;
                System.out.println("La edad es: " + edad); // La edad es: 36


            } catch (ParseException e) {
                //e.printStackTrace();
                System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
                System.err.println("El formato debe ser 'yyyy-MM-dd'");
                System.exit(1);
                //main(args);
            }
        }
    }