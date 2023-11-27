package primera_evaluacion.Tema04.Ejercicios.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        /*
        Realizar un programa que declare un array y lo vaya llenando de números intoducidos por teclado hasta que introduzcamos un número negativo. Entonces debe imprimir los elementos que contiene (el número negativo sólo sirve para finalizar el programa, no entra en el array)
         */
        Scanner teclado = new Scanner(System.in);
        int tamaño = teclado.nextInt();
        int[] array = new int[tamaño];
        int numero = teclado.nextInt();
        int indice = 0;
        while (numero > 0 && indice < array.length - 1){
            array[indice] = numero;
            indice++;
            numero = teclado.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
