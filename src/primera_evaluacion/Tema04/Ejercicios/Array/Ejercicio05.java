package primera_evaluacion.Tema04.Ejercicios.Array;

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

        // ¿y si los quiero ordenar al revés, de mayor a menor?
        int [] inverso = new int [array.length]; //tenemos que crear otro array porque si no no se puede
        for (int i = array.length - 1; i >= 0; i--) {
            inverso [i] = array[array.length -1 -i];
        }
        System.out.println(Arrays.toString(inverso));
    }
}
