package test.prueba;
// un conjunto de constantes que a su vez el valor es el mismo nombre de la constante.
// Por lo tanto, el contenido de rojo es ROJO en mayúscula.

public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris Oscuro"),
    NARANJO("Naranja");

    private final String color;

    Color(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

}
