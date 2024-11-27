package Unidad2;

class Persona {
    String nombre;
}
public class PasoporReferencia {
    public static void main(String[] args) {
    Persona persona = new Persona();
    persona.nombre = "Castilla";
    cambiarNombre(persona);
    System.out.println("Nombre despues de cambiarNombre: " + persona.nombre);
    }
    public static void cambiarNombre(Persona persona){
        persona.nombre = "Mariana";
    }

}


