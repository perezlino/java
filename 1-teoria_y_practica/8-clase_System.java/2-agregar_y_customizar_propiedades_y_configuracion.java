/*  ======================================================
    == AGREGAR Y CUSTOMIZAR PROPIEDADES Y CONFIGURACIÓN ==
    ======================================================

    Hay dos formas, una es crear un archivo de propiedad con extensión ".properties" y ahí 
    colocar todas nuestras configuraciones con un nombre y un valor. Otra forma es asignar 
    vía método del objeto properties, el método set property.

    Para este ejemplo vamos a crear un archivo en src, un archivo de configuración con extensión 
    .properties.
*/
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.util.Properties;

    public class EjemploAsignarPropiedadesDeSistema {
        public static void main(String[] args) {

            // Nos pide y nos obliga a manejar utilizando TRY – CATCH, porque podría ocurrir que este 
            // archivo (config.properties) no se encuentre o no exista. 

            try {
                FileInputStream archivo = new FileInputStream("src/config.properties");

                // Acá tenemos entonces nuestro archivo y tenemos que agregarlo a un objeto Properties:
                // De esta forma cargamos la configuración del sistema en nuestro objeto Properties, pero 
                // además le agregamos las nuevas configuraciones del archivo.
/*               ____________________________________________________________________________________________________
                |                                                                                                    |        
                |   Pero este método "load" también nos pide manejar Error. Podría ocurrir un "IOException" de       |
                |   entrada y salida al tratar de leer el contenido, los bytes del archivo, entonces acá tenemos     |
                |   que manejar también Error. Pero lo podríamos hacer de forma genérica, tanto para "FileNotFound"  |
                |   y también para "IO". Simplemente colocamos "Exception" (en el 'catch') que es la clase genérica  |
                |   de excepción que se aplica tanto para cualquier objeto de excepción.                             |    
                |____________________________________________________________________________________________________|
*/
                Properties p = new Properties(System.getProperties());
                p.load(archivo);

                // Creo que al principio había explicado que hay otra forma de agregar configuraciones y es mediante 
                // el método del objeto Properties. El método "setProperty()". 
                p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");

                // Ahora, entonces tenemos que actualizar nuestro property en el System Properties, en las propiedades 
                // del sistema, para que estas configuraciones personalizadas se agreguen.                
                System.setProperties(p);

                // Entonces ahora podemos obtener la propiedad del sistema, actualizadas, y listarlas.
                // Usamos cualquiera de las dos
                System.getProperties().list(System.out);
                // Otra forma de hacer lo mismo:
                Properties ps = System.getProperties();
                ps.list(System.out); 


                // Y para finalizar, cómo obtener una propiedad personalizada? Vimos algo en la clase anterior con 
                // el System.getProperty.
                System.out.println("============================================");
                System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada"));
                System.out.println(System.getProperty("config.puerto.servidor"));
                System.out.println(System.getProperty("config.autor.nombre"));
                System.out.println(System.getProperty("config.autor.email"));                

            } catch(Exception e){
                System.err.println("no existe el archivo = " + e);
                System.exit(1);
            }
        }
    }
/* 

-- listing properties --
java.runtime.name=Java(TM) SE Runtime Environment
config.texto.ambiente=Configurando ambiente de desarrollo      <====================
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
config.autor.nombre=Alfonso           <====================                   
sun.jnu.encoding=Cp1252
mi.propiedad.personalizada=Mi valor guardado en el objeto proper...  <====================
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
config.puerto.servidor=8090            <====================
config.autor.email=alfonso@email.com   <====================
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
otra=algun valor                      <====================
sun.stdout.encoding=cp850
sun.desktop=windows
sun.cpu.isalist=amd64 
============================================
ps.getProperty(...) = Mi valor guardado en el objeto properties
8090
Alfonso
alfonso@email.com

*/    