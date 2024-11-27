import java.util.Scanner;
public class IngresodeDatos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre");
            String Nombre = scanner.nextLine();

            System.out.println("Ingrese su edad");
            int edad = scanner.nextInt();

            System.out.println("ingrese su altura");
            double altura = scanner.nextDouble();

            System.out.println("Su nombre ingresado fue de: " + Nombre);
            System.out.println("Su edad ingresado es: " + edad);
            System.out.println("Su altura ingresado es: " + altura);
        }

    }
}
