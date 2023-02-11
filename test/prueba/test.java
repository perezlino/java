package test.prueba;

public class test {
        public static void main(String[] args) {

                // Modificamos para todos los objetos el valor del atributo estatico (ahora PRIVADO) 'colorPatente'
                Automovil.setColorPatente("Azul");
        
                Automovil subaru = new Automovil("Subaru", "Impreza");
        
                // Podriamos utilizar un objeto para modificar el valor del atributo estatico.
                // Pero esto NO ES BUENA PRACTICA.
                //subaru.setColorPatente("Verde");
        
                subaru.setCilindrada(2.0);
                subaru.setColor("Blanco");
        
                System.out.println(subaru.verDetalle());
                System.out.println(subaru.acelerar(3000));
                System.out.println(subaru.frenar());
                System.out.println(subaru.acelerarFrenar(3000));
                System.out.println("Kilometros por litro: " + subaru.calcularConsumo(300, 0.6f));
                System.out.println("Kilometros por litro: " + subaru.calcularConsumo(300, 60));
        /* 
                auto.fabricante = Subaru
                auto.modelo = Impreza
                auto.color = Blanco
                auto.patenteColor = Azul <================== Modificamos el valor del atributo estatico
                auto.cilindrada = 2.0
                El auto Subaru acelerando a 3000 rpm
                Subaru Impreza frenando!
                El auto Subaru acelerando a 3000 rpm
                Subaru Impreza frenando!
                Kilometros por litro: 12.5
                Kilometros por litro: 12.5
        */  
                Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);
        
                System.out.println(mazda.verDetalle());
                System.out.println(mazda.acelerar(3000));
                System.out.println(mazda.frenar()); 
                System.out.println(mazda.acelerarFrenar(4000));                         
        /* 
                auto.fabricante = Mazda
                auto.modelo = BT-50
                auto.color = Rojo
                auto.patenteColor = Azul <================== Modificamos el valor del atributo estatico
                auto.cilindrada = 3.0
                El auto Mazda acelerando a 3000 rpm
                Mazda BT-50 frenando!
                El auto Mazda acelerando a 4000 rpm
                Mazda BT-50 frenando!
        */
                Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50); 
                
                System.out.println(nissan.verDetalle());
                System.out.println("Kilometros por litro: " + nissan.calcularConsumo(300, 60));
        /* 
                auto.fabricante = Nissan
                auto.modelo = Navara
                auto.color = Gris oscuro
                auto.patenteColor = Azul <================== Modificamos el valor del atributo estatico
                auto.cilindrada = 3.5
                Kilometros por litro: 9.999999
        */        
            }
        }   