/*  =================================================================
    === EL MÉTODO GETCLASS() DEL OBJETO PARA REFLEXIÓN Y METADATA ===
    =================================================================

    "getClass()" es un método que nos permite obtener información sobre la reflexión del objeto, es 
    decir, toda su estructura interna, la reflexión o metadata. Este método lo que retorna es una 
    instancia del tipo Class. Por ejemplo, el nombre de la clase completa, incluyendo el package, el 
    package al cual pertenece, sus métodos, sus atributos, sus constructores, clase padre a la cual 
    hereda o extiende. En fin, un montón de información. Es como el esquema o la estructura interna 
    del objeto y de la clase.
*/
    import java.lang.reflect.Method;

    public class EjemploMetodoGetClass {

        public static void main(String[] args) {
            
            String texto = "Hola que tal!";
            
            Class strClass = texto.getClass();

            System.out.println("strClass = " + strClass.getName());          
            System.out.println("strClass = " + strClass.getSimpleName());    
            System.out.println("strClass = " + strClass.getPackage().getName());   
            System.out.println("strClass = " + strClass);

            System.out.println("===========================================");
            
            for(Method metodo: strClass.getMethods()){
                System.out.println("metodo.getName() = " + metodo.getName());
            }
            
            System.out.println("===========================================");

            Integer num = 34;
            Class intClass = num.getClass();
            Class objClass = intClass.getSuperclass().getSuperclass();
            System.out.println("intClass.getName() = " + intClass.getName());
            System.out.println("intClass.getPackage().getName() = " + intClass.getPackage().getName());
            System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass());
            System.out.println("objClass.getSuperclass().getSuperclass() = " + objClass);
    
            System.out.println("===========================================");

            for(Method metodo: objClass.getMethods()){
                System.out.println("metodo.getName() = " + metodo.getName());
            }

        }
    }
/* 
strClass = java.lang.String
strClass = String
strClass = java.lang
strClass = class java.lang.String
===========================================
metodo.getName() = equals
metodo.getName() = toString
metodo.getName() = hashCode
metodo.getName() = compareTo
metodo.getName() = compareTo
metodo.getName() = indexOf
metodo.getName() = indexOf
metodo.getName() = indexOf
metodo.getName() = indexOf
metodo.getName() = valueOf
metodo.getName() = valueOf
metodo.getName() = valueOf
metodo.getName() = valueOf
metodo.getName() = valueOf
metodo.getName() = valueOf
metodo.getName() = valueOf
metodo.getName() = valueOf
metodo.getName() = valueOf
metodo.getName() = charAt
metodo.getName() = codePointAt
metodo.getName() = codePointBefore
metodo.getName() = codePointCount
metodo.getName() = compareToIgnoreCase
metodo.getName() = concat
metodo.getName() = contains
metodo.getName() = contentEquals
metodo.getName() = contentEquals
metodo.getName() = copyValueOf
metodo.getName() = copyValueOf
metodo.getName() = endsWith
metodo.getName() = equalsIgnoreCase
metodo.getName() = format
metodo.getName() = format
metodo.getName() = getBytes
metodo.getName() = getBytes
metodo.getName() = getBytes
metodo.getName() = getBytes
metodo.getName() = getChars
metodo.getName() = intern
metodo.getName() = isEmpty
metodo.getName() = join
metodo.getName() = join
metodo.getName() = lastIndexOf
metodo.getName() = lastIndexOf
metodo.getName() = lastIndexOf
metodo.getName() = lastIndexOf
metodo.getName() = length
metodo.getName() = matches
metodo.getName() = offsetByCodePoints
metodo.getName() = regionMatches
metodo.getName() = regionMatches
metodo.getName() = replace
metodo.getName() = replace
metodo.getName() = replaceAll
metodo.getName() = replaceFirst
metodo.getName() = split
metodo.getName() = split
metodo.getName() = startsWith
metodo.getName() = startsWith
metodo.getName() = subSequence
metodo.getName() = substring
metodo.getName() = substring
metodo.getName() = toCharArray
metodo.getName() = toLowerCase
metodo.getName() = toLowerCase
metodo.getName() = toUpperCase
metodo.getName() = toUpperCase
metodo.getName() = trim
metodo.getName() = wait
metodo.getName() = wait
metodo.getName() = wait
metodo.getName() = getClass
metodo.getName() = notify
metodo.getName() = notifyAll
metodo.getName() = chars
metodo.getName() = codePoints
===========================================
intClass.getName() = java.lang.Integer
intClass.getPackage().getName() = java.lang
intClass.getSuperclass().getSuperclass() = class java.lang.Number
objClass.getSuperclass().getSuperclass() = class java.lang.Object
===========================================
metodo.getName() = wait
metodo.getName() = wait
metodo.getName() = wait
metodo.getName() = equals
metodo.getName() = toString
metodo.getName() = hashCode
metodo.getName() = getClass
metodo.getName() = notify
metodo.getName() = notifyAll

*/