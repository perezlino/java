/*  ======================================================
    ======== INTRODUCCION A LA ENUMERACION (ENUM) ========
    ======================================================

    Una 'Enumeracion' es un tipo similar a una Clase, pero es una Clase particular que contiene varios
    elementos. Y por ello se le conoce como 'Enumeracion', ya que, va a contener varios elementos
    definidos dentro de esta enumeracion.

*/
package enumeracion;

// La diferencia entre una Clase y una Enumeracion, es que en lugar de utilizar la palabra reservada 'class'
// vamos a utilizar la la palabra reservada 'enum'.

public enum Dias {

    // Lo interesante de los elementos de la Enumeracion es que por defecto son elementos 'publicos', 
    // 'estaticos' y 'finales'. Asi que todos los elementos que agreguemos en una Enumeracion son
    // 'Constantes'. Recordemos que una 'Constante' es 'publica, 'estatica' y 'final'.

    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO

}