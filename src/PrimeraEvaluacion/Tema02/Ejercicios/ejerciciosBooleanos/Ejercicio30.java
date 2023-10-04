package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosBooleanos;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        /*
        Escribe un programa que lea los números a, b y c y compruebe si existe algún par de ellos que sumen exactamente 20. El programa debe imprimir un booleano (true o false)
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tres números enteros: ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();

        boolean resultado = a + b == 20 || a + c == 20 || b + c == 20;
        System.out.println("Existe algún par de ellos que suma 20: " + resultado);
    }
}
