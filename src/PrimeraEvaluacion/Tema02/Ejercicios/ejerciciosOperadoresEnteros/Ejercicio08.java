package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosOperadoresEnteros;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
/*
Escribe un programa que pida un número de dos cifras, escribe un programa que permita obtener el número invertido. Ejemplo, si se introduce 23 que muestre 32.
*/
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número de dos cifras: ");
        int numero = teclado.nextInt();
        if (numero <10 || numero >99){
            System.out.println("Error, no es un número de dos dígitos.");
        }
        else {
            int unidades = numero / 10;
            int decenas = numero % 10 * 10;
            int resultado = unidades + decenas;
            System.out.println(resultado);

        }

    }
}
