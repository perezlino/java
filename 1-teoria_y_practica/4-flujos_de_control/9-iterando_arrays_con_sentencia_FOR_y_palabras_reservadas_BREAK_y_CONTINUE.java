/*  ======================================================
    =============== FLUJO DE CONTROL - FOR ===============
    ======================================================

*/
    import javax.swing.*;

    public class SentenciaForArray {
        public static void main(String[] args) {

            // Forma 1
            String[] nombres = new String[3];
            nombres[0] = "Alfonso";
            nombres[1] = "Andres";
            nombres[2] = "Tomas";

            // Forma 2
            String[] names = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
            int count = nombres.length;
            for(int i = 0; i < count; i++){
                if(nombres[i].toLowerCase().contains("ANDRES".toLowerCase()) ||
                        nombres[i].toLowerCase().contains("pePa".toLowerCase())){
                    continue;
                }
                System.out.println( i + ".- " + nombres[i]);
            }
            
            String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\":");
            System.out.println("buscar = " + buscar);

            boolean encontrado = false;
            for(int i = 0; i < count; i++){
                if(nombres[i].equalsIgnoreCase(buscar)){
                    encontrado = true;
                    break;
                }
                System.out.println("nombres = " + nombres[i]);
            }
            if(encontrado){
                JOptionPane.showMessageDialog(null, buscar + " fue encontrado!");
            } else {
                JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema!");
            }
        }
    }