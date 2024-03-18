package hoteles;

public class Main {
    public static void main(String[] args) {
    Hotel hotel1 = new Hotel(1, 400, Zona.PLAYA);
        System.out.println(hotel1);
        hotel1.setPrecio(600);
        System.out.println(hotel1);
        hotel1.setPrecio(60);
        System.out.println(hotel1);
        hotel1.setPrecio(36);

    Hotel hotel2 = new Hotel(1, 500, Zona.PLAYA);


    int hashCode1 = hotel1.hashCode();
    int hashCode2 = hotel2.hashCode();

        System.out.println("¿Es el mismo hotel? " + (hashCode1 == hashCode2));

        System.out.println(hotel1.equals(hotel2));
    }
}
