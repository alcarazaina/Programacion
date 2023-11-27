package primera_evaluacion.Tema04.Ejercicios.Array;

import java.util.Arrays;
import java.util.Random;

public class EjercicioHuelga {
    public static void main(String[] args) {
        /*
        Escribe un programa en el que se crea un array de 60 elementos enteros. Rellénalo con números aleatorios entre 1 y 5 . Cuenta el número de 1, 2, 3, 4, 5 que contiene
         */
        int[] array = new int[60];
        Random generador = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = generador.nextInt(1,6);
        }
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        for (int i = 0; i < array.length; i++) {
           if (array[i] == 1) {
               contador1++;
           } else if (array[i] == 2) {
               contador2++;
           } else if (array[i] == 3) {
               contador3++;
           } else if (array[i] == 4) {
               contador4++;
           }else {
               contador5++;
           }
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Contador 1: " + contador1 + "\nContador 2: " + contador2 + "\nContador 3: " + contador3 + "\nContador 4: " + contador4 + "\nContador 5: " + contador5);
 }
}
