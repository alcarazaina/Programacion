package PrimeraEvaluacion.Tema04.Ejercicios.Array;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio05 {
    public static void main(String[] args) {
        /*
        Hacer un programa que inicialice una lista de números con valores aleatorios (10 valores), y los muestre ordenados de menor a mayor
         */
        int [] array = new int [10];
        Random generador = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = generador.nextInt(1,11);
        }
        System.out.println(Arrays.toString(array));

        Arrays.sort(array); // el método sort de la clase array ordena los arrays de menor a mayor

        System.out.println(Arrays.toString(array));
    }
}
