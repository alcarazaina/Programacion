package teoria.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class MainConsumer {
    public static void main(String[] args) {

        Consumer<String> consumer1 = nombre -> System.out.println("Hola, " + nombre);
        consumer1.accept("Iván");

        //Creamos un arraylist y lo rellenamos con 25 números aleatorios entre 1 y 1000
        ArrayList<Integer> numeros = new ArrayList<>();
        Random generador = new Random();
        for (int i = 0; i < 25; i++) {
            numeros.add(generador.nextInt(1,1001));
        }
        // queremos imprimirlos
        System.out.println("Sin ordenar: ");
        numeros.forEach(integer -> System.out.print(integer + " "));

        // pero queremos imprimirlos ordenados de menor a mayor
        System.out.println();
        System.out.println("Ordenados: ");
        numeros.sort((n1, n2) -> n1 - n2);
        numeros.forEach(integer -> System.out.print(integer + " "));

        //Quiero imprimir los pares ordenados de mayor a menor
        System.out.println();
        System.out.println("Números pares de mayor a menor: ");
        numeros.stream().filter(numero -> numero % 2 == 0).sorted((n1, n2) -> n2 -n1).forEach(numero -> System.out.print(numero + " "));

    }
}
