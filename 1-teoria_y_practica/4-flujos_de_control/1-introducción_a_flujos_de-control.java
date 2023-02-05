/*  ======================================================
    ========== INTRODUCCION A FLUJOS DE CONTROL ==========
    ======================================================

    
    IF ELSE
    =======
     _________________________________________________________________
    |                                                                 |  
    |   En la expresión podemos utilizar una variable del tipo:       |  
    |                                                                 |  
    |           int, byte, short, char, String y enum.                |      
    |_________________________________________________________________|
    

    - Ejecuta un bloque de código si alguna condición es verdadera.
     _________________________________________________________________
    |                                                                 |              
    |    if(expresion){                                               |      
    |        // ejecuta el bloque de código si cumple la condición    |
    |    }                                                            |          
    |_________________________________________________________________|

    - Si la expresión es falsa podemos hacer uso de 'else'.
     _________________________________________________________________
    |                                                                 |              
    |    if(expresion){                                               |      
    |        // ejecuta el bloque de código si cumple la condición    |
    |    }else{                                                       |  
    |       // sentencia a ejecutar si NO se cumple la condición      |  
    |    }                                                            |          
    |_________________________________________________________________|

    - O bien, una serie de comparaciones 'else if' y una sentencia 'else'.
     _________________________________________________________________
    |                                                                 |              
    |    if(expresion){                                               |      
    |        // ejecuta el bloque de código si cumple la condición    |
    |    }else if(expresion){                                         |  
    |       // sentencia a ejecutar si se cumple segunda condición    |  
    |    }else{                                                       |  
    |        sentencia a ejecutar si NO se cumple ninguna condición   |  
    |    }                                                            |          
    |_________________________________________________________________|



    SWITCH CASE
    ===========

    - La sentencia 'switch' o interruptor se utiliza para realizar sentencias
      condicionalmente basadas en alguna expresión.

    - De acuerdo al valor de la expresión se ejecuta la sentencia 'case' apropiada

    - La sentencia 'break' hace que el control salga de la sentencia 'switch' y 
      continue con la siguiente linea.
     ____________________________________________________________________________
    |                                                                            |              
    |    switch(variable){                                                       |  
    |        case valor1:                                                        |      
    |           // ejecuta la sentencia 1                                        |  
    |           break;                                                           |
    |        case valor2:                                                        |      
    |           // ejecuta la sentencia 2                                        |  
    |           break;                                                           |
    |        case valor3:                                                        |      
    |           // ejecuta la sentencia 3                                        |  
    |           break;                                                           |
    |        default:                                                            |      
    |           // Si no existe coincidencia, se ejecuta la sentencia default    |  
    |    }                                                                       |          
    |____________________________________________________________________________|



    SEPARADORES
    ===========
    
        Paréntensis ()
        --------------

        1.	Se utilizan para contener condiciones en sentencias de flujo de control

            if(expresion);
            switch(expresion);
            for(inicializacion;condicion;incremento);
            while(expresion);


        2.	Contienen listas de parámetros, tanto en la definición de un método como en la llamada al 
            mismo.

            public void run (String nombre){
                ...
            }

            // o bien en llamadas de un método
            objeto.run();

            Integer.parseInt(a);


        3.	También se utilizan para modificar la precedencia en una expresión.

            double promedio = (i + j + k) / 3d * 10;


        4.	También para realizar conversiones de tipo.

            int i = 22768;
            short s = (short) i;


        Llaves {}
        ---------

        1.	Se utilizan para definir bloques de código, definir ámbitos.

        if(condicion){
            ...
        };

        for(inicializacion;condicion;incremento){
            ...
        };

        while(condicion){
            ...
        };

        class Persona {
            public String getNombre(){
                ...
            }
        }


        2.	También para contener los valores iniciales de los arrays

        int[] numeros = {1,3,5,7,9,11};

        String[] nombres = {"Andres","Pepe","Maria","Bea","Pato"};


        Corchetes []
        ------------

        Se utiliza tanto para declarar arrays como para referenciar valores dentro de 
        los mismos.

        public static void main(String[] args){...}

        int[] numeros = {1,3,5,7,9,11};

        String[] nombres = new String[3];
        nombres[0] = "Andrés";
        nombres[1] = "Bruce";
        nombres[2] = "Maria";

        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);

*/