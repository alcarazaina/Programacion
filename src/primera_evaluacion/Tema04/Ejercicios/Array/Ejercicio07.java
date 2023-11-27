package primera_evaluacion.Tema04.Ejercicios.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        /*
        Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno (comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media, la nota más alta que ha sacado y la menor
         */
        Scanner teclado = new Scanner(System.in);
        double[] notas = new double[5];
        for (int i = 0; i < notas.length; i++) {
          notas[i] = teclado.nextDouble();
        }
        Arrays.sort(notas);
        double notaMasBaja = notas[0];
        double notaMasAlta = notas[4];

        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
           suma += notas[i];
        }
        double media = suma / notas.length;
        System.out.println("Notas: " + Arrays.toString(notas));
        System.out.println("Nota mas baja :" + notaMasBaja);
        System.out.println("Nota mas alta: " + notaMasAlta);
        System.out.println("Nota media: " + media);
    }
}
