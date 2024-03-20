package teoria.biblioteca;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
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

        //ordenamos el arraylist
        //Collections.sort(socios);

        // e imprimimos el arraylist, se supone que tiene que aparecer ordenados por fecha de nacimiento porque eso es lo que hemos indicado en el método compareTo


        // ahora vamos a probar esta nueva clase
        // antes, debemos desordenar el arraylist. Para eso tenemos el método shuffle

        // comprobamos que está desordenado
        for (Socio socio: socios) {
            System.out.println(socio);
        }
        System.out.println();
        // ahora para ordenar utilizando comparator debemos crear un objeto de la clase comparadora
        CompararFechaNacimiento comparador = new CompararFechaNacimiento();

        socios.sort(comparador);
        // volvemos a imprimir
        imprimirSocios(socios);

        // ahora ordenamos en orden inverso
        socios.sort(comparador.reversed());

        System.out.println("\nOrden inverso:");
        imprimirSocios(socios);


    }

    public static void imprimirSocios(ArrayList<Socio> socios) {
        for (Socio socio: socios) {
            System.out.println(socio);
        }
    }
}
