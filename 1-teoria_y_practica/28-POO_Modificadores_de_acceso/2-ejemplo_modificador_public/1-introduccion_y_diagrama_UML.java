/*  ======================================================
    ============ MODIFICADOR DE ACCESO PUBLIC ============
    ======================================================

     ______________________________________________________________________________
    |   Modificador   | Misma Clase | Mismo Paquete |  Subclase  | Todas las demas | 
    |-----------------|-------------|---------------|------------|-----------------|
    |   public ( + )  |      Si     |       Si      |     Si     |       Si        |           
    |-----------------|-------------|---------------|------------|-----------------|

     ______________                           ______________           
    |   paquete1   |                         |   paquete2   |   
    |--------------|-----------|             |--------------|-----------|
    |   ____________________   | <<extends>> |   ____________________   |
    |  |       Clase1       |<------------------|                    |  |    
    |  |--------------------|  |             |  |       Clase 3      |  | 
    |  | + id : atributo    |  |             |  |____________________|  | 
    |  |--------------------|  |             |                          |    
    |  | + metodo()         |  |             |   ____________________   |
    |  |--------------------|  |             |  |                    |  |   
    |                          |             |  |      Clase2        |  |   
    |   ____________________   |             |  |____________________|  |
    |  |                    |  |             |                          |
    |  |      Clase2        |  |             |--------------------------|
    |  |____________________|  | 
    |                          | 
    |--------------------------|

*/