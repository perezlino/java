/*  ======================================================
    ========= MATRIZ DE STRING E ITERAR CON FOR ==========
    ======================================================


    EJEMPLO 1
    =========
*/
    public class EjemploMatricesStringFor {
        public static void main(String[] args) {

            String[][] nombres = new String[3][2];
            nombres[0][0] = "Pepe";
            nombres[0][1] = "Pepa";
            nombres[1][0] = "Josefa";
            nombres[1][1] = "Paco";
            nombres[2][0] = "Lucas";
            nombres[2][1] = "Pancha";
    
            System.out.println("Iterando con for: ");
            for(int i = 0; i < nombres.length; i++){
    
                for(int j = 0; j < nombres[i].length; j++){ // Ejemplo: nombres[0].length = 2
                    System.out.print(nombres[i][j] + "\t");
                }
                System.out.println();
            }
/* 
            Iterando con for: 
            Pepe    Pepa
            Josefa  Paco
            Lucas   Pancha
*/
    
            System.out.println("Iterando con foreach: ");
    
            for(String[] fila: nombres){
                for(String nombre: fila){
                    System.out.print(nombre + "\t");
                }
                System.out.println();
            }
/* 
            Iterando con foreach:
            Pepe    Pepa
            Josefa  Paco
            Lucas   Pancha
*/
        }
    }
/* 

    EJEMPLO 2
    =========
*/
public class EjemploMatricesStringFor {
    public static void main(String[] args) {

        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa","Zarzamora","Manzana"}};

        System.out.println("Iterando con for: ");
        for(int i = 0; i < frutas.length; i++){

            for(int j = 0; j < frutas[i].length; j++){ // Ejemplo: nombres[0].length = 2
                System.out.print(frutas[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
/*
        Iterando con for: 
        Naranja Limon
        Fresa   Zarzamora   Manzana
*/