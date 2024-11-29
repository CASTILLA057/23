package Unidad2;

public class Arraypasoporreferencia{

    public static void modificarArray(int[] arr) {
        //Establecemos un for
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        //Lo que sucede dentro del metodo
        System.out.println("Dentro del método: " + java.util.Arrays.toString(arr));
    }


//Lo que sucede antes y depues de modificar el array por paso por referencia
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Antes de modificar: " + java.util.Arrays.toString(numeros));
        modificarArray(numeros);
        System.out.println("Después de modificar: " + java.util.Arrays.toString(numeros));
    }
}
