package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosfor;

import java.util.Scanner;

public class Ejercicio28Otraforma {
    public static void main(String[] args) {
           /*
        Hacer un programa que imprima todos los números múltiplos de 5 entre 1 y n, siendo n un número introducido por el usuario.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int n = teclado.nextInt();
        for (int i = 5; i <= n; i = i + 5) {
            System.out.println("Los múltiplos de 5 entre 1 y " + n + " son " + i);

        }
    }
}
