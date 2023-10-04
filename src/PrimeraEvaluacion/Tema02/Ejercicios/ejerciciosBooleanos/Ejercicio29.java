package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosBooleanos;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        /*
        Escribe un programa que lea tres números y compruebe que todos son diferentes, es decir, no iguales entre sí. El programa debe imprimir un booleano (true o false)
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tres números enteros: ");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();
        int numero3= teclado.nextInt();

        boolean resultado = numero1 !=numero2 && numero1 !=3 && numero2 !=numero3;
        System.out.println("Los tres números son iguales: " + resultado);
    }
}
