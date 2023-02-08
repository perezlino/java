/*  ======================================================
    =========== ORDENAMIENTO ALGORITMO BURBUJA ===========
    ======================================================
     _________________________________________
    |                                         |  
    |   IMPORTANTE: Los Arrays SON MUTABLES   |
    |_________________________________________|

    Continuamos con ordenar, con ordenar un array. Ya lo vimos, pero utilizando la clase 'Arrays.sort()' 
    de forma automática. Ahora la idea es implementar esto mismo, pero de forma explícita, implementar el 
    código para generar un orden customizado, nuestro propio algoritmo de forma manual para poder ordenar 
    el array.

    Bueno, aquí es justamente es el mismo algoritmo, que trabaja y funciona por debajo del 'sort' o muy 
    parecido, que es el 'método de ordenamiento de burbuja', donde compara cada palabra del array con el 
    siguiente. Por lo tanto, se comparan y se van ordenando si están desordenadas o en el orden equivocado, 
    se van intercambiando de posición, por lo tanto van subiendo de nivel en el array, igual que las burbujas
    y de ahí el nombre, por la forma en que suben o se van intercambiando de posición en el array.    


    FORMA NO OPTIMIZADA
    ===================

     -- Revisar con el Debug (está enredado) -- 

*/
    import java.util.Arrays;

    public class EjemploArreglosForOrdenamientoBurbuja {

        public static void sortBurbuja(Object[] arreglo){

            int total = arreglo.length;
            int contador_iteracion = 0;

            for(int i = 0; i < total; i++){
                for(int j = 0; j < total; j++){
                    if(arreglo[i].compareTo(arreglo[j]) < 0 ){
                        String auxiliar = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = auxiliar;
                    }
                    contador_iteracion++;
                }
            }

            System.out.println("contador = " + contador_iteracion);
        }

        public static void main(String[] args) {

            String[] productos = { "Kingston Pendrive 64GB", "Samsung Galaxy",
                                   "Disco Duro SSD Samsung Externo",
                                   "Asus Notebook", "Macbook Air",
                                   "Chromecast 4ta generación", "Bicicleta Oxford" };

            int total = productos.length;

            System.out.println("=== Usando FOR ===");
            for(int i = 0; i < total; i++){
                System.out.println("para indice " + i + " : " + productos[i]);
            }     
/*           ____________________________________________________
            |                                                    |               
            |   Hasta el momento tenemos lo siguiente:           |     
            |                                                    |               
            |   === Usando FOR ===                               |       
            |   para indice 0 : Kingston Pendrive 64GB           |   
            |   para indice 1 : Samsung Galaxy                   |   
            |   para indice 2 : Disco Duro SSD Samsung Externo   |    
            |   para indice 3 : Asus Notebook                    |
            |   para indice 4 : Macbook Air                      |   
            |   para indice 5 : Chromecast 4ta generación        |   
            |   para indice 6 : Bicicleta Oxford                 |   
            |____________________________________________________|

*/                       
            sortBurbuja(productos);

/*          contador = 49                                               */

            System.out.println("=== Usando FOR ===");
            for(int i = 0; i < total; i++){
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
        }
    }
/*

contador = 49
=== Usando for ===
para indice 0 : Asus Notebook
para indice 1 : Bicicleta Oxford
para indice 2 : Chromecast 4ta generacion
para indice 3 : Disco Duro SSD Samsung Externo
para indice 4 : Kingston Pendrive 64GB
para indice 5 : Macbook Air
para indice 6 : Samsung Galaxy



    FORMA OPTIMIZADA
    ================

     -- Revisar con el Debug (está enredado) -- 
*/
    public class EjemploArreglosForOrdenamientoBurbuja {

        public static void sortBurbuja(String[] arreglo) {

            int total = arreglo.length;
            int contador = 0;

            for (int i = 0; i < total - 1; i++) {
                for (int j = 0; j < total - 1 - i; j++) {
                    if (arreglo[j + 1].compareTo(arreglo[j]) < 0) {
                        String auxiliar = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = auxiliar;
                    }
                    contador++;
                }
            }

            System.out.println("contador = " + contador);
        }

        public static void main(String[] args) {

            String[] productos = { "Kingston Pendrive 64GB", "Samsung Galaxy",
                    "Disco Duro SSD Samsung Externo",
                    "Asus Notebook", "Macbook Air",
                    "Chromecast 4ta generación", "Bicicleta Oxford" };

            int total = productos.length;

            System.out.println("=== Usando for ===");
            for(int i = 0; i < total; i++) {
                System.out.println("para indice " + i + " : " + productos[i]);
            }
/*           ____________________________________________________
            |                                                    |               
            |   Hasta el momento tenemos lo siguiente:           |     
            |                                                    |               
            |   === Usando FOR ===                               |       
            |   para indice 0 : Kingston Pendrive 64GB           |   
            |   para indice 1 : Samsung Galaxy                   |   
            |   para indice 2 : Disco Duro SSD Samsung Externo   |    
            |   para indice 3 : Asus Notebook                    |
            |   para indice 4 : Macbook Air                      |   
            |   para indice 5 : Chromecast 4ta generación        |   
            |   para indice 6 : Bicicleta Oxford                 |   
            |____________________________________________________|

*/              

            sortBurbuja(productos);

/*          contador = 21                                               */

            System.out.println("=== Usando for ===");
            for(int j = 0; j < total; j++){
                System.out.println("para indice " + j + " : " + productos[j]);
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
        }
    }
/*

contador = 21
=== Usando for ===
para indice 0 : Asus Notebook
para indice 1 : Bicicleta Oxford
para indice 2 : Chromecast 4ta generacion
para indice 3 : Disco Duro SSD Samsung Externo
para indice 4 : Kingston Pendrive 64GB
para indice 5 : Macbook Air
para indice 6 : Samsung Galaxy

*/