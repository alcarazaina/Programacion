package segunda_evaluacion.tema06.ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio05 {
    public static void main(String[] args) {
        /*
        Hacer un programa que inicialice una lista de números con valores aleatorios (10 valores), y los muestre ordenados de menor a mayor.
         */
        Random generador = new Random();
        ArrayList<Integer> lista = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            lista.add(generador.nextInt(1,11));
        }
        System.out.println(lista);
       Collections.sort(lista);
        System.out.println(lista);
    }
}
