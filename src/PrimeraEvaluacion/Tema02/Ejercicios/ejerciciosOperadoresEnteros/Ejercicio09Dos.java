package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosOperadoresEnteros;

import java.util.Scanner;

public class Ejercicio09Dos {
    public static void main(String[] args) {
        /*
Escribe un programa que lea un número de tres cifras y muestre el número invertido. Por ejemplo: si introducimos el número 320, el programa debe mostrar 23; si introducimos 976, el programa debe mostrar 679.
 */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número de tres cifras: ");
        int numero = teclado.nextInt();
        while (numero < 10 || numero > 999) {
            System.out.println("Error, no es un número de tres dígitos. Introduce otro: ");
            numero = teclado.nextInt();
        }
        int unidades = numero / 100;
        int centenas = numero % 10 * 100;
        int decenas = numero % 100 - numero % 10;
        int resultado = unidades + decenas + centenas;
        System.out.println(resultado);

    }




}



