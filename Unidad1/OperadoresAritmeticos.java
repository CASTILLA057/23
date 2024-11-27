import java.util.Scanner;
public class OperadoresAritmeticos {
    public static void main(String[] args) 
    {
        //Elsusuario registrara 2 numeros el cual se realizara todos los operadores aritmeticos
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese us primer valor numerico: ");
            int number1 = scanner.nextInt();

            System.err.println("Ingrese su segundo valor numerico: ");
            int number2 = scanner.nextInt();

            int suma = (number1 + number2);
            int resta = (number1 - number2);
            int multiplicacion = (number1 * number2);
            int division = (number1 / number2);
            int modulo = (number1 % number2);

            //Imprimimos lo valores
            System.out.println("sus resultados son:");
            System.out.println("suma: " + suma);
            System.out.println("resta: " + resta);
            System.out.println("multiplicacion: " + multiplicacion);
            System.out.println("division: " + division);
            System.out.print("modulo: " + modulo);
        }
       
    }
    
}
