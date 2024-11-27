import java.util.Scanner;
public class numero1mayor {
    public static void main(String[] args) 
    {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el primer numero: ");
            int numero1 = scanner.nextInt();

            System.out.println("Ingrese el segundo numero: ");
            int numero2 = scanner.nextInt();

            System.out.println("Ingrese el tercer numero: ");
            int numero3 = scanner.nextInt();

            boolean resultado = (numero1 > numero2) && (numero1 > numero3);


            System.out.println("¿El primer numero es mayor que el segundo y tercero? " + resultado);
        }
    }
}
