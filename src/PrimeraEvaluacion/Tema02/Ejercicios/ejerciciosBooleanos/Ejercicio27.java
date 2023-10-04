package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosBooleanos;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        /*
        Escribe un programa que lea un valor entero y verifique si es menor que 10 y mayor que 0. El programa debe imprimir un booleano (true o false)
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = teclado.nextInt();
        boolean resultado = numero < 10 && numero >0;
        System.out.println("El número es menor que 10 y mayor que 0, " + resultado);
    }
}
