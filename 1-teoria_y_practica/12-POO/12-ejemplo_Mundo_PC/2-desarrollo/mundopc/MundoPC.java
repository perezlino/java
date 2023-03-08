package mundopc;

import com.gm.mundopc.*;

import test.Orden;

public class MundoPC {

    public static void main(String[] args) {
        
        Monitor monitorHP  = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Computador computadorHP = new Computador("Computador HP", monitorHP, tecladoHP, ratonHP);

        Monitor monitorGamer  = new Monitor("Gamer", 34);
        Teclado tecladoGamer = new Teclado("bluetooth", "Gamer");
        Raton ratonGamer = new Raton("bluetooth", "Gamer");
        Computador computadorGamer = new Computador("Computador Gamer", monitorGamer, tecladoHP, ratonGamer);  
        
        Orden orden1 = new Orden();
        orden1.agregarComputador(computadorHP);
        orden1.agregarComputador(computadorGamer);

        orden1.mostrarOrden();

    } 
}