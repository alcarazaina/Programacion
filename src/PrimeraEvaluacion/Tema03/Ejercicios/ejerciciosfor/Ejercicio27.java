package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosfor;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        /*
        Hacer un programa que calcule el factorial de un número pedido por teclado. (Ejemplo: el factorial de 5 sería 5 * 4 * 3 * 2 * 1; el de 4 sería 4* 3 * 2 * 1, etc.)
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int n = teclado.nextInt();
        int factorial = 1;
        for (int i = 1; i <=n; i++) {
        factorial = factorial * i;
        }
        System.out.println("EL factorial de " + n + " es " + factorial);
    }
}
