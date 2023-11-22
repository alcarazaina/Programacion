package PrimeraEvaluacion.Tema04.Ejercicios.Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Ejercicio08 {
    public static void main(String[] args) {
        /*
        Realizar un programa que pida un tamaño de array por teclado y a continuación cree un array formado por elementos aleatorios pares entre 1 y 50.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué tamaño va a tener el array?");
        int tamaño = teclado.nextInt();
        int[] array = new int[tamaño];
        Random generador = new Random();
            for (int i = 0; i < array.length; i++) {
                int relleno = generador.nextInt(1,51);
                if ( relleno % 2 == 0){
                    array[i] = relleno;
                }else {
                    i--;
                }
            }
        System.out.println(Arrays.toString(array));
    }
}
