/*  ===========================================================
    OTRAS CARACTERÍSTICAS Y FUNCIONES ÚTILES DE LA CLASE SYSTEM
    ===========================================================

    También recordar que la clase System contiene solamente métodos y atributos estáticos, nada más. 
    De hecho, la clase System está diseñada para que no se pueda instanciar con el operador new, no 
    se puede crear una instancia y tampoco se puede crear una clase que extienda de ella una subclase 
    o clase.
     __________________________________________________________________________________________________
    |                                                                                                  |         
    |   err                                                                                            |      
    |   ---                                                                                            |             
    |   muestra el mensaje, el texto como un error, de hecho, aparece el texto en color rojo como un   | 
    |   error. Es mucho mejor para textos o mensajes de error usar esta forma. Si este punto era un    | 
    |   atributo estático, que también es un print stream igual que el out, pero para error.           | 
    |__________________________________________________________________________________________________|

    Caso 1
    ------
    Para un archivo que no existe, vemos la diferencia entre out y err:

    ...
    } catch (Exception e){
        System.out.println("No existe el archivo = " + e);
    }

    ...
    } catch (Exception e){
        System.err.println("No existe el archivo = " + e);
    }

     ________________________________________________________________________________________________________
    |                                                                                                        |         
    |   exit( )                                                                                              |   
    |   -------                                                                                              |   
    |   cuando todo sale correcto es igual a 0, pero cuando hay algún error es distinto a 0. Generalmente    |
    |   usamos 1 cuando se lanza una exepción, cuando ocurre una falla y se interrumpe el flujo de nuestra   |
    |   aplicación, el flujo normal, y nos salimos del programa. Entonces, con exit(1) terminamos. Si        |   
    |   ocurre un error, simplemente nos salimos, termina la aplicación.                                     |   
    |________________________________________________________________________________________________________|

    Caso 1
    ------
    ...
    } catch (Exception e){
        System.err.println("No existe el archivo = " + e);
        System.exit(1);
    }    
    
     __________________________________________________________________________________________________________
    |                                                                                                          | 
    |   main(args)                                                                                             |  
    |   ----------                                                                                             |             
    |   También podemos agregar la línea main(args) para que se vuelva a ejecutar el código inicial. En este   |
    |   caso se vuelve a realizar la pregunta de ingreso de la fecha:                                          | 
    |__________________________________________________________________________________________________________|

    Caso 1
    ------
    ...
    } catch (Exception e){
        System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
        System.err.println("El formato debe ser 'yyyy-MM-dd'");
        main(args);
    }
    
     ______________________________________________________________________________________________________________
    |                                                                                                              |     
    |   System.gc( )                                                                                               |     
    |   ------------                                                                                               |     
    |   Pero cuando tenemos un programa muy cargado como este caso, con muchos objetos, muchas instancias que      | 
    |   se están creando, en este caso del tipo String, podemos acelerar el garbage collector o el recolector      | 
    |   de basura, entonces lo podemos invocar de forma explícita y de esa forma invocamos el recolector y         | 
    |   automáticamente va eliminar todos los objetos que no se están utilizando, que están en desuso, que no      | 
    |   se están referenciando en ninguna parte de nuestra aplicación. Puede que estas instancias se hayan         | 
    |   utilizado anteriormente, pero después se tienen que borrar, eliminar de la memoria para liberar espacio.   | 
    |   Entonces eso lo podemos hacer con la clase System, por ejemplo. Puede ser al final de la aplicación o      | 
    |   entremedio.                                                                                                |         
    |                                                                                                              | 
    |   Entonces de esta forma lo invocamos de forma explícita para liberar espacio, pero es opcional solamente    | 
    |   cuando estamos trabajando con muchas instancias, muchos objetos, porque esto también se hace de forma      | 
    |   automática por la máquina virtual de Java, pero de esta forma estamos acelerando el proceso, lo estamos    | 
    |   forzando.                                                                                                  |  
    |______________________________________________________________________________________________________________|

*/
