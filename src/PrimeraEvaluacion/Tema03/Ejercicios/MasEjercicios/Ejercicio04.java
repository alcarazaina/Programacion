package PrimeraEvaluacion.Tema03.Ejercicios.MasEjercicios;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*
        Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla los números desde 1 hasta N, uno en cada línea, repitiendo cada número tantas veces como su valor.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número del 0 al 20: ");
        int n = teclado.nextInt();
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
