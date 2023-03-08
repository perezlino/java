package test;

import dominio.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("Juan", 5000, "Sistemas");
        
        System.out.println("gerente1 = " + gerente1.obtenerDetalles());
    }
/*
gerente1 = Nombre: Juan, sueldo: 5000.0, departamento:Sistemas
*/    
}