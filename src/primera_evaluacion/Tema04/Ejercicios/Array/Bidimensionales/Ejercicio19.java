package primera_evaluacion.Tema04.Ejercicios.Array.Bidimensionales;

import java.util.Random;

public class Ejercicio19 {
    public static void main(String[] args) {
        /*
        Haz un programa que realice lo siguiente:
Crea un array bidimensional de 5x5 enteros y rellénalo con valores numéricos.
Suma todos los elementos de cada fila y todos los elementos de cada columna visualizando los resultados en pantalla
         */
        int[][] caracteres = new int[5][5];
        Random generador = new Random();
        for (int i = 0; i < caracteres.length; i++) {
            for (int j = 0; j < caracteres[i].length; j++) {
                caracteres[i][j] = generador.nextInt(1,11);
            }
        }
        for (int i = 0; i < caracteres.length; i++) {
            for (int j = 0; j < caracteres[i].length; j++) {
                System.out.print(caracteres[i][j] + " ");
            }
            System.out.println();
        }
    }
}
