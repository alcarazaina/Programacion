package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosWhile;

import java.util.Scanner;

public class Ejercicio35DoWhile {
    public static void main(String[] args) {
         /*
        Dada una secuencia de números enteros introducidos por teclado (que finaliza con el número 0), encuentra el elemento más grande de la secuencia. El número 0 no está incuido en la secuencia, sólo se utiliza para finalizar el programa.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una serie de números, y 0 para finalizar: ");
        int numeros = teclado.nextInt();
        int numeromayor = numeros;
        do {
            if (numeros != 0){
                numeros = teclado.nextInt();
                if (numeros > numeromayor && numeros != 0){
                    numeromayor = numeros;}
            }

        }while (numeros != 0);

        System.out.println(numeromayor);
    }
}
