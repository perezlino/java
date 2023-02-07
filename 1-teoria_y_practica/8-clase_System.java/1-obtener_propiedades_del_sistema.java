/*  ======================================================
    ========== OBTENER PROPIEDADES DEL SISTEMA ===========
    ======================================================

    Continuamos con la clase System de Java, la vamos a ver mucho más en detalle. Por ejemplo, 
    cómo obtener, leer todas las propiedades del sistema, configuraciones propias del sistema 
    operativo, del entorno, desarrollo, de nuestro entorno. Por ejemplo, nombre de usuarios, 
    directorio del usuario, alguna variable ambiente como JAVA HOME, la variable Pad, la versión 
    de Java. En fin, varias configuraciones de nuestro sistema que podemos utilizar en nuestras 
    aplicaciones Java.

*/
    import java.util.Properties;

    public class EjemploPropiedadesDeSistema {
        public static void main(String[] args) {

            // Nombre de usuario del Sistema operativo
            String username = System.getProperty("user.name");
            System.out.println("username = " + username);
            
            // Ruta del usuario del Sistema operativo
            String home = System.getProperty("user.home");
            System.out.println("home = " + home);
            
            // Ruta del proyecto
            String workspace = System.getProperty("user.dir");
            System.out.println("workspace = " + workspace);
            
            // Version de Java
            String java = System.getProperty("java.version");
            System.out.println("java = " + java);

            // Salto de línea
            String lineSeparator = System.getProperty("line.separator");
            String lineSeparator2 = System.lineSeparator();
            System.out.println("lineSeparator:" + lineSeparator2 + "Una línea nueva ...");

            // Listar las propiedades del sistema
            Properties p = System.getProperties();
            p.list(System.out);
        }
    }
/* 

username = Alfonso
home = C:\Users\Alfonso
workspace = C:\github\java
java = 1.8.0_321
lineSeparator:
Una línea nueva ...
-- listing properties --
java.runtime.name=Java(TM) SE Runtime Environment
sun.boot.library.path=C:\Program Files\Java\jre1.8.0_321\bin
java.vm.version=25.321-b07
java.vm.vendor=Oracle Corporation
java.vendor.url=http://java.oracle.com/
path.separator=;
java.vm.name=Java HotSpot(TM) 64-Bit Server VM
file.encoding.pkg=sun.io
user.script=
user.country=CL
sun.java.launcher=SUN_STANDARD
sun.os.patch.level=
java.vm.specification.name=Java Virtual Machine Specification
user.dir=C:\github\java
java.runtime.version=1.8.0_321-b07
java.awt.graphicsenv=sun.awt.Win32GraphicsEnvironment
java.endorsed.dirs=C:\Program Files\Java\jre1.8.0_321\li...
os.arch=amd64
java.io.tmpdir=C:\Users\Alfonso\AppData\Local\Temp\
line.separator=

java.vm.specification.vendor=Oracle Corporation
user.variant=
os.name=Windows 10
sun.jnu.encoding=Cp1252
java.library.path=C:\Program Files\Java\jre1.8.0_321\bi...
java.specification.name=Java Platform API Specification
java.class.version=52.0
sun.management.compiler=HotSpot 64-Bit Tiered Compilers
os.version=10.0
user.home=C:\Users\Alfonso
user.timezone=
java.awt.printerjob=sun.awt.windows.WPrinterJob
file.encoding=Cp1252
java.specification.version=1.8
user.name=Alfonso
java.class.path=C:\Users\Alfonso\AppData\Roaming\Code...
java.vm.specification.version=1.8
sun.arch.data.model=64
java.home=C:\Program Files\Java\jre1.8.0_321
sun.java.command=test.prueba.test
java.specification.vendor=Oracle Corporation
user.language=es
awt.toolkit=sun.awt.windows.WToolkit
java.vm.info=mixed mode
java.version=1.8.0_321
java.ext.dirs=C:\Program Files\Java\jre1.8.0_321\li...
sun.boot.class.path=C:\Program Files\Java\jre1.8.0_321\li...
sun.stderr.encoding=cp850
java.vendor=Oracle Corporation
file.separator=\
java.vendor.url.bug=http://bugreport.sun.com/bugreport/
sun.cpu.endian=little
sun.io.unicode.encoding=UnicodeLittle
sun.stdout.encoding=cp850
sun.desktop=windows
sun.cpu.isalist=amd64 

*/