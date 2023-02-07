/*  ===========================================================
    === LA CLASE RUNTIME PARA EJECUTAR APLICACIONES DEL S.O. ==
    ===========================================================

    Veamos cómo ejecutar alguna aplicación (programa) del sistema operativo utilizando la "clase Runtime". 
    Y también vamos a combinarlo con el 'System.getProperty' para obtener el sistema operativo (el nombre).

    Entonces de esta forma la "clase Runtime" y el método estático getRuntime, obtenemos la instancia de 
    tiempo de ejecución del objeto 'rt' y cuando se ejecuta un programa por ejemplo el "editor de texto", el 
    notapad, lo que retorna es un objeto del tipo 'Process', process de Java lang.

    Lo vamos a llamar 'proceso' y lo dejamos definido o simplemente declarado como una variable, pero sin la 
    instancia todavía, porque la instancia la retorna el 'método Execute (Exec)'.

    Pero la idea es que cuando ejecute el editor de texto (Notepad) no continúe con la ejecución de la 
    aplicación, sino que quede esperando hasta que cerremos con la X, cerrar el Notepad o del editor de texto. 
    Entonces, para proceso utilizamos el 'método waitFor()'.
*/
    public class EjemploEjecutarProgramaSO {
        public static void main(String[] args) {

            Runtime rt = Runtime.getRuntime();
            Process proceso;

            try {
                if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                    proceso = rt.exec("notepad");
                } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                    proceso = rt.exec("textedit");
                }else if (System.getProperty("os.name").toLowerCase().contains("nux") ||
                        System.getProperty("os.name").toLowerCase().contains("nix")) {
                    proceso = rt.exec("gedit");
                }
                else {
                    proceso = rt.exec("gedit");
                }
                proceso.waitFor();
            } catch(Exception e){
                System.err.println("El comando es desconocido: " + e.getMessage());
                System.exit(1);
            }
            System.out.println("Se ha cerrado el editor");
            System.exit(0);
        }
    }