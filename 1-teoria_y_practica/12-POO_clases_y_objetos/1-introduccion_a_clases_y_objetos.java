/*  ======================================================
    ========== INTRODUCCION A CLASES Y OBJETOS ===========
    ======================================================


    PROGRAMACION ORIENTADA A OBJETOS
    ================================

    • Los objetos como concepto, fuera de la informática, existen desde siempre, antes de la programación!


    LA CLASE
    ========
    
    • Primero definiríamos un diseño (molde) de cómo va a ser la entidad que queremos crear!

    • Una Clase es un molde, o prototipo, que definen las variables y los métodos comunes a un cierto tipo 
      de objetos.

     ___________________________________________
    |                                           |
    |   public class Automovil {                |
    |      String modelo;               ________|______________
    |      String color;               |       Automovil       |
    |      double cilindrada;          |-----------------------|
    |                                  | - modelo: String      | 
    |      public void acelerar() {    | - color: String       |  ATRIBUTOS
    |      }                           | - cilindrada: double  | 
    |                                  |-----------------------|
    |      public void frenar() {      | - acelerar(): void    |  METODOS
    |      }                           | - frenar():void       | 
    |  }                               |-----------------------|
    |__________________________________________|


    CREAR OBJETOS - OPERADOR NEW
    ============================
    
    • El operador 'new' reserva memoria dinámica para un objeto
    
      Automovil auto = new Automovil();

*/    
