package PruebaExamen;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        /**
         * @author Ainara
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué nota has obtenido en la primera práctica?");
        double p1 = teclado.nextDouble();
        System.out.println("¿Y en la segunda práctica?");
        double p2 = teclado.nextDouble();
        System.out.println("¿Cuál ha sido tu nota en el examen final?");
        double exam = teclado.nextDouble();

        double notaPracticas = ((p1 + p2) / 2) * 0.30;
        double notaExamen = exam * 0.70;
        double notaFinal = notaExamen + notaPracticas;

        System.out.printf("%.2f La nota final de la primera evaluación es: ", notaFinal);
    }
}
