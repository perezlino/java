/*  ======================================================
    ====== SISTEMA DE NOTAS DE ALUMNOS POR ASIGNATURA ====
    ======================================================

    Para este ejemplo vamos a tener un colegio con algún curso, cualquier curso, por ejemplo, primero
    básico y con tres asignaturas, como Matemática, Historia y Lenguaje, y la idea es asignar para este
    curso de 7 alumnos una nota en cada asignatura. Luego poder calcular el promedio general de curso 
    y además el promedio por asignatura, el total de la clase y además, el promedio por alumno. Por 
    ejemplo, leer el índice del alumno, su identificador, lo obtenemos, obtenemos sus notas de las 
    asignaturas y calculamos su promedio. Veamos cómo se podría implementar.


*/
    import java.util.Scanner;

    public class EjemploArregloNotasAlumnos {
        public static void main(String[] args) {

            double[] claseMatematicas, claseHistoria, claseLenguaje;
            double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;
            claseMatematicas = new double[7];
            claseHistoria = new double[7];
            claseLenguaje = new double[7];

            claseMatematicas[0] = 6.5;
            claseMatematicas[1] = 6.1;
            claseMatematicas[2] = 5.5;
            claseMatematicas[3] = 4.5;
            claseMatematicas[4] = 6.1;
            claseMatematicas[5] = 5.1;
            claseMatematicas[6] = 4.8;

            claseHistoria[0] = 6.0;
            claseHistoria[1] = 4.1;
            claseHistoria[2] = 5.5;
            claseHistoria[3] = 6.5;
            claseHistoria[4] = 6.1;
            claseHistoria[5] = 6.6;
            claseHistoria[6] = 4.7;
            
            claseLenguaje[0] = 6.9;
            claseLenguaje[1] = 7.0;
            claseLenguaje[2] = 6.4;
            claseLenguaje[3] = 4.9;
            claseLenguaje[4] = 6.1;
            claseLenguaje[5] = 4.1;
            claseLenguaje[6] = 4.8;            


            // CODIGO PARA PEDIR NOTAS POR TERMINAL

            // Scanner s = new Scanner(System.in);
            // System.out.println("Ingrese 7 notas de estudiantes para matemáticas:");
            // for(int i = 0; i < claseMatematicas.length; i++){
            //     claseMatematicas[i] = s.nextDouble();
            // }

            // System.out.println("Ingrese 7 notas de estudiantes para historia:");
            // for(int i = 0; i < claseHistoria.length; i++){
            //     claseHistoria[i] = s.nextDouble();
            // }

            // System.out.println("Ingrese 7 notas de estudiantes para lenguaje:");
            // for(int i  = 0; i < claseLenguaje.length; i++){
            //     claseLenguaje[i] = s.nextDouble();
            // }

            for(int i = 0; i < 7; i++){
                sumNotasMatematicas += claseMatematicas[i];
                sumNotasHistoria += claseHistoria[i];
                sumNotasLenguaje += claseLenguaje[i];
            }
/* 
            sumNotasMatematicas = 38.6
            sumNotasHistoria = 39.50000000000001
            sumNotasLenguaje = 40.2
*/

            double promedioMatematica = (sumNotasMatematicas/claseMatematicas.length);
            double promedioHistoria = (sumNotasHistoria/claseHistoria.length);
            double promedioLenguaje = (sumNotasLenguaje/claseLenguaje.length);
            System.out.println("Promedio curso clase matemáticas: " + promedioMatematica);
            System.out.println("Promedio curso clase historia: " + promedioHistoria);
            System.out.println("Promedio curso clase lenguaje: " + promedioLenguaje);
            System.out.println("Promedio total del curso: "
                    + (promedioMatematica + promedioHistoria + promedioLenguaje)/3);
/* 
            Promedio clase curso matemáticas: 5.514285714285714
            Promedio clase curso historia: 5.642857142857144
            Promedio clase curso lenguaje: 5.742857142857143
            Promedio total del curso: 5.633333333333334
*/
            // Ingresamos el identificador por terminal
            System.out.println("Ingrese el identificador del alumno (de 0 - 6):");
            int id = s.nextInt();

            double promedioAlumno = (claseHistoria[id] + claseLenguaje[id] + claseMatematicas[id])/3;
            System.out.println("Promedio alumno Nro " + id + " : " + promedioAlumno);
        }
/* 
            Por ejemplo, si ingresamos el indice = 0:
            -----------------------------------------

            (claseMatematicas[0] + claseHistoria[0] + claseLenguaje[0]) / 3
            (6.5 + 6.0 + 6.9) / 3
            Promedio alumno Nro 0 : 6.466666666666666
*/


    }