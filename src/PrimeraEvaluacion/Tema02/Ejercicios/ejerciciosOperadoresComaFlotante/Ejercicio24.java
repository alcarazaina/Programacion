package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosOperadoresComaFlotante;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        /*
        Un alumno desea saber cual será su nota final en un módulo. Dicha calificación se compone de los siguientes porcentajes:
El 55% se obtiene del promedio de la nota de las tres evaluaciones..
El 30% se obtiene de la nota en un examen final.
El 15% se obtiene de de la calificación de un trabajo final
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuál es tu  media de las 3 evaluaciones? ");
        double media = teclado.nextDouble();
        System.out.println("¿Cuál es tu nota del examen final? ");
        double examen = teclado.nextDouble();
        System.out.println("¿Cuánto sacaste en el trabajo final? ");
        double trabajo = teclado.nextDouble();

        double media2 = media * 0.55;
        double examen2 = examen * 0.30;
        double trabajo2 = trabajo * 0.15;

        double notaFinal = media2 + examen2 + trabajo2;

        System.out.printf("Tu nota final es de %.2f" , notaFinal);

    }
}
