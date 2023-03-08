package mx.com.gm.peliculas.datos;

/* 
    Vamos a definir la Interface AccesoDatos y posteriormente vamos a definir una Clase que implementa esta interface.
    Esto es importante, ya que, posteriormente el siguiente paquete, por ejemplo, en este caso el paquete de negocio, 
    lo que va a hacer es utilizar el tipo Interface, así que en este caso la Clase CatalogoPeliculasImpl que implementa, 
    a su vez, la Interface de CatalogoPeliculas, no va a utilizar directamente la Clase AccesoDatosImp, así que esto no 
    se va a realizar, no va a haber conexión directa entre Clases, sino, que vamos a utilizar los tipos Interface. Y 
    esta es una práctica muy común en Java, ya que, es una de las mejores prácticas que podemos aplicar. Con esto lo 
    que vamos a lograr es aplicar el concepto que se conoce como Bajo acoplamiento y alta cohesión. Bajo acoplamiento 
    porque nuestras Clases directamente, si tienen alguna modificación, si trabajamos directamente con las Clases, 
    entonces, nos puede afectar nuestro código, pero si trabajamos con tipo Interface, entonces, podemos modificar nuestro 
    código de las Clases que implementan los métodos definidos en las Interfaces y entonces no estamos afectando a las 
    demás capas, debido a que nuestra Interface solamente contiene la firma de los métodos, pero no contiene cómo es que 
    se realiza todo ese trabajo. Para ello tenemos las Clases que implementan las Interfaces. Así que esto se le conoce 
    como Bajo acoplamiento y alta cohesión.
*/

import java.util.List;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;


public interface IAccesoDatos {

    boolean existe(String nombreRecurso) throws AccesoDatosEx;

    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;

    void crear(String nombreRecurso) throws AccesoDatosEx;

    void borrar(String nombreRecurso) throws AccesoDatosEx;
}	