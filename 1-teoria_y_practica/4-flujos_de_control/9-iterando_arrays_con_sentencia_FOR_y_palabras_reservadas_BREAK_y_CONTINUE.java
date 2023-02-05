/*  ======================================================
    =============== FLUJO DE CONTROL - FOR ===============
    ======================================================

*/
    import javax.swing.*;

    public class SentenciaForArray {
        public static void main(String[] args) {

            // Forma 1
            System.out.println("------------ EJEMPLO 1 ------------");
            String[] nombres = new String[3];
            nombres[0] = "Alfonso";
            nombres[1] = "Andres";
            nombres[2] = "Tomas";
            int count = nombres.length;
            for(int i = 0; i < count; i++){
                System.out.println( i + ".- " + nombres[i]);
                }
            

            // Forma 2
            System.out.println("------------ EJEMPLO 2 ------------");
            String[] nombres2 = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
            int count2 = nombres2.length;
            for(int i = 0; i < count2; i++){
                System.out.println( i + ".- " + nombres2[i]);
                }
            

            // Forma 3
            System.out.println("------------ EJEMPLO 3 ------------");
            String[] nombres3 = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
            int count3 = nombres3.length;
            for(int i = 0; i < count3; i++){
                if(nombres3[i].equalsIgnoreCase("andres") ||
                    nombres3[i].equalsIgnoreCase("pepa")) {
                        continue;
                }
                System.out.println(i + ".- " + nombres3[i]);
            }


            // Forma 4
            System.out.println("------------ EJEMPLO 4 ------------");
            String[] nombres4 = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
            int count4 = nombres4.length;
            for(int i = 0; i < count4; i++){
                if(nombres4[i].contains("Andres") ||
                    nombres4[i].contains("Pepa")) {
                        continue;
                }
                System.out.println(i + ".- " + nombres4[i]);
            }


            // Forma 5
            System.out.println("------------ EJEMPLO 5 ------------");
            String[] nombres5 = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
            int count5 = nombres5.length;
            for(int i = 0; i < count5; i++){
                if(nombres5[i].toLowerCase().contains("ANDRES".toLowerCase()) ||
                    nombres5[i].toLowerCase().contains("pePa".toLowerCase())){
                        continue;
                }
                System.out.println(i + ".- " + nombres5[i]);
            }            
                
            // Forma 6
            System.out.println("------------ EJEMPLO 6 ------------");
            String[] nombres6 = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
            int count6 = nombres6.length;                        
            String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\":");
            System.out.println("buscar = " + buscar);

            boolean encontrado = false;
            for(int i = 0; i < count6; i++){
                if(nombres6[i].equalsIgnoreCase(buscar)){
                    encontrado = true;
                    break;
                }
            }
            if(encontrado){
                JOptionPane.showMessageDialog(null, buscar + " fue encontrado!");
            } else {
                JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema!");
            }
        }
    }
/*

------------ EJEMPLO 1 ------------
0.- Alfonso
1.- Andres
2.- Tomas
------------ EJEMPLO 2 ------------
0.- Andres
1.- Pepe
2.- Maria
3.- Paco
4.- Lalo
5.- Bea
6.- Pato
7.- Pepa
------------ EJEMPLO 3 ------------
1.- Pepe
2.- Maria
3.- Paco
4.- Lalo
5.- Bea
6.- Pato
------------ EJEMPLO 4 ------------
1.- Pepe
2.- Maria
3.- Paco
4.- Lalo
5.- Bea
6.- Pato
------------ EJEMPLO 5 ------------
1.- Pepe
2.- Maria
3.- Paco
4.- Lalo
5.- Bea
6.- Pato

*/