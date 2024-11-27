import java.util.Scanner;
public class tablasnumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero que desea ver su tabla de multiplicacion");
        int numero = scanner.nextInt();

        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
    }
}
