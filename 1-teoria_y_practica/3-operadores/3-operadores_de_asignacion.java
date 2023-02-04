/*  ======================================================
    ============== OPERADORES DE ASIGNACION ==============
    ======================================================

*/ 
    public class OperadoresAsignacion {
        public static void main(String[] args) {

            int i = 5;
            int j = i + 4;
            System.out.println("i = " + i); // i = 5
            System.out.println("j = " + j); // j = 9
            
            i += 2; // i = i + 2
            System.out.println("i = " + i); // i = 7

            i += 5; // i = i + 5
            System.out.println("i = " + i); // i = 12
            
            j -= 4; // j = j - 4
            System.out.println("j = " + j); // j = 5
            
            j *= 3; // j = j * 3;
            System.out.println("j = " + j); // j = 15
            
            String sqlString = "select * from clientes as c";
            sqlString += " where c.nombre = 'Andres' ";
            sqlString += " and c.activo = 1";
            System.out.println("sqlString = " + sqlString);
            // select * from clientes as c where c.nombre = 'Andres' and c.activo = 1
        }
    }