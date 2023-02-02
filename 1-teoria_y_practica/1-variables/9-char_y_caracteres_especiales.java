/*  =======================================================
    ============ CHAR Y CARACTERES ESPECIALES =============
    =======================================================


    char
    ====
*/
public class PrimitivoCharacter {
    public static void main(String[] args) {

        char espacio = ' ';
        char espacioUnicode = '\u0020';
        char retroceso = '\b';  
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
        System.out.println("Mi nombre es =" + espacio + "Alfonso");
        System.out.println("Mi nombre es =" + espacioUnicode + "Alfonso");
        System.out.println("Mi nombre es =" + retroceso + "Alfonso");
        System.out.println("Mi nombre es =" + tabulador + "Alfonso");
        System.out.println("Mi nombre es =" + nuevaLinea + "Alfonso");
        System.out.println("Mi nombre es =" + retornoCarro + "Alfonso");
        System.out.println("Mi \bnombre \tes = " + tabulador + "Alfonso");
        System.out.println("Mi nombre es = " + System.getProperty("line.separator") + "Alfonso");
        System.out.println("Mi nombre es = " + System.lineSeparator() + "Alfonso");

    }
}
/* Esto nos devuelve:

Mi nombre es = Alfonso
Mi nombre es = Alfonso
Mi nombre es Alfonso
Mi nombre es =  Alfonso
Mi nombre es =
Alfonso
Alfonsore es =
Minombre        es =    Alfonso
Mi nombre es =
Alfonso
Mi nombre es =
Alfonso

*/