/*  =====================================================================
    ======= SISTEMAS NUMERICOS Y ENTRADAS DE DATOS DESDE TERMINAL =======
    =====================================================================


    System.out 
    ==========
    Se refiere a la salida, imprimir datos en la consola.

    System.in 
    =========
    Se refiere a recibir datos del usuario de la consola, la entrada del terminal (de la consola).

    nextLine
    ========
    El método nextLine se utiliza para obtener la línea del terminal que el usuario ingresó, pero del 
    tipo es String. Escanea la línea actual que el usuario ingrese. Entonces, el nextLine lo que hace 
    es dejar esperando la consola (el terminal) hasta que el usuario ingresa un número o alguna información, 
    lo que sea. Una vez que la ingresa se asigna a la variable numeroStr. Como esperamos que sea un número, 
    lo tenemos que convertir con el parseInt y manejamos el error.


    Modelo A
    ========
*/
    import java.util.Scanner;

    public class SistemasNumericosEntradaScanner {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un número entero:");
            String numeroStr = scanner.nextLine();
            int numeroDecimal = 0;
            try {
                numeroDecimal = Integer.parseInt(numeroStr);
            } catch (NumberFormatException e){
                System.out.println("Error debe ingresar un número entero!");
                main(args);
                System.exit(0);
            }

            System.out.println("numeroDecimal = " + numeroDecimal);

            String resultadoBinario = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
            String resultadoOctal = "Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
            String resultadoHex = "Numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
            
            String mensaje = resultadoBinario;
            mensaje += "\n" + resultadoOctal;
            mensaje += "\n" + resultadoHex;

            System.out.println(mensaje);
        }
    }
/* Esto nos devuelve el terminal:

Ingrese un número entero:
50                          <---- Ingresamos este numero por la terminal

numeroDecimal = 50
Numero binario de 50 = 110010 
Numero octal de 50 = 62          
Numero hexadecimal de 50 = 32 


    Modelo B
    ========

    En este modelo no es necesario convertir utilizando Integer.parseInt. Por qué?,  porque otra forma 
    mucho mejor es obtener directamente el entero desde el escáner. Si, el escáner se encarga de obtener 
    la línea y convertirla a entero de forma automática. Entonces en vez de utilizar nextLine, usamos 
    nextInt. Una línea, pero la convierte automáticamente y así nos ahorramos código, es decir, automatizamos. 
    El único tema que si ingresamos, algo que no sea un número, va a lanzar una excepción InputMismatchException. 
    Ya no es del tipo NumberFormatException, es otro tipo excepción.
*/
    import java.util.InputMismatchException;
    import java.util.Scanner;

    public class SistemasNumericosEntradaScanner {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un número entero:");
            // String numeroStr = scanner.nextLine();
            int numeroDecimal = 0;
            try {
                numeroDecimal = scanner.nextInt();// Integer.parseInt(numeroStr);
            } catch (InputMismatchException e){
                System.out.println("Error debe ingresar un número entero!");
                main(args);
                System.exit(0);
            }

            System.out.println("numeroDecimal = " + numeroDecimal);

            String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
            String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
            String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
            
            String mensaje = resultadoBinario;
            mensaje += "\n" + resultadoOctal;
            mensaje += "\n" + resultadoHex;

            System.out.println(mensaje);
        }
    }
/*
Si ejecutamos, donde primero intentaremos ingresar un string y luego un número:

Ingrese un número entero:
hola                          <---- Ingresamos este texto por la terminal

Error debe ingresar un número entero!
Ingrese un número entero:
50                          <---- Ingresamos este numero por la terminal

numeroDecimal = 50
Numero binario de 50 = 110010 
Numero octal de 50 = 62          
Numero hexadecimal de 50 = 32
*/