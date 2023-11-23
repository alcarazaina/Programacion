package PrimeraEvaluacion.Tema04.Ejercicios.Array;

import java.util.Random;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
        Crear un programa que rellene aleatoriamente un array de 10 números enteros. Guardar en otro array los elementos pares del primero, y, a continuación, los elementos impares
         */
        Random generador = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array [i] = generador.nextInt(1,10);
        }
    }
}
