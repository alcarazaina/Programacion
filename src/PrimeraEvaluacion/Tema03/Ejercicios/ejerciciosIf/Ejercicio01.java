package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosIf;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        /*
        Escribe un programa que pida un número e indique si es par o impar (un número es par si al dividirlo entre 2 el resto es 0)
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número par o impar: ");
        int numero = teclado.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par ");}
            else {
                System.out.println("El número es impar ");
            }
    }
}
