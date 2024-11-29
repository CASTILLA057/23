package Unidad2;
//Ejercicio practico de paso por valor
public class PasoValor {

        public static void intercambiar(int a, int b) {
            //Declaramos las variables
            int tempA = a;
            a = b;
            b = tempA;
            System.out.println("Dentro del método: a = " + a + ", b = " + b);
        }
    
        public static void main(String[] args) {
            int a = 5;
            int b = 10;
            System.out.println("Antes de llamar al método: a = " + a + ", b = " + b);

            //Realizamos el intercambio entre estos 2 valores
            intercambiar(a, b);
            System.out.println("Después de llamar al método: a = " + a + ", b = " + b);
        }
    }
    

