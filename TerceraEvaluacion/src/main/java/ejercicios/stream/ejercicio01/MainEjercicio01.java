package ejercicios.stream.ejercicio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class MainEjercicio01 {
    public static void main(String[] args) {

// Crea una lista de enteros con 20 elementos aleatorios entre 1 y 15.
        List<Integer> numeros = new ArrayList<>();

        Random generador = new Random();

        for (int i = 0; i < 20; i++) {
            numeros.add(generador.nextInt(1, 16));
        }

// Utilizando streams, haz lo siguiente:


// Imprime todos los elementos de la lista, sin ordenar.
        System.out.println("Sin ordenar: ");
        numeros.forEach(n -> System.out.print(n + " "));

// Imprime todos los elementos de la lista, ordenados.
        System.out.println("\n\nOrdenados: ");
        numeros.stream()
                .sorted() // el método sorted funciona bien con números, de menor a mayor
                .forEach(n -> System.out.print(n + " "));

// Imprime todos los elementos de la lista, sin repetir, ordenados.
        System.out.println("\n\nSin repetir y ordenados: ");
        numeros.stream().distinct().sorted().forEach(n -> System.out.print(n + " "));

// Imprime sólo los mayores o iguales a 5 distintos entre sí.
        System.out.println("\n\nMayores o iguales a 5, distintos entre sí: ");
        numeros.stream().filter(n -> n >= 5).distinct().forEach(n -> System.out.print(n + " "));

// Imprime sólo los mayores o iguales a 5 distintos entre sí, ordenados.
        System.out.println("\n\nMayores o iguales a 5, distintos entre sí y ordenados: ");
        numeros.stream().filter(n -> n >= 5).distinct().sorted().forEach(n -> System.out.print(n + " "));

// Imprime sólo los mayores o iguales a 5 distintos entre sí, ordenados inversamente.
        System.out.println("\n\nMayores o iguales a 5, distintos entre sí y ordenados inversamente: ");
        numeros.stream().filter(n -> n >= 5).distinct().sorted((n1, n2) -> n2 - n1).forEach(n -> System.out.print(n + " "));

        System.out.println("\n Otra forma: ");
        numeros.stream().filter(n -> n >= 5).distinct().sorted(Comparator.reverseOrder()).forEach(n -> System.out.print(n + " "));

// Suma todos los elementos de la lista e imprime el resultado.
        System.out.println("\n\nSuma de todos los elementos: ");
        int suma = numeros.stream().reduce(0, (n1, n2) -> n1 + n2);
        System.out.println(suma);

        System.out.println("Otra forma de hacer la suma: ");
        suma = numeros.stream().mapToInt(n -> n).sum();
        System.out.println(suma);


// Suma todos los elementos mayores o iguales a 5 (también los que se repitan) e imprime el resultado.
        System.out.println("\nSuma de los elementos mayores o iguales a 5: ");
        suma = numeros.stream().filter(n -> n >= 5).reduce(0, (n1, n2) -> n1 + n2);
        System.out.println(suma);

// Calcula el promedio de todos los elementos de la lista (sin eliminar los repetidos) e imprime el resultado.
        System.out.println("\nPromedio de todos los elementos de la lista: ");
        // Lo podemos sacar con la suma, por un lado, y el total de elementos de la lista por otro, cuidado con el int porque hay que hacer casting a double
        double resultado = (double) (numeros.stream().reduce(0, (n1, n2) -> n1 + n2)) / (double) numeros.size();
        System.out.println(resultado);

        System.out.println("Otra forma, con Optional: ");
        // La secuencia de métodos es muy parecida a la que nos lleva a sum(), pero en lugar de sum() elegimos average() y en vez de mapToInt, mapToDouble. O sea:

        resultado = numeros.stream().mapToDouble(n -> n).average().orElseThrow(); // el método average() devuelve un objeto de tipo OptionalDouble -> para convertirlo en double hay que aplicar el método(get())-> getAsDouble() o .orElseThrow()
        System.out.println(resultado);


    }
}
