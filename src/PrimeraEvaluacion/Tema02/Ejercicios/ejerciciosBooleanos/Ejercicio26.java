package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosBooleanos;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        /*
        Escribe un programa que lea un valor por teclado y verifique si es menor que 10. El programa debe imprimir un booleano (true o false).
          */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = teclado.nextInt();
        boolean resultado = numero < 10;
        System.out.println("El número es menor que 10, " + resultado);
    }
}
