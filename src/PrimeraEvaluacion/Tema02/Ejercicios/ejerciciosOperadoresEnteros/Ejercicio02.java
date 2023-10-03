package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosOperadoresEnteros;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
/*
Escribir un programa en el cual se piden cuatro números y se calcule e imprima la suma de los dos primeros y el producto del tercero y el cuarto.
 */
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce cuatro números enteros: ");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();
        int numero3 = teclado.nextInt();
        int numero4 = teclado.nextInt();

        int suma = numero1 + numero2;
        int producto = numero3 * numero4;
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        System.out.println("El producto de " + numero3 + " y " + numero4 + " es: " + producto);
    }
}
