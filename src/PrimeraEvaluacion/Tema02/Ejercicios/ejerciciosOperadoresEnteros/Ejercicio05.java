package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosOperadoresEnteros;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        /*
        Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas y 40 minutos.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce una cantidad de minutos: ");
        int minutos = teclado.nextInt();
        int horas = minutos / 60;
        System.out.print(minutos + " minutos son " + horas + " horas");
        minutos = minutos % 60;
        System.out.print(" y " + minutos + " minutos");

    }
}
