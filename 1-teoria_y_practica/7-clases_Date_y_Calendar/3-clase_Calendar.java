/*  ======================================================
    ================== LA CLASE CALENDAR =================
    ======================================================

    La clase Calendar es un poco particular. No es como la mayoría que podríamos crear, por 
    ejemplo, el objeto, la instancia con el operador new. Esta es una clase abstracta. Eso 
    quiere decir que no permite crear la instancia concreta con el operador new. Por lo tanto, 
    no podemos hacer un new de Calendar, porque es abstracta, por diseño es así. La instancia 
    la maneja la propia clase por debajo, invocando el método estático getInstance. Entonces, 
    con este método invocamos y creamos la instancia de Calendar. Por debajo este método 
    getInstance va a realizar el new.

    El método set nos permite indicar una fecha en específico.

    EJEMPLO 1
    ---------
*/
    import java.util.Calendar;
    import java.util.Date;

    public class EjemploJavaUtilCalendar {
        public static void main(String[] args) {

            Calendar calendario = Calendar.getInstance();
            System.out.println("calendario = " + calendario);

            // 'calendario' es un OBJETO y 'set' es un MÉTODO
            calendario.set(2019, Calendar.SEPTEMBER, 25, 18, 20, 10);
            Date fecha = calendario.getTime();
            System.out.println("calendario = " + fecha);
        }
    }
/* 

calendario = java.util.GregorianCalendar[time=1675699797787,areFieldsSet=true,areAllFieldsSet=true,lenient=true,
             zone=sun.util.calendar.ZoneInfo[id="America/Santiago",offset=-14400000,dstSavings=3600000,
             useDaylight=true,transitions=159,lastRule=java.util.SimpleTimeZone[id=America/Santiago,offset=-14400000,
             dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=8,startDay=2,startDayOfWeek=1,
             startTime=14400000,startTimeMode=2,endMode=3,endMonth=3,endDay=2,endDayOfWeek=1,endTime=10800000,
             endTimeMode=2]],firstDayOfWeek=2,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=1,WEEK_OF_YEAR=7,
             WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=37,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=1,
             HOUR_OF_DAY=13,MINUTE=9,SECOND=57,MILLISECOND=787,ZONE_OFFSET=-14400000,DST_OFFSET=3600000]
calendario = Wed Sep 25 18:20:10 CLST 2019 


    EJEMPLO 2
    ---------

    Una misma forma de obtener lo mismo que el ejemplo anterior. En este caso utilizamos la clase Calendar y 
    la constante FEBRUARY. La constante por estándar siempre comienzan con mayúscula, completamente mayúscula, 
    tal como lo vemos y palabra compuesta separada con guion. A diferencia de las demás variables de Java, las 
    variables común y corriente comienzan en minúscula y palabras compuestas se separan con mayúscula, pero no 
    con guion bajo.
*/
    import java.util.Calendar;
    import java.util.Date;

    public class EjemploJavaUtilCalendar {
        public static void main(String[] args) {

            Calendar calendario = Calendar.getInstance();
            System.out.println("calendario = " + calendario);

            // 'calendario' es un OBJETO y 'set' es un MÉTODO
            calendario.set(2019, Calendar.FEBRUARY, 25, 19, 20, 10);
            Date fecha = calendario.getTime();
            System.out.println("calendario = " + fecha);
        }
    }
/* 

calendario = java.util.GregorianCalendar[time=1675699797787,areFieldsSet=true,areAllFieldsSet=true,lenient=true,
             zone=sun.util.calendar.ZoneInfo[id="America/Santiago",offset=-14400000,dstSavings=3600000,
             useDaylight=true,transitions=159,lastRule=java.util.SimpleTimeZone[id=America/Santiago,offset=-14400000,
             dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=8,startDay=2,startDayOfWeek=1,
             startTime=14400000,startTimeMode=2,endMode=3,endMonth=3,endDay=2,endDayOfWeek=1,endTime=10800000,
             endTimeMode=2]],firstDayOfWeek=2,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=1,WEEK_OF_YEAR=7,
             WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=37,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=1,
             HOUR_OF_DAY=13,MINUTE=9,SECOND=57,MILLISECOND=787,ZONE_OFFSET=-14400000,DST_OFFSET=3600000]
calendario = Mon Feb 25 18:20:10 CLST 2019


    EJEMPLO 3
    ---------
*/
    import java.util.Calendar;
    import java.util.Date;
    import java.text.SimpleDateFormat;

    public class EjemploJavaUtilCalendar {
        public static void main(String[] args) {

            Calendar calendario = Calendar.getInstance();
            //System.out.println("calendario = " + calendario);

            // 'calendario' es un OBJETO y 'set' es un MÉTODO
            //calendario.set(2019, Calendar.FEBRUARY, 25, 19, 20, 10);
            calendario.set(Calendar.YEAR, 2020);
            calendario.set(Calendar.MONTH, Calendar.JULY); // (Calendar.MONTH, 6)
            calendario.set(Calendar.DAY_OF_MONTH, 25);
            calendario.set(Calendar.HOUR_OF_DAY, 21);
            calendario.set(Calendar.MINUTE, 20);
            calendario.set(Calendar.SECOND, 10);
            calendario.set(Calendar.MILLISECOND, 125);

            Date fecha = calendario.getTime();
            System.out.println("calendario = " + fecha);

            // Usando la clase SimpleDateFormat y el método Format:
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
            String fechaConFormato = formato.format(fecha);
            System.out.println("Fecha con formato = " + fechaConFormato);
        }
    }
/* 

calendario = Sat Jul 25 21:20:10 CLT 2020
Fecha con formato = 2020-07-25 21:20:10:125 


    EJEMPLO 4
    ---------

    Para asignar el formato AM y PM a la Hora: (No me apareció el a.m ni el p.m.)
*/
    import java.util.Calendar;
    import java.util.Date;
    import java.text.SimpleDateFormat;

    public class EjemploJavaUtilCalendar {
        public static void main(String[] args) {

            Calendar calendario = Calendar.getInstance();
            //System.out.println("calendario = " + calendario);

            // 'calendario' es un OBJETO y 'set' es un MÉTODO
            //calendario.set(2019, Calendar.FEBRUARY, 25, 19, 20, 10);
            calendario.set(Calendar.YEAR, 2020);
            calendario.set(Calendar.MONTH, Calendar.JULY); // (Calendar.MONTH, 6)
            calendario.set(Calendar.DAY_OF_MONTH, 25);
            //calendario.set(Calendar.HOUR_OF_DAY, 21);
            calendario.set(Calendar.HOUR, 7); // <--------- Coloco '7' y me retorna como '19'
            calendario.set(Calendar.AM_PM, Calendar.PM); // <--------- Si coloco '.AM' '7' me lo devuelve como '07'        
            calendario.set(Calendar.MINUTE, 20);
            calendario.set(Calendar.SECOND, 10);
            calendario.set(Calendar.MILLISECOND, 125);

            Date fecha = calendario.getTime();
            System.out.println("calendario = " + fecha);

            // Usando la clase SimpleDateFormat y el método Format:
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
            String fechaConFormato = formato.format(fecha);
            System.out.println("Fecha con formato = " + fechaConFormato);
        }
    }
/* 

calendario = Sat Jul 25 19:20:10 CLT 2020
Fecha con formato = 2020-07-25 19:20:10:125 

*/