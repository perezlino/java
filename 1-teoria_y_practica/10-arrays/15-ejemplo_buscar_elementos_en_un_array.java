/*  ======================================================
    ============= BUSCAR ELEMENTOS EN UN ARRAY ===========
    ======================================================

    Vamos a tener un array de enteros y la idea es buscar un elemento, un número y si lo encuentra,
    debe mostrar la posición donde se encuentra este número, este elemento y si no se encuentra, notificar
    con un mensaje.


    UTILIZANDO WHILE
    ================
*/
    import java.util.Scanner;

    public class EjemploArreglosBuscarNumero {
        public static void main(String[] args) {

            int[] a = new int[10];

            a[0] = 20;
            a[1] = 15;
            a[2] = 9;
            a[3] = 25;
            a[4] = 30;
            a[5] = 35;
            a[6] = 18;
            a[7] = 36;
            a[8] = 29;
            a[9] = 36;


            // CODIGO PARA PEDIR NUMEROS POR TERMINAL

            // Scanner s = new Scanner(System.in);

            // for(int i = 0; i < a.length; i++){
            //     System.out.print("Ingrese un número: "); // Podemos colocarlo arriba también, es lo mismo
            //     a[i] = s.nextInt();
            // }

            // Nos pide por terminal el numero a buscar
            System.out.println("\r\nIngrese un número a buscar:");
            int num = s.nextInt();
/* 
            Ingrese un número a buscar:
            36                          <------------------ Ingresamos el 36
*/
            int i = 0;
/*          Mientras i < 10 && a[i] no sea igual a 36, aumenta en 1 a i
            Al encontrarlo por primera vez nos saca del while
            Llegamos a la posicion 7, donde a[7] = 36 y 36 == num, por tanto,
            nos saca del while. Vemos que también tenemos el valor 36 en la
            posicion 9, pero solo tomara la primera aparicion y luego nos 
            saca del bucle.

*/          int i = 0;
            while (i < a.length && a[i] != num) {
                i++;
                System.out.println(i);
            }
/* 
            1
            2
            3
            4
            5
            6
            7
*/
            // i == a.length ---> nos indica que si el indice i ha tomado todos los valores
            // de indice, quiere decir que llego hasta el final y no encontro nada.
            if(i == a.length){
                System.out.println("Número no encontrado");
            } else if(a[i] == num){
                System.out.println("Encontrado en la posición: " + i);
            }
/*          Encontrado en la posición: 7        */            
        }
    }
/* 

    UTILIZANDO FOR
    ==============
*/
import java.util.Scanner;

public class EjemploArreglosBuscarNumero {
    public static void main(String[] args) {

        int[] a = new int[10];

        a[0] = 20;
        a[1] = 15;
        a[2] = 9;
        a[3] = 25;
        a[4] = 30;
        a[5] = 35;
        a[6] = 18;
        a[7] = 36;
        a[8] = 29;
        a[9] = 48;


        // CODIGO PARA PEDIR NUMEROS POR TERMINAL

        // Scanner s = new Scanner(System.in);

        // for(int i = 0; i < a.length; i++){
        //     System.out.print("Ingrese un número: "); // Podemos colocarlo arriba también, es lo mismo
        //     a[i] = s.nextInt();
        // }

        // Nos pide por terminal el numero a buscar
        System.out.println("\r\nIngrese un número a buscar:");
        int num = s.nextInt();
/* 
        Ingrese un número a buscar:
        36                          <------------------ Ingresamos el 36
*/
        int i = 0;
        // i = 0 ; i < 10 && a[i] no sea igual a 36 ; i++
/*        Al encontrarlo por primera vez nos saca del while
          Llegamos a la posicion 7, donde a[7] = 36 y 36 == num, por tanto,
          el for ya no se cumple. Vemos que también tenemos el valor 36 en la
          posicion 9, pero solo tomara la primera aparicion y luego nos 
          saca del for.   */
          for(; i < a.length && a[i] != num; i++){}
/* 
        0
        1
        2
        3
        4
        5
        6
*/
        // i == a.length ---> nos indica que si el indice i ha tomado todos los valores
        // de indice, quiere decir que llego hasta el final y no encontro nada.
        if(i == a.length){
            System.out.println("Número no encontrado");
        } else if(a[i] == num){
            System.out.println("Encontrado en la posición: " + i);
        }
/*          Encontrado en la posición: 7        */                  
    }
}
/*

    Vamos a tener un array de strings y la idea es buscar un elemento, un string y si lo encuentra,
    debe mostrar la posición donde se encuentra este string, este elemento y si no se encuentra, notificar
    con un mensaje.


    UTILIZANDO FOR
    ==============    
 */
    import java.util.Scanner;

    public class EjemploArreglosBuscarString {
        public static void main(String[] args) {

            String[] a = new String[4];

            a[0] = "Alfonso";
            a[1] = "Andres";
            a[2] = "Tomas";
            a[3] = "Javiera";

            // CODIGO PARA PEDIR NUMEROS POR TERMINAL

            // Scanner s = new Scanner(System.in);

            // for(int i = 0; i < a.length; i++){
            //     System.out.print("Ingrese un nombre: ");
            //     a[i] = s.next();
            // }

            System.out.println("\r\nIngrese un nombre a buscar:");
            String nombre = s.next();
/* 
            Ingrese un nombre a buscar:
            Javiera                          <------------------ Ingresamos 'Javiera'
*/
            int i = 0;
            for(; i < a.length && !a[i].equalsIgnoreCase(nombre); i++){}
/* 
        0
        1
        2
*/
            if(i == a.length){
                System.out.println("Número no encontrado");
            } else if(a[i].toLowerCase().compareTo(nombre.toLowerCase()) == 0){
                System.out.println("Encontrado en la posición: " + i);
            }
/*          Encontrado en la posición: 3        */                 
        }
    }