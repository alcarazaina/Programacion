package segunda_evaluacion.tema06colecciones.poo.clasesyobjetos.hoteles;

public class Main {
    public static void main(String[] args) {
    Hotel hotel1 = new Hotel(1, 400, Zona.PLAYA);
        System.out.println(hotel1);
        hotel1.setPrecio(600);
        System.out.println(hotel1);
        hotel1.setPrecio(60);
        System.out.println(hotel1);
        hotel1.setPrecio(36);
    }
}
