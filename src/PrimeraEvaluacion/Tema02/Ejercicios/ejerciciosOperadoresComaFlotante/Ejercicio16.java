package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosOperadoresComaFlotante;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        /*
        Pide al usuario dos pares de números x1,y1 y x2,y2, que representen dos puntos en el plano. Calcula y muestra la distancia entre ellos. (https://www.geometriaanalitica.info/formula-de-la-distancia-entre-dos-puntos-geometria-ejemplos-y-ejercicios-resueltos/ )
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las coordenadas x e y del primer punto: ");
        double x1 = teclado.nextDouble();
        double y1 = teclado.nextDouble();
        System.out.println("Introduce las coordenadas x e y del segundo punto: ");
        double x2 = teclado.nextDouble();
        double y2 = teclado.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow (y2 - y1, 2));
        System.out.printf("La distancia entre el punto a y el punto b es de: %.2f", distancia);

        }
    }
