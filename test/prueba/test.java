package test.prueba;

public class test {

        public static void main(String[] args) {

                // renombramos el nombre del objeto (de la instancia de la clase a 'subaru')
                Automovil subaru = new Automovil();
        
                subaru.fabricante = "Subaru";
                subaru.modelo = "Impreza";
                subaru.cilindrada = 2.0;
                subaru.color = "Blanco";
        
                System.out.println(subaru.verDetalle());
                System.out.println(subaru.acelerar(3000));
                System.out.println(subaru.frenar());
                System.out.println(subaru.acelerarFrenar(3000));
        /* 
                this.fabricante = Subaru
                this.fabricante = Impreza
                this.fabricante = Blanco
                this.fabricante = 2.0
        */  
                Automovil mazda = new Automovil();
                mazda.fabricante = "Mazda";
                mazda.modelo = "BT-50";
                mazda.cilindrada = 3.0;
                mazda.color = "Rojo";
        
                System.out.println(mazda.verDetalle());
                System.out.println(mazda.acelerar(3000));
                System.out.println(mazda.frenar()); 
                System.out.println(mazda.acelerarFrenar(4000));                         
        /* 
                this.fabricante = Mazda 
                this.fabricante = BT-50 
                this.fabricante = Rojo  
                this.fabricante = 3.0 
        */
            }
        }   