/*  ======================================================
    ================ OPERADORES TERNARIOS ================
    ======================================================

    ______________________________________________________________________________________________________
   |                                                                                                      |  
   |    ¿Por qué se llama Ternario?                                                                       |   
   |    ---------------------------                                                                       |    
   |                                                                                                      |  
   |    Ternario porque está formado por tres partes o elementos. Y este operador también esta formado    | 
   |    por tres partes, en este caso, argumentos. Su primer argumento evalúa una expresión booleana.     |  
   |                                                                                                      |                  
   |    El ternario es muy parecido, es decir, es como una versión simplificada o abreviada del IF.       |  
   |    Cuando tenemos el IF en combinación con un ELSE, si se cumple una condición hacemos una cosa y    |  
   |    si no se cumple, hacemos otra. Pero acá devuelve un valor, siempre devuelve. A diferencia del IF, |  
   |    que realiza o ejecuta un bloque de código con las llaves o realiza alguna operación, acá asigna   |  
   |    (devuelve) un valor.                                                                              |  
   |                                                                                                      |                                  
   |______________________________________________________________________________________________________|


   EJEMPLO 1
   =========
*/
    public class OperadorTernario {
        public static void main(String[] args) {
            
            // variable = condicion ? si_es_verdadero; si_es_falso;
            String variable = 7 == 5 ? "si es verdadero" : "si es falso";
            System.out.println("variable = " + variable);
            
            String estado = "";
            double promedio = 6.2;

            estado = promedio >= 5.49 ? "Aprobado" : "Reprobado";
            System.out.println("estado = " + estado);

            // Con IF seria de la siguiente forma:
            if(promedio >= 5.49){
                estado = "Aprobado";
            }
            else {
                estado = "Reprobado";
            }
        }
    }
/* Retorna lo siguiente:

variable = si es falso
estado = Aprobado


   EJEMPLO 2
   =========
    __________________________________________________________________________________
   |                                                                                  |  
   |    El ingreso de los valores double en la consola no son con “.” sino con “,”    | 
   |__________________________________________________________________________________| 

*/
    import java.util.Scanner;

    public class OperadorTernario {
        public static void main(String[] args) {
            
            String estado = "";
            double promedio = 0.0;

            double matematicas = 0.0;
            double ciencias = 0.0;
            double historia = 0.0;

            Scanner s = new Scanner(System.in);

            System.out.println("Ingrese la nota de matemáticas entre 2.0 - 7.0:");
            matematicas = s.nextDouble(); // nextDouble() nos permite ingresar un 'double'

            System.out.println("Ingrese la nota de ciencias entre 2.0 - 7.0:");
            ciencias = s.nextDouble();

            System.out.println("Ingrese la nota de historia entre 2.0 - 7.0:");
            historia = s.nextDouble();

            promedio = (matematicas + ciencias + historia) / 3;
            System.out.println("promedio = " + promedio);

            estado = promedio >= 5.49 ? "Aprobado": "Reprobado";
            System.out.println("estado = " + estado);

        }
    }
/*


   EJEMPLO 3
   =========
*/
    import java.util.Scanner;

    public class OperadorTernarioNumeroMayor {
        public static void main(String[] args) {

            int max = 0;

            Scanner s = new Scanner(System.in);
            
            System.out.println("ingrese un número");
            int num1 = s.nextInt();

            System.out.println("ingrese un segundo número");
            int num2 = s.nextInt();

            System.out.println("ingrese un tercer número");
            int num3 = s.nextInt();

            System.out.println("ingrese un cuarto número");
            int num4 = s.nextInt();

            max = (num1 > num2)? num1: num2;
            max = (max > num3)? max: num3;
            max = (max > num4)? max: num4;

            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
            System.out.println("num3 = " + num3);
            System.out.println("num4 = " + num4);
            System.out.println("el número mayor es: " + max);
        }
    }