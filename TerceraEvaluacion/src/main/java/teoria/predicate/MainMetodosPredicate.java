package teoria.predicate;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainMetodosPredicate {
    public static void main(String[] args) {
        Socio socio1 = new Socio("Caleb", "Calvo", LocalDate.of(2000, 12, 1));
        Socio socio2 = new Socio("Blas", "Blez", LocalDate.of(2010, 12, 1));
        Socio socio3 = new Socio("Fermín", "Fez", LocalDate.of(1999, 1, 1));
        Socio socio4 = new Socio("Alba", "Álvarez", LocalDate.of(2005, 10, 10));

        // los añadimos a un arralist

        ArrayList<Socio> socios = new ArrayList<>();
        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);

        System.out.println(socios);
        // ¿Cómo puedo utilizar los predicados en una lista?
        // tenemos el método removeIf -> elimina los objetos de una lista que cumplan las condiciones del predicado.
        // en este caso, vamos a eliminar los socios cuyo nombre empiece por "B"
        socios.removeIf(socio -> socio.getNombre().startsWith("B"));
        System.out.println(socios);

        // Lo volvemos a meter
        socios.add(socio2);

        // Vamos a eliminar los socios que hayan nacido antes del 2000
        socios.removeIf(socio -> socio.getFechaNac().isBefore(LocalDate.of(2000, 1, 1)));
        System.out.println(socios);

    }
}
