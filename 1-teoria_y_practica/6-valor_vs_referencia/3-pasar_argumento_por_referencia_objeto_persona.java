/*  ======================================================
    ==== PASAR ARGUMENTO POR REFERENCIA OBJETO PERSONA ===
    ======================================================

*/
    class Persona {
        private String nombre;

        public void modificarNombre(String nuevoNombre){
            nombre = nuevoNombre;
        }

        public String leerNombre(){
            return this.nombre;
        }
    }
    public class PasarPorReferencia2 {
        public static void main(String[] args) {

            Persona persona = new Persona();
            persona.modificarNombre("Alfonso");

            System.out.println("iniciamos el método main");

            System.out.println("persona.nombre = " + persona.leerNombre());
            System.out.println("Antes de llamar al método test");
            System.out.println("================================");
            test(persona);
            System.out.println("Después de llamar al método test");
            System.out.println("================================");

            System.out.println("persona.nombre = " + persona.leerNombre());

            System.out.println("Finaliza el método main con los datos de la persona modificados!");
        }

        public static void test(Persona persona){
            System.out.println("Iniciamos el método test");
            persona.modificarNombre("Pepe");
            System.out.println("Finaliza el método test");
        }
    }
/* 

iniciamos el método main
persona.nombre = Alfonso
Antes de llamar al método test
================================
Iniciamos el método test
Finaliza el método test
Después de llamar al método test
================================
persona.nombre = Pepe
Finaliza el método main con los datos de la persona modificados! 

*/