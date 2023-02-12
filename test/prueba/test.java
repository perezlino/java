package test.prueba;

public class test {            
    public static void main(String[] args) {

    Automovil.setColorPatente(Color.AZUL);

    System.out.println("Automovil.VELOCIDAD_MAX_CARRETERA = " + Automovil.VELOCIDAD_MAX_CARRETERA);
    System.out.println("Automovil.ELOCIDAD_MAX_CIUDAD = " + Automovil.VELOCIDAD_MAX_CIUDAD);
/* 
    Automovil.VELOCIDAD_MAX_CARRETERA = 120
    Automovil.ELOCIDAD_MAX_CIUDAD = 60 
*/        

    Automovil subaru = new Automovil("Subaru", "Impreza");

    Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA); // <================== Agregamos

    subaru.setMotor(motorSubaru); //subaru.setCilindrada(2.0);

    subaru.setEstanque(new Estanque()); // Podriamos instanciarlo:
                                        // Estanque estanqueSubaru = new Estanque();
                                        // subaru.setEstanque();
                                        // ES LO MISMO!
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
    Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL); // <================== Agregamos

    Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, motorMazda); // 3.0

    mazda.setTipo(TipoAutomovil.PICKUP);

    mazda.setEstanque(new Estanque(45)); // <================== Agregamos

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
    //Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50); 
    Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));

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