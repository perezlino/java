package com.gm.mundopc;

public class Orden {

	private final int idOrden;
    private Computador computadores[];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORES = 10;
    private int contadorComputadores;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadores = new Computador[Orden.MAX_COMPUTADORES];
    }
    
    public void agregarComputador(Computador computador){
        if(this.contadorComputadores < Orden.MAX_COMPUTADORES){
            this.computadores[this.contadorComputadores++] = computador;
        }
        else{
            System.out.println("Has superado el limite: " + Orden.MAX_COMPUTADORES);
        }
    }
    
    public void mostrarOrden(){
        System.out.println("Orden #:" + this.idOrden);
        System.out.println("Computadores de la orden #:" + this.idOrden);
        for (int i = 0; i < this.contadorComputadores; i++) {
            System.out.println(this.computadores[i]);
        }
    }	
}