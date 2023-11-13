package PrimeraEvaluacion.Tema04.Ejercicios.Array;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio06 {
    public static void main(String[] args) {
        /*
        Realizar un programa en el se se inicialice un array de longitud 20 con números aleatorios comprendidos entre -10 y 10. A continuación, mostrar la media de los números positivos,la media de los negativos y contar el número de ceros
         */
        int[] array = new int[20];
        int max = 10;
        int min = -10;

        Random generador = new Random();
        int contadorCero = 0;
        int contadorPos = 0;
        int contadorNeg = 0;
        double mediaPos = 0;
        double mediaNeg = 0;
        for (int i = 0; i < array.length; i++) {
            array [i] = generador.nextInt(min, max + 1);
        }
        System.out.println(Arrays.toString(array));
        for (int valor: array) {
          if (valor == 0){
            contadorCero++;
          } else if (valor < 0) {
            contadorNeg++;
            mediaNeg = mediaNeg + valor;
          } else{
              contadorPos++;
              mediaPos += valor;
              }
        }
        mediaNeg = mediaNeg / contadorNeg;
        mediaPos = mediaPos / contadorPos;

        System.out.println("Media negativos: " + mediaNeg + "\nMedia positivos: " + mediaPos + "\nNúmero de ceros: " + contadorCero);
    }
}
