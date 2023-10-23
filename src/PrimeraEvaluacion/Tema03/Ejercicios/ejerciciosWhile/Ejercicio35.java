package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosWhile;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        /*
        Dada una secuencia de números enteros (que finaliza con el número 0), encuentra el elemento más grande de la secuencia. El número 0 no está incuido en la secuencia, sólo se utiliza para finalizar el programa.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una serie de números, y 0 para finalizar: ");
        int numeros = teclado.nextInt();
        int mayor = 0;
        int numeromayor = 0;
        while (numeros != 0){
            numeros = teclado.nextInt();
            numeros = mayor;
            if (mayor < numeros){
                numeromayor = numeros;
            }
        }
        System.out.println(numeromayor);
    }
}
