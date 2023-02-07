/*  ======================================================
    =================== COMPARAR FECHAS ==================
    ======================================================


    EJEMPLO 1
    ---------

    Utilizamos los métodos 'after' y 'before':

*/
    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.util.Date;
    import java.util.Scanner;

    public class EjemploJavaUtilDateParse {
        public static void main(String[] args) {

            /* "SimpleDateFormat" es una clase
            "Date" es una clase
            "df" es un objeto de la clase "SimpleDateFormat"  
            "parse" es un método y lo utilizamos en el objeto 'df'  */            

            Scanner s = new Scanner(System.in);
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

            System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd'"); // 2022-01-01
            try {
                Date fecha = df.parse(s.next());
                System.out.println("fecha = " + fecha); // fecha = Sat Jan 01 00:00:00 CLST 2022
                System.out.println("df = " + df.format(fecha)); // df = 2022-01-01
                
                Date fecha2 = new Date();
                System.out.println("fecha2 = " + fecha2); // fecha2 = Mon Feb 06 14:21:43 CLST 2023

                if(fecha.after(fecha2)){
                    System.out.println("fecha1 (del usuario) es después que fecha2 (actual)");
                } else if(fecha.before(fecha2)){
                    System.out.println("fecha es anterior que fecha2"); // fecha es anterior que fecha2
                } else if(fecha.equals(fecha2)){
                    System.out.println("fecha es igual a fecha2");
                }

            } catch (ParseException e) {
                //e.printStackTrace();
                System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
                System.err.println("El formato debe ser 'yyyy-MM-dd'");
                System.exit(1);
                //main(args);
            }
        }
    }
/* 


    EJEMPLO 2
    ---------

    Utilizando "compareTo". Este método devuelve un entero y si es mayor a 0 es porque el primer objeto 
    es mayor al segundo, siendo en este caso, fecha es 'después' de la fecha2.
*/    
    public class EjemploJavaUtilDateParse {
        public static void main(String[] args) {

            /* "SimpleDateFormat" es una clase
            "Date" es una clase
            "df" es un objeto de la clase "SimpleDateFormat"  
            "parse" es un método y lo utilizamos en el objeto 'df'  */            

            Scanner s = new Scanner(System.in);
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

            System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd'"); // 2022-01-01
            try {
                Date fecha = df.parse(s.next());
                System.out.println("fecha = " + fecha); // fecha = Sat Jan 01 00:00:00 CLST 2022
                System.out.println("df = " + df.format(fecha)); // df = 2022-01-01
                
                Date fecha2 = new Date();
                System.out.println("fecha2 = " + fecha2); // fecha2 = Mon Feb 06 14:21:43 CLST 2023

                if(fecha.compareTo(fecha2) > 0){
                    System.out.println("fecha1 (del usuario) es después que fecha2 (actual)");
                } else if(fecha.compareTo(fecha2) < 0){
                    System.out.println("fecha es anterior que fecha2"); // fecha es anterior que fecha2
                } else if(fecha.compareTo(fecha2) == 0){
                    System.out.println("fecha es igual a fecha2");
                }
    
            } catch (ParseException e) {
                //e.printStackTrace();
                System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
                System.err.println("El formato debe ser 'yyyy-MM-dd'");
                System.exit(1);
                //main(args);
            }
        }
    }