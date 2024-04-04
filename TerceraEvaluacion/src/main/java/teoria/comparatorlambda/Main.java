package teoria.comparatorlambda;

import teoria.biblioteca.CompararFechaNacimiento;
import teoria.biblioteca.Socio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

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

        imprimirSocios(socios);


        // 1) Creamos un comparador instanciando la interfaz funcional Comparator
        // 2) Implementamos el método compare
        // 3) Hacemos la transformación de la clase a lambda

        // 4) Ahora podemos utilizar este comparador en el método sort de Arraylist

        // También podríamos hacer esto más breve, sustituyendo comparator en el método sort por la expresión que hay detrás del =
        socios.sort((o1, o2) -> {
            // casteamos los objetos a socios
            Socio s1 = (Socio) o1;
            Socio s2 = (Socio) o2;

            // hacemos el resto
            if (s1.getFechaNac().isBefore(s2.getFechaNac())) {
                return -1;
            } else if (s1.getFechaNac().isAfter(s2.getFechaNac())) {
                return 1;
            } else {
                return 0;
            }

        });
    }
    public static void imprimirSocios(ArrayList<Socio> socios) {
        for (Socio socio: socios) {
            System.out.println(socio);
        }
    }
}
