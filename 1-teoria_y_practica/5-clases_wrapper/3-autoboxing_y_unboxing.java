/*  ======================================================
    =============== AUTOBOXING Y UNBOXING ================
    ======================================================

*/
    public class WrapperInteger {
        public static void main(String[] args) {

            // Sin modificar nada
            Integer[] enteros = {1,2,3,4,5,6,7,8,9,10};

            int suma = 0;
            for(int i = 0; i < enteros.length; i++){
                if(enteros[i] % 2 == 0){
                    suma += enteros[i]; 
                }
            }
            System.out.println("suma = " + suma); // suma = 30


            // Sin modificar nada
            Integer[] enteros2 = {1,2,3,4,5,6,7,8,9,10};

            int suma2 = 0;
            for(Integer i: enteros2){
                if(i % 2 == 0){
                    suma2 += i; // suma = suma + i.intValue()
                }
            }
            System.out.println("suma = " + suma2);            
           

            // UNBOXING
            Integer[] enteros3 = {1,2,3,4,5,6,7,8,9,10};

            int suma3 = 0;
            for(Integer i: enteros3){
                if(i.intValue() % 2 == 0){
                    suma3 += i.intValue(); // suma = suma + i.intValue()
                }
            }
            System.out.println("suma = " + suma3); // suma = 30

        }
    }