package hoteles;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
    Hotel hotel1 = new Hotel(1, 100, Zona.PLAYA);
        System.out.println(hotel1);
        hotel1.setPrecio(600);
        System.out.println(hotel1);
        hotel1.setPrecio(60);
        System.out.println(hotel1);
        hotel1.setPrecio(36);
        System.out.println();

    Hotel hotel2 = new Hotel(2, 75, Zona.PLAYA);
    Hotel hotel3 = new Hotel(3, 90, Zona.MONTAÑA);
    Hotel hotel4 = new Hotel(4, 85, Zona.MONTAÑA);

        ArrayList<Hotel> hoteles = new ArrayList<>();
        hoteles.add(hotel1);
        hoteles.add(hotel2);
        hoteles.add(hotel3);
        hoteles.add(hotel4);

        System.out.println("Orden tal cual entran en el arraylist");
        impromirHoteles(hoteles);
// ahora los ordenamos
        Collections.sort(hoteles);
        System.out.println("Ordenados");
        impromirHoteles(hoteles);

        System.out.println();


    int hashCode1 = hotel1.hashCode();
    int hashCode2 = hotel2.hashCode();
    int hashCode3 = hotel3.hashCode();

        System.out.println("¿Es el mismo hotel? " + (hashCode1 == hashCode2));

        System.out.println(hotel1.equals(hotel2));

        System.out.println("¿Es el mismo hotel? " + (hashCode1 == hashCode3));

        System.out.println(hotel1.equals(hotel3));

    }
    public static void impromirHoteles (ArrayList<Hotel> hoteles){
        for (Hotel hotel: hoteles) {
            System.out.println(hotel);
        }
    }
}
