import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a nuestra pizzeria ");
        System.out.println("Ingrese que opcion de pizza prefiere: ");
        System.out.println("Ingrese 1, pizza de jamon-pollo");
        System.out.println("Ingrese 2, pizza de hawaiana");
        System.out.println("Ingrese 3, pizza de mexicana");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
            System.out.println("Excelente eleccion su pizza estara dentro de pocos minutos.");
                break;

            case 2:
            System.out.println("Excelente eleccion su pizza estara dentro de pocos minutos.");
                break;

            case 3:
            System.out.println("Excelente eleccion su pizza estara dentro de pocos minutos.");
                break;
        
            default:
            System.out.println("Vaya,al parecer esa opcion no esta dentro de nuestro menu.");
                break;
        }


    }
    
}
