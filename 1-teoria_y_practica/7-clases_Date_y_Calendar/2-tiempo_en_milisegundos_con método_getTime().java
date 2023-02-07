/*  ======================================================
    ===== TIEMPO EN MILISEGUNDOS CON METODO getTime() ====
    ======================================================

*/
    import java.util.Date;

    public class EjemploJavaUtilDate {
        public static void main(String[] args) {
            
            Date fecha = new Date();
            System.out.println("fecha = " + fecha);

            long j = 0;
            for(int i = 0; i < 100; i++){
                j +=i; // j = j + i
            }
            System.out.println("j = " + j);

            Date fecha2 = new Date();
            long tiempoFinal = fecha2.getTime() - fecha.getTime();
            System.out.println("Tiempo transcurrido en el for = " + tiempoFinal + " milisegundos");
        }
    }
/* 

fecha = Mon Feb 06 12:49:50 CLST 2023
j = 4950
Tiempo transcurrido en el for = 41 milisegundos 

*/