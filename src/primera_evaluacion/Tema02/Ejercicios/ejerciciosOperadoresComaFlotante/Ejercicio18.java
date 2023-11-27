package primera_evaluacion.Tema02.Ejercicios.ejerciciosOperadoresComaFlotante;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        /*
        Realiza un programa que pida las notas de las tres evaluaciones del módulo Programación y muestre la nota final (la nota final es la media de las tres evaluaciones) con un decimal
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las notas de las tres evaluaciones de programación: ");
        double eva1 = teclado.nextDouble();
        double eva2 = teclado.nextDouble();
        double eva3 = teclado.nextDouble();
        double nota = (eva1 + eva2 + eva3) / 3;
        System.out.printf("Tu nota final de programación es: %.1f", nota);

    }
}
