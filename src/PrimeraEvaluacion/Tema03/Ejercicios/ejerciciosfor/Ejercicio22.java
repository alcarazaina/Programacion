package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosfor;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Ejercicio22 {
    public static void main(String[] args) {
/*
Hacer un programa que genere 10 números aleatoriamente y calcule su media.
 */
        Random generator = new Random();
        int numerosAleatorios = generator.nextInt();
        int suma = numerosAleatorios * numerosAleatorios;
    }
}
