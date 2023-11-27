package primera_evaluacion.Tema04.Ejercicios.Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*
        Haz un programa en el que se cree un array que lea por teclado la longitud que debe tener y a continuación lo inicialice con números aleatorios comprendidos entre 1 y 10. Mostrar la suma de todos los números que se guardan en el array
         */
        Scanner teclado = new Scanner(System.in);
        int tamaño = teclado.nextInt();
        int[] array = new int[tamaño];

        Random generador = new Random();
        for (int i = 0; i < tamaño; i++) {
           array[i] = generador.nextInt(1,11);
        }
        System.out.println(Arrays.toString(array));

        int suma = 0;
        for (int i = 0; i < array.length; i++) {
           suma+= array[i];
        }
        System.out.println("Suma = " +  suma);
    }
}
