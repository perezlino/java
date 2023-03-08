package directorio;

import dominio.Empleado;
import dominio.Cliente;
import java.util.Date;

public class TestHerencia {

    public static void main(String[] args) {
        
        // Empleado empleado1 = new Empleado("Alfonso", 5000.00);
        // System.out.println("empleado1 = " + empleado1); 

        Cliente cliente1 = new Cliente(new Date(), true, "Javiera", 'F', 27, "Copiapo 280");
        System.out.println("cliente1 = " + cliente1);
/*
        Tambien podriamos hacerlo de esta manera:

        Date fecha = new Date();
        Cliente cliente1 = new Cliente(fecha, true, "Javiera", 'F', 27, "Copiapo 280");
                                       ------
*/
    }
}
/* 
cliente1 = Cliente [idCliente=1, fechaRegistro=Wed Feb 15 11:32:37 CLST 2023, vip=true, 
                    Persona={Persona [nombre=Javiera, genero=F, edad=27, direccion=Copiapo 280]}]
*/