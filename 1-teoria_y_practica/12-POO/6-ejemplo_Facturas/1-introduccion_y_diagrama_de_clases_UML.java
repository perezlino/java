/*  ======================================================
    ======= INTRODUCCION Y DIAGRAMA DE CLASES UML ========
    ======================================================

    - Un cliente puede tener asociado muchas facturas. Y una factura solo puede tener 
      asociado un cliente.

    - Una factura puede tener varios itemsFactura. Será un array.

                                    ___________________________
                                   |          Factura          |  
     __________________            |---------------------------|  
    |      Cliente     |           |- cliente : Cliente        | 
    |------------------|           |- items : ItemFactura[]    |     
    |- nombre : String |<----------|- folio : Integer          | 
    |- nif : String    |           |- descripcion : String     | 
    |------------------|           |- fecha : Date             | 
                                   |---------------------------|
                                   |+ calcularTotal() : Double |
                                   |+ verDetalle() : String    | 
                                   |---------------------------|  
                                                ^                
                                                |
                                                |
                                                |
                                                |
                                    _____________________________        
                                   |          ItemFactura        |   
                                   |-----------------------------|            ___________________
                                   |- producto : Producto        |           |     Producto      |
                                   |- cantidad : Integer         |---------->|-------------------|   
                                   |-----------------------------|           |- codigo : Integer |  
                                   |+ calcularImporte() : Double |           |- nombre : String  | 
                                   |-----------------------------|           |- precio : Double  |  
                                                                             |-------------------|              

*/