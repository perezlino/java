/*  ======================================================
    ========== MODIFICANDO EL ARRAY EN REVERSO ===========
    ======================================================
     _________________________________________
    |                                         |  
    |   IMPORTANTE: Los Arrays SON MUTABLES   |
    |_________________________________________|

*/
    import java.util.Arrays;
    import java.util.Collections;

    public class EjemploArreglosForInversoMutable {

        public static void arregloInverso(String[] arreglo) { // Este método es estático. Tiene que
            int total2 = arreglo.length;                      // ser estático porque lo vamos a utilizar
            int total = arreglo.length;                       // dentro del 'main' y este también es estático.
            for(int i = 0; i < total2; i++){
                String actual = arreglo[i];                   // 'arreglo' es el parámetro de este método
                String inverso = arreglo[total-1-i];          // 'productos' es el argumento que le pasaremos  
                arreglo[i] = inverso;
                arreglo[total-1-i] = actual;
                total2--;
            }
        }

        public static void main(String[] args) {

            String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
                                    "Disco Duro SSD Samsung Externo", "Asus Notebook",
                                    "Macbook Air", "Chromecast 4ta generación",
                                    "Bicicleta Oxford" };

            int total = productos.length;

            Arrays.sort(productos);

            System.out.println("=== Usando FOR ===");
            for(int i = 0; i < total; i++) {
                System.out.println("para indice " + i + " : " + productos[i]);
            }
/*           ____________________________________________________
            |                                                    |               
            |   Hasta el momento tenemos lo siguiente:           |     
            |                                                    |               
            |   === Usando FOR ===                               |       
            |   para indice 0 : Asus Notebook                    |   
            |   para indice 1 : Bicicleta Oxford                 |   
            |   para indice 2 : Chromecast 4ta generacion        |    
            |   para indice 3 : Disco Duro SSD Samsung Externo   |
            |   para indice 4 : Kingston Pendrive 64GB           |   
            |   para indice 5 : Macbook Air                      |   
            |   para indice 6 : Samsung Galaxy                   |   
            |____________________________________________________|

*/
            arregloInverso(productos); // Con este método modificamos el Array (EL ARRAY ES MUTABLE!!)

/*          El array se acaba de modificar y quedo de la siguiente manera:

            String[] productos = {"Samsung Galaxy", "Macbook Air",
                                    "Kingston Pendrive 64GB", "Disco Duro SSD Samsung Externo",
                                    "Chromecast 4ta generación", "Bicicleta Oxford",
                                    "Asus Notebook"};

*/            
            System.out.println("=== Usando FOR ===");
            for(int j = 0; j < total; j++){
                System.out.println("para indice " + j + " : " + productos[j]);
            }
/*           ____________________________________________________
            |                                                    |  Notar que los productos se ordenaron de manera            
            |   Hasta el momento tenemos lo siguiente:           |  DESC, según, la primera letra del producto.   
            |                                                    |  Y se mantuvo el numero del indice.             
            |   === Usando FOR ===                               |       
            |   para indice 0 : Samsung Galaxy                   |   
            |   para indice 1 : Macbook Air                      |   
            |   para indice 2 : Kingston Pendrive 64GB           |    
            |   para indice 3 : Disco Duro SSD Samsung Externo   |
            |   para indice 4 : Chromecast 4ta generacion        |   
            |   para indice 5 : Bicicleta Oxford                 |   
            |   para indice 6 : Asus Notebook                    |   
            |____________________________________________________|            
*/

            //Collections.reverse(Arrays.asList(productos)); Obtenemos lo mismo utilizando la API Collections


        }
    }