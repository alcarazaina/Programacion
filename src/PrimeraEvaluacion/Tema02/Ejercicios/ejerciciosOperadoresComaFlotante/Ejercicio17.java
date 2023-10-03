package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosOperadoresComaFlotante;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        /*
        Realizar un programa que lea cuatro valores numéricos e imprima su suma y su media. Ten en cuenta que la media puede contener decimales.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce cuatro valores numéricos: ");
        double numero1 = teclado.nextDouble();
        double numero2 = teclado.nextDouble();
        double numero3 = teclado.nextDouble();
        double numero4 = teclado.nextDouble();
        double suma = numero1 + numero2 + numero3 + numero4;
        double media = suma / 4;
        System.out.println("El total de la suma de " + numero1 + " + " + numero2 + " + " + numero3 + " + " + numero4 + " es: " + suma + " y el resultado de la media es: " + media);
    }
}
