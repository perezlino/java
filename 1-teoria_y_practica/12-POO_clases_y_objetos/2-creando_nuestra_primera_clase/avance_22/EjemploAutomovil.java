/*  ======================================================
    =========== CREANDO NUESTRA PRIMERA CLASE ============
    ======================================================

    ATRIBUTOS
    =========

    - El modificador 'static' hace que el atributo sea de la clase y no de la instancia.

    - El modificador 'final' hace que el atributo sea una constante que no se puede modificar.
      Solamente se define una vez en la clase y después se puede utilizar.

    METODOS
    =======

    - El método también puede ser estático y puede ser final.

    - Un 'metodo static' se pueden invocar de forma directa con la clase, sin crear el objeto con 
      la clase, el nombre de la clase punto, el método. Porque ese método no es del objeto, le pertenece 
      a la clase. No es necesario tener que crear la instancia.

    - Un 'metodo final' evita que ese método se modifique en la herencia.

*/
public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil.setColorPatente(Color.AZUL);

        System.out.println("Automovil.VELOCIDAD_MAX_CARRETERA = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Automovil.ELOCIDAD_MAX_CIUDAD = " + Automovil.VELOCIDAD_MAX_CIUDAD);
/* 
        Automovil.VELOCIDAD_MAX_CARRETERA = 120
        Automovil.ELOCIDAD_MAX_CIUDAD = 60 
*/        

        Automovil subaru = new Automovil("Subaru", "Impreza");

        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO); 
        subaru.setTipo(TipoAutomovil.HATCHBACK); 

        System.out.println(subaru.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(subaru.acelerarFrenar(3000));
        System.out.println("Kilometros por litro: " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("Kilometros por litro: " + subaru.calcularConsumo(300, 60));

        TipoAutomovil tipo = subaru.getTipo();

        System.out.println("tipo subaru: " + tipo.getNombre()); 
        System.out.println("tipo desc. subaru: " + tipo.getDescripcion()); 

        // ----------------------------------------------------------------------------------------------------
        tipo = subaru.getTipo();
        switch(tipo){
            case CONVERTIBLE :
                System.out.println("El automovil es deportivo y descapotable de dos puertas");
                break;
            case COUPE :
                System.out.println("Es un automovil pequeño de dos puertas y típicamente deportivo");
                break;                
            case FURGON :
                System.out.println("Es un automovil utilitario de transporte, de empresas");
                break;                
            case HATCHBACK :
                System.out.println("Es un automovil mediano compacto, aspecto deportivo");
                break;                
            case PICKUP :
                System.out.println("Es un automovil de doble cabina o camioneta");
                break;                
            case SEDAN :
                System.out.println("Es un automovil mediano");
                break;                
            case STATION_WAGON :
                System.out.println("Es un automovil más grande, con maleta grande...");
                break;
        } 

/*      A partir de JAVA podemos optimizar el codigo anterior de la siguiente forma:

        tipo = subaru.getTipo();
        switch(tipo){
            case CONVERTIBLE ->
                System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE ->
                System.out.println("Es un automovil pequeño de dos puertas y típicamente deportivo");
            case FURGON ->
                System.out.println("Es un automovil utilitario de transporte, de empresas");
            case HATCHBACK ->
                System.out.println("Es un automovil mediano compacto, aspecto deportivo");
            case PICKUP ->
                System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN ->
                System.out.println("Es un automovil mediano");
            case STATION_WAGON ->
                System.out.println("Es un automovil más grande, con maleta grande...");
        
        // ----------------------------------------------------------------------------------------------------                               
  
        auto.id = 1
        auto.fabricante = Subaru
        auto.modelo = Impreza
        auto.tipo = Auto compacto
        auto.color = Blanco
        auto.patenteColor = Azul
        auto.cilindrada = 2.0
        El auto Subaru acelerando a 3000 rpm
        Subaru Impreza frenando!
        El auto Subaru acelerando a 3000 rpm
        Subaru Impreza frenando!
        Kilometros por litro: 12.5
        Kilometros por litro: 12.5
        tipo subaru: Hatchback
        tipo desc. subaru: Auto compacto
        Es un automovil mediano compacto, aspecto deportivo <======================= Valor obtenido con el SWITCH      
*/  
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.0);

        mazda.setTipo(TipoAutomovil.PICKUP);

        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerar(3000));
        System.out.println(mazda.frenar()); 
        System.out.println(mazda.acelerarFrenar(4000)); 
        
/* 
        auto.id = 2
        auto.fabricante = Mazda
        auto.modelo = BT-50
        auto.tipo = Camioneta
        auto.color = Rojo
        auto.patenteColor = Azul
        auto.cilindrada = 3.0
        El auto Mazda acelerando a 3000 rpm
        Mazda BT-50 frenando!
        El auto Mazda acelerando a 4000 rpm
        Mazda BT-50 frenando!
*/
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50); 

        nissan.setTipo(TipoAutomovil.PICKUP);     
        
        System.out.println(nissan.verDetalle());
        System.out.println("Kilometros por litro: " + nissan.calcularConsumo(300, 60));
/* 
        auto.id = 3
        auto.fabricante = Nissan
        auto.modelo = Navara
        auto.tipo = Camioneta
        auto.color = Gris Oscuro
        auto.patenteColor = Azul
        auto.cilindrada = 3.5
        Kilometros por litro: 9.999999
*/        
    }
}  