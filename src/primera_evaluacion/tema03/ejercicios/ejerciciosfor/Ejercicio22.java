package primera_evaluacion.tema03.ejercicios.ejerciciosfor;

import java.util.Random;

public class Ejercicio22 {
    public static void main(String[] args) {
/*
Hacer un programa que genere 10 números aleatoriamente y calcule su media.
 */
        Random generator = new Random();
        int numerosAleatorios = generator.nextInt(1,11);
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(numerosAleatorios);
            numerosAleatorios = generator.nextInt(1,11);
        suma = suma + numerosAleatorios;
        }
        System.out.println("La suma es: " + suma);
        double media = suma / 10.0;
        System.out.printf("La media es %.2f", media);
    }
}
