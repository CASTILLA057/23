//Asignamos valores magicos a constantes
public class constantes {
    public static void main(String[] args) {

        //Ejercicio que nos da el ticher para aplicar lo aprendido

        //double radio = 5;
        //double area = 3.14159 * radio * radio;

        //lo convertimos a constantes ya que ahora mismo son valores magicos que en un futuro puede afectar a nuestro codigo

        System.out.println("Hallando el valor del area: ");
        final double PI = 3.14159; //PI siempre va a estar definido como una constante ya que este valor no puede cambiar
        double radio = 10; //Colocamos el radio como un double ya que se puede ir modificando este valor
        final double radiocuadrado = radio * radio; //Podemos definir a radiocuadrado como una constante
        double area = PI * radiocuadrado; //Ya no habria valores magicos 

        System.out.print("El valor del area es: " + area); //Podemos imprimir este resultado

    }
    
}
