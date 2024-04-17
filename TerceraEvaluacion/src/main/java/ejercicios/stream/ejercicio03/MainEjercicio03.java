package ejercicios.stream.ejercicio03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainEjercicio03 {
    public static void main(String[] args) {
        String animales = "Abadejo, Abejaruco, Abeja, Abejorro, Águila, Alacrán, Antílope, Babuino, Bacalao, Ballena, Barracuda, Bisonte, Búho, Caballo, Cebra, Chimpancé, Ciervo, Conejo, Cotorra, Coyote, Delfín, Dromedario, Elefante, Erizo, Foca, Gacela, Golondrina, Guepardo, Halcón, Hiena, Hormiga, Hurón, Iguana, Jabalí, Jirafa, Kiwi, Koala, Lagarto, Lince, Lobo, Mapache, Medusa, Mosca, Murciélago, Nutria, Ñu, Oso, Oveja, Paloma, Pantera, Perezoso, Reno, Ruiseñor, Salamandra, Sapo, Serpiente, Tiburón, Tigre, Tortuga, Urraca, Vaca, Yak, Zorro";

        // para separar lo elemento entre si utilizo el método split, que me los va a guardar en un array

        String[] arrayAnimales = animales.split(", ");
        System.out.println(Arrays.toString(arrayAnimales));
        List<String> animalitos = new ArrayList<>();

        //Para añadir lo que tenemos en el array se puede hacer con un for un for each o asi:
        animalitos.addAll(Arrays.asList(arrayAnimales)); // Arrays.asList te convierte el array que le pasas en una lista que se la metemos en el método addAll que añade de golpe una lista entera a otra que ya tenemos

        // Muestra todos los animales que comiencen por una letra introducida por teclado.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Letra: ");
        String letra = teclado.nextLine().substring(0, 1).toLowerCase(); // por si se mete por teclado más de una letra que coja solo la primera
        animalitos.stream().filter(a -> a.toLowerCase().startsWith(letra)).forEach(System.out::println);

        // Muestra el animal que tenga el nombre más largo, y el que tenga el nombre más corto
        System.out.println("Animal que tenga el nombre más largo y el que tenga el nombre más corto: ");
        System.out.println("Largo: ");
        // animalitos.stream().sorted((a1, a2) -> a2.length() - a1.length()).forEach(System.out::println); -> no funciona porque hay más de uno
        animalitos.stream().max((a1, a2) -> a2.length() - a1.length());

        // Muestra el número de animales que contiene la lista.






    }
}
