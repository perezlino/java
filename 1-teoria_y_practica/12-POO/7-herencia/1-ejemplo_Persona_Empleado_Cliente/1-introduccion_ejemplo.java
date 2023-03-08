/*  ======================================================
    =========== INTRODUCCION EJEMPLO HERENCIA ============
    ======================================================

                          ________________________________
                         |             Persona            |      
                         |--------------------------------|
                         | nombre : String                |  
                         | genero : char                  |  
                         | edad : int                     |  
                         | direccion : String             |  
                         |--------------------------------|
                         | + getNombre() : String         |  
                         | + setNombre(String) : void     |  
                         | + getGenero() : char           |  
                         | + setGenero(char) : void       |  
                         | + getEdad() : int              |  
                         | + setEdad(int) : void          |  
                         | + getDireccion() : String      |  
                         | + setDireccion(String) : void  |
                         |--------------------------------|
                                         ^
                        <<extends>>      |    <<extends>> 
                    _____________________|_____________________
                   |                                           | 
                   |                                           | 
     _____________________________            __________________________________   
    |           Empleado          |          |              Cliente             |
    |-----------------------------|          |----------------------------------|
    | - idEmpleado : int          |          | - idCliente : int                |    
    | - sueldo : double           |          | - fechaRegistro : Date           |    
    |-----------------------------|          | - vip : boolean                  |
    | + getIdEmpleado() : int     |          |----------------------------------|     
    | + getSueldo() : double      |          | + getIdCliente() : int           |    
    | + setSueldo(double) : void  |          | + getFechaRegistro() : Date      |    
    |-----------------------------|          | + setFechaRegistro(Date) : void  |             
                                             | + idVip() : boolean              |    
                                             | + setVip(boolean) : void         |    
                                             |----------------------------------|  

    - La Clase 'Empleado' y 'Cliente' al ser "extends" de la Clase 'Persona' van a heredar TODAS 
      las caracteristicas de la Clase 'Persona' que sean posibles de heredar.
    
    - Todo lo que sea definido como 'privado' en la clase 'Persona' no es posible heredarlo. 

    - Aquellos atributos y metodos que posean modificadores de acceso 'public' y 'protected' en la
      Clase 'Persona' seran posibles de heredar.

*/    