package Unidad2;

//Definimos los atributos del rectangulo con una clase
    class Rectangulo {
        int ancho;
        int alto;
    
        Rectangulo(int ancho, int alto) {
            this.ancho = ancho;
            this.alto = alto;
        }
    }
    
    public class RectanguloAtributos {
    
        public static void modificarRectangulo(Rectangulo r) {
            r.ancho = 50;
            r.alto = 25;
            System.out.println("Dentro del método: ancho = " + r.ancho + ", alto = " + r.alto);
        }

    //Mostramos antes de modificar y despues de modificar
        public static void main(String[] args) {
            Rectangulo miRectangulo = new Rectangulo(5, 10);
            System.out.println("Antes de modificar: ancho = " + miRectangulo.ancho + ", alto = " + miRectangulo.alto);
            modificarRectangulo(miRectangulo);
            System.out.println("Después de modificar: ancho = " + miRectangulo.ancho + ", alto = " + miRectangulo.alto);
        }
    }
    

