/*  ======================================================
    ======== INTRODUCCION A LA PALABRA INSTANCEOF ========
    ======================================================


    El uso de la palabra instanceOf lo que significa es que vamos a poder determinar el 'tipo' 
    pero en tiempo de ejecución. Por 'tipo' nos referimos a lo que se ha creado del lado derecho.
    
                            Empleado empleado = new Empleado();
                                                --------------

    Recordemos que esto es lo que se asigna en la memoria, es la referencia. Así que 'instanceOf' 
    nos va a permitir preguntar de qué tipo es la referencia a la cual está apuntando cierta 
    variable. Recordemos, por ejemplo, en este caso que esta variable 'empleado' es de tipo 'Empleado', 
    así que si preguntáramos a la variable 'empleado' su tipo, nos regresaría que es de tipo 'Empleado'. 


    Sin embargo, en este caso en esta línea, si preguntamos cuál es el tipo del Objeto al cual está 
    apuntando, entonces la respuesta no sería la misma, ya que, nos indicaría que es de tipo 'Gerente'.

                                empleado = new Gerente();

    Así que una cosa es el tipo de la variable y otra cosa es el tipo al cual está apuntando en memoria.                          

*/