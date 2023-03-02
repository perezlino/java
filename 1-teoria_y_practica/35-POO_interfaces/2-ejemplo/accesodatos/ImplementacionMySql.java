package accesodatos;

// Lo siguiente es que vamos a agregar la implementación de esta 'Interface' y la primera implementación que 
// vamos a utilizar es la implementación de 'MySql'. Así que vamos a simular una implementación, no va a ser 
// una conexión real a la base de datos de 'MySql', sino que, vamos simplemente a simular las operaciones 
// pero con esto lo que vamos a hacer es implementar la 'Interface' y agregar el comportamiento de los métodos 
// de 'insertar', 'listar', 'actualizar' o 'eliminar'. Así que vamos a definir una Clase que implementa esta 
// 'Interface'.

                        public class ImplementacionMySql implements IAccesoDatos

// ¿Para qué hacemos esto? Básicamente, al hacer esto estamos obligando a estas Clases (ImplementacionMySql) 
// que quieren implementar la 'Interface' de 'IAccesoDatos', agregar el comportamiento definido en sus métodos. 
// Así que básicamente con esto lo que hacemos es 'obligar' a la Clase que 'implemente el comportamiento' del 
// metodo definido en la 'Interface'. ¿Cómo es que lo obligamos? Si no implementamos los métodos en esta Clase 
// (ImplementacionMySql), entonces, nos obliga a definir como abstracta esta Clase (ImplementacionMySql). De esta 
// manera, el compilador ya no nos mandaría error, pero entonces, tendríamos que agregar una Clase hija para poder 
// utilizar esta Clase ImplementacionMySql. 

// Y debido a que sí queremos utilizar esta Clase (ImplementacionMySql), entonces, no puede ser abstracta, ya que, 
// de lo contrario recordemos que no podríamos crear Objetos de una Clase abstracta. 

public class ImplementacionMySql implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Mysql");

    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Mysql");

    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Mysql");

    }
}