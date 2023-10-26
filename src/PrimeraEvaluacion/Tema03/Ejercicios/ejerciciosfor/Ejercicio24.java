package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosfor;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        /*
        [FOR ANIDADO] Escribe un programa que reciba dos valores enteros por teclado, a y b, y dibuje un rectángulo en que la base sea el número mayor y la altura el número menor, con un carácter también introducido por teclado.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de filas de la tabla: ");
        int f = teclado.nextInt();
        System.out.println("Introduce ahora las columnas: ");
        int c = teclado.nextInt();
        System.out.println("Introduce el carácter: ");
        String caracter = teclado.next();
        if (f < c){
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(caracter + " ");
            }
            System.out.println();
         }
        }else {
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < f; j++) {
                    System.out.print(caracter + " ");
                }
                System.out.println();
            }
        }
    }
}
