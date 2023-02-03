/*  =====================================================================
    == SISTEMAS NUMERICOS Y ENTRADAS DE DATOS DESDE VENTANA DE DIALOGO ==
    =====================================================================


    Modelo A
    ========

    De esta manera podemos ingresar un valor por medio de un caja de dialogo que se abrirá:

*/
    import javax.swing.*;

    public class SistemasNumericos {
        public static void main(String[] args) {

            String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
            int numeroDecimal = Integer.parseInt(numeroStr); //Convertimos 'numeroStr' a integer
            // En Java se puede concatenar texto con números, no asi en Python.
            System.out.println("numeroDecimal = " + numeroDecimal);
            
            String mensaje = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
            mensaje += "Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
            mensaje += "Numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
/* Esto nos devuelve la caja de dialogo que se abrirá:

|--------------------------|
|           INPUT          |
|--------------------------| 
| Ingrese un número entero |
|--------------------------|                          
|           50             | <------------------------------- Ingresamos este numero
|--------------------------|

Luego, la caja de dialogo nos devuelve lo siguiente:

|-----------------------------------------------------------------------------------|
|                                       MENSAJE                                     |
|-----------------------------------------------------------------------------------| 
| Numero binario de 50 = 110010Numero octal de 50 = 62Numero hexadecimal de 50 = 32 |
|-----------------------------------------------------------------------------------|                       
|                                        OK                                         |
|-----------------------------------------------------------------------------------|


    Ahora podemos aplicar saltos de línea al mensaje:
*/
    import javax.swing.*;

    public class SistemasNumericos {
        public static void main(String[] args) {

            String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
            int numeroDecimal = Integer.parseInt(numeroStr); //Convertimos 'numeroStr' a integer
            // En Java se puede concatenar texto con números, no asi en Python.
            System.out.println("numeroDecimal = " + numeroDecimal);
            
            String mensaje = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
            mensaje += "\nnumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
            mensaje += "\nnumero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
/* Esto nos devuelve la caja de dialogo que se abrirá:

|--------------------------|
|           INPUT          |
|--------------------------| 
| Ingrese un número entero |
|--------------------------|                          
|           50             | <------------------------------- Ingresamos este numero
|--------------------------|

Luego, la caja de dialogo nos devuelve lo siguiente:

|-------------------------------|
|             MENSAJE           |
|-------------------------------| 
| Numero binario de 50 = 110010 |
| Numero octal de 50 = 62       |    
| Numero hexadecimal de 50 = 32 |
|-------------------------------|                      
|               OK              |
|-------------------------------|


    Modelo B
    ========
    */
    import javax.swing.*;

    public class SistemasNumericos {
        public static void main(String[] args) {

            String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
            int numeroDecimal = Integer.parseInt(numeroStr); //Convertimos 'numeroStr' a integer
            // En Java se puede concatenar texto con números, no asi en Python.
            System.out.println("numeroDecimal = " + numeroDecimal);
            
            String resultadoBinario = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
            System.out.println(resultadoBinario);

            String resultadoOctal = "Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
            System.out.println(resultadoOctal);

            String resultadoHex = "Numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
            System.out.println(resultadoHex);

            String mensaje = resultadoBinario;
            mensaje += "\n" + resultadoOctal;
            mensaje += "\n" + resultadoHex;

            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
/* Esto nos devuelve la caja de dialogo que se abrirá:

|--------------------------|
|           INPUT          |
|--------------------------| 
| Ingrese un número entero |
|--------------------------|                          
|           50             | <------------------------------- Ingresamos este numero
|--------------------------|

Luego, la caja de dialogo nos devuelve lo siguiente:

|-------------------------------|
|             MENSAJE           |
|-------------------------------| 
| Numero binario de 50 = 110010 |
| Numero octal de 50 = 62       |    
| Numero hexadecimal de 50 = 32 |
|-------------------------------|                      
|               OK              |
|-------------------------------|


    Modelo C
    ========

    Ahora que ocurrirá si se ingresa un texto en vez de un número? Para resolver este enigma utilizaremos 
    TRY-CATCH:
*/
    import javax.swing.*;

    public class SistemasNumericos {
        public static void main(String[] args) {

            String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
            int numeroDecimal = 0;
            try {
                numeroDecimal = Integer.parseInt(numeroStr);
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error debe ingresar un número entero");
                main(args);
                System.exit(0);
            }

            System.out.println("numeroDecimal = " + numeroDecimal);
            
            String resultadoBinario = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
            System.out.println(resultadoBinario);

            String resultadoOctal = "Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
            System.out.println(resultadoOctal);

            String resultadoHex = "Numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
            System.out.println(resultadoHex);

            String mensaje = resultadoBinario;
            mensaje += "\n" + resultadoOctal;
            mensaje += "\n" + resultadoHex;

            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
/* Esto nos devuelve la caja de dialogo que se abrirá:

|--------------------------|
|           INPUT          |
|--------------------------| 
| Ingrese un número entero |
|--------------------------|                          
|           hola           | <------------------------------- Ingresamos este texto
|--------------------------|

Luego, la caja de dialogo nos devuelve lo siguiente:

|-------------------------------|
|             MENSAJE           |
|-------------------------------| 
|Debe ingresar un numero entero |
|-------------------------------|                      
|               OK              |
|-------------------------------|

Después:

|--------------------------|
|           INPUT          |
|--------------------------| 
| Ingrese un número entero |
|--------------------------|                          
|           50             | <------------------------------- Ingresamos este numero
|--------------------------|

Luego, la caja de dialogo nos devuelve lo siguiente:

|-------------------------------|
|             MENSAJE           |
|-------------------------------| 
| Numero binario de 50 = 110010 |
| Numero octal de 50 = 62       |    
| Numero hexadecimal de 50 = 32 |
|-------------------------------|                      
|               OK              |
|-------------------------------|