/*  ======================================================
    =================== ITERANDO ARRAYS ==================
    ======================================================

    Siempre hay que ordenar (Arrays.sort) antes de iterar o antes de asignar o mostrar los elementos. 


    CASO 1 - USANDO 'FOR'
    =====================
*/ 
    import java.util.Arrays;

    public class EjemploArreglosFor {
        public static void main(String[] args) {
            
            String[] productos = new String[7];
            int total = productos.length;

            productos[0] = "Kingston Pendrive 64GB";
            productos[1] = "Samsung Galaxy";
            productos[2] = "Disco Duro SSD Samsung Externo";
            productos[3] = "Asus Notebook";
            productos[4] = "Macbook Air";
            productos[5] = "Chromecast 4ta generación";
            productos[6] = "Bicicleta Oxford";

            Arrays.sort(productos);

            System.out.println("=== Usando FOR ===");
            for(int i = 0; i < total; i++){
                System.out.println("para indice " + i + " : " + productos[i]);
            }
        }
    }
/* 

=== Usando FOR ===
para indice 0 : Asus Notebook
para indice 1 : Bicicleta Oxford
para indice 2 : Chromecast 4ta generación
para indice 3 : Disco Duro SSD Samsung Externo
para indice 4 : Kingston Pendrive 64GB
para indice 5 : Macbook Air
para indice 6 : Samsung Galaxy 


    CASO 2 - USANDO 'FOR EACH'
    ==========================
*/    
    import java.util.Arrays;

    public class EjemploArreglosFor {
        public static void main(String[] args) {
            
            String[] productos = new String[7];

            productos[0] = "Kingston Pendrive 64GB";
            productos[1] = "Samsung Galaxy";
            productos[2] = "Disco Duro SSD Samsung Externo";
            productos[3] = "Asus Notebook";
            productos[4] = "Macbook Air";
            productos[5] = "Chromecast 4ta generación";
            productos[6] = "Bicicleta Oxford";

            Arrays.sort(productos);

            System.out.println("=== Usando FOR EACH ===");
            for(String prod: productos){
                System.out.println("prod = " + prod);
            }
        }
    }
/* 

=== Usando FOR EACH ===
prod = Asus Notebook
prod = Bicicleta Oxford
prod = Chromecast 4ta generación
prod = Disco Duro SSD Samsung Externo
prod = Kingston Pendrive 64GB
prod = Macbook Air
prod = Samsung Galaxy 


    CASO 3 - USANDO 'WHILE'
    =======================
*/
    import java.util.Arrays;

    public class EjemploArreglosFor {
        public static void main(String[] args) {
            
            String[] productos = new String[7];
            int total = productos.length;

            productos[0] = "Kingston Pendrive 64GB";
            productos[1] = "Samsung Galaxy";
            productos[2] = "Disco Duro SSD Samsung Externo";
            productos[3] = "Asus Notebook";
            productos[4] = "Macbook Air";
            productos[5] = "Chromecast 4ta generación";
            productos[6] = "Bicicleta Oxford";

            Arrays.sort(productos);

            System.out.println("=== Usando WHILE ===");
            int i = 0;
            while(i < total){
                System.out.println("para indice " + i + " : " + productos[i]);
                i++;
            }
        }
    }
/* 

=== Usando WHILE ===
para indice 0 : Asus Notebook
para indice 1 : Bicicleta Oxford
para indice 2 : Chromecast 4ta generación
para indice 3 : Disco Duro SSD Samsung Externo
para indice 4 : Kingston Pendrive 64GB
para indice 5 : Macbook Air
para indice 6 : Samsung Galaxy 


    CASO 4 - USANDO 'DO WHILE'
    ==========================
*/   
    import java.util.Arrays;

    public class EjemploArreglosFor {
        public static void main(String[] args) {
            
            String[] productos = new String[7];
            int total = productos.length;

            productos[0] = "Kingston Pendrive 64GB";
            productos[1] = "Samsung Galaxy";
            productos[2] = "Disco Duro SSD Samsung Externo";
            productos[3] = "Asus Notebook";
            productos[4] = "Macbook Air";
            productos[5] = "Chromecast 4ta generación";
            productos[6] = "Bicicleta Oxford";

            Arrays.sort(productos);

            System.out.println("=== Usando DO WHILE ===");
            int j = 0;
            do {
                System.out.println("para indice " + j + " : " + productos[j]);
                j++;
            } while(j < total);
        }
    }
/* 

=== Usando DO WHILE ===
para indice 0 : Asus Notebook
para indice 1 : Bicicleta Oxford
para indice 2 : Chromecast 4ta generación
para indice 3 : Disco Duro SSD Samsung Externo
para indice 4 : Kingston Pendrive 64GB
para indice 5 : Macbook Air
para indice 6 : Samsung Galaxy


    CASO 5 - USANDO 'FOR'
    =====================
*/  
    public class EjemploArreglosFor {
        public static void main(String[] args) {
            
            int[] numeros = new int[10];

            int totalNumeros = numeros.length;
            
            for(int k = 0; k < totalNumeros; k++){
                numeros[k] = k*3;
            }

            for(int k = 0; k < totalNumeros; k++){
                System.out.println("numeros = " + numeros[k]);
            }
        }
    }
/* 

numeros = 0
numeros = 3
numeros = 6
numeros = 9
numeros = 12
numeros = 15
numeros = 18
numeros = 21
numeros = 24
numeros = 27 

*/