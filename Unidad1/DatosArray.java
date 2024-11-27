import java.util.Scanner;
public class DatosArray {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int suma = 0;
            int[]numeros = new int[5];//El array tiene una capacidad de 5

            //Un ciclo para pedir los numeros depende a la capacidad del array
            for(int i = 0; i < numeros.length; i++){
                System.out.println("Ingrese un numero");
                numeros[i] = scanner.nextInt();
                System.out.println("El indice del array es : " + i + " ,El numero colocado es de: " + numeros[i]);
                suma += numeros[i];//De esta forma acumulamos la suma de los numeros
            }
   System.out.println("La suma de sus datos colocados es de: " + suma);
   double promedio = suma / (double) numeros.length;
   System.out.println("El promedio es de : " + promedio);
        }
    }
}
