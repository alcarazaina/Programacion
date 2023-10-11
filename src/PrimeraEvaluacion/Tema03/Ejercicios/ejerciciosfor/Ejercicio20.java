package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosfor;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
/*
Hacer un programa que pida dos números a y b, enteros, por teclado (se asume que a es menor que b siempre), e imprima la suma de todos los números enteros desde a hasta b, ambos inclusive.
 */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los números a y b ordenados de menos a mayor: ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        for (int i = a; i <= b; i++) {
            a = a + i;
            System.out.print(a + " ");

        }
    }
}
