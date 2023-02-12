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

        // ------------------------------------------------------------------------------------------------
        // Agregamos
        Persona conductorSubaru = new Persona("Luci", "Martínez");
        // ------------------------------------------------------------------------------------------------

        // ------------------------------------------------------------------------------------------------
        // Agregamos
        Rueda[] ruedasSubaru = new Rueda[5];
        ruedasSubaru[0] = new Rueda("Yokohama", 16, 7.5);
        ruedasSubaru[1] = new Rueda("Yokohama", 16, 7.5);
        ruedasSubaru[2] = new Rueda("Yokohama", 16, 7.5);
        ruedasSubaru[3] = new Rueda("Yokohama", 16, 7.5);
        ruedasSubaru[4] = new Rueda("Yokohama", 16, 7.5);
        // ------------------------------------------------------------------------------------------------

        Automovil.setColorPatente(Color.AZUL);

        System.out.println("Automovil.VELOCIDAD_MAX_CARRETERA = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Automovil.ELOCIDAD_MAX_CIUDAD = " + Automovil.VELOCIDAD_MAX_CIUDAD);
/* 
        Automovil.VELOCIDAD_MAX_CARRETERA = 120
        Automovil.ELOCIDAD_MAX_CIUDAD = 60 
*/        

        Automovil subaru = new Automovil("Subaru", "Impreza");

        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);

        subaru.setMotor(motorSubaru);

        subaru.setEstanque(new Estanque()); 
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK); 
        subaru.setConductor(conductorSubaru); // <======================== Agregamos
        subaru.setRuedas(ruedasSubaru); // <======================== Agregamos
        
        System.out.println(subaru.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(subaru.acelerarFrenar(3000));
        System.out.println("Kilometros por litro: " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("Kilometros por litro: " + subaru.calcularConsumo(300, 60));

        TipoAutomovil tipo = subaru.getTipo();

        System.out.println("tipo subaru: " + tipo.getNombre()); 
        System.out.println("tipo desc. subaru: " + tipo.getDescripcion()); 

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

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for(TipoAutomovil ta: tipos){
            System.out.print(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuerta());
            System.out.println();
        }

/* 
        auto.id = 1
        auto.fabricante = Subaru
        auto.modelo = Impreza
        auto.tipo = Auto compacto
        auto.color = Blanco
        auto.patenteColor = Azul
        auto.cilindrada = 2.0
        Conductor: Luci Martínez   <============ 
        Ruedas del automóvil:
        Yokohama, aro: 16, ancho: 7.5    <============ 
        Yokohama, aro: 16, ancho: 7.5    <============ 
        Yokohama, aro: 16, ancho: 7.5    <============ 
        Yokohama, aro: 16, ancho: 7.5    <============ 
        Yokohama, aro: 16, ancho: 7.5    <============ 
        El auto Subaru acelerando a 3000 rpm
        Subaru Impreza frenando!
        El auto Subaru acelerando a 3000 rpm
        Subaru Impreza frenando!
        Kilometros por litro: 12.5
        Kilometros por litro: 12.5
        tipo subaru: Hatchback
        tipo desc. subaru: Auto compacto
        Es un automovil mediano compacto, aspecto deportivo
        SEDAN => SEDAN, Sedan, Auto mediano, 4
        STATION_WAGON => STATION_WAGON, Station Wagon, Auto grande, 5    
        HATCHBACK => HATCHBACK, Hatchback, Auto compacto, 5              
        PICKUP => PICKUP, Pickup, Camioneta, 4                           
        COUPE => COUPE, Coupé, Auto pequeño, 2                           
        CONVERTIBLE => CONVERTIBLE, Convertible, Auto deportivo, 2       
        FURGON => FURGON, Furgón, Auto utilitario, 3                     
        SUV => SUV, SUV, Todo terreno deportivo, 5                       
*/  
        // ------------------------------------------------------------------------------------------------
        // Agregamos        
        Persona conductorMazda = new Persona("Patricio", "Rodríguez");
        // ------------------------------------------------------------------------------------------------

        // ------------------------------------------------------------------------------------------------
        // Agregamos 
        Rueda[] ruedasMazda = {new Rueda("Michelin", 20, 11.5),
                               new Rueda("Michelin", 20, 11.5),
                               new Rueda("Michelin", 20, 11.5),
                               new Rueda("Michelin", 20, 11.5),
                               new Rueda("Michelin", 20, 11.5)};
        // ------------------------------------------------------------------------------------------------

        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL); 

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, motorMazda);

        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque(45));
        mazda.setConductor(conductorMazda); // <======================== Agregamos
        mazda.setRuedas(ruedasMazda); // <======================== Agregamos

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
        Conductor: Patricio Rodríguez    <============ 
        Ruedas del automóvil:               <============ 
        Michelin, aro: 20, ancho: 11.5    <============ 
        Michelin, aro: 20, ancho: 11.5    <============ 
        Michelin, aro: 20, ancho: 11.5    <============ 
        Michelin, aro: 20, ancho: 11.5    <============ 
        Michelin, aro: 20, ancho: 11.5    <============ 
        El auto Mazda acelerando a 3000 rpm
        Mazda BT-50 frenando!
        El auto Mazda acelerando a 4000 rpm
        Mazda BT-50 frenando!
*/
        // ------------------------------------------------------------------------------------------------
        // Agregamos        
        Persona conductorNissan = new Persona("Beatriz", "González");
        // ------------------------------------------------------------------------------------------------        

        // ------------------------------------------------------------------------------------------------
        // Agregamos 
        Rueda[] ruedasNissan = {new Rueda("Pirelli", 20, 11.5),
        new Rueda("Pirelli", 20, 11.5),
        new Rueda("Pirelli", 20, 11.5),
        new Rueda("Pirelli", 20, 11.5),
        new Rueda("Pirelli", 20, 11.5)};
        // ------------------------------------------------------------------------------------------------        

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL), 
                            new Estanque(50), conductorNissan, ruedasNissan); // Agregamos 'conductorNissan' 
                                                                                        // y 'ruedasNissan'
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
        auto.cilindrada = 4.0
        Conductor: Beatriz González    <============ 
        Ruedas del automóvil:                <============ 
        Pirelli, aro: 20, ancho: 11.5    <============ 
        Pirelli, aro: 20, ancho: 11.5    <============ 
        Pirelli, aro: 20, ancho: 11.5    <============ 
        Pirelli, aro: 20, ancho: 11.5    <============ 
        Pirelli, aro: 20, ancho: 11.5    <============         
        Kilometros por litro: 9.999999
*/        
    }
}  