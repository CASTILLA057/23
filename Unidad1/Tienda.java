import java.util.Scanner;
public class Tienda {
    public static void main(String[] args) {

        final double descuento1 = 0.15;
        final double descuento2 = 0.20;
        final int camisa = 25;
        final int pantalon = 30;

        System.out.println("Marque 1 si solo compro 1 camisa y 1 pantalon: ");
        System.out.println("Marque 2 si compro 2 camisas y un pantalon: ");
        
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion = scanner.nextInt();

            if(opcion == 1)
            {   
                int valorPrendas = (camisa + pantalon);
                double TotalDescuento = (valorPrendas * descuento1);
                double TotalValor = (valorPrendas - TotalDescuento);
                System.out.println("El total de su compra es de: " + TotalValor);

            } else {

                int valorPrenda2 = (2 * camisa + pantalon);
                double TotalDescuento2 = (valorPrenda2 * descuento2);
                double TotalValor2 = (valorPrenda2 - TotalDescuento2);
                System.out.println("El total de su compra es de: " + TotalValor2);

            }
        }
    }
    
}
