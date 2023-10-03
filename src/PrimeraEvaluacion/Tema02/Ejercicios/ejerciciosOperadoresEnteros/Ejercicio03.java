package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosOperadoresEnteros;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
/*
Escribe un programa que lea un valor entero n de la entrada estándar y muestre el resultado de la siguiente expresión aritmética:
((n + 1) * n + 2) * n + 3

 */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int n = teclado.nextInt();
        int resultado = ((n + 1) * n + 2) * n + 3;
        //podría poner directamente el resultado de la expresión en el sout sin necesidad de crear la variable resultado, así:
        // System.out.println("((n + 1) * n + 2) * n + 3 = " + (((n+1) * n + 2) * n + 3));
        System.out.println("El resultado de ((" +n+ " + 1) * " +n+ " + 2) * 2" + n +" + 3 = " + resultado);

    }
}
