package hoteles;

import java.util.ArrayList;
import java.util.Collections;

public class Main2 {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel(1, 100, Zona.PLAYA);
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
        System.out.println("Ordenados");
        CompararPrecio compararPrecio = new CompararPrecio();
        hoteles.sort(compararPrecio);

        impromirHoteles(hoteles);

        System.out.println();


        System.out.println("Ordenados de menor a mayor");
        hoteles.sort(compararPrecio.reversed());

        impromirHoteles(hoteles);

        System.out.println();
        System.out.println("Ordenados por ID");
        CompararId compararId = new CompararId();
        hoteles.sort(compararId);
        impromirHoteles(hoteles);

        System.out.println();
        System.out.println("Ordenados por ID al revés");
        hoteles.sort(compararId.reversed());
        impromirHoteles(hoteles);
    }
    public static void impromirHoteles (ArrayList<Hotel> hoteles){
        for (Hotel hotel: hoteles) {
            System.out.println(hotel);
        }
    }
}
