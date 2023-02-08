/*  ======================================================
    ============ EJEMPLO DE UN ARRAY DE STRING ===========
    ======================================================

    CASO 1
    ------

*/ 
    public class EjemploArreglos {
        public static void main(String[] args) {

            String[] productos = new String[7];

            productos[0] = "Kingston Pendrive 64GB";
            productos[1] = "Samsung Galaxy";
            productos[2] = "Disco Duro SSD Samsung Externo";
            productos[3] = "Asus Notebook";
            productos[4] = "Macbook Air";
            productos[5] = "Chromecast 4ta generación";
            productos[6] = "Bicicleta Oxford";

            String prod1 = productos[0];
            String prod2 = productos[1];
            String prod3 = productos[2];
            String prod4 = productos[3];
            String prod5 = productos[4];
            String prod6 = productos[5];
            String prod7 = productos[6];

            System.out.println("productos[0] = " + prod1);
            System.out.println("productos[1] = " + prod2);
            System.out.println("productos[2] = " + prod3);
            System.out.println("productos[3] = " + prod4);
            System.out.println("productos[4] = " + prod5);
            System.out.println("productos[5] = " + prod6);
            System.out.println("productos[6] = " + prod7);
        }
    }
/* 

productos[0] = Kingston Pendrive 64GB
productos[1] = Samsung Galaxy
productos[2] = Disco Duro SSD Samsung Externo
productos[3] = Asus Notebook
productos[4] = Macbook Air
productos[5] = Chromecast 4ta generación
productos[6] = Bicicleta Oxford 


    CASO 2
    ------
*/
    import java.util.Arrays;

    public class EjemploArreglos {
        public static void main(String[] args) {

            String[] productos = new String[7];

            productos[0] = "Kingston Pendrive 64GB";
            productos[1] = "Samsung Galaxy";
            productos[2] = "Disco Duro SSD Samsung Externo";
            productos[3] = "Asus Notebook";
            productos[4] = "Macbook Air";
            productos[5] = "Chromecast 4ta generación";
            productos[6] = "Bicicleta Oxford";

            Arrays.sort(productos);  // <======================== Se agregó

            String prod1 = productos[0];
            String prod2 = productos[1];
            String prod3 = productos[2];
            String prod4 = productos[3];
            String prod5 = productos[4];
            String prod6 = productos[5];
            String prod7 = productos[6];

            System.out.println("productos[0] = " + prod1);
            System.out.println("productos[1] = " + prod2);
            System.out.println("productos[2] = " + prod3);
            System.out.println("productos[3] = " + prod4);
            System.out.println("productos[4] = " + prod5);
            System.out.println("productos[5] = " + prod6);
            System.out.println("productos[6] = " + prod7);
        }
    }
/* 

productos[0] = Asus Notebook
productos[1] = Bicicleta Oxford
productos[2] = Chromecast 4ta generación
productos[3] = Disco Duro SSD Samsung Externo
productos[4] = Kingston Pendrive 64GB
productos[5] = Macbook Air
productos[6] = Samsung Galaxy 


    CASO 3
    ------
*/
    import java.util.Arrays;

    public class EjemploArreglos {
        public static void main(String[] args) {

            String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", 
                                    "Disco Duro SSD Samsung Externo", "Asus Notebook",
                                        "Asus Notebook", "Macbook Air", "Chromecast 4ta generación",
                                        "Bicicleta Oxford"};                            

            Arrays.sort(productos);  // <======================== Se agregó

            System.out.println("productos[0] = " + productos[0]);
            System.out.println("productos[1] = " + productos[1]);
            System.out.println("productos[2] = " + productos[2]);
            System.out.println("productos[3] = " + productos[3]);
            System.out.println("productos[4] = " + productos[4]);
            System.out.println("productos[5] = " + productos[5]);
            System.out.println("productos[6] = " + productos[6]);
        }
    }
/* 

productos[0] = Asus Notebook
productos[1] = Bicicleta Oxford
productos[2] = Chromecast 4ta generación
productos[3] = Disco Duro SSD Samsung Externo
productos[4] = Kingston Pendrive 64GB
productos[5] = Macbook Air
productos[6] = Samsung Galaxy 


    CASO 4
    ------
*/
import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        int[] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;
        // numeros[4] = 5;

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1];
        //int m = numeros[4];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
/* 

i = -1
j = 7
k = 10
l = 35 

*/