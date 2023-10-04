package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosBooleanos;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        /*
        Escribe un programa que lea tres números enteros e imprima true si el primer número está entre el segundo y el tercero (ambos inclusive). De lo contrario, debe imprimir false.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tres números enteros: ");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();
        int numero3= teclado.nextInt();

        boolean resultado = numero1 >= numero2 && numero1 <= numero3 || numero1 <= numero2 && numero1 >= numero3;

        System.out.println("Tu primer número esta entre el segundo y el tercero: " + resultado);
    }
}
