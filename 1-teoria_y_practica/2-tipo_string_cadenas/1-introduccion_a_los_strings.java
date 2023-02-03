/*  ======================================================
    ============= INTRODUCCION A LOS STRINGS =============
    ======================================================

    Lo primero es que JAVA es fuertemente tipado. Cualquier variable que se defina en la aplicación tiene 
    que estar asociada a un tipo de dato, ya sea si es primitivo, representa un solo valor o bien si es un 
    objeto, un tipo de una clase.

    STRINGS
    =======

    - Los "String" son objetos de Java, del tipo referencia:
*/
    String nombre = new String("Alfonso");
    System.out.println(nombre);  // Alfonso

/*
    - Aunque también los String se pueden representar con una sintáxis especialmente cómoda.
     ___________________________________________________________________________________________________
    |                                                                                                   |
    |   Independiente que usemos una u otra, ambas son objetos del tipo string y representan lo mismo:  |
    |                                                                                                   |            
    |   String nombre = new String("Andrés");                                                           |                
    |   String nombre = "Andrés";                                                                       |
    |                                                                                                   |            
    |   Sin embargo, se recomienda la última por su simpleza.                                           |    
    |___________________________________________________________________________________________________|   
 

    - El String tiene una caracteristica especial, permite crear objetos también en la literal entre comillas
      dobles.

    - Para incluir el caracter comillas dobles, se debe escapar "\""

    - Los caracteres de un String se codifican usando Unicode

    - Son INMUTABLES
*/
    String tema = new String("Manejo de \"String\"");
    System.out.println(tema);  // Manejo de "String"
/* 

                                        =============================

    CONCATENAR STRINGS
    ==================

    - Sobre las cadenas se define la operación de concatenar con el operador de suma
*/
    String nombre = "Alfonso"; 
    String apellido = "Perez";

    String nombreCompleto = nombre + " " + apellido;
/*

                                        =============================

    COMPARAR STRINGS
    ================

    - Con el operador relacional de igualdad '==' compara por referencia

    - Con el método "equals" compara por valor

     ______________________________________________________________________________________________
    |                                                                                              |     
    | Veamos cómo comparar el String, porque acá hay que tener cuidado. Recordemos que los Strings |
    | no son primitivos, por lo tanto no se pueden comparar con el operador relacional de igualdad |
    | con el ==. Es decir, de poder se puede, pero no va a comparar por valor, como lo hace en los |
    | primitivos. En un String, va a comparar por objeto, por referencia.                          |     
    |______________________________________________________________________________________________|
     ___________________________________________________________________________________________________
    |                                                                                                   |
    | Si ambas variables de String apuntan a la misma referencia en la memoria, es decir, corresponden  | 
    | al mismo objeto. Pero si queremos comparar por valor en un String, tenemos que utilizar el método |    
    | EQUALS y no el ==.                                                                                |    
    |___________________________________________________________________________________________________|
*/
    String str1 = "Hola Alfonso"; 
    String str2 = new String("Hola Alfonso");

    // chequea si son el mismo objeto
    System.out.println("Son el mismo objeto?" + (str1 == str2));

    // chequea si tienen el mismo valor
    System.out.println("Tienen el mismo valor?" + str1.equals(str2));

/* Esto nos devuelve:

Son el mismo objeto? false
Tienen el mismo valor? true   


                                        =============================

    METODOS DE LA CLASE STRING
    ==========================

    int length() : Número de caracteres
    ------------
    
    boolean equals(String b) : Compara si ambas son iguales, por valor.
    ------------------------

    boolean equalsIgnoreCase(String b) : Compara si ambas son iguales, independientemente de mayúsculas
    ----------------------------------   o minúsculas.

    int compareTo(String b) : Compara contra la cadena del argumento, devolviendo:
    ------------------------    - un valor negativo si la cadena es anterior a b
                                - cero (0) si la cadena es igual a b
                                - un valor positivo si la cadena es posterior a b

    String trim() : Crea un nuevo objeto eliminando el espacio en blanco que pudiera haber al principio o
    -------------   al final.

    char charAt (int posicion) : Extrae un caracter en la posicion indicada.
    --------------------------   

    char[] toCharArray() : Convierte la cadena en un arreglo (array) de caracteres
    --------------------

    String substring(int a, int b) : Extrae la sub-cadena entre las posiciones a y b
    ------------------------------

    String substring(int desde) : Extrae la sub-cadena desde la posicion indicada
    ---------------------------

    int indexOf(String cadena) : Indican en que posicion se encuentra el caracter (o cadena) indicado por
    --------------------------   primera vez, buscando desde el principio

    int lastIndexOf(String cadena) : Indica en que posicion se encuentra el caracter (o cadena) indicado por
    ------------------------------   primera vez, buscando desde el final

    boolean startsWith(String prefijo) : Dice si la cadena comienza con el prefijo indicado
    ----------------------------------   

    boolean endsWith(String sufijo) : Dice si la cadena termina con el sufijo indicado
    -------------------------------- 

    String[] split(String patron) : Divide la cadena en varias subcadenas utilizando el patron indicado como
    -----------------------------   separador.