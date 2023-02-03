/*  ======================================================
    ============== RENDIMIENTO CONCATENACIÓN =============
    ======================================================

    UTILIZAR FOR
    ============
*/
    public class EjemploStringTestRendimientoConcat {
        public static void main(String[] args) {

            for(int i = 0; i < 100000; i++){

                System.out.println(i);

            }
        }
    }
/* Esto es lo que nos devuelve:

0
1
2
3
4
5
6
...
...


    UTILIZAR FOR ITERANDO CON UN CONCAT
    ===================================

    Forma A
    -------
*/
    public class EjemploStringTestRendimientoConcat {
        public static void main(String[] args) {

            String a = "a";
            String b = "b";
            String c = "c";

            for(int i = 0; i < 5; i++){

                c = c.concat(a).concat(b).concat("\n") + i;
                System.out.println("inicio " + c + " final");
            }  
        }
    }
/* Esto es lo que nos devuelve:

inicio cab
0 final
inicio cab
0ab
1 final
inicio cab
0ab
1ab
2 final
inicio cab
0ab
1ab
2ab
3 final
inicio cab
0ab
1ab
2ab
3ab
4 final


    Forma B
    -------
*/
    public class EjemploStringTestRendimientoConcat {
        public static void main(String[] args) {

            String a = "a";
            String b = "b";
            String c = "c";

            for(int i = 0; i < 5; i++){

                c = c.concat(a).concat(b).concat("\n") + i;
                
            }

            System.out.println("inicio " + c + " final");
        }
    }
/* Esto es lo que nos devuelve:

inicio cab
0ab
1ab
2ab
3ab
4 final



    MEDIR RENDIMIENTO
    =================

    Utilizando "currentTimeMillis"
    ------------------------------
    Para medir el tiempo en milisegundos
*/
    public class EjemploStringTestRendimientoConcat {
        public static void main(String[] args) {

            String a = "a";
            String b = "b";
            String c = a;

            StringBuilder sb = new StringBuilder(a);

            long inicio = System.currentTimeMillis();

            for(int i = 0; i < 100000; i++){
                // c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1000 => 4ms, 10000 => 105ms, 100000 => 5071ms
                // c += a + b + "\n"; // 500 => 19, 1000 => 21ms, 10000 => 68, 100000 => 1976ms
                sb.append(a).append(b).append("\n"); // 500 => 0ms, 1000 => 0ms, 10000 => 2ms, 100000 => 8ms
            }

            System.gc();

            long fin = System.currentTimeMillis();
            System.out.println(fin - inicio);
            System.out.println("c = " + c);
            System.out.println("sb = " + sb.toString());
            System.exit(0);
        }
    }