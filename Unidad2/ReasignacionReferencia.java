package Unidad2;

class Persona {
    String nombre;
}
public class ReasignacionReferencia {
    public static void main(String[] args) {
        
    Persona persona = new Persona();
    persona.nombre = "CASTILLA";
    reasignarPersona(persona);
    System.out.println("El nombre despues de recibir reasignarPersona: " + persona.nombre);
    }

    public static void reasignarPersona(Persona persona){
        persona = new Persona();
        persona.nombre = "MARIANA";
    }
}



    

