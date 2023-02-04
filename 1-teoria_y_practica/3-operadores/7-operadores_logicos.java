/*  ======================================================
    ================ OPERADORES LOGICOS ==================
    ======================================================

    ______________________________________________________
   |                                                      |  
   |    PRECEDENCIA DE LOS OPERADORES LOGICOS             |   
   |    -------------------------------------             |    
   |                                                      |  
   |    - Se lee de Izquierda a Derecha                   |  
   |                                                      |         
   |    - Paréntesis tienen prioridad                     |
   |                                                      |  
   |    - && (and) tiene mayor prioridad sobre || (or)    |
   |______________________________________________________|

*/ 
    public class OperadoresLogico {
        public static void main(String[] args) {
            
            int i = 3;
            byte j = 3;
            float k = 127e-7f;
            double l = 2.1413e3;
            boolean m = false;
            
            boolean b1 = i == j && k < l && m == false;
            System.out.println("b1 = " + b1); // b1 = true
            
            boolean b2 = i == j || k < l;
            System.out.println("b2 = " + b2); // b2 = true
            
            boolean b3 = i == j && (k < l || m == true);
            System.out.println("b3 = " + b3); // b3 = true
            
            boolean b4 = (i == j || k < l) && m == true;
            System.out.println("b4 = " + b4); // b4 = false
            
            boolean b5 = (true || true) && false;
            System.out.println("b5 = " + b5); // b5 = false
            
            // true || false || false ===> true
            boolean b6 = true || false && false || false;
            System.out.println("b6 = " + b6); // b6 = true

            boolean b7 = ((true || false) && false) || false; 
            System.out.println("b7 = " + b7); // b7 = false
            
        }
    }