package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosOperadoresEnteros;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
/*
Escribe un programa que pida un número de dos dígitos e imprima las decenas.
 */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número de dos dígitos: ");
        int numero = teclado.nextInt();
        if (numero > 99 || numero < 10){
            System.out.println("Error, no es un número de dos dígitos.");
        }
        else {
            int resultado = numero / 10;
            System.out.println("Las decenas son: " + resultado);
        }
    }
}
