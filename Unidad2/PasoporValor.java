package Unidad2;

public class PasoporValor {
    public static void main(String[] args) {
        int numero = 5;
        cambiarValor(numero);
        System.out.println("Despues de llamar a cambiarValor: " + numero);
    }

    public static void cambiarValor(int num){
        num = 10;
        System.out.println("Dentro de cambiarValor: " + num);
    }
    
}
