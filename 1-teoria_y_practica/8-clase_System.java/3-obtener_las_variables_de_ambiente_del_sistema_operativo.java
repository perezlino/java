/*  =======================================================
    OBTENER LAS VARIABLES DE AMBIENTE DEL SISTEMA OPERATIVO 
    =======================================================

    Vamos a ver cómo acceder a esta variable ambiente desde Java utilizando la clase System con el 
    "método getenv()".

    Vamos a utilizar 'Map'. En resumen, un mapa de Java es como un array asociativo que asocia valores 
    que están guardados con un nombre. Entonces guardamos elementos, objetos de cualquier tipo y lo 
    podemos asignar a un nombre. Se le conoce como llave-valor y tenemos que indicar con los paréntesis 
    triangulares.

    Y acá se imprimen todas las variables del sistema, todas. En general se escriben con mayúscula 
    completamente y palabra compuesta separada con guion bajo, muy parecida a las constantes en Java. 
    Pero también hay veces que se escriben de distinta forma como acá, pero lo típico es con mayúscula 
    y separada con guion bajo.

*/
    import java.util.Map;

    public class EjemploVariablesDeEntorno {
        public static void main(String[] args) {

            Map<String, String> varEnv = System.getenv();
            System.out.println("Variables de ambiente del sistema = " + varEnv);

            // Vamos a utilizar un FOR para iterar las variables de entorno del Map y de esta manera 
            // queden en lista:
            System.out.println("========== Listando variables de entorno del sistema ==========");
            for(String key: varEnv.keySet()){
                System.out.println(key + " => " + varEnv.get(key));
            }
            
            // ¿Ahora, como puedo obtener una variable en particular?
            System.out.println("========== Variables especificas ==========");
            String username = System.getenv("USERNAME");
            System.out.println("username = " + username);
            
            String javaHome = System.getenv("JAVA_HOME");
            System.out.println("javaHome = " + javaHome);

            String temDir = System.getenv("TEMP");
            System.out.println("temDir = " + temDir);

            String path = System.getenv("Path");
            System.out.println("path = " + path);

            String path2 = varEnv.get("Path");
            System.out.println("path2 = " + path2);

            String appEnv = varEnv.get("APPLICATION_ENV");
            System.out.println("appEnv = " + appEnv);

            String hola = varEnv.get("SALUDAR_HOLA");
            System.out.println("hola = " + hola);
        }
    }
