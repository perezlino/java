/*  ======================================================
    ============ INTRODUCCION A LOS PAQUETES =============
    ======================================================


    ¿QUE SON LOS PAQUETES ?
    =======================

    - Son como un contenedor que nos permite agrupar y organizar nuestras clases!


    CARACTERISTICAS
    ===============

    - Agrupan y organizan nuestras clases

    - Además evitan conflictos de nombre entre clases

    - Según modificadores pueden ocultan el acceso a sus clases y/o a sus miembros


    ESTANDAR EN NOMBRES DE PAQUETES
    ===============================
    
    - Deben estar escrito completamente en minúscula y los subpackage se separan con un punto.

    - Típicamente las empresas utilizan la extensión de su dominio (com, org, es, cl, mx) seguido del 
      nombre del dominio, ejemplo:

        com.google      Directorio: com y Subdirectorio: google
        com.facebook
        com.aguzman

        com.aguzman.proyectoa       Directorio: com, Subdirectorio: aguzman y Sub-subdirectorio: proyectoa
        com.aguzman.proyectob
        com.aguzman.proyectoc

        com.aguzman.compras.proyectob
        com.aguzman.ventas.proyectob
        com.aguzman.soporte.proyectob
        

    DEFINIENDO EL PACKAGE EN NUESTRA CLASE
    ======================================
    
    - Utilizamos la palabra reservada package seguido del nombre del paquete:

        package com.aguzman.datos;
        public class Persona {
        }

    - Luego para utilizar la clase la debemos importar con "import"

        import com.aguzman.datos.Persona;


    UTILIZANDO UNA CLASE (Se recomienda utilizar IMPORT, como se muestra en el ejemplo de abajo)
    ====================

    package com.aguzman.prueba;
    public class TestMain {
        public static void main(String[] args) {
            com.aguzman.datos.Persona persona = new com.aguzman.datos.Persona();
        }
    }


    IMPORTANDO PARA UTILIZAR UNA CLASE
    ==================================
    
    package com.aguzman.prueba;
    import com.aguzman.datos.Persona;
    public class TestMain {
        public static void main(String[] args) {
            Persona persona = new Persona();
        }
    }


    IMPORTANDO TODAS LAS CLASES
    ===========================

    package com.aguzman.prueba;
    import com.aguzman.datos.*;
    public class TestMain {
        public static void main(String[] args) {
            Persona persona = new Persona();
        }
    }


    EVITANDO CONFLICTOS DE NOMBRES
    ==============================
    
    package com.aguzman.prueba;
    import com.aguzman.datos.Persona;
    public class TestMain {
        public static void main(String[] args) {
            Persona persona = new Persona();
            com.aguzman.otro.Persona persona2 = new com.aguzman.otro.Persona();
        }
    }


    IMPORT ESTÁTICO
    ===============

    package com.aguzman.prueba;
    import static com.aguzman.datos.Persona.saludar;
    public class TestMain {
        public static void main(String[] args) {
            String saludo = saludar();
        }
    }

*/    