public class Banco {
    public static void main(String[] args) 
    {
        System.out.println("bienvenido a su Banco de confianza");
        final int Dinero = 1000; //Dolares
        System.out.println("El deposito que usted tenia es de: " + Dinero);

        System.out.println("Retiro 200 dolares cada semana durante un mes");
        final int SemanalDesceunto = 200; //Dolares
        final int Semanas = 4; //Semanas

        int TotalSacado = (SemanalDesceunto * Semanas);
        int BancoValor = (Dinero - TotalSacado);

        System.out.println("Su deposito actual en nuestro banco es de: " + BancoValor + " Dolares");
    }
    
}
