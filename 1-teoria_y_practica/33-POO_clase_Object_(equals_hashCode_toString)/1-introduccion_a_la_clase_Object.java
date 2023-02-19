/*  ======================================================
    ========== INTRODUCCION A LA CLASE OBJECT ============
    ======================================================

    CONVERSION OBJECT EN JAVA
    =========================

    Como hemos comentado anteriormente todas las clases de una u otra manera en Java heredan de la clase Object, 
    así que la clase Object es la clase padre de todas las clases en Java. La clase Object ya define algunos 
    métodos, incluso su comportamiento, por ejemplo algunos de los métodos más importantes de la clase Object es 
    el método de toString(), que ya lo hemos visto también anteriormente y ahora vamos a ver el método equals() y 
    el método hasCode(). El método equals() nos va a permitir comparar el contenido de 2 objetos para saber si son 
    iguales y el método hashCode() nos va a permitir también comparar el contenido de los objetos, sin embargo, la 
    comparación se va a realizar con un tipo entero, se va a generar un valor de tipo entero que se le va a asignar 
    a cada objeto generado a partir de los valores de cada uno de los atributos de la clase, así que se genera un 
    entero único para cada objeto y posteriormente se compara ese valor único para saber si los objetos son iguales. 
    Sin embargo, si vamos a implementar el método hashCode() en nuestra clase, entonces también tenemos que sobrescribir 
    el método equals(), ya que, de no hacerlo, entonces cuando estemos utilizando nuestras clases dentro de algunas 
    estructuras de datos cómo puede ser el manejo de hashMap, hashSet, etc… u otro tipo de colecciones, podríamos 
    tener inconsistencias cuando se estén aplicando de manera automática algoritmos de ordenamiento, así que lo mejor 
    es implementar como recomienda el API de Java, tanto el método hashCode() como el método equals().

     _________________________________________
    |   << Clase Raiz de todas las clases>>   |
    |-----------------------------------------|
    | + toString() : String                   |  
    | + equals() : boolean                    |  
    | + hashCode() : int                      |  
    |_________________________________________|

*/