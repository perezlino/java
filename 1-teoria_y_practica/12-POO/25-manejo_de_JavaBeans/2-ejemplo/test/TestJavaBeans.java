package test;

import dominio.Persona;

/*  Asi tal cual como estamos viendo este codigo, es como lo van a utilizar las tecnologias mas avanzadas.
    Por lo tanto,  es necesario tener el 'constructor vacío', tener los métodos 'get' y 'set' de cada atributo 
    y además la Clase 'Persona' debe de ser 'Serializable', ya que, si por alguna razón este Objeto (persona) 
    es necesario transferirlo en la red de un servidor hacia otro servidor, entonces, se tiene que aplicar 
    el concepto de Serialización. Este concepto básicamente significa que estamos convirtiendo en nuestro 
    Objeto a ceros y unos, es decir, que se convierte a bits y básicamente cuando se envía este Objeto en 
    la red, se convierte a ceros y unos y cuando se recibe este Objeto del otro lado del servidor, entonces, 
    se aplica el concepto que se conoce como de Serialización. Es decir, que de nueva cuenta se convierta 
    en los valores de ceros y unos y se vuelve a construir el Objeto y por ello es que es necesario que 
    nuestras Clases implementen la Interface 'Serializable'. Este proceso todo lo va a hacer en automático el 
    servidor de aplicaciones Java que estemos utilizando. Sin embargo, es necesario que nuestra Clase 
    implemente la Interface 'Serializable' para que este Objeto (persona) que se está creando en esta línea se 
    pueda transferir a otro servidor de manera automática. Esta es la razón por la cual tenemos que implementar 
    la Interface 'Serializable', ya que, muchas veces desconocen cuál es uno de los objetivos de que nuestros 
    JavaBeans deben de implementar esta Interface.      */

public class TestJavaBeans {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Alfonso");
        persona.setApellido("Perez");

        System.out.println("persona = " + persona);

        System.out.println("Nombre completo = " + persona.getNombre() + " " + persona.getApellido())

    }
}