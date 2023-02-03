/*  ======================================================
    ======= METODOS IMPORTANTES DEL OBJETO STRING ========
    ======================================================

*/
    public class EjemploStringMetodos {
        public static void main(String[] args) {
            
            String nombre = "Alfonso";

            System.out.println("nombre.length() =  n° caracteres del nombre = " + nombre.length());
            System.out.println("nombre.toUpperCase() = nombre en mayúsculas = " + nombre.toUpperCase());
            System.out.println("nombre.toLowerCase() = nombre en minúsculas = " + nombre.toLowerCase());
            System.out.println("nombre.equals(\"Alfonso\") = nombre == Alfonso = " + nombre.equals("Alfonso"));
            System.out.println("nombre.equals(\"alfonso\") = nombre == alfonso = " + nombre.equals("alfonso"));
            System.out.println("nombre.equalsIgnoreCase(\"alfonso\") = nombre == alfonso (IgnoreCase) = " + nombre.equalsIgnoreCase("alfonso"));
            System.out.println("nombre.compareTo(\"Alfonso\") = nombre == Alfonso = " + nombre.compareTo("Alfonso"));
            System.out.println("nombre.compareTo(\"Aaron\") = nombre == Aaron = " + nombre.compareTo("Aaron"));
            System.out.println("nombre.charAt(0) = Caracter posicion 0 = " + nombre.charAt(0));
            System.out.println("nombre.charAt(1) = Caracter posicion 1 = " + nombre.charAt(1));
            System.out.println("nombre.charAt(nombre.length()-1) = Ultimo caracter = " + nombre.charAt(nombre.length()-1));

            System.out.println("nombre.substring(1) = Extraemos texto a partir de la posicion 1 = " + nombre.substring(1));
            System.out.println("nombre.substring(1, 3) = Extraemos texto entre la posicion 1 y 3 = " + nombre.substring(1, 3));
            System.out.println("nombre.substring(nombre.length()-1) = Extraemos ultimo caracter = " + nombre.substring(nombre.length()-1));
            System.out.println("nombre.substring(nombre.length()-2) = Extraemos ultimos 2 caracteres = " + nombre.substring(nombre.length()-2));
/* 
             ____________________________________________________________________________________________________
            |                                                                                                    |   
            |   indexOf = Permite saber si se encuentra un carácter específico dentro del String. Retornará la   |    
            |             primera posición que encuentre de ese carácter.                                        |   
            |____________________________________________________________________________________________________|
*/
            String trabalenguas = "trabalenguas";

            System.out.println("trabalenguas.replace('a', '.') = Reemplazo de la 'a' por '.' = " + trabalenguas.replace("a", "."));
            System.out.println("trabalenguas.indexOf('a') = Búsqueda del caracter 'a' e indicar 1era posicion = " + trabalenguas.indexOf('a'));
            System.out.println("trabalenguas.lastIndexOf('a') = Búsqueda del caracter 'a' e indicar ultima posicion = " + trabalenguas.lastIndexOf('a'));
            System.out.println("trabalenguas.contains('t') = ¿'trabalenguas' contiene el caracter 't'? = " + trabalenguas.contains("t"));
            System.out.println("trabalenguas.startsWith(\"tra\") = ¿'trabalenguas' comienza con los caracteres 'tra'? = " + trabalenguas.startsWith("tra"));
            System.out.println("trabalenguas.endsWith(\"uas\") = ¿'trabalenguas' termina con los caracteres 'uas'? = " + trabalenguas.endsWith("uas"));
            
            String nuevaPalabra = "  trabalenguas ";
            System.out.println(nuevaPalabra);
            System.out.println(nuevaPalabra + "= Eliminamos los espacios inicial y final = " + trabalenguas.trim());
            
        }
    }
/*
nombre.length() =  n° caracteres del nombre = 7
nombre.toUpperCase() = nombre en mayúsculas = ALFONSO
nombre.toLowerCase() = nombre en minúsculas = alfonso
nombre.equals("Alfonso") = nombre == Alfonso = true
nombre.equals("alfonso") = nombre == alfonso = false
nombre.equalsIgnoreCase("alfonso") = nombre == alfonso (IgnoreCase) = true
nombre.compareTo("Alfonso") = nombre == Alfonso = 0
nombre.compareTo("Aaron") = nombre == Aaron = 11
nombre.charAt(0) = Caracter posicion 0 = A
nombre.charAt(1) = Caracter posicion 1 = l
nombre.charAt(nombre.length()-1) = Ultimo caracter = o
nombre.substring(1) = Extraemos texto a partir de la posicion 1 = lfonso
nombre.substring(1, 3) = Extraemos texto entre la posicion 1 y 3 = lf
nombre.substring(nombre.length()-1) = Extraemos ultimo caracter = o
nombre.substring(nombre.length()-2) = Extraemos ultimos 2 caracteres = so
trabalenguas.replace('a', '.') = Reemplazo de la 'a' por '.' = tr.b.lengu.s
trabalenguas.indexOf('a') = Búsqueda del caracter 'a' e indicar 1era posicion = 2
trabalenguas.lastIndexOf('a') = Búsqueda del caracter 'a' e indicar ultima posicion = 10
trabalenguas.contains('t') = ¿'trabalenguas' contiene el caracter 't'? = true
trabalenguas.startsWith("tra") = ¿'trabalenguas' comienza con los caracteres 'tra'? = true
trabalenguas.endsWith("uas") = ¿'trabalenguas' termina con los caracteres 'uas'? = true
  trabalenguas
  trabalenguas = Eliminamos los espacios inicial y final = trabalenguas
  
*/