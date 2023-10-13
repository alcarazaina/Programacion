package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosfor;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        /*
        Hacer un programa que pida dos números a y b, enteros, por teclado (se asume que a es menor que b siempre), e imprima la suma de todos los números enteros desde a hasta b, ambos inclusive.
Hacer el ejercicio anterior, pero sin asumir que el primer número es menor que el segundo. Es decir, pedir dos números enteros por teclado e imprimir la suma de todos los números enteros desde el menor hasta el mayor, ambos inclusive.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos números enteros: ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();

        int suma = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
            suma = suma + i;
            }
        }
        else {
            for (int i = b; i <= a; i++) {
                suma = suma + i;
        }
        }
        System.out.println(suma);
    }
}
