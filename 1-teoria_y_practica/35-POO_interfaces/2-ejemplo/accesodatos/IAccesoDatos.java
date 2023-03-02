package accesodatos;

//  Tambien existe la Herencia entre 'Interfaces'. Podemos extender de otra 'Interface'.

public interface IAccesoDatos {
    // - Cualquier atributo que definamos en una 'Interface' va a ser una CONSTANTE.
    // - Si agregamos atributos a una 'interface' van a ser 'constantes', en automático son atributos de 
    //   tipo 'public', 'final' y 'static'
    // - En un atributo de una 'Interface' debemos asignarle un valor de manera OBLIGATORIA.
    // - Una 'Interface' no tiene constructores. Solo va a tener metodos y todos los metodos seran 'abstractos'

    int MAX_REGISTRO = 10;
    
    // - Cualquier metodo que agreguemos va a ser 'public' y 'abstract'. Si no agregamos estas palabras, el
    //   compilador lo hara por nosotros.

    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
    
}