//Asignamos lo valores de la edad,altura,Letra incial del nombre y si es mayor de edad o no
public class nombre_variables {

    public static void main(String[] args) {
        System.out.println("Bienvenido, sus datos son los siguientes: ");
        String name = "Santiago"; //Para poder sacar la primera letra del nombre debemos utilizar char
        char firstletter = name.charAt(0); //tomaria el nombre Santiago en el inidice 0 que seria la letra "S"
        int age = 18;//Si modificamos la edad sea menor de 18 nos dara false
        double height = 1.73;
        boolean Isolderage = (age >= 18);

        //Imprimimos los valores que tenemos 
        
        System.out.println("Su nombre es: " + name);//Imprimimos el nombre
        System.out.println("La primera letra de sus nombre es: " + firstletter);//Imprimimos la primera letra
        System.out.println("Su estatura es de: " + height);//Imprimimos su altura
        System.out.print("¿Usted es mayor de edad? " + Isolderage);//Imprimimos si es mayor de edad o no

    }
}