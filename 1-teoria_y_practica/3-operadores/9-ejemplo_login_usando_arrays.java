/*  ======================================================
    = EJEMPLO OPERADORES LOGICOS - LOGIN (USANDO ARRAYS) =
    ======================================================


    FORMA A
    =======
*/
    import java.util.Scanner;

    public class OperadoresLogicosLogin {
        public static void main(String[] args) {
        
            // El "3" se refiere a que se guardan 3 posiciones en memoria en el array “usernames”:
            // String[] usernames = new String[3];

            String[] usernames = new String[3];
            String[] passwords = new String[3];

            usernames[0] = "andres";
            passwords[0] = "12345";

            usernames[1] = "admin";
            passwords[1] = "12345";

            usernames[2] = "pepe";
            passwords[2] = "12345";

            // usernames = {"andres","admin","pepe"}
            // passwords = {"12345","12345","12345"}

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el username");
            String u = scanner.next(); // Es lo mismo que nextLine()

            System.out.println("Ingrese el password");
            String p = scanner.next();

            boolean esAutenticado = false;

            for(int i = 0; i < usernames.length; i++){
                if( (usernames[i].equals(u) && passwords[i].equals(p)) ){
                    esAutenticado = true;
                    break;
                }
            }

           if(esAutenticado){
                System.out.println("Bienvenido usuario ".concat(u).concat("!"));
            } else {
                System.out.println("Username o contraseña incorrecto!");
                System.out.println("Lo siento, requiere autenticación");
            }
        }
    }
/*

    FORMA B
    =======
*/
    import java.util.Scanner;

    public class OperadoresLogicosLogin {
        public static void main(String[] args) {

            String[] usernames = {"andres", "admin", "pepe"};
            String[] passwords = {"123", "1234", "12345"};

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el username");
            String u = scanner.next(); // Es lo mismo que nextLine()

            System.out.println("Ingrese el password");
            String p = scanner.next();

            boolean esAutenticado = false;

            for(int i = 0; i < usernames.length; i++){

                // Se utiliza un operador ternario
                esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p))? true: esAutenticado;

                /*if( (usernames[i].equals(u) && passwords[i].equals(p)) ){
                    esAutenticado = true;
                    break;
                }*/
            }

            // Se utiliza un operador ternario
            String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!") :
                    "Username o contraseña incorrecto!\nLo sentimos, requiere autenticación";
            System.out.println("mensaje = " + mensaje);

            /*if(esAutenticado){
                System.out.println("Bienvenido usuario ".concat(u).concat("!"));
            } else {
                System.out.println("Username o contraseña incorrecto!");
                System.out.println("Los siento, requiere autenticación");
            }*/
        }
    }