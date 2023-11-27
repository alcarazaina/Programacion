package primera_evaluacion.Tema04.Ejercicios.Array;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /*
        Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los muestre en el orden inverso al introducido
         */
        double [] numerosDecimales = new double[5]; // creo un array de tamaño 5 de números decimales
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < numerosDecimales.length; i++) {
            // Que los guarde en array --> tengo que tener creado antes del for el array
            double numero = teclado.nextDouble();
            numerosDecimales[i] = numero;
        }
        for (int i = numerosDecimales.length - 1 ; i >= 0; i--) { //recordemos que la última posición es 4 (length - 1)
            System.out.print(numerosDecimales[i] + " ");
        }
    }
}
