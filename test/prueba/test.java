package test.prueba;



public class test {
        public static void main(String[] args) {

        
            //Scanner scanner = new Scanner(System.in);

            double area; // El area a calcular

            double radio; // El radio a ingresar

            System.out.println("Ingrese el radio del circulo: "); // 2
            radio = 2;

            area = Math.PI * Math.pow(radio, 2);

            System.out.println("El área de su circunferencia de radio " + radio + " es igual a: " + area);
        }
    }