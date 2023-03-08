/*  ======================================================
    ======== INTRODUCCION AL MANEJO DE JAVABEANS =========
    ======================================================

    Básicamente para que una Clase en Java se considere un 'JavaBean', es que debe de cumplir ciertas 
    características, por ejemplo, debe de tener un constructor vacío y cada atributo que definamos 
    dentro de esta Clase 'JavaBean' debe de ser un atributo 'privado' y cada atributo 'privado' debe 
    tener un método 'get' y 'set' asociado. Y por último, debe de implementar una 'Interface' llamada 
    'Serializable'. Esta 'Interface Serializable' nos va a permitir enviar nuestra Clase entre diferentes 
    equipos, por ejemplo, si tenemos diferentes servidores de Java y necesitamos transferir esta Clase 
    de Java, este 'JavaBean' entre diferentes equipos, entonces, va a ser importante que implemente la 
    'Interface Serializable'. La 'Interface Serializable' tiene más usos, pero básicamente simplemente al 
    agregar 'implements Serializable' todo lo demás lo va a implementar el servidor de aplicaciones Java. 
    Así que, no es necesario agregar ninguna otra característica a nuestra Clase. Simplemente con que 
    cumpla con ciertas características, entonces, es que se va a considerar un 'JavaBean'. Al considerarse 
    un 'JavaBean', entonces, otras tecnologías como puede ser Java Empresarial, o frameworks como Spring o 
    Hibernate van a poder hacer uso de nuestras Clases. De lo contrario, si nuestra Clase no sigue la 
    nomenclatura de un 'JavaBean', entonces, esas tecnologías no van a poder utilizar nuestras Clases.

    En esta lección, lo que vamos a ver es como crear un 'JavaBean' y cuales son las reglas para crear esta 
    Clase.

*/    