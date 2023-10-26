package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosfor;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        /*
        [FOR ANIDADO]Hacer un programa que introduzca un número entero, positivo, y calcule su tabla de multiplicar, hasta llegar a él. (Nota: para  que los números queden alineados en columnas puedes usar el tabulador \t)
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = teclado.nextInt();
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= numero; j++) {
                System.out.print(i * j + "\t"); // \t para tabular y que quede bien organizado
            }
            System.out.println();
        }
    }
}
