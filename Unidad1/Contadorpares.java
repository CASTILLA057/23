
public class Contadorpares {
    public static void main(String[] args) 
    {
        int contador = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
            contador++;
        
        }
    }   

    System.out.println("los numeros pares que hay entre 1 a 100 es de: " + contador);
  }
}
