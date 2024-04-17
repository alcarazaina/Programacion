package ejercicios.stream.ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class MainEjercicio02 {
    public static void main(String[] args) {


        List<Personaje> personajes = new ArrayList<>();

        personajes.add(new Personaje("Gandalf", Integer.MAX_VALUE, false, Arma.BASTÓN));
        personajes.add(new Personaje("Aragorn", 88, true, Arma.ESPADA));
        personajes.add(new Personaje("Gimli", 140, false, Arma.HACHA));
        personajes.add(new Personaje("Legolas", 2931, false, Arma.ARCO));
        personajes.add(new Personaje("Boromir", 41, true, Arma.ESPADA));
        personajes.add(new Personaje("Frodo", 51, false, Arma.ANILLO));
        personajes.add(new Personaje("Sam", 33, false, Arma.ESPADA));




        // Filtrar los personajes que sean jóvenes (menos de 90 años) y lleven espada.
        System.out.println("Personajes menores de 90 años con espada: ");

        personajes.stream().filter(p -> p.getEdad() < 90 && p.getArma().equals(Arma.ESPADA)).forEach(System.out::println);

        // Filtrar los personajes que no usan espada.
        System.out.println("\nPersonajes que no usan espada: ");

        personajes.stream().filter(p -> !p.getArma().equals(Arma.ESPADA)).forEach(System.out::println);

        // Muestra los personajes ordenados por orden alfabético.
        System.out.println("\nPersonajes ordenados alfabéticamente: ");

        personajes.stream().sorted((p1, p2) -> p1.getNombre().compareTo(p2.getNombre())).forEach(System.out::println);

        // Muestra los personajes humanos.
        System.out.println("\nPersonajes humanos: ");

        personajes.stream().filter(p -> p.isEsHumano()).forEach(System.out::println);

        // Muestra el personaje más viejo.
        System.out.println("\nPersonaje mas viejo: ");

        personajes.stream().sorted((p1, p2) -> p2.getEdad() - p1.getEdad()).limit(1).forEach(System.out::println); //ordeno de mayor a menor y cojo el primero como en BBDD

        System.out.println("Otra forma: ");
        Personaje viejo = personajes.stream().max((p1, p2) -> p1.getEdad() - p2.getEdad()).get();
        System.out.println(viejo);





    }
}
