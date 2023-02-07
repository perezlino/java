/*  ======================================================
    ========= LA CLASE DATE Y FORMATOS DE FECHAS =========
    ======================================================

    "java.util" es el package, donde se guarda, donde se contiene la clase 'date'.

*/
    import java.text.SimpleDateFormat;
    import java.util.Date;

    public class EjemploJavaUtilDate {
        public static void main(String[] args) {
            
            Date fecha = new Date();
            System.out.println("fecha = " + fecha);

            /* Pero este formato se puede customizar, por ejemplo, usando la clase
               'SimpleDateFormat'  */

            SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");
            String fechaStr = df.format(fecha);
            System.out.println("fechaStr = " + fechaStr);
        }
    }
/* 

fecha = Mon Feb 06 12:33:14 CLST 2023
fechaStr = lunes 06 de febrero, 2023 

*/