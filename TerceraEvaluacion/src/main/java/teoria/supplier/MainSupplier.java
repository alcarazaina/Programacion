package teoria.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class MainSupplier {
    public static void main(String[] args) {
        // Creamos un supplier que genere un número aleatorio
        Random generador = new Random();
        Supplier<Integer> numerosRandom = () -> generador.nextInt(1, 1001);
        int numero = numerosRandom.get();
        System.out.println(numero);
    }
}
