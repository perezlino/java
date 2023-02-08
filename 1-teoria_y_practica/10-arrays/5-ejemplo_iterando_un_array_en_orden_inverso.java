/*  ======================================================
    ========= ITERANDO UN ARRAY EN ORDEN INVERSO =========
    ======================================================

*/ 
    import java.util.Arrays;

    public class EjemploArreglosForInverso {
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

            System.out.println("=== Usando FOR INVERSO ===");
            for(int i = 0; i < total; i++){
                System.out.println("para i = " + (total - 1 - i) + " valor: " + productos[total - 1 - i]);
            }

            System.out.println("=== Usando FOR INVERSO 2 ===");
            for(int i = total - 1; i >= 0; i--){
                System.out.println("para i = " + i + " valor " + productos[i]);
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
=== Usando FOR INVERSO ===
para i = 6 valor: Samsung Galaxy
para i = 5 valor: Macbook Air
para i = 4 valor: Kingston Pendrive 64GB
para i = 3 valor: Disco Duro SSD Samsung Externo
para i = 2 valor: Chromecast 4ta generación
para i = 1 valor: Bicicleta Oxford
para i = 0 valor: Asus Notebook
=== Usando FOR INVERSO 2 ===
para i = 6 valor Samsung Galaxy
para i = 5 valor Macbook Air
para i = 4 valor Kingston Pendrive 64GB
para i = 3 valor Disco Duro SSD Samsung Externo
para i = 2 valor Chromecast 4ta generación
para i = 1 valor Bicicleta Oxford
para i = 0 valor Asus Notebook 

*/    