/* 

Variables de ambiente del sistema = {USERDOMAIN_ROAMINGPROFILE=LAPTOP-5AQJOUQN, PROCESSOR_LEVEL=6, RegionCode=LA, 
SESSIONNAME=Console, ALLUSERSPROFILE=C:\ProgramData, PROCESSOR_ARCHITECTURE=AMD64, 
VSCODE_GIT_IPC_HANDLE=\\.\pipe\vscode-git-8cf3226253-sock, 
PSModulePath=C:\Users\Alfonso\Documents\WindowsPowerShell\Modules;C:\Program Files\WindowsPowerShell\Modules;
C:\windows\system32\WindowsPowerShell\v1.0\Modules;C:\Program Files (x86)\Microsoft SQL Server\150\Tools\PowerShell\
Modules\, SystemDrive=C:, COLORTERM=truecolor, USERNAME=Alfonso, VSCODE_GIT_ASKPASS_NODE=C:\Users\Alfonso\AppData\
Local\Programs\Microsoft VS Code\Code.exe, TERM_PROGRAM_VERSION=1.75.0, ProgramFiles(x86)=C:\Program Files (x86), 
GIT_ASKPASS=c:\Users\Alfonso\AppData\Local\Programs\Microsoft VS Code\resources\app\extensions\git\dist\askpass.sh, 
CHROME_CRASHPAD_PIPE_NAME=\\.\pipe\LOCAL\crashpad_2184_LLVQRKLMWECNQUVR, FPS_BROWSER_USER_PROFILE_STRING=Default, 
PATHEXT=.COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC;.CPL, DriverData=C:\Windows\System32\Drivers\DriverData, 
platformcode=KV, ORIGINAL_XDG_CURRENT_DESKTOP=undefined, ProgramData=C:\ProgramData, ProgramW6432=C:\Program Files, 
HOMEPATH=\Users\Alfonso, PROCESSOR_IDENTIFIER=Intel64 Family 6 Model 126 Stepping 5, GenuineIntel, 
HADOOP_HOME=C:\winutils, ProgramFiles=C:\Program Files, PUBLIC=C:\Users\Public, windir=C:\windows, ZES_ENABLE_SYSMAN=1, 
OneDriveCommercial=C:\Users\Alfonso\OneDrive - UNIVERSIDAD ANDRES BELLO, LOCALAPPDATA=C:\Users\Alfonso\AppData\Local,
USERDOMAIN=LAPTOP-5AQJOUQN, FPS_BROWSER_APP_PROFILE_STRING=Internet Explorer, LOGONSERVER=\\LAPTOP-5AQJOUQN, 
JAVA_HOME=C:\Program Files\Java\jdk1.8.0_321, LANG=es_ES.UTF-8, VSCODE_GIT_ASKPASS_MAIN=c:\Users\Alfonso\AppData\Local\
Programs\Microsoft VS Code\resources\app\extensions\git\dist\askpass-main.js, 
OneDrive=C:\Users\Alfonso\OneDrive - UNIVERSIDAD ANDRES BELLO, APPDATA=C:\Users\Alfonso\AppData\Roaming, 
SPARK_HOME=C:\spark-3.2.1-bin-hadoop2.7, VSCODE_GIT_ASKPASS_EXTRA_ARGS=--ms-enable-electron-run-as-node, 
CommonProgramFiles=C:\Program Files\Common Files, Path=C:\Program Files\Common Files\Oracle\Java\javapath;
C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\windows\system32;C:\windows;C:\windows\System32\Wbem;
C:\windows\System32\WindowsPowerShell\v1.0\;C:\windows\System32\OpenSSH\;C:\Program Files\Calibre2\;
C:\Program Files\Microsoft SQL Server\Client SDK\ODBC\170\Tools\Binn\;C:\Program Files\Azure Data Studio\bin;
C:\Program Files (x86)\Microsoft SQL Server\150\Tools\Binn\;C:\Program Files\Microsoft SQL Server\150\Tools\Binn\;
C:\Program Files (x86)\Microsoft SQL Server\150\DTS\Binn\;C:\Program Files\Microsoft SQL Server\150\DTS\Binn\;
C:\Program Files\Microsoft SQL Server\130\Tools\Binn\;C:\Program Files (x86)\Microsoft SQL Server\110\DTS\Binn\;
C:\Program Files (x86)\Microsoft SQL Server\120\DTS\Binn\;C:\Program Files (x86)\Microsoft SQL Server\130\DTS\Binn\;
C:\Program Files (x86)\Microsoft SQL Server\140\DTS\Binn\;C:\Program Files\Git\cmd;C:\Program Files (x86)\scala\bin;
C:\Program Files\Docker\Docker\resources\bin;C:\Users\Alfonso\miniconda3;
C:\Users\Alfonso\miniconda3\Library\mingw-w64\bin;C:\Users\Alfonso\miniconda3\Library\usr\bin;
C:\Users\Alfonso\miniconda3\Library\bin;C:\Users\Alfonso\miniconda3\Scripts;
C:\Users\Alfonso\AppData\Local\Microsoft\WindowsApps;C:\Program Files\Azure Data Studio\bin;
C:\Program Files\Java\jdk1.8.0_321\bin;C:\spark-3.2.1-bin-hadoop2.7\bin;
C:\Users\Alfonso\AppData\Local\Programs\Microsoft VS Code\bin, OS=Windows_NT, TERM_PROGRAM=vscode, 
COMPUTERNAME=LAPTOP-5AQJOUQN, OnlineServices=Online Services, PROCESSOR_REVISION=7e05, 
CommonProgramW6432=C:\Program Files\Common Files, ComSpec=C:\windows\system32\cmd.exe, SystemRoot=C:\windows, 
TEMP=C:\Users\Alfonso\AppData\Local\Temp, HOMEDRIVE=C:, USERPROFILE=C:\Users\Alfonso, 
TMP=C:\Users\Alfonso\AppData\Local\Temp, CommonProgramFiles(x86)=C:\Program Files (x86)\Common Files, 
NUMBER_OF_PROCESSORS=8}

========== Listando variables de entorno del sistema ==========
USERDOMAIN_ROAMINGPROFILE => LAPTOP-5AQJOUQN
PROCESSOR_LEVEL => 6
RegionCode => LA
SESSIONNAME => Console
ALLUSERSPROFILE => C:\ProgramData
PROCESSOR_ARCHITECTURE => AMD64
VSCODE_GIT_IPC_HANDLE => \\.\pipe\vscode-git-8cf3226253-sock
PSModulePath => C:\Users\Alfonso\Documents\WindowsPowerShell\Modules;C:\Program Files\WindowsPowerShell\Modules;C:\windows\system32\WindowsPowerShell\v1.0\Modules;C:\Program Files (x86)\Microsoft SQL Server\150\Tools\PowerShell\Modules\
SystemDrive => C:
COLORTERM => truecolor
USERNAME => Alfonso
VSCODE_GIT_ASKPASS_NODE => C:\Users\Alfonso\AppData\Local\Programs\Microsoft VS Code\Code.exe
TERM_PROGRAM_VERSION => 1.75.0
ProgramFiles(x86) => C:\Program Files (x86)
GIT_ASKPASS => c:\Users\Alfonso\AppData\Local\Programs\Microsoft VS Code\resources\app\extensions\git\dist\askpass.sh
CHROME_CRASHPAD_PIPE_NAME => \\.\pipe\LOCAL\crashpad_2184_LLVQRKLMWECNQUVR
FPS_BROWSER_USER_PROFILE_STRING => Default
PATHEXT => .COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC;.CPL
DriverData => C:\Windows\System32\Drivers\DriverData
platformcode => KV
ORIGINAL_XDG_CURRENT_DESKTOP => undefined
ProgramData => C:\ProgramData
ProgramW6432 => C:\Program Files
HOMEPATH => \Users\Alfonso
PROCESSOR_IDENTIFIER => Intel64 Family 6 Model 126 Stepping 5, GenuineIntel
HADOOP_HOME => C:\winutils
ProgramFiles => C:\Program Files
PUBLIC => C:\Users\Public
windir => C:\windows
ZES_ENABLE_SYSMAN => 1
OneDriveCommercial => C:\Users\Alfonso\OneDrive - UNIVERSIDAD ANDRES BELLO
LOCALAPPDATA => C:\Users\Alfonso\AppData\Local
USERDOMAIN => LAPTOP-5AQJOUQN
FPS_BROWSER_APP_PROFILE_STRING => Internet Explorer
LOGONSERVER => \\LAPTOP-5AQJOUQN
JAVA_HOME => C:\Program Files\Java\jdk1.8.0_321
LANG => es_ES.UTF-8
VSCODE_GIT_ASKPASS_MAIN => c:\Users\Alfonso\AppData\Local\Programs\Microsoft VS Code\resources\app\extensions\git\dist\askpass-main.js     
OneDrive => C:\Users\Alfonso\OneDrive - UNIVERSIDAD ANDRES BELLO
APPDATA => C:\Users\Alfonso\AppData\Roaming
SPARK_HOME => C:\spark-3.2.1-bin-hadoop2.7
VSCODE_GIT_ASKPASS_EXTRA_ARGS => --ms-enable-electron-run-as-node
CommonProgramFiles => C:\Program Files\Common Files
Path => C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\windows\system32;C:\windows;C:\windows\System32\Wbem;C:\windows\System32\WindowsPowerShell\v1.0\;C:\windows\System32\OpenSSH\;C:\Program Files\Calibre2\;C:\Program Files\Microsoft SQL Server\Client SDK\ODBC\170\Tools\Binn\;C:\Program Files\Azure Data Studio\bin;C:\Program Files (x86)\Microsoft SQL Server\150\Tools\Binn\;C:\Program Files\Microsoft SQL Server\150\Tools\Binn\;C:\Program Files (x86)\Microsoft SQL Server\150\DTS\Binn\;C:\Program Files\Microsoft SQL Server\150\DTS\Binn\;C:\Program Files\Microsoft SQL Server\130\Tools\Binn\;C:\Program Files (x86)\Microsoft SQL Server\110\DTS\Binn\;C:\Program Files (x86)\Microsoft SQL Server\120\DTS\Binn\;C:\Program Files (x86)\Microsoft SQL Server\130\DTS\Binn\;C:\Program Files (x86)\Microsoft SQL Server\140\DTS\Binn\;C:\Program Files\Git\cmd;C:\Program Files (x86)\scala\bin;C:\Program Files\Docker\Docker\resources\bin;C:\Users\Alfonso\miniconda3;C:\Users\Alfonso\miniconda3\Library\mingw-w64\bin;C:\Users\Alfonso\miniconda3\Library\usr\bin;C:\Users\Alfonso\miniconda3\Library\bin;C:\Users\Alfonso\miniconda3\Scripts;C:\Users\Alfonso\AppData\Local\Microsoft\WindowsApps;C:\Program Files\Azure Data Studio\bin;C:\Program Files\Java\jdk1.8.0_321\bin;C:\spark-3.2.1-bin-hadoop2.7\bin;C:\Users\Alfonso\AppData\Local\Programs\Microsoft VS Code\bin
OS => Windows_NT
TERM_PROGRAM => vscode
COMPUTERNAME => LAPTOP-5AQJOUQN
OnlineServices => Online Services
PROCESSOR_REVISION => 7e05
CommonProgramW6432 => C:\Program Files\Common Files
ComSpec => C:\windows\system32\cmd.exe
SystemRoot => C:\windows
TEMP => C:\Users\Alfonso\AppData\Local\Temp
HOMEDRIVE => C:
USERPROFILE => C:\Users\Alfonso
TMP => C:\Users\Alfonso\AppData\Local\Temp
CommonProgramFiles(x86) => C:\Program Files (x86)\Common Files
NUMBER_OF_PROCESSORS => 8
========== Variables especificas ==========
username = Alfonso
javaHome = C:\Program Files\Java\jdk1.8.0_321
temDir = C:\Users\Alfonso\AppData\Local\Temp
path = C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\windows\system32;C:\windows;C:\windows\System32\Wbem;C:\windows\System32\WindowsPowerShell\v1.0\;C:\windows\System32\OpenSSH\;C:\Program Files\Calibre2\;C:\Program Files\Microsoft SQL Server\Client SDK\ODBC\170\Tools\Binn\;C:\Program Files\Azure Data Studio\bin;C:\Program Files (x86)\Microsoft SQL 
Server\150\Tools\Binn\;C:\Program Files\Microsoft SQL Server\150\Tools\Binn\;C:\Program Files (x86)\Microsoft SQL Server\150\DTS\Binn\;C:\Program Files\Microsoft SQL Server\150\DTS\Binn\;C:\Program Files\Microsoft SQL Server\130\Tools\Binn\;C:\Program Files (x86)\Microsoft SQL 
Server\110\DTS\Binn\;C:\Program Files (x86)\Microsoft SQL Server\120\DTS\Binn\;C:\Program Files (x86)\Microsoft SQL Server\130\DTS\Binn\;C:\Program Files (x86)\Microsoft SQL Server\140\DTS\Binn\;C:\Program Files\Git\cmd;C:\Program Files (x86)\scala\bin;C:\Program Files\Docker\Docker\resources\bin;C:\Users\Alfonso\miniconda3;C:\Users\Alfonso\miniconda3\Library\mingw-w64\bin;C:\Users\Alfonso\miniconda3\Library\usr\bin;C:\Users\Alfonso\miniconda3\Library\bin;C:\Users\Alfonso\miniconda3\Scripts;C:\Users\Alfonso\AppData\Local\Microsoft\WindowsApps;C:\Program Files\Azure Data Studio\bin;C:\Program Files\Java\jdk1.8.0_321\bin;C:\spark-3.2.1-bin-hadoop2.7\bin;C:\Users\Alfonso\AppData\Local\Programs\Microsoft VS Code\bin
path2 = C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\windows\system32;C:\windows;C:\windows\System32\Wbem;C:\windows\System32\WindowsPowerShell\v1.0\;C:\windows\System32\OpenSSH\;C:\Program Files\Calibre2\;C:\Program Files\Microsoft SQL Server\Client SDK\ODBC\170\Tools\Binn\;C:\Program Files\Azure Data Studio\bin;C:\Program Files (x86)\Microsoft SQL Server\150\Tools\Binn\;C:\Program Files\Microsoft SQL Server\150\Tools\Binn\;C:\Program Files (x86)\Microsoft SQL Server\150\DTS\Binn\;C:\Program Files\Microsoft SQL Server\150\DTS\Binn\;C:\Program Files\Microsoft SQL Server\130\Tools\Binn\;C:\Program Files (x86)\Microsoft SQL Server\110\DTS\Binn\;C:\Program Files (x86)\Microsoft SQL Server\120\DTS\Binn\;C:\Program Files (x86)\Microsoft SQL Server\130\DTS\Binn\;C:\Program Files (x86)\Microsoft SQL Server\140\DTS\Binn\;C:\Program Files\Git\cmd;C:\Program Files (x86)\scala\bin;C:\Program Files\Docker\Docker\resources\bin;C:\Users\Alfonso\miniconda3;C:\Users\Alfonso\miniconda3\Library\mingw-w64\bin;C:\Users\Alfonso\miniconda3\Library\usr\bin;C:\Users\Alfonso\miniconda3\Library\bin;C:\Users\Alfonso\miniconda3\Scripts;C:\Users\Alfonso\AppData\Local\Microsoft\WindowsApps;C:\Program Files\Azure Data Studio\bin;C:\Program Files\Java\jdk1.8.0_321\bin;C:\spark-3.2.1-bin-hadoop2.7\bin;C:\Users\Alfonso\AppData\Local\Programs\Microsoft VS Code\bin
appEnv = null
hola = null 

*/