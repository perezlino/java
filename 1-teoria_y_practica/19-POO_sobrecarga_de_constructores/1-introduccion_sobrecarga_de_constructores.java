/*  ======================================================
    ==== INTRODUCCION A LA SOBRECARGA DE CONSTRUCTORES ===
    ======================================================


    ¿QUE ES LA SOBRECARGA DE CONSTRUCTORES?
    =======================================

    -   La sobrecarga de constructores quiere decir que tenemos uno o mas constructores definidos
        dentro de nuestra clase, pero con diferentes argumentos.

        Ejemplo para la Clase 'Persona' creamos 4 constructores:

        Constructor vacio
        -----------------
        public Persona(){

        }

        Constructor con un argumento
        ----------------------------
        public Persona(String nombre){
            this.nombre = nombre;
        }

        Constructor con dos argumentos
        ------------------------------
        public Persona(String nombre, char genero){
            this.nombre = nombre;
        }

        Constructor con todos los argumentos
        ------------------------------------
        public Persona(String nombre, char genero, int edad, String direccion){
            this.nombre = nombre;
            this.genero = genero;
            this.edad = edad;
            this.direccion = direccion;
        }        

        Tambien podria ser así para optimizar el codigo.

        public Persona(String nombre, char genero, int edad, String direccion){
            this(nombre, genero);
            this.edad = edad;
            this.direccion = direccion;
        }            

*/  