package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosOperadoresEnteros;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
 /*
 Escribe un programa que reciba un tiempo en segundos y muestre por pantalla este tiempo pero expresado en horas, minutos y segundos. Por ejemplo, 12.610 segundos son 3 horas, 30 minutos y 10 segundos.
        */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un tiempo en segundos: ");
        int segundos = teclado.nextInt();
        int horas = segundos / 3600;
        int minutos = segundos / 60 - horas * 60;
        int segundosRestantes = segundos % 60;

        System.out.println(segundos + " segundos son " + horas + " horas, " + minutos + " minutos y " + segundosRestantes + " segundos." );

    }
}
