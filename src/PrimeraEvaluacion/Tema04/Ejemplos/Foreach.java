package PrimeraEvaluacion.Tema04.Ejemplos;

import java.util.Arrays;
import java.util.Random;

public class Foreach {
    public static void main(String[] args) {
        // for-each es una manera de recorrer arrays alternativa al for
        /*
        for (tipoArray valor : nombreArray) {
    //instrucciones sobre el array
        }
         */

        //ejemplo: vamos a crear un array y a rellenarlo
        int[] nombreArray = {1, 2, 4, 8, 16, 32, 34, 128, 256, 512, 1024};

        //lo recorremos con for-each
        //valor es el nombre que le damos en este caso (lo podemos llamar como queramos) es una variable temporal que designa a cada uno de los elementos del array
        for (int valor: nombreArray) {
            System.out.println(valor * 2); //imprimimos cada elemento multiplicado por dos
            //seria equivalente a escribir, en vez de valor, nombreArray[i] en un for
        }
    }
}